/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseString;

/**
 *
 * @author rosa
 */
public class ClaseString {
    public static void main(String[] args) {
        
        String s= "iesmardealboran.com";
        System.out.println("Me quiero morir");
        
        //Tamaño de la cadena
        System.out.println("Tamaño: "+s.length());
        
        //Obtener el char de una posición concreta
        System.out.println("Char almacenado a la posición 5: "+s.charAt(5));
        
        //Obtener subcadena desde el caracter i-ésimo hasta el final de
        //la cadena
        
        String subcadena=s.substring(3);
        System.out.println("Subcadena= "+subcadena);
        
        //Obtener subcadena desde el caracter i-ésimo hasta el
        //caracter j-esimo de la cadena
        
        subcadena=s.substring(8,15); //coge hasta el caracter último -1
        System.out.println("Subcadena= "+subcadena);
        
        //Concatenar cadenas. Equivale al operador +
        String s1="ies";
        String s2="mardealboran.com";
        String nuevo=s1+s2;
        String nuevo2=s1.concat(s2);
        System.out.println("Nuevo: "+nuevo);
        System.out.println("Nuevo2: "+nuevo2);
        
    }
}
