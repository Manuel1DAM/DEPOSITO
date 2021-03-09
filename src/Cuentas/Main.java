/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuentas;

/**
  * @version 8.2 RC
  * @author Manuel Garcia
  * @since 09/03/2021
*/
public class Main {
    
    /**
     * 
     * @param args argumentos de consola del metodo main
     */
    
    public static void main(String[] args) {
        
        /**
         * Atributos creados:
         * miCuenta
         * saldoActual
         */
        
        CCuenta miCuenta;
        double saldoActual;
        
        /**
         * Creación del objeto miCuenta
         * Llamada al método estado de la clase CCuenta
         * Mostrar por pantalla el saldo actual
         */
        
        miCuenta = new CCuenta("Antonio López","1000-2365-85-123456789",2500,0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es" + saldoActual);
        
        /** 
          * @throws Exception devuelve excepcion en el caso de que la cantidad retirada que entre sea negativa o superior al saldo
        */
        
        try {
            miCuenta.retirar(2300);
        }catch (Exception e) {
            System.out.println("Fallo al retirar");
        }
        
        /**
          * @throws Exception devuelve la excepcion en el caso de que la cantidad ingresada que entre sea negativa al saldo
        */
        
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(695);
        }catch (Exception e) {
            System.out.println("Fallo al ingresar");
        }
    }
    
    
        /* EJERCICIO DE REFACTORIZAR */
//    public static void main(String[] args) {
//        operativa_cuenta(100);
//    }
//
//    private static void operativa_cuenta(float cantidad) {
//        CCuenta cuenta1;
//        double saldoActual;
//        
//        cuenta1 = new CCuenta("Antonio López","1000-2365-85-123456789",2500,0);
//        saldoActual = cuenta1.estado();
//        System.out.println("El saldo actual es" + saldoActual);
//        
//        try {
//            cuenta1.retirar(2300);
//        }catch (Exception e) {
//            System.out.println("Fallo al retirar");
//        }
//        
//        try {
//            System.out.println("Ingreso en cuenta");
//            cuenta1.ingresar(695);
//        }catch (Exception e) {
//            System.out.println("Fallo al retirar");
//        }
//    }
}
