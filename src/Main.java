import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int[] nums = new int[5];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Popolo l'array
        for (int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(10) + 1;
        }

        // Stampo l'array di partenza
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }

        // Da qui parte il ciclo
        while (true){
            try {
                System.out.println("Scrivi un numero (0 per cancellare)");
                int numero = scanner.nextInt();
                if (numero == 0){
                    break;
                }
                System.out.println("Scrivi un numero da 0 a 4");
                int indice = scanner.nextInt();
                nums[indice] = numero;

                // Qui mostro l'array aggiornato
                for (int i = 0; i < nums.length; i++){
                    System.out.print(nums[i] + " ");
                }
            }
            catch(ArrayIndexOutOfBoundsException a){
                System.out.println("Ho detto tra 0 e 4, cretino.");
            } catch(Exception b){
                System.out.println("Errore");}

        }
        scanner.close();



    }
}