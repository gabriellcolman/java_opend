package com.bicoserus;

public class ejercicio_3 {
    public static void main(String[] args) {

        String [] palabras = {"hola ","mundo ","feo ","y cruel"};
        String resultado = "" ;

        for(int i = 0 ;i < palabras.length;i ++){
            resultado +=palabras [i]+ "";
        }
        System.out.println(resultado);
    }
}
