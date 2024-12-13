import java.io.File;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.inicio();
    }
    public void inicio(){
        File file = new File("numbers.txt");
        try (PrintStream output = new PrintStream(file)) {
            for (int i=0; i<5; i++){
                output.print(i+" ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }


        System.out.println("Operacion de escritura completada");
    }
}