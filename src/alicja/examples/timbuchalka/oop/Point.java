package alicja.examples.timbuchalka.oop;
///You have to represent a point in 2D space. Write a class with the name Point. The class needs two fields (instance variables) with name x and y of type int.
//The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor). The second constructor has parameters x and y of type int and it needs to initialize the fields.
//Write the following methods (instance methods):
//* Method named getX without any parameters, it needs to return the value of x field.
//* Method named getY without any parameters, it needs to return the value of y field.
//* Method named setX with one parameter of type int, it needs to set the value of the x field.
//* Method named setY with one parameter of type int, it needs to set the value of the y field.
//* Method named distance without any parameters, it needs to return the distance between this Point and Point 0,0 as double.
//* Method named distance with two parameters x, y both of type int, it needs to return the distance between this Point and Point x,y as double.
//* Method named distance with parameter another of type Point, it needs to return the distance between this Point and another Point as double.
//
//How to find the distance between two points?To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
//
//d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
//
//Where √ represents square root.
public class Point {

    private int x;
    private int y;

    public Point(){
        this.x=0;
        this.y=0;
    }

    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
        //w zaleznosci z jakiego constructors stworzymy obiekt bedzie mial on wspolrzedne punktu albo 0,0 albo jakie wlozymy w nawiasy
        //tutaj odleglosc puntku z wybrengo constructora od 0.0
        //d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
        return Math.sqrt((0-this.x)*(0-this.x)+(0-this.y)*(0-this.y));
    }
    public double distance(int x, int y){
        //tutaj odleglosc punktu z wybranego konstrutoroa od punktu okreslonego przy powolywaniu metody
        //d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
        return Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
    }
    public double distance(Point another){
        //tutaj odleglosc punktu z wybrengo konstruktora od drugiego obiektu tej samej klasy
        //d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
        return Math.sqrt((another.getX()-this.x)*(another.getX()-this.x)+(another.getY()-this.y)*(another.getY()-this.y));
    }
}
