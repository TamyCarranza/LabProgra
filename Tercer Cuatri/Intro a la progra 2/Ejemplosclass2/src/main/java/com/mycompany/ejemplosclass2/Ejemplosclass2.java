/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplosclass2;
import javax.swing.JOptionPane;
/**
 *
 * @author tamar
 */
public class Ejemplosclass2 {

    public static void main(String[] args) {
        int eleccion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione un dia : 1. Lunes, 2. Martes, 3. Miercoles, 4. Jueves, 5. Viernes, 6.Sabado, 7.Domingo "));
       
        switch (eleccion) {
        case 1:
            System.out.println("Lunes");
        case 2:
            System.out.println("Martes");
        case 3:
            System.out.println("Miercoles");
        case 4:
            System.out.println("Jueves");
        case 5:
            System.out.println("Viernes");
        case 6:
            System.out.println("Sabado");
        case 7:
            System.out.println("Domingo");
        default:
            System.out.println("Digite un numero valido");
            break;
    }
    }
       
}
