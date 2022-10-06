
class Circle {
int radius;
}

class Rectangle{
    int length;
    int breadth;
}

class Square{
    int side;
}






public class Shape {

    public void area(Circle circle){
        System.out.println(3.14 * circle.radius* circle.radius);
    }
    public void area(Rectangle rectangle){
        System.out.println(rectangle.breadth  * rectangle.length);
    }
    public void area(Square square){
        System.out.println(square.side *  square.side );

    }



}
