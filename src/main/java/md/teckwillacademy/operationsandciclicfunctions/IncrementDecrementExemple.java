package md.teckwillacademy.operationsandciclicfunctions;

public class IncrementDecrementExemple {
    public static void main(String[] args) {
        int a  = 35;
        //Incrementare
        a++;

        System.out.println("Valoarea dupa incrementare:" +a);

        //Incrementare pre-fixata
        ++a;
        //a=7
        int b = ++a;
        //b = 10, a =8;
        int a1 = a;
        int c = a++;
        //c = 10, a= 11

        System.out.println("Valoarea dupa incrementare pre -fixata:" +a);

        System.out.println("Afiseaza b = "+ b + " a1= " + a1 + " c" + c +"a2 = " +a);

        //Descrimentare
        a--;
        System.out.println("Valoarea dupa descrementare:" +a);
        //Descrementarea pre -fixata
        --a;
        System.out.println("Valoarea dupa descrementare pre-fixata:" + a);


}
}