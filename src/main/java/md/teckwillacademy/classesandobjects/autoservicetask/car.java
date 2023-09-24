package md.teckwillacademy.classesandobjects.autoservicetask;

public class car {
    public String vinCode;

    public String mark;
    public Person owner;

    public car( String vinCodeInput,String mark,Person owner){
        vinCode = vinCodeInput;
        this.mark = mark;
        this.owner = owner;
        System.out.println("Now there is a car in the service of type" + mark);
    }


}


