import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class Files {

    int countFileLines(String fileNames){
        File file;
        FileReader reader;
        BufferedReader bufer;
        int numLines = 0;

        try{
            file = new File("C:\\Archivos\\" + fileNames);
            reader = new FileReader(file);
            bufer = new BufferedReader(reader); //Count the lines of the file
            while ((bufer.readLine()) != null) {
                numLines++;
            }
            reader.close();
        }catch ( Exception e){
            System.out.println("Error al leer el archivo: " + e.toString());
        }
        return numLines; 
    }

    public String[] fileToIntArray(String fileName){
        File file; //Point a physical file of dd
        FileReader reader; //Key with permission (only read)
        BufferedReader bufer; //Recover the data from the file
        String linea; //Line of the file
        String[] array = null; //Array of numbers
        int i=0; //Index of the array
        int t; //size of the array
        try {
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                t = countFileLines(fileName);
                array = new String[t];
                file = new File("C:\\Archivos\\" + fileName);
                reader = new FileReader(file); //Open the file only read
                bufer = new BufferedReader(reader); //Count the lines of the file
                // Read each line of the file n put it in the array
                while ( (linea = bufer.readLine()) != null) {
                    array[i] = linea; //Convert the string to int
                    i++;
                }
                reader.close();
            } catch ( Exception e) {
                System.out.println("Error al leer el archivo: " + e.toString());
            }
        }
        return array;
    }
    //Create a file with info of one array
    public void writeIntArrayToFile(String fileName, int[] array){
        FileWriter file; //Key with permission (only write)
        PrintWriter writer; //Write the data in the file
        try {
            file = new FileWriter("C:\\Archivos\\" + fileName);
            writer = new PrintWriter(file);
            for (int unDato : array) 
                writer.println(unDato); //Write the data in the file
            file.close(); //Close the file
        } catch (Exception e) {
            System.out.println("Error al crear el archivo: " + e.toString());
        }
    }
}
