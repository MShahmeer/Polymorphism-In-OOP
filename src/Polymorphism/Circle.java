/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author Muhammad Shahmeer
 */
public class Circle extends Shape {

    private double radius;
    
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    public double calCircumference(){
        return 2* Math.PI *radius;
    }
    
    public double calArea(){
        return Math.PI * radius * radius;
    }
    
}
