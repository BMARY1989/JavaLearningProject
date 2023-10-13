package md.teckwillacademy.filemanagementservice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OutputFileWriterManager {



    public static void writeInformationIntoAFileUsingFileWriter(String filePath,String conent){
        FileWriter fileWriterObject = null;

        try {
            fileWriterObject = new FileWriter(filePath);
          fileWriterObject.write(conent);

        } catch (IOException exceptionObject) {
        System.out.println("There is a problem with the date writing process,let's skip this code");
        exceptionObject.printStackTrace();
        }finally {
            if (fileWriterObject != null){
                try {
                    fileWriterObject.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
    public static void wirteInformationIntoAFileByUsingBufferedWriter(File file, String content){
       BufferedWriter buffereWriterObject = null;

        try {
            buffereWriterObject = new BufferedWriter(new FileWriter(file));
            buffereWriterObject.write(content);
        } catch (IOException exceptionObject) {
            System.out.println(exceptionObject.getMessage());
        } finally {
            if (buffereWriterObject != null) {

                try {
                    buffereWriterObject.close();

                } catch (IOException e) {
                    System.out.println("There is problem when it comes to close the Writing process ");
                }
            }
            }
        }
    }

