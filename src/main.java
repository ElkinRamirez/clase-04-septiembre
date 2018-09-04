/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.print("Nombre de la Pizza: ");
        String nombre=leer.next();
        
        System.out.print("Diametro de la pizza: ");
        double diametro=leer.nextDouble();
        
        System.out.print("Valor de la Pizza: ");
        double valor=leer.nextDouble();  
     // Punto B   
    Pizza p1=new Pizza(nombre,diametro,valor);
        System.out.print("Parametros Pizza 1: ");
        System.out.print(p1.getNombre()+",");
        System.out.print(p1.getDiametro()+",");
        System.out.println(p1.getValor());
    
    Pizza p2=new Pizza("Queso",15,13.65);
        System.out.println("Parametros pizza 2: "+ p2.getNombre()+","+ p2.getDiametro()+","+ p2.getValor());
    
    //Punto C
        int tam=2;
        Pizza[] arrayPizzas=new Pizza[tam];    
       String[] arrayNombre=new String[tam];
       double[] arrayDiametro= new double[tam];
       double[] arrayValor= new double [tam];
        
        for (int i = 0; i < tam; i++) {
            System.out.print("Nombre de la Pizza: ");
             nombre=leer.next();
        
            System.out.print("Diametro de la pizza: ");
            diametro=leer.nextDouble();
        
            System.out.print("Valor de la Pizza: ");
            valor=leer.nextDouble();
            Pizza pizza=new Pizza(nombre,diametro,valor);
            arrayPizzas[i]=pizza;
        }
        for (int i = 0; i < tam; i++) {
            System.out.println(arrayPizzas[i]);
        }
        
    }
}
