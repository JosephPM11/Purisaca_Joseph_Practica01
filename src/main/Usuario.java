/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author josep
 */
public class Usuario {
    private String paterno;
    private String materno;
    private String nombres;
    private String documento;
    private String tipoDocumento;
    
    //Constructor
    public Usuario(String paterno){
        this.paterno = paterno;
    }
    //Constructor sobrecargado
    public Usuario(String paterno, String materno, String nombres, String documento, String tipoDocumento){
        this.paterno = paterno;
        this.materno = materno;
        this.nombres = nombres;
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
    }

    //Getters y Setters
    public String getPaterno() {
        return paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public String getNombres() {
        return nombres;
    }

    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    
    //Métodos por defecto
    public float recargar(float monto){
        return 0;
    }
    public boolean consumir(){
        return true;
    }
}
