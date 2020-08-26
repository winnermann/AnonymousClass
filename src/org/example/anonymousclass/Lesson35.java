package org.example.anonymousclass;

interface AbleToEat{
    public void eat();
}

public class Lesson35 {
    public static void main(String[] args) {
        //создаем объект Интерфейса AbleToEat
        //объект этого класса присваивается Интерфейсу
        //Это Анонимный класс
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating....");
            }
        };
        ableToEat.eat();

    }
}
