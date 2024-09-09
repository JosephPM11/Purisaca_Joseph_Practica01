/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--INGRESAR DATOS DE LA TARJETA 1--");
        //Datos Tarjeta1
        System.out.println("Ingresa el numero de tarjeta: ");
        int tarjeta = scanner.nextInt();
        System.out.println("Ingresa el saldo: ");
        float saldo = scanner.nextFloat();
        System.out.println("Ingresa activo (T/F): ");
        boolean activo = scanner.nextBoolean();
        System.out.println("Ingresa el precio: ");
        float precio = scanner.nextFloat();
        
        //Datos Usuario1
        scanner.nextLine();
        System.out.println("");
        System.out.println("--INGRESAR DATOS DEL USUARIO 1--");
        System.out.println("Ingresa el apellido paterno: ");
        String paterno = scanner.nextLine();
        System.out.println("Ingresa el apellido materno: ");
        String materno = scanner.nextLine();
        System.out.println("Ingresa los nombres: ");
        String nombres = scanner.nextLine();
        System.out.println("Ingresa el documento: ");
        String documento = scanner.nextLine();
        System.out.println("Ingresa el tipo de documento: ");
        String tipoDocumento = scanner.nextLine();
        
        
        Tarjeta tarjeta1 = new Tarjeta(tarjeta,saldo,activo,precio);
        Usuario usuario1 = new Usuario(paterno,materno,nombres,documento,tipoDocumento);
        
       
        
    }
    
}
