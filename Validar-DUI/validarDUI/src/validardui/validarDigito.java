/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validardui;

/**
 *
 * @author Jymmy
 */
public class validarDigito {

    int[] numeros = {9, 8, 7, 6, 5, 4, 3, 2};
    char[] digitos;
    int acumulador = 0;
    boolean respuesta = false;

    public boolean validar(String dui, int longitud) {
        if (dui.contains("-")) {
            dui = dui.replace("-", "");
        }
        digitos = String.valueOf(dui).toCharArray();

        try {
            for (int i = 0; i < longitud; i++) {

                acumulador = acumulador + ((Character.getNumericValue(digitos[i])) * numeros[i]);
                //System.out.println("" + acumulador + " " + i + " " + digitos[i]);
            }
            acumulador = (10 - (acumulador % 10));
            //Si el digito validador es igual a la resta el DUI es correcto si la resta da 0 el DUi es correcto
            if ((acumulador == (Character.getNumericValue(digitos[8]))) || acumulador == 0) {
                System.out.println("VALIDO \nEl digito validador es " + (Character.getNumericValue(digitos[8])) + " que es mayor o igual a " + (acumulador % 10) + " valor obtenido mediante formula");
                respuesta = true;
            } else {
                System.out.println("NO ES VALIDO \nya que el digito validador es menor " + (acumulador % 10) + " valor obtenido mediante formula");
                respuesta = false;
            }

        } catch (Exception e) {
            System.out.println("" + e);
            respuesta = false;
        }

        return respuesta;
    }

}
