
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class TestingFiles {

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }    


    public static void main(String[] args) throws IOException {
        Files files  = new Files();
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        int[] numeros;

        System.out.println("----------------------------------------");
        System.out.println("Program that read files");
        System.out.println("Write the name of the file: ");
        fileName = bufer.readLine();
        numeros = files.fileToIntArray(fileName);
        System.out.println("Content of the array: ");
        printArray(numeros);
    }        
}
