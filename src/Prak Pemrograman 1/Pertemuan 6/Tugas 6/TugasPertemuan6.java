import java.util.Scanner;

public class TugasPertemuan6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan bilang deret maksimal yang akan ditampilkan ");
        int n = scan.nextInt();
        int i = 0;
        int angka = 0;
        while (i != n) {
            if (i == Math.pow(5, angka)) {
                System.out.println(i);
                angka++;
            }
            i++;
        }
    }
}
