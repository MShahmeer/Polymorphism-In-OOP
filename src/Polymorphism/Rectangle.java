/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author Muhammad Shahmeer
 */
public class Rectangle extends Shape {

    private int length;
    private int width;
    
    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    
    public double calArea(){
        return length* width;
    }
    
    public double calCircumference(){
        return 2*(length+width);
    }
    
}
