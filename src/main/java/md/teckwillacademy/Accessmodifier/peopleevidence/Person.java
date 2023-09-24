package md.teckwillacademy.Accessmodifier.peopleevidence;

import javax.xml.namespace.QName;

public class Person {
    // Class variable
    static boolean hasHeart = true;
    public static boolean hasBrain;
    //Private-Instance variable becouse it defines the objects of Person class
    private long idnp;

    //Default - Instance variable
    String maritalStatus;

    //Protected - Instance variable
    protected  String name;
    //Public - Instance variable
    public boolean isRetired;

    public Person(){
        System.out.println( "This is a defined constructor withput params");
    }
    public  Person(  long idnp, String nameInput){
        this.idnp = idnp;
        name = nameInput;
        System.out.println(" This is a defined constructor with 2 params");

    }
    public Person(long idnp, String name ,String maritalStatus,boolean isRetired){
        this.idnp = idnp;
        this.maritalStatus = maritalStatus;
        this.isRetired = isRetired;
        System.out.println( "This is a constructor with all the params");


    }


    }

