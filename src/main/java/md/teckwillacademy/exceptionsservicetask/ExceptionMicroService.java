package md.teckwillacademy.exceptionsservicetask;

    public class ExceptionMicroService {
    public static void main(String[] args) {
        String controlVariable = "null";
        //       System.out.println("The String Lenght it i = " + TextManager.getTheTextLength(controlVariable));
        System.out.println("The String Lenght it i = " + TextManager.getTheTextWithTryandCatch(controlVariable));
        System.out.println("The String Lenght it i = " + TextManager.getTheTextLengthWithIf(controlVariable));
        System.out.println(ArithmeticOperationService.divideWithoutExceptionHandLing(0, 2));
        System.out.println(ArithmeticOperationService.divideWithExceptionHandLing(0, 0));
        System.out.println("the show must go on");
    }

}



