//Класс Point моделирует двумерную точку (x,y)
package util;

public class Point {
    //private переменные-члены класса
    private int x,y;

    //Конструкторы(перегружаемые)
    public Point(){
        this.x=0;
        this.y=0;
    }
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){return this.x;}
    public int getY(){return this.y;}
    public void setX(int x){this.x=x;}
    public void setY(int y){this.y=y;}

    //Метод toString() возвращающий "(x,y)"
    public String toString() {
        return "("+this.x+","+this.y+")";
    }

    //Метод возвращающий массив из двух элементов, содержащий координаты x и y.
    public int[] getXY() {
        int[] results = new int[2];
        results[0]=this.x;
        results[1]=this.y;
        return results;
    }

    //Сеттер установим координаты x и y
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
    //возвращает расстояние от данного объекта до заданной точки (x,y)
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    //Возвращает расстнояние от данного объекта до заданной точки
    //объекта класса Point c именем another.
    public double distance(Point another){
        int xDiff=this.x-another.x;
        int yDiff=this.y-another.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    //Возвращает расстояние от данного объекта до точки (0,0)
    public double distance(){
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }


}
