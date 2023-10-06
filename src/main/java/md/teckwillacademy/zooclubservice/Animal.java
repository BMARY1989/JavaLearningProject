package md.teckwillacademy.zooclubservice;

public  abstract class Animal implements AnimalInterface{
    private String name;
    public Animal (String nameValue){
        this.name = nameValue;

    }
    public String getName(){
        return  this.name + " - This is from the child class";
    }
    public  abstract  void eat();

    }

