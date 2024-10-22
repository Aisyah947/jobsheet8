import java.util.Scanner;

public class Mencetak_angka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = sc.nextInt();
        
        // Validasi input N
        if (N < 3) {
            System.out.println("N harus minimal 3.");
            return;
        }

        // Mencetak persegi dengan angka di tepi
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // Mencetak angka di baris dan kolom tepi
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                    System.out.print(N + "  "); // Angka di tepi
                } else {
                    System.out.print("   "); // Ruang kosong di tengah
                }
            }
            System.out.println(); // Pindah ke baris berikutnya
        }
    }
}
