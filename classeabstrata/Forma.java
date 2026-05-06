/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classeabstrata;

/**
 *
 * @author misael.oliveira
 */
public abstract class Forma {
    protected String cor;
    protected double x;
    protected double y;
    
    public Forma (String pcor, double px, double py){
        this.cor=pcor;
        this.x=px;
        this.y=py;
    }
    
    public abstract void calcularArea();
    
    public void mover (double px, double py){
        x += px;
        y += py;
    }
}
