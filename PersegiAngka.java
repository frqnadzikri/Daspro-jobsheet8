import java.util.Scanner;

public class PersegiAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = input.nextInt();
        input.close();

        // validasi
        if (N < 3) {
            System.out.println("Nilai N minimal 3!");
            return;
        }

        // mencetak pola
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                // baris pertama atau terakhir, atau kolom pertama atau terakhir
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  "); // spasi di dalam kotak
                }
            }
            System.out.println();
        }
    }
}

