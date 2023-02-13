package Polymorphism;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Muhammad Shahmeer
 */

//Abstraction is the implementation at the very low level
public abstract class Shape {
    
    private String color;
    
    public Shape(String color) {
        this.color = color;
    }
    
    public abstract double calCircumference();
    public abstract double calArea();
}
