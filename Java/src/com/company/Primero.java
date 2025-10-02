package com.company; // declaracion de paquete
import javax.swing.JFrame; // paquetes importados
public class Primero extends JFrame{

    public static void main(String[] args){ // Main puerta de ejecucion
        Primero p = new Primero();
        p.setSize(200,200);
        p.setVisible(true);
    }
}
