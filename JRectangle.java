package JAVA;



// Задача 2:
// Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства ширина (width) и высота (height). Класс должен обладать следующими методами:

// Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
// Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
// Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
// Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
// Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника (2 * (ширина + высота)).

public class JRectangle {

 public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(10,5);
        rectangle1.result();
        System.out.println();
        rectangle2.result();
        }
}

    class Rectangle {
    private int width;
    private int height;

    // Конструктор без параметров, который создает прямоугольник 2 на 1.
    public Rectangle() {    
        width = 2; 
        height = 1;
    }
    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }

    public int calculatePerimeter() {
        return 2 * (width + height);
    }

    public void result() {
        System.out.println("Ширина: " + getWidth());
        System.out.println("Высота: " + getHeight());
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Периметр: " + calculatePerimeter());
    }
    
}
