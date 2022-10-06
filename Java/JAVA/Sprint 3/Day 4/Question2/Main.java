package Question2;
public class Main {

    public static void main(String[] args) {


        Shape shape = new Area();
        Area area = (Area) shape;

        System.out.println(area.circleArea(10));
        System.out.println(area.rectangleArea(10,10));
        System.out.println(area.squareArea(10));

    }
}
