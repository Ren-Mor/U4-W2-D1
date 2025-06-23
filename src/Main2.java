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
            System.out.println("Non so cosa tu abbia fatto, ma non va bene");
        } finally {
            valore.close();
        }





                try {
                    System.out.print("Scrivi i km percorsi (numero decimale): ");
                    double km = valore.nextDouble();

                    System.out.print("Inserisci i litri di benzina usati (numero decimale): ");
                    double litri = valore.nextDouble();

                    if (litri == 0) {
                        System.out.println("Errore: non si può dividere per zero.");
                    } else {
                        double kmPerLitro = km / litri;
                        System.out.println("Km per litro percorsi: " + kmPerLitro);
                    }

                } catch (Exception e) {
                    System.out.println("Hai sbagliato anche qui. Bene.");
                } finally {
                    valore.close();
                }
            }
        }



