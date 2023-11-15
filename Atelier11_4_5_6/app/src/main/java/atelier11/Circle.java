package atelier11;

// class circle

public class Circle extends Shape{

    private double radius; //truc de gpt ca marche peut etre pas
    public void setRadius(double radius){

        this.radius = radius;

    }

    public double getRadius() {
        return radius;

    }
    
    public Circle() { } 

    public Circle(double radius) { //constructeurs :) si ca shie c la faute a ...

        String isColor;
        Boolean isFilled;
     }

     public Circle(double radius, String isColor, Boolean isFilled ) {

        super( isColor, isFilled );
     }
}