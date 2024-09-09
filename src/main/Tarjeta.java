/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author josep
 */
public class Tarjeta {
    private int numero;
    private float saldo;
    private boolean activo;
    private float precio;
    
    //Constructor
    public Tarjeta(int numero){
        this.numero = numero;
    }
    //Constructor sobrecargado
    public Tarjeta(int numero, float saldo, boolean activo, float precio){
        this.numero = numero;
        this.saldo = saldo;
        this.activo = activo;
        this.precio= precio;
    }
    
    //Getters y Setters
    public int getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean isActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    //Métodos por defecto
    public boolean recargar(float monto){ //Aumentar saldo
        if(monto>0){
            saldo+=monto;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean consumir(float monto){ //Retirar saldo
        if(monto<=saldo){
            saldo-=monto;
            return true;
        }
        else{
            return false;
        }
    }
}
