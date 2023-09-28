package md.teckwillacademy.methodstask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {
    private static Random objectofRandomClass = new Random();

    public  static int getRandomInt(int min,int max) {
        int delta = max - min;
        if (delta <= 0) {
            System.out.println("This delta has to be positive");
            return 0;
        }
        int randomIntFOrThisDelta = objectofRandomClass.nextInt(delta);
        return (randomIntFOrThisDelta + min);
    }
    public static int getRandomInt(int limit){
        if (limit<0){
            return 0;
        }
        return objectofRandomClass.nextInt(limit);
    }

   protected  static String getRandomEmail(String domainName){
        String uniqueUUID = UUID.randomUUID().toString();
        return uniqueUUID + "@" + domainName;

    }

}
