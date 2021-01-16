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
        System.out.println();
        String test = "I like Java!!!";
        System.out.println(test.replace("a","o"));
        System.out.println(test.charAt(13));
        System.out.println(test.endsWith("!!!"));
        System.out.println(test.startsWith("I like"));
        System.out.println(test.contains("Java"));
        System.out.println(test.indexOf("Java"));
        System.out.println(test.toLowerCase());
        System.out.println(test.toUpperCase());//'kk
        System.out.println(test.substring(7,11));
        }
    }

