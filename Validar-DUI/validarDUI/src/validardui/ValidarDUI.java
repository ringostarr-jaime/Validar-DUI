/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validardui;

import java.util.Scanner;

/**
 *
 * @author Jymmy
 */
public class ValidarDUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String dui = "0";
        int longitud = 8;

        validarDigito comprobar = new validarDigito();
        Scanner captura = new Scanner(System.in);

        System.out.println("Ingrese su numero de dui");
        dui = captura.nextLine();

        comprobar.validar(dui, longitud);

        //System.out.println("DUI "+dui);
    }

}
