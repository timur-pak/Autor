import util.Author;

public class TestAuthor{
    public static void main(String[] args) {

        //Проверка конструктора и метода toString()
        Author Ivanov = new Author("Иванов","ivan@nikuda.com");
        System.out.println(Ivanov); //проверка toString()

        //Проверка сеттеров и геттеров
        Ivanov.setEmail("ivan@nikuda");
        System.out.println(Ivanov);// проверка toString()
        System.out.println("имя:" + Ivanov.getName());
        System.out.println("email:" + Ivanov.getEmail());
    }
}