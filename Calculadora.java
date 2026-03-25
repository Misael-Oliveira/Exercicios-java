
package com.mycompany.pooencapsulamento;

public class Calculadora {
    public int somar(int a, int b){
        return a +b;
    }
    public int somar (int a, int b, int c){
        return a + b+ c;
    }
    public double somar (double a, double b){
        return a + b;
    }
   
    public static int somar(double a, int b){
        return (int) a +b;
    }
}
