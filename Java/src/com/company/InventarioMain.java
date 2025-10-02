class Producto {
    int codigo;
    String nombre;
    double precio;

    public Producto(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto [Código: " + codigo + ", Nombre: " + nombre + ", Precio: " + precio + "]";
    }
}

class Inventario {
    private Producto[] productos;
    private int contador = 0;
    private final int CAPACIDAD = 10;

    public Inventario() {
        this.productos = new Producto[CAPACIDAD];
    }

    // 1. Agregar un nuevo producto
    public void agregarProducto(Producto p) {
        if (contador < CAPACIDAD) {
            productos[contador++] = p;
            System.out.println("✅ Producto " + p.nombre + " agregado.");
        } else {
            System.out.println("❌ Error: Inventario lleno.");
        }
    }

    // 2. Buscar un producto por código
    public Producto buscarPorCodigo(int codigo) {
        for (int i = 0; i < contador; i++) {
            if (productos[i].codigo == codigo) {
                return productos[i];
            }
        }
        return null;
    }

    // 3. Modificar su precio
    public void modificarPrecio(int codigo, double nuevoPrecio) {
        Producto p = buscarPorCodigo(codigo);
        if (p != null) {
            p.precio = nuevoPrecio;
            System.out.println("🔄 Precio de " + p.nombre + " modificado a " + nuevoPrecio);
        } else {
            System.out.println("❓ Producto con código " + codigo + " no encontrado.");
        }
    }

    // 4. Eliminar un producto por su nombre
    public void eliminarProducto(String nombre) {
        for (int i = 0; i < contador; i++) {
            if (productos[i].nombre.equalsIgnoreCase(nombre)) {
                for (int j = i; j < contador - 1; j++) {
                    productos[j] = productos[j + 1];
                }
                productos[contador - 1] = null;
                contador--;
                System.out.println("🗑️ Producto " + nombre + " eliminado.");
                return;
            }
        }
        System.out.println("❓ Producto " + nombre + " no encontrado para eliminar.");
    }

    // 5. Mostrar el listado de productos
    public void mostrarListado() {
        if (contador == 0) {
            System.out.println("📝 Inventario vacío.");
            return;
        }
        System.out.println("\n--- Listado de Productos (" + contador + " ítems) ---");
        for (int i = 0; i < contador; i++) {
            System.out.println((i + 1) + ". " + productos[i]);
        }
    }
}

public class InventarioMain {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        System.out.println("\n--- 52) Inventario de Productos ---");
        inventario.agregarProducto(new Producto(101, "Leche", 1.50));
        inventario.agregarProducto(new Producto(102, "Pan", 2.20));

        inventario.modificarPrecio(101, 1.80);
        inventario.eliminarProducto("Pan");

        inventario.mostrarListado();
    }
}