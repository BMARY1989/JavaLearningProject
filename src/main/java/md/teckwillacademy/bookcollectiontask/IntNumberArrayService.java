package md.teckwillacademy.bookcollectiontask;

public class IntNumberArrayService {
 //   dataTable[0] = 9;
  //  dataTable[1] = 65;
   // dataTable[2] = 12;
    // dataTable[3] = 52;
// dataTable[4] = 5;
 // dataTable[5] = 1;
    public static int findMin(int [] arrayTable){
        int min = arrayTable[0];
        for (int i = 0; i<arrayTable.length; i++){
            if (min > arrayTable[1]){
                min = arrayTable[1];
            }
        }
        return min;
    }
    public static double getAvg(int[] array){
        int sum = 0;
        for ( int i = 0; i < array.length; i++){
            sum = sum + array[i];
            sum += array[i];

        }
        return sum/ array.length;
    }
}
