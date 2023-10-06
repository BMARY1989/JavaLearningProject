package md.teckwillacademy.exceptionsservicetask;

public class TextManager {
    public static int getTheTextLength(String inputString) {
        return inputString.length();
    }
    public static int getTheTextWithTryandCatch(String inputString) {
        try {
            return inputString.length();
        } catch (NullPointerException exceptionFromTheTryBlock) {

          System.out.println( exceptionFromTheTryBlock.getMessage());
          return 0;

        }
    }
    public static int getTheTextLengthWithIf(String inputText){
        if(inputText == null){
            return 0;
        }else {
            return inputText.length();
        }
    }
}
