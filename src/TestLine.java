import util.*;


public class TestLine {
    public static void main(String[] args) {
        int x1 = 2;
        int y1 = 2;
        int x2 = 7;
        int y2 = 7;
        //l1 Line = new Line();
        Line l1 = new Line( x1, y1, x2, y2);
        System.out.println(l1.toString());
        System.out.printf("Длина отрезка: %.2f%n", l1.getLength());

        Line l2 = new Line(new Point(2, 2),new Point(7, 7));
        System.out.println(l2.toString());
        System.out.printf("Длина отрезка: %.2f%n",l2.getLength());
        System.out.println(l1.getBeginXY());
        System.out.println(l1.getEndX());




    }


}
