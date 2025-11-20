public class MainThreads {
    public static void main(String[] args) {
        System.out.println("--- Inicio del Hilo Principal (Main) ---");

        // 1. Instanciar hilo por herencia
        HiloHerencia hilo1 = new HiloHerencia("Hilo A");
        HiloHerencia hilo2 = new HiloHerencia("Hilo B");

        // 2. Instanciar hilo por interfaz Runnable
        TareaRunnable tarea = new TareaRunnable();
        Thread hilo3 = new Thread(tarea); // Pasamos la tarea al Thread

        // 3. INICIAR LOS HILOS
        // ¡OJO! Usamos start(), NO run().
        // start() crea el nuevo hilo de ejecución. run() solo ejecutaría el método secuencialmente.
        hilo1.start();
        hilo2.start();
        hilo3.start();

        System.out.println("--- Fin del Hilo Principal (Main) ---");
    }
}