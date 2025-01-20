import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class AccesoArchivosJava {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            // Pide al usuario que ingrese un nombre de archivo
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Ingresa el nombre del archivo: ");
            final String nombreArchivo = br.readLine();

            // Inicializa docLCB con nombreArchivo
            String docLCB = nombreArchivo;
            
            BufferedWriter writer = new BufferedWriter(new FileWriter(docLCB));
            writer.write("Hola, este es un archivo de ejemplo.");
            writer.close();
            
            // Abre el archivo en modo lectura y muestra su contenido
            BufferedReader reader = new BufferedReader(new FileReader(docLCB));
            System.out.println("Contenido del archivo:");
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
