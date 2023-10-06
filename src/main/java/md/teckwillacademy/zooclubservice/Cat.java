package md.teckwillacademy.zooclubservice;

public class Cat extends Animal {
    public Cat (String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Miau,Miau");

    }

    @Override
    public void eat() {
        System.out.println("A cat is eating kitkat");
    }
}
