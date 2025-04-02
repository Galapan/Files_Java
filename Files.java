import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class Files {

    public int[] fileToIntArray(String fileName){
        File file; //Point a physical file of dd
        FileReader reader; //Key with permission (only read)
        BufferedReader bufer; //Recover the data from the file
        String linea; //Line of the file
        int[] array = null; //Array of numbers
        int i=0; //Index of the array
        int t; //size of the array
        try {
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                t = countFileLines(fileName);
                array = new int[t];
                file = new File("C:\\archivos\\" + fileName);
                reader = new FileReader(file);
                bufer = new BufferedReader(reader); //Count the lines of the file
            } catch (Exception e) {
                System.out.println("Error al leer el archivo: " + e.toString());
            }
        }
    }
}
