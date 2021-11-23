import java.util.Scanner;

public class TugasPertemuan8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] mahasiswa = new String[1000];
        double[] ipk = new double[1000];
        double amount, average;
        int i;

        System.out.println("MEMASUKKAN DATA");
        System.out.println();

        amount = 0;
        for (i = 1; i <= 1000; i++) {
            System.out.println("Data " + i);
            System.out.print("Nama Mahasiswa = ");
            String cekMahasiswa = scan.nextLine();
            if (cekMahasiswa.equals ("exit")) {
                break;
            } else {
                mahasiswa[i] = cekMahasiswa; 
            }

            System.out.print("IPK Mahasiswa = ");
            double cekIpk = scan.nextDouble();
            scan.nextLine();
            ipk[i] = cekIpk;

            System.out.println();
            amount += ipk[i];
        }

        System.out.println();
        System.out.println("No   Nama                          IPK ");
        System.out.println("-------------------------------------- ");
        for (int j = 1; j < i; j++) {
            System.out.println(j + "    " + mahasiswa[j] + "                        " + ipk[j]);  
        }

        System.out.println();
        average = amount/(i-1);
        System.out.println("Rata-rata IPK = " + average);      
    }
}
