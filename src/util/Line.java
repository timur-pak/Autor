package util;
// Отрезок включает в себя две точки, точки начала и конца отрезка объекты класса Point

public class Line {
    //private переменные объекта члена класса
    Point begin, end;
    //Конструкторы
    public Line(int x1, int y1, int x2, int y2){
        begin=new Point(x1, y1); //Создает объявленные объекты
        end = new Point(x2, y2);
    };
    public Line(Point begin, Point end){
        this.begin=begin; //Вызов созданных объектов
        this.end=end;
    }
    //public геттеры и сеттеры для private переменных-членов класса

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX(){
        return begin.getX(); //getX() класса Point для начала отрезка
    }
    public int getBeginY(){
        return begin.getY(); //getY() класса Point для начала отрезка
    }
    public void setBeginX(int x){
        begin.setX(x);
    }
    public void setBeginY(int y){
        begin.setY(y);
    }
    public int[] getBeginXY(){
        return begin.getXY(); //getXY() класса Point для начала отрезка
    }
    public void setBeginXY(int x, int y) {
        begin.setXY(x,y); //setXY() класса Point для начала отрезка
    }
    public int getEndX(){
        return end.getX();
    }
    public int getEndY(){
        return end.getY();
    }
    public void setEndX(int x){
        end.setX(x);
    }
    public void setEndY(int y){
        end.setY(y);
    }
    public int[] getEndXY(){
        return end.getXY();
    }
    public void setEndXY(int x, int y){
        end.setXY(x,y);
    }
    public String toString() {
        return "Отрезок[начало="+begin+",конец="+end+"]";
    }
    public double getLength(){
        return begin.distance(end); //Вычисление расстояния между точками
    }

}
