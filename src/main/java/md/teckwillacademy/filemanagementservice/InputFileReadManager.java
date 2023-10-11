package md.teckwillacademy.filemanagementservice;

import java.io.*;
import java.nio.file.Files;

public class InputFileReadManager {

    public static void printDataonTheConsoleUsingFileReader(File file) {
        FileReader fileReaderObject = null;
        try {
            fileReaderObject = new FileReader(file);
            int charNumberInAscilSystem;
            while ((charNumberInAscilSystem = fileReaderObject.read()) != -1) {
                System.out.print((char) charNumberInAscilSystem);
            }
        } catch (FileNotFoundException e) {
            System.out.print("The file was not found, the procedure is aborted ");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.print("There is a problem with read process");
        } finally {
            try {
                fileReaderObject.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void printDataFromFileUsingbufferedReader(File file) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);

            }
        } catch (IOException e) {
            System.out.println("Exception has occurred,skip the reading");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void printDataUsingTheEAsiesWay(File file){
        try {
            String content = Files.readString(file.toPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



