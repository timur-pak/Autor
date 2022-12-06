import util.*;

public class TestBook {
    public static void main(String[] args){
        //Создаем объект класса Author, чтобы создать объект класса Book
        Author Ivanov = new Author("Иван Иванов", "ivanov1@kuda.com");
        System.out.println(Ivanov); //Применение метода toString() для объкта класса Author

        //Проверка конструктора и метода toString() для класса Book
        Book dummyBook=new Book("Java для чайников", Ivanov, 200, 99);
        System.out.println(dummyBook); //Метод toString() для класса Book

        //Проверка геттеров и сеттеров
        dummyBook.setPrice(300.75);
        dummyBook.setQty(88);
        System.out.println(dummyBook); //Проверка метода toString() для класса Book
        System.out.println("Название: "     + dummyBook.getName());
        System.out.println("Цена: "         + dummyBook.getPrice());
        System.out.println("Количество: "   + dummyBook.getQty());
        System.out.println("Автор: "        + dummyBook.getAuthor()); //вызов метода toString из класса Author
        System.out.println("имя автора: "   + dummyBook.getAuthor().getName());
        System.out.println("email автора: " + dummyBook.getAuthor().getEmail());
        //Создадим анонимный объект класса Author для создания объекта класса Book
        Book moreDummyBook = new Book("Java для опытных",
                new Author("Петр Петров", "petrov@nikuda.com"), //анонимный объект
                                                                           // класса Author
                1.99, 8);
        System.out.println(moreDummyBook); //Применение метода toString() для класса Book

    }
}
