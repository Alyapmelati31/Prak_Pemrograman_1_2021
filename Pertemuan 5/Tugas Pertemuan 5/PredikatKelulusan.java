import java.util.Scanner;

public class PredikatKelulusan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan IPK Anda = ");
        double ipk = scanner.nextDouble();
        System.out.println("Masukan lama studi = ");
        double lamastudi = scanner.nextDouble();
        if (ipk >= 3.51 && ipk <= 4 && lamastudi <=4) {
            System.out.println("Selamat Anda Meraih Predikat Summa Cumlaude");
        }else if (ipk >= 3.51 && ipk <= 4 && lamastudi >4)  {
            System.out.println("Selamat Anda Meraih Predikat Cumlaude");
        }else if (ipk >= 3.01 && ipk < 3.51) {
            System.out.println("IPK Anda Sangat Memuaskan");
        }else if (ipk >= 2.76 && ipk < 3.01) {
            System.out.println("IPK Anda Memuaskan");
        }else if (ipk >= 2.00 && ipk < 2.76) {
            System.out.println("IPK Anda Cukup");   
        }else if (ipk < 2.00) {
            System.out.println("Anda Tidak Lulus");
        }else {
            System.out.println("Tidak Valid");
        }
    }
}

