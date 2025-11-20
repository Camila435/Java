package com.company.ModeloParcial;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * TEORÍA: Clase Principal
 * Aquí es donde se ejecutará el programa (método 'main').
 * Contendrá la lógica para el menú y para llamar a los métodos CRUD.
 * Usamos 'static' para los métodos y variables porque no necesitamos
 * crear un objeto 'GestionVehiculos', sino solo usar sus métodos.
 */
public class GestionVehiculos {

    // --- JUSTIFICACIÓN DE CONTEXTO (Requerido) ---
    /*
     * Contexto: "Flota GestiMAX"
     * Este programa administra la flota de vehículos de una empresa de logística mediana.
     * Permite al supervisor de flota registrar, consultar, actualizar y dar de baja
     * vehículos (autos de gerencia y camiones de reparto), y verificar costos
     * de mantenimiento.
     */
    
    /*
     * TEORÍA: Variable Global (Requisito)
     * 'private static List<Vehiculo> flota'
     * - 'static': Es una variable de CLASE (global a esta clase). Todos los métodos
     * static pueden verla y usarla.
     * - 'List<Vehiculo>': Usamos la interfaz 'List'.
     * - 'new ArrayList<>()': Usamos la implementación 'ArrayList' (Requisito).
     * - TEORÍA: Polimorfismo. Aunque la lista es de 'Vehiculo', podemos guardar
     * objetos 'Auto' y 'Camion' en ella, porque ambos SON UN 'Vehiculo'.
     */
    private static List<Vehiculo> flota = new ArrayList<>();
    
