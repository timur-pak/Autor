//Тестирующая программа для класса Point
import util.*;

public class TestPoint {
    public static void main(String[] args) {
        Point p1=new Point(1, 2);
        System.out.println(p1); //проверка toString()
        Point p2=new Point(); // конструктор по умолчанию
        System.out.println(p2);

        //Проверка геттеров и сеттеров
        p1.setX(3);
        p1.setY(4);

        System.out.println(p1); //вызывает toString() для проверки модифицированного объекта.
        System.out.println("X :"+p1.getX());
        System.out.println("Y :"+p1.getY());

        //проверка методов setXY() и getXY()
        p1.setXY(5,6);

        System.out.println(p1); //вызов toString();\
        System.out.println("X is:"+p1.getXY()[0]);
        System.out.println("Y is:"+p1.getXY()[1]);

        //Проверка 3-ех перегруженных версий метода distance.
        p2.setXY(10,11);
        System.out.printf("Расстояние: %.2f%n", p1.distance(10,11));
        System.out.printf("Расстояние: %.2f%n", p1.distance(p2));
        System.out.printf("Расстояние: %.2f%n", p2.distance(p1));
        System.out.printf("Расстояние: %.2f%n", p1.distance());


    }
}
