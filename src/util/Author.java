//Class "Автор" creates author of book.
package util;

public class Author {
    //private переменные-члены класса
    private String name;
    private String email;

    //Конструктор
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //public геттеры и сеттеры для private переменных-членов класса.
    /* Отсутствует сеттер для поля name, поскольку он описан таким образом, что не может быть изменен

     */
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Описание public метода toString()
    public String toString() {
        return name + "," + email;
    }
}
