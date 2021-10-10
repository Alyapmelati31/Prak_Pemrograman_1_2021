import java.util.Scanner;

public class BelajarNestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Umur Anda = ");
        int umur = scanner.nextInt();
        if (umur <= 5) {
            System.out.println("Anda masih balita");
            System.out.print("Masukan Umur Orang Tua Anda");
            int umurOrangTua = scanner.nextInt();
            if (umurOrangTua<15) {
                System.out.print("Sebaiknya meminta pengasuh anak");
            } else {
                System.out.print("Anda bisa mengasuh anak sendiri");
            }
        } else if (umur > 5 && umur <= 19) {
            System.out.println("Anda sudah remaja");
        } else if (umur > 19) {
            System.out.println("Anda sudah dewasa");
        } else {
            System.out.println("Umur Anda tidak valid");
        }
    }
}