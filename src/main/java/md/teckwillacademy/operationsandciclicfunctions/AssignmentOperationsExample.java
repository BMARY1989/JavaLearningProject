package md.teckwillacademy.operationsandciclicfunctions;

public class AssignmentOperationsExample {
    public static void main(String[] args) {
       int a = 7;
       int b = 3;

       //Atribuirea simpla
        int result = a;
        System.out.println(" Atribuire simpla:" + result);


        // Atribuirea cu adunare
        // result = result + b;
        result += b;
        System.out.println(" Atribuire  cu adunare:" + result);


        // Atribuirea cu scadere
        // result = result -b;
        result -=b;
        System.out.println(" Atribuire  cu scadere:" + result);


        // Atribuirea cu inmultirea
        // result = result * b;
        result *= b;
        System.out.println(" Atribuire  cu inmultirea:" + result);

        // Atribuirea cu impartire
        // result = result /b;
        result /=b;
        System.out.println(" Atribuire  cu impartire:" + result);


        // Atribuirea cu restul impartirii
        // result = result %b;
        result %=b;
        System.out.println(" Atribuire  cu restul impartirii:" + result);



    }
}