    /*
     * TEORÍA: Scanner (de java 1.ppt)
     * Objeto para leer la entrada del usuario desde la consola.
     */
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Punto de entrada principal del programa.
     */
    public static void main(String[] args) {
        System.out.println("--- Bienvenido a Flota GestiMAX ---");
        
        // Datos de prueba para no empezar de cero
        cargarDatosDePrueba();

        /*
         * TEORÍA: Bucle do-while (Requisito)
         * Se ejecuta al menos una vez, y luego repite mientras la condición (opcion != 0)
         * sea verdadera. Perfecto para un menú.
         */
        int opcion = -1;
        /*
         * TEORÍA: finally (Requisito)
         * Este bloque se ejecuta SIEMPRE, ya sea que el 'try' termine bien
         * o se vaya por el 'catch'. Es bueno para limpiar recursos.
         */
        try {
            do {
                mostrarMenu();
                /*
                 * TEORÍA: Manejo de Excepciones (try-catch) (de java 3.ppt)
                 * Intentamos leer un entero. Si el usuario escribe "hola",
                 * 'scanner.nextInt()' lanzará una 'InputMismatchException'.
                 * La atrapamos (catch) para mostrar un error y no crashear.
                 */
                try {
                    opcion = scanner.nextInt();
                    scanner.nextLine(); // Consume el "enter" fantasma

                    /*
                     * TEORÍA: Estructura switch (Requisito)
                     * Más limpio que un 'if/else if/else' largo para manejar
                     * las opciones del menú.
                     */
                    switch (opcion) {
                        case 1:
                            crearVehiculo();
                            break; // 'break' sale del switch (Requisito)
                        case 2:
                            mostrarTodosLosVehiculos();
                            break;
                        case 3:
                            buscarVehiculo();
                            break;
                        case 4:
                            actualizarKilometraje();
                            break;
                        case 5:
                            eliminarVehiculo();
                            break;
                        case 6:
                            mostrarCostosMantenimiento();
                            break;
                        case 7:
                            contarVehiculosPorTipo();
                            break;
                        case 0:
                            System.out.println("Saliendo del sistema...");
                            break;
                        default:
                            System.out.println("Opción no válida. Intente de nuevo.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Debe ingresar un número.");
                    scanner.nextLine(); // Limpia el scanner del texto inválido
                    opcion = -1; // Resetea la opción para que el bucle continúe
                }
            } while (opcion != 0);
        } finally {
            scanner.close(); // Cerramos el scanner al final
            System.out.println("Sistema cerrado. ¡Hasta luego!");
        }
    }

    /** Muestra el menú de opciones */
    public static void mostrarMenu() {
        System.out.println("\n--- MENÚ PRINCIPAL ---");
        System.out.println("1. Registrar nuevo vehículo");
        System.out.println("2. Mostrar todos los vehículos (Lambda forEach)");
        System.out.println("3. Buscar vehículo por patente (Recursivo)");
        System.out.println("4. Actualizar kilometraje (Paso por Referencia)");
        System.out.println("5. Eliminar vehículo (Lambda removeIf)");
        System.out.println("6. Ver costos de mantenimiento");
        System.out.println("7. Contar vehículos (Loop For)");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    /** 1. CREAR - (Cumple: if/else, while, try-catch, throw, PatenteInvalidaException, printf) */
    public static void crearVehiculo() {
        System.out.println("\n--- Registrar Nuevo Vehículo ---");
        try {
            // Validación de Patente (con Regex y Excepción Personalizada)
            String patente;
            while (true) {
                System.out.print("Patente (ej: AAA111 o AA111AA): ");
                patente = scanner.nextLine().toUpperCase();
                // Patrón Regex: 3 letras y 3 números O 2 letras, 3 números, 2 letras
                if (Pattern.matches("^[A-Z]{3}[0-9]{3}$", patente) || Pattern.matches("^[A-Z]{2}[0-9]{3}[A-Z]{2}$", patente)) {
                    break; // Patente válida, salimos del bucle
                }
                // Si no es válida, lanzamos nuestra excepción
                throw new PatenteInvalidaException("Formato de patente no válido. Debe ser AAA111 o AA111AA.");
            }
            
            // Verificamos si ya existe (usando el .equals() sobreescrito)
            if (flota.stream().anyMatch(v -> v.getPatente().equals(patente))) {
                 System.out.println("Error: Ya existe un vehículo con esa patente.");
                 return; // Salimos del método
            }

            System.out.print("Marca: ");
            String marca = scanner.nextLine();
            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            
            int anio = 0;
            while (true) { // Bucle 'while' para validar año
                try {
                    System.out.print("Año (ej: 2020): ");
                    anio = Integer.parseInt(scanner.nextLine());
                    if (anio > 1980 && anio <= 2025) {
                        break; // Año válido
                    } else {
                        System.out.println("Año fuera de rango (1981-2025).");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: Ingrese un número válido para el año.");
                }
            }

            System.out.print("Kilometraje: ");
            double km = scanner.nextDouble();
            scanner.nextLine(); // Limpiar buffer

            // Preguntamos qué tipo crear
            System.out.print("Tipo de vehículo (1=Auto, 2=Camión): ");
            int tipoVehiculo = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            
            /* TEORÍA: printf (Requisito)
             * Usado para dar formato a la salida. %s (string), %d (entero), %.1f (float/double con 1 decimal)
             */
            if (tipoVehiculo == 1) {
                System.out.print("Número de puertas: ");
                int puertas = scanner.nextInt();
                scanner.nextLine();
                Auto auto = new Auto(marca, modelo, anio, patente, "Auto", km, puertas);
                flota.add(auto);
                System.out.printf("Auto '%s %s' registrado con éxito.\n", marca, modelo);
            } else if (tipoVehiculo == 2) {
                System.out.print("Capacidad de Carga (en Toneladas): ");
                double carga = scanner.nextDouble();
                System.out.print("Número de ejes: ");
                int ejes = scanner.nextInt();
                scanner.nextLine();
                Camion camion = new Camion(marca, modelo, anio, patente, "Camión", km, carga, ejes);
                flota.add(camion);
                System.out.printf("Camión '%s %s' registrado con éxito.\n", marca, modelo);
            } else {
                System.out.println("Tipo no válido. No se registró el vehículo.");
            }

        } catch (PatenteInvalidaException e) {
            System.out.println("Error al registrar: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Tipo de dato incorrecto. Vuelva a intentarlo.");
            scanner.nextLine(); // Limpiar buffer
        }
    }

    /** 2. LEER - (Cumple: Lambda forEach) */
    public static void mostrarTodosLosVehiculos() {
        System.out.println("\n--- Flota Completa de Vehículos ---");
        if (flota.isEmpty()) {
            System.out.println("No hay vehículos registrados.");
            return;
        }

        /*
         * TEORÍA: Interfaz Lambda (forEach) (Requisito)
         * Es una forma corta de iterar sobre una lista.
         * 'v' es el nombre que le damos a cada elemento (el vehículo).
         * '->' es el operador lambda.
         * 'System.out.println(v)' es lo que se ejecuta para cada elemento.
         * (Java llama automáticamente al método v.toString() que sobrescribimos)
         */
        flota.forEach(v -> System.out.println(v));
        // Alternativa (más avanzada):
        // flota.forEach(System.out::println);
    }

    /** 3. LEER (Específico) - (Cumple: Función Recursiva) */
    public static void buscarVehiculo() {
        System.out.print("Ingrese la patente a buscar: ");
        String patenteBuscada = scanner.nextLine().toUpperCase();
        
        // Llamamos a la función RECURSIVA
        Vehiculo encontrado = buscarVehiculoRecursivo(patenteBuscada, 0);

        if (encontrado != null) {
            System.out.println("Vehículo encontrado:");
            // Usamos la sobrecarga de métodos
            encontrado.mostrarInfo(); // Muestra info detallada
        } else {
            System.out.println("No se encontró ningún vehículo con esa patente.");
        }
    }

    /*
     * TEORÍA: Función Recursiva (Requisito)
     * Un método que se llama a sí mismo para resolver un problema.
     * Debe tener:
     * 1. Caso Base (fin): Cuando el índice llega al final de la lista.
     * 2. Caso Base (éxito): Cuando encontramos el elemento.
     * 3. Paso Recursivo: Volver a llamar con el siguiente índice.
     */
    private static Vehiculo buscarVehiculoRecursivo(String patente, int index) {
        // Caso Base (Fracaso): Recorrimos toda la lista y no lo encontramos
        if (index >= flota.size()) {
            return null; // No encontrado
        }
        
        Vehiculo vActual = flota.get(index);
        
        // Caso Base (Éxito): Lo encontramos
        if (vActual.getPatente().equals(patente)) {
            return vActual; // Encontrado
        }
        
        // Paso Recursivo: Llamarse a sí mismo para buscar en el resto de la lista
        return buscarVehiculoRecursivo(patente, index + 1);
    }

    /** 4. ACTUALIZAR - (Cumple: Paso por Referencia) */
    public static void actualizarKilometraje() {
        System.out.print("Ingrese la patente del vehículo a actualizar: ");
        String patenteBuscada = scanner.nextLine().toUpperCase();

        Vehiculo vehiculo = buscarVehiculoRecursivo(patenteBuscada, 0);

        if (vehiculo != null) {
            System.out.printf("Kilometraje actual de %s: %.1f km\n", vehiculo.getPatente(), vehiculo.getKilometraje());
            System.out.print("Ingrese nuevo kilometraje total: ");
            try {
                double nuevoKm = scanner.nextDouble();
                scanner.nextLine();
                if (nuevoKm < vehiculo.getKilometraje()) {
                    System.out.println("Error: El nuevo kilometraje no puede ser menor al actual.");
                } else {
                    // Llamamos al método que demuestra el paso por referencia
                    modificarVehiculo(vehiculo, nuevoKm);
                    System.out.println("Kilometraje actualizado con éxito.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido.");
                scanner.nextLine();
            }
        } else {
            System.out.println("Vehículo no encontrado.");
        }
    }
    
    /*
     * TEORÍA: Paso por Referencia (Requisito)
     * En Java, los objetos se pasan como "valor de la referencia".
     * 'v' aquí es una copia de la "dirección de memoria" del objeto original.
     * Por lo tanto, 'v' y el objeto en la lista 'flota' APUNTAN AL MISMO LUGAR.
     * Si modificamos 'v' (usando v.setKilometraje), modificamos el objeto original.
     */
    private static void modificarVehiculo(Vehiculo v, double nuevoKm) {
        // Este cambio AFECTA al objeto original en la lista 'flota'.
        v.setKilometraje(nuevoKm);
    }

    /** 5. ELIMINAR - (Cumple: Lambda removeIf) */
    public static void eliminarVehiculo() {
        System.out.print("Ingrese la patente del vehículo a eliminar: ");
        String patenteBuscada = scanner.nextLine().toUpperCase();

        /*
         * TEORÍA: Interfaz Lambda (removeIf) (Requisito)
         * 'removeIf' recorre la lista. Para cada vehículo 'v', ejecuta la
         * condición 'v.getPatente().equalsIgnoreCase(patenteBuscada)'.
         * Si la condición es 'true', elimina ese elemento de la lista.
         * (Uso de String method: equalsIgnoreCase)
         */
        boolean eliminado = flota.removeIf(v -> v.getPatente().equalsIgnoreCase(patenteBuscada));

        if (eliminado) {
            System.out.println("Vehículo eliminado con éxito.");
        } else {
            System.out.println("No se encontró ningún vehículo con esa patente.");
        }
    }
    
    /** 6. Método Extra (Polimorfismo) */
    public static void mostrarCostosMantenimiento() {
        System.out.println("\n--- Costos de Mantenimiento Estimados ---");
        if (flota.isEmpty()) {
            System.out.println("No hay vehículos registrados.");
            return;
        }

        /*
         * TEORÍA: Polimorfismo en Acción
         * Recorremos la lista de 'Vehiculo'.
         * Cuando llamamos a 'v.calcularCostoMantenimiento()', Java sabe
         * automáticamente si 'v' es un 'Auto' o un 'Camion' y ejecuta
         * la versión CORRECTA (la sobrescrita) de ese método.
         */
        for (Vehiculo v : flota) {
            System.out.printf("Vehículo [%s]:\n", v.getPatente());
            System.out.printf("  Costo Próx. Mantenimiento: $%.2f\n", v.calcularCostoMantenimiento());
            System.out.printf("  Próximo Servicio en: %d meses\n", v.getMesesProximoServicio());
            System.out.println("--------------------");
        }
    }
    
    /** 7. Método Extra (Cumple: Bucle 'for', 'continue') */
    public static void contarVehiculosPorTipo() {
        System.out.print("¿Qué tipo de vehículo desea contar? (Auto / Camion): ");
        String tipoBuscado = scanner.nextLine();
        
        /* TEORÍA: Bucle 'for' tradicional (Requisito) */
        int contador = 0;
        for (int i = 0; i < flota.size(); i++) {
            Vehiculo v = flota.get(i);
            
            // Uso de 'continue' (Requisito) y 'contains' (String method)
            if (!v.getTipo().equalsIgnoreCase(tipoBuscado)) {
                continue; // Salta al siguiente ciclo del bucle
            }
            
            // Si el tipo SÍ coincide, incrementamos
            contador++;
            System.out.printf("  Encontrado: %s\n", v.getPatente()); // Muestra los que va encontrando
        }
        
        System.out.printf("Total de vehículos tipo '%s': %d\n", tipoBuscado, contador);
    }
    
    /** Carga datos de prueba para que la lista no esté vacía */
    private static void cargarDatosDePrueba() {
        // Usamos los constructores para crear objetos
        Auto auto1 = new Auto("Toyota", "Corolla", 2022, "AF123BC", "Auto", 15000, 4);
        Auto auto2 = new Auto("Volkswagen", "Golf", 2019, "AD456FG", "Auto", 65000, 5);
        Camion camion1 = new Camion("Mercedes-Benz", "Actros", 2018, "AC789HI", "Camión", 320000, 25.5, 3);
        
        flota.add(auto1);
        flota.add(auto2);
        flota.add(camion1);
    }
}
