import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner valore = new Scanner(System.in);

        try {
            System.out.print("Scrivi i km percorsi (numero intero)");
            int km = valore.nextInt();

            System.out.print("Inserisci i litri di benzina usati (numero intero)");
            int litri = valore.nextInt();

            int kmPerLitro = km / litri;
            System.out.println("Km per litro percorsi: " + kmPerLitro);
        } catch (ArithmeticException | NumberFormatException a){
            System.out.println("O hai diviso per 0 e quindi sei scemo, o hai inserito un decimale, e sei scemo uguale");
        } finally {
            valore.close();
        }
    }
}
