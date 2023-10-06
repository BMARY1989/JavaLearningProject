package md.teckwillacademy.exceptionsservicetask;

public class ArithmeticOperationService {
public static  double divideWithoutExceptionHandLing(int a ,int b){
    return a/b;
}
public static double divideWithExceptionHandLing(int a,int b){
    try{
        return a/b;
    }catch (ArithmeticException capturedException){
        System.out.println(capturedException.getMessage());
        return 0.0;
    }
}
}



