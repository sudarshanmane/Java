public class Main {

    public static void main(String[] args) {
        Shape obj = new Shape() ;


        Circle circle = new Circle();
        circle.radius =10;


        Rectangle rectangle = new Rectangle();
        rectangle.length= 12;
        rectangle.breadth= 10;


        Square square = new Square();
        square.side= 10;


        obj.area(circle);
        obj.area(rectangle);
        obj.area(square);

    }


//    Explanation
//    from the above Example we can conclude that the static polymorphism means we can access the same
//    methods having the same  names if they hava the different classes without any problems by passing the
//    same arguments .

}
