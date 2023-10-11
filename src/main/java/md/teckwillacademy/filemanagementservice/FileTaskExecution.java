package md.teckwillacademy.filemanagementservice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileTaskExecution {
  public static void main(String[] args) throws IOException {
    File fileObject = new File("src/main/java/md/teckwillacademy/filemanagementservice/test.txt");

    FileManager.informIfTheFileExists(fileObject);
    System.out.println(FileManager.createTheFileIfItDoesNotExist(fileObject));
    FileManager.informIfTheFileExists(fileObject);
    FileManager.printTheFileNameFile(fileObject);
    FileManager.printTheAbsolutePath(fileObject);
    FileManager.printItIsADirectoryOrAFile(fileObject);


    OutputFileWriterManager.writeInformationIntoAFileUsingFileWriter(fileObject.getPath(),"Content");
    OutputFileWriterManager.writeInformationIntoAFileUsingFileWriter(fileObject.getPath(),"Content");
    OutputFileWriterManager.wirteInformationIntoAFileByUsingBufferedWriter(fileObject,"Value Free");

    InputFileReadManager.printDataonTheConsoleUsingFileReader(fileObject);
    System.out.println();
    InputFileReadManager.printDataFromFileUsingbufferedReader(fileObject);
    InputFileReadManager.printDataUsingTheEAsiesWay(fileObject);
    }


  }


