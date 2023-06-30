
// Задача 1:
// Создайте класс "Кот" (Cat) со следующими свойствами:

// Приватное поле "имя" (name) типа String для хранения имени кота.
// Приватное поле "возраст" (age) типа int для хранения возраста кота.
// Публичные методы доступа (геттеры и сеттеры) для полей "имя" и "возраст".
// Публичный метод "приветствие" (greet), который выводит на консоль приветствие вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет).".

// Дополнительное задание:
// Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String. Добавьте соответствующее поле в классе "Кот" и методы доступа для него.
// Измените метод "приветствие" класса "Кот", чтобы он выводил приветствие вида 
// "Мяу! Меня зовут <имя>. Мне <возраст> года(лет). Мой владелец - <имя владельца>.".
package JAVA;

public class Jcat {
    public static void main(String[] args) {
    Owner owner1 = new Owner("Aleksej"); 
    Owner owner2 = new Owner("Nikita"); 
    Cat cat1 = new Cat("jack", 10);
    Cat cat2 = new Cat("misha", 5);
    cat1.setownerName(owner1.getName());
    cat1.greet();
    cat2.setownerName(owner2.getName());
    cat2.greet();
    }
}

///     НЕ ПОЛУЧИЛОСЬ СДЕЛАТЬ ЧЕРЕЗ extends :(

class Owner{
    private String name1;   ///можно было поменять name из условия на name1? Просто сильно путался в в переменных :(
    
    public Owner(String name1) {
         this.name1 = name1;
    }

    public String getName() {
        return name1;
    }
    public void setName(String name1) {
        this.name1 = name1;
    }
}

 class Cat{

    private String name;
    private int age;
    private String ownerName;
    

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getownerName() {
        return ownerName;
    }
    public void setownerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void greet() {
        System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года/лет. Мой владелец - " +  ownerName);
    }
 }
