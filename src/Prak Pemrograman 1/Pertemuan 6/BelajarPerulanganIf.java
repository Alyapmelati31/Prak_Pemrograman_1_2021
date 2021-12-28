import java.util.Scanner;

public class BelajarPerulanganIf {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan jumlah deret bilangan genap yang akan ditampilkan = ");
        int n = scan.nextInt();
        int i = 0;
        int bil = 2;
        while (i != n) {
            System.out.println(bil);
            bil += 2;
            i++;
        }

    }
}