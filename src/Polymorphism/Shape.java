package Polymorphism;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Muhammad Shahmeer
 */
public abstract class Shape {
    
    private String color;
    
    public Shape(String color) {
        this.color = color;
    }
    
    public abstract double calCircumference();
    public abstract double calArea();
}
