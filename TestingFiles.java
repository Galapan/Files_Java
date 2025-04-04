import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestingFiles {

    public static void printArray(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public static void printArray(String[] songs) {
        for (int i = 0; i < songs.length; i++) {
            System.out.println(songs[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        Files files = new Files();
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        String[] songs;
        String[] numeros;
        int[] numeros2 = {27, 29, 33, 68, 10, 1, 15, 87, 95};

        System.out.println("----------------------------------------");
        System.out.println("Program that reads numbers from a file");
        System.out.println("Write the name of the file: ");
        fileName = bufer.readLine();
        numeros = files.fileToIntArray(fileName);
        System.out.println("Content of the array (numbers): ");
        printArray(numeros);

        System.out.println("----------------------------------------");
        System.out.println("Program that reads text from a file");
        System.out.println("Write the name of the file: ");
        fileName = bufer.readLine();
        songs = files.fileToIntArray(fileName); // Leer texto
        System.out.println("Content of the array (text): ");
        printArray(songs);

        System.out.println("Escribe el nombre del archivo de números para guardar: ");
        fileName = bufer.readLine();
        files.writeIntArrayToFile(fileName, numeros2); // Guardar números en un archivo
    }
}