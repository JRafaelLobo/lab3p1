package com.mycompany.lab3p1_joselobo;

import java.util.Scanner;

/**
 *
 * @author rinal
 */
public class Lab3P1_JoseLobo {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
        int opcion;
        do{
            System.out.println("Menu");
            System.out.println("1--->Diptongo");
            System.out.println("2--->Sumatoria PI");
            System.out.println("3--->Time Clock");
            System.out.println("4--->Salir");
            System.out.println("Ingrese su opcion: ");
            opcion = leer.nextInt();

           switch(opcion){
               case 1 ->{
                   int TF=0,Final=0;
                   System.out.println("Ingrese una cadena: ");
                   String palabra = leer.next().toLowerCase();
                   for (int i=0;i<palabra.length();i++){
                       char letra = palabra.charAt(i);
                       if (TF==1){
                           switch (letra) {
                            case 'a','e','i','o','u' ->{
                               Final = 1;
                               break;
                           }//case vocales 2
                            default ->{
                                break;
                            }//defaul vocales
                       }//diptongo
                       }//if tf
                       switch(letra){
                          case 'a','e','i','o','u' ->{
                               TF = 1;
                               break;
                           }//case vocales
                          default ->{
                               TF = 0;
                           }//TF
                       }//char verificar
                   }//for case 1
                   if (Final==1){
                       System.out.println("Su palabra es un diptongo");
                   }//final verdad
                   else{
                       System.out.println("Su palabra no es un diptongo");
                   }
               }//case 1
               case 2 ->{
                   System.out.println("Ingrese su limite: ");
                   double total2=0;
                   int k = leer.nextInt();
                   for (int n=0;n<k;n++){
                       int divisor = 2*n+1;
                       double dividendo = Math.pow(-1,n);
                       double total = dividendo/divisor;
                       total2 += total;
                   }//for
                   double resultado = 4*total2;
                   System.out.println("Su resultado es: "+ resultado);
               }//case 2
               case 3 ->{
                   System.out.println("Ingrese un numero impar positivo");
                   int num = leer.nextInt();
                   int rem = num%2;
                   while (num>0&rem==0){
                       System.out.println("Numero Invalido");
                       System.out.println("Ingrese un numero impar positivo:");
                       num = leer.nextInt();
                       rem = num%2;
                   }//while numero invalido
                   int med = num/2,i,k;
                   for(i=0;i<=med;i++){
                       for (k=0;k<i;k++){
                           System.out.print(" ");
                       }//for 2
                       int total = (num-k);
                       for (k=total;k>=i+1;k--){
                           System.out.print("*");
                       }//for 2
                       System.out.println();
                   }//for 1
                   int c=3;
                   for(i=i;i<=num;i++){
                       int total = (num-i);
                       for (k=total-1;k>0;k--){
                           System.out.print(" ");
                       }//for 2
                       if(c<=num){
                        for (k=1;k<=c;k++){
                            System.out.print("*");
                        }//for 2
                        c+=2;
                       }//if
                       System.out.println();
                   }//for base
               }//case 3
           }//switch
        }while(opcion!=4);//do todo
    }//public static void main
}//public class
