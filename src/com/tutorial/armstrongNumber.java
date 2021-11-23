import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        findArmstrong(a, b);
    }
    
    static void findArmstrong(int a, int b) {
        for(int i = a; i <= b; i++) {
            int num = i;
            int sum = 0;
            
            while (num > 0) {
                int remainder = num % 10;
                sum = sum + (remainder * remainder * remainder);
                num = num / 10;
            }
            
            if(sum == i) {
                System.out.println(sum);
            }
        }
    }
}