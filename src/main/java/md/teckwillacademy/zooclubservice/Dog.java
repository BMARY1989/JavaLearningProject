package md.teckwillacademy.zooclubservice;

public class Dog extends Animal {
    private boolean hasAGodLife;
    public Dog(String nameOfTheDog,boolean hasAGodLife) {
        super(nameOfTheDog);
        this.hasAGodLife = hasAGodLife;

    }
    public Dog(String nameOfTheDog) {
        super(nameOfTheDog);
    }

    @Override
    public void makeSound() {
        System.out.println("Hrrr,Hrrr");

    }

    @Override
    public void eat() {
        System.out.println("The dog is eating pedigri");
    }


}
