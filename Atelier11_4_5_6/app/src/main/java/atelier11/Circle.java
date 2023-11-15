package atelier11;

// class circle

public class Circle extends Shape{

    private double radius; //truc de gpt ca marche peut etre pas

    public Circle() { } 

    public Circle(double radius) { //constructeurs :) si ca shie c la faute a ...

     }

     public Circle(double radius, String isColor, Boolean isFilled ) {

        super( isColor, isFilled );
    }

    public double getRadius() { //get method

        return radius;
    }
    public void setRadius(double radius){ //set method

        this.radius = radius;
    }
    public double getArea() { //methods
        
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        
        return Math.PI * 2 * radius;
    }
}