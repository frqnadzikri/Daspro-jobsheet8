
import java.util.Scanner;

public class DataAtletPorseni {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] cabang = {"Badminton", "Tenis Meja", "Basket", "Bola Voly"};

        System.out.print("Masukkan jumlah Politeknik yang mendaftar: ");
        int jumlahPoli = input.nextInt();
        input.nextLine(); 
        input.close();

        String[][][] atlet = new String[jumlahPoli][cabang.length][5];

        // Input data
        for (int i = 0; i < jumlahPoli; i++) {
            System.out.println("\n=== Politeknik ke-" + (i + 1) + " ===");
            for (int j = 0; j < cabang.length; j++) {
                System.out.println("Masukkan nama 5 atlet untuk cabang " + cabang[j] + ":");
                for (int k = 0; k < 5; k++) {
                    System.out.print("Atlet ke-" + (k + 1) + ": ");
                    atlet[i][j][k] = input.nextLine();
                }
            }
        }

        // Output data
        System.out.println("\n=== Daftar Atlet Setiap Politeknik ===");
        for (int i = 0; i < jumlahPoli; i++) {
            System.out.println("\nPoliteknik ke-" + (i + 1));
            for (int j = 0; j < cabang.length; j++) {
                System.out.println("Cabang " + cabang[j] + ":");
                for (int k = 0; k < 5; k++) {
                    System.out.println(" - " + atlet[i][j][k]);
                }
            }
        }
    }
}
