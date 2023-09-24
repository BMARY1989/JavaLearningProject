package md.teckwillacademy.Accessmodifier;

import md.teckwillacademy.Accessmodifier.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        Person Cristina = new Person();
        System.out.println(Cristina.isRetired);
        Cristina.isRetired = true;
        if (Cristina.isRetired){
            System.out.println("Cristina is retired");
        } else {
           System.out.println( "Cristina is not retired");
        }
       Person eliza = new Person(123345l ,"Eliza" , "Married",true);

    System.out.println(" Available info about eliza:" + eliza.isRetired);
        if (eliza.isRetired){
            System.out.println("Eliza is retired");
        } else {
            System.out.println( "Eliza is not retired");

    }
        Person marcel = new Person( 1233442,"Marcel");
        System.out.println("Available info about Marcel:" + marcel.isRetired);

        if (marcel.isRetired){
            System.out.println("Marcel is retired");
        } else {
            System.out.println( "Marcel is not retired");
        }
        Person.hasBrain = true;
        System.out.println(Person.hasBrain);
    }
    }