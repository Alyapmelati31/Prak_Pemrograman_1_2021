import java.util.Scanner;

public class caridigit {
    public static void main(String [] args ) {
        Scanner scanner = new Scanner (System.in);
        for (int i = 0; i <= 400; i++) {
            int num = i;
            int sum = 0;
            int count = 0;
            //System.out.print(i);

            while (num > 0) {
                num = num / 10;
                count++;
            }

            //System.out.print(count);
            int pow = (int)Math.pow(i, count);
            if (i == pow)  {
                System.out.print(pow);
                System.out.print("  ");
            }    
        } 
    }    
}
