package atelier11;

// class circle

public class Circle extends Shape{

    private double radius; //truc de gpt ca marche peut etre pas

    public Circle() { } 

    public Circle(double radius) { //constructeurs :) si ca shie c la faute a Victo
        this.radius = radius;

    }

     public Circle(double radius, String isColor, Boolean isFilled ) {

        super( isColor, isFilled );
        this.radius = radius;
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

    public String toString() {

        return "radius of circle" + radius + ", " + super.toString();
    }

    public static void main(String[] args){ //print btw ca fait radius 0.0 jsp pourquoi

        Circle Circle = new Circle(5.0);
        System.out.println(Circle);
    }
}