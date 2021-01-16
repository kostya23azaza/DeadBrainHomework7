package oop;

public class Cat {
    private final String name;
    private int appetite;
    private boolean hungry;

    public String getName() {
        return name;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate plate) {
        System.out.println("Cat is eating...");
        hungry=true;
        if (hungry&&plate.decreaseFood(getAppetite())) {
            hungry = false;
        }
    }


    public int getAppetite() {
        return appetite;
    }
    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
    public void info1() {
        String isHungry;
        if (hungry==true) {
            isHungry="кот голоден";
        } else isHungry="кот сыт";
        System.out.println("Info : " + isHungry );
    }
}
