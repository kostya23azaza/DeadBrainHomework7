package oop;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("Plate = " + food);
    }
    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int appetite) {
        int decreasefood = food - appetite;
        if (decreasefood<0) {
            return false;
        }
        this.food-=appetite;
        return true;
    }
    public void addFood(int food) {
        this.food+=food;
        System.out.println("Добавили коту еды");
    }
}
