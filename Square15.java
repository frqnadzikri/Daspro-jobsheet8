import java.util.Scanner;

public class Square15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();

        // Outer loop untuk baris
        for (int iOuter = 1; iOuter <= N; iOuter++) {
            // Inner loop untuk kolom
            for (int i = 1; i <= N; i++) {
                System.out.print("*");
            }
            System.out.println(); 
        }

        sc.close();
    }
}

