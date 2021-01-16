package oop;

public class TestEatCat {
    public static void main(String[] args) {
       Cat[]cats = { new Cat("Baton",15),new Cat("Murzik", 17),new Cat("FESDWSd", 5) };
       Plate plate = new Plate(15);
        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info1();
        }
        Cat catTest = new Cat("TestCat", 10);
        System.out.println();
        catTest.eat(plate);
        catTest.info1();
        plate.addFood(20);
        catTest.eat(plate);
        catTest.info1();//sd
        }
    }

