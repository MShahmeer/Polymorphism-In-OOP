/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author Muhammad Shahmeer
 */
public class Main {
    public static void main(String[] args) {
        Shape shapes[] = new Shape[3];
        shapes[0] = new Rectangle("red", 2,3 );
        shapes[1] = new Circle("blue", 2.3);
        shapes[2] = new Rectangle("green", 4, 5);
        
        double totalArea = 0;
        
        for (Shape shape : shapes){
            System.out.println(shape.calArea());
            totalArea += shape.calArea();
        }
        
        System.out.println("Total Area: "+Math.round(totalArea));
    }
}

//Now this is the concept of the polymorphism, 
//there is a shape object that has different version, 
//it can be Circle, Rectangle, or any other
