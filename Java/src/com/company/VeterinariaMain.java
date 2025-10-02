class Mascota {
    String nombre;
    String especie;
    int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Mascota [Nombre: " + nombre + ", Especie: " + especie + ", Edad: " + edad + " años]";
    }
}

class Veterinaria {
    private Mascota[] mascotas;
    private int contador = 0;
    private final int CAPACIDAD = 7;

    public Veterinaria() {
        this.mascotas = new Mascota[CAPACIDAD];
    }

    // 1. Registrar nuevas mascotas
    public void registrarMascota(Mascota m) {
        if (contador < CAPACIDAD) {
            mascotas[contador++] = m;
            System.out.println("✅ Mascota " + m.nombre + " registrada.");
        } else {
            System.out.println("❌ Error: Veterinaria llena.");
        }
    }

    // 2. Mostrar todas las mascotas
    public void mostrarMascotas() {
        if (contador == 0) {
            System.out.println("📝 No hay mascotas registradas.");
            return;
        }
        System.out.println("\n--- Registro de Mascotas ---");
        for (int i = 0; i < contador; i++) {
            System.out.println((i + 1) + ". " + mascotas[i]);
        }
    }

    // 3. Buscar y modificar la edad de una mascota
    public void modificarEdad(String nombre, int nuevaEdad) {
        for (int i = 0; i < contador; i++) {
            if (mascotas[i].nombre.equalsIgnoreCase(nombre)) {
                mascotas[i].edad = nuevaEdad;
                System.out.println("🔄 Edad de " + nombre + " modificada a " + nuevaEdad + " años.");
                return;
            }
        }
        System.out.println("❓ Mascota " + nombre + " no encontrada.");
    }

    // 4. Eliminar una mascota
    public void eliminarMascota(String nombre) {
        for (int i = 0; i < contador; i++) {
            if (mascotas[i].nombre.equalsIgnoreCase(nombre)) {
                for (int j = i; j < contador - 1; j++) {
                    mascotas[j] = mascotas[j + 1];
                }
                mascotas[contador - 1] = null;
                contador--;
                System.out.println("🗑️ Mascota " + nombre + " eliminada.");
                return;
            }
        }
        System.out.println("❓ Mascota " + nombre + " no encontrada para eliminar.");
    }

    // 5. Contar cuántas mascotas hay registradas actualmente
    public int contarMascotas() {
        return contador;
    }
}

public class VeterinariaMain {
    public static void main(String[] args) {
        Veterinaria vet = new Veterinaria();
        System.out.println("\n--- 53) Registro de Mascotas ---");
        vet.registrarMascota(new Mascota("Max", "Perro", 3));
        vet.registrarMascota(new Mascota("Luna", "Gato", 5));

        vet.mostrarMascotas();
        vet.modificarEdad("Max", 4);
        System.out.println("Total de mascotas: " + vet.contarMascotas());
    }
}