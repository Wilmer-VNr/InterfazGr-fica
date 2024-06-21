package org.example;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    /*    String primerNumero = JOptionPane.showInputDialog("Ingrese el primer entero");
        String segundoNumero = JOptionPane.showInputDialog("Ingrese el segundo entero");
        String terceroNumero = JOptionPane.showInputDialog("Ingrese el tercer entero");
        String cuartoNumero = JOptionPane.showInputDialog("Ingrese el cuarto entero");
        //convierte las entradas String en valores int para uarlos en un Calculo


        int numero1 = Integer.parseInt(primerNumero);
        int numero2 = Integer.parseInt(segundoNumero);
        int resultado = numero1 + numero2; //suma numeros
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado, "Suma de dos enteros", JOptionPane.PLAIN_MESSAGE);


        int numero3 = Integer.parseInt(terceroNumero);
        int numero4 = Integer.parseInt(cuartoNumero);
        int multiplicacion = numero1 * numero2; //suma numeros
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado, "Multiplicacion de dos enteros", JOptionPane.PLAIN_MESSAGE);
        */
        JFrame frame = new JFrame("Mi aplicación"); //instanciado el objeto llamado frame
        frame.setContentPane(new form1().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // mata o cierra
        frame.setSize(400, 200);
        frame.pack();
        frame.setVisible(true);







    }
}