import java.util.Scanner;

public class RataNilai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i, j;
        float nilai, totalNilai, rataNilai;
        
    
        i = 1;
        
        while (i <= 5) {
            totalNilai = 0;
            
            System.out.println("\n=== Mahasiswa ke-" + i + " ===");
            for (j = 1; j <= 5; j++) {
                // Input nilai
                System.out.print("Nilai ke-" + j + " = ");
                nilai = sc.nextFloat();
                
                totalNilai += nilai;
            }
            
            rataNilai = totalNilai / 5;
            
            System.out.println("Rata-rata nilai mahasiswa ke-" + i + " = " + rataNilai);
            
            System.out.println("Total nilai = " + totalNilai);
            
            i++;
        }
        
        System.out.println("\n=== Program Selesai ===");
        System.out.println("Semua data nilai mahasiswa telah diinput.");
        
        sc.close();
    }
}
