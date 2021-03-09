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
public class CCuenta {
    
    /**
      * Atributos empleados:
      * nombre nombre de la persona
      * cuenta nombre de la cuenta
      * saldo saldo de la cuenta
      * tipoInteres tipo de interes de la cuenta
    */
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /* TODO LO QUE ESTA COMENTADO ES DEL EJERCICIO DE REFACTORIZAR */
//    /**
//     * @return the nombre
//     */
//    public String getNombre() {
//        return nombre;
//    }
//
//    /**
//     * @param nombre the nombre to set
//     */
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    /**
//     * @return the cuenta
//     */
//    public String getCuenta() {
//        return cuenta;
//    }
//
//    /**
//     * @param cuenta the cuenta to set
//     */
//    public void setCuenta(String cuenta) {
//        this.cuenta = cuenta;
//    }
//
//    /**
//     * @return the saldo
//     */
//    public double getSaldo() {
//        return saldo;
//    }
//
//    /**
//     * @param saldo the saldo to set
//     */
//    public void setSaldo(double saldo) {
//        this.saldo = saldo;
//    }
//
//    /**
//     * @return the tipoInterés
//     */
//    public double getTipoInterés() {
//        return tipoInterés;
//    }
//
//    /**
//     * @param tipoInterés the tipoInterés to set
//     */
//    public void setTipoInterés(double tipoInterés) {
//        this.tipoInterés = tipoInterés;
//    }

    /**
      * Constructor con 0 parametros
    */
    
    public CCuenta() {
    }

//    public CCuenta(String nombre, String cuenta, double saldo, double tipo) {
//        this.nombre = nombre;
//        this.cuenta = cuenta;
//        this.saldo = saldo;
//    }

    /**
      * Constructor con 4 parametros
      * @param nom nombre de la persona
      * @param cue nombre de la cuenta
      * @param sal saldo de la cuenta
      * @param tipo tipo de interes de la cuenta
    */
    
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
    
    /**
      * @return estado devuelve el saldo de nuestra cuenta al metodo estado
    */
    
    public double estado(){
        return saldo;
    }
    
    /**
      * @param cantidad parametro double que le entra al metodo
      * @throws Exception devuelve la excepcion en el caso de que la cantidad que entre sea negativa al saldo
    */
    
    public void ingresar(double cantidad) throws Exception {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }
    
    /** 
      * @param cantidad parametro double que le entra al metodo
      * @throws Exception devuelve excepcion en el caso de que la cantidad que entre sea negativa o superior al saldo
    */
    
    public void retirar(double cantidad) throws Exception{
        if (cantidad <= 0){
            throw new Exception ("No se puede retirar una cantidad negativa");   
        }
        if (estado()< cantidad){
            throw new Exception ("No hay suficiente saldo");
        }    
        saldo = saldo - cantidad;
    }
    
    

            
            
    
}
