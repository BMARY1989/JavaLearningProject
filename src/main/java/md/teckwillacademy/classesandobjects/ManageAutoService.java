package md.teckwillacademy.classesandobjects;

import md.teckwillacademy.classesandobjects.autoservicetask.Garage;
import md.teckwillacademy.classesandobjects.autoservicetask.Person;
import md.teckwillacademy.classesandobjects.autoservicetask.Worker;
import md.teckwillacademy.classesandobjects.autoservicetask.car;

import java.awt.*;
import java.sql.ClientInfoStatus;
import java.util.concurrent.atomic.AtomicReference;

public class ManageAutoService {
     public static void main (String [] args) {
         Garage autoDocGarage;


         autoDocGarage = new Garage();

         autoDocGarage. address = "Stefan Cel Mare,Ihub 64";
         autoDocGarage.surfaceM2 = 450;

         System.out.println("Obiectul autoDocGarage are urmatoarele proprietati" + autoDocGarage.address
                 + "  " + autoDocGarage.surfaceM2 + "  " +autoDocGarage.capacity);

         Garage garajialoveni = new Garage ();
         System.out.println("Obiectul garajialoveni are urmatoarele proprietati" + garajialoveni.address
                 + "  " + garajialoveni.surfaceM2 + "  " +autoDocGarage.capacity);



        Worker vasile = new Worker ();

        vasile.name = " vasile";
       vasile.age = 54 ;
       System.out.println("Obiectul nostru are numele de " + vasile.name +" si are " + vasile.age + " ani");

       Worker Ion = new Worker ();
         System.out.println("Obiectul nostru are numele de " + Ion.name +" si are " + Ion.age + " ani");


 Person client1 = new Person( "37379888688");
 car porscheNKK123 = new car ( "AfsdfD542", "Porsche Cayenne",client1);
 car mercedesBenzTranzit = new car( "DFSD45", "Mercedes",
         new Person( "5566546421"));
 System.out.println("Obiectul nostru are numele de " + porscheNKK123.mark + " " +
         " Si proprietarul poate fi apelat la " + porscheNKK123.owner.phoneNumber);



     }
}
