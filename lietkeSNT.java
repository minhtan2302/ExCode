import java.util.Scanner;
public class lietkeSNT {
    public static int nhapSoTN() {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check) {
               try {
                     n = Integer.parseInt(input.nextLine());
                     if (n < 0) {
                            System.out.println("Bạn phải nhập số tự nhiên! Hãy nhập lại.");
                            continue;
                     }
                     check = true;
               } catch (Exception e) {
                     System.out.println("Bạn phải nhập số tự nhiên! Hãy nhập lại.");
               }
        }
        return (n);
 }

 public static boolean isPrime(int n) {
        boolean check = true;
        if ((n == 0) || (n == 1)) {
               return false;
        } else {
               for (int i = 2; i <= (int) Math.sqrt(n); i++)
                     if (n % i == 0) {
                            check = false;
                            break;
                     }
        }
        return check;
 }

 public static String nguyento_be_hon_n(int n) {
        String str = "";
        if ((n == 0) || (n == 1) || (n == 2)) {
               return "";
        } else {
               for (int i = 2; i < n; i++) {
                     if (isPrime(i)) {
                            str = str + Integer.toString(i) + " ";
                     }
               }
               str = str.substring(0, str.length() - 1);
               return str;
        }
 }

 public static void main(String[] args) {
        System.out.println("Nhập số tự nhiên n: ");
        int n = nhapSoTN();
        System.out.println("Các số nguyên tố bé hơn " + n + " là: ");
        System.out.println(nguyento_be_hon_n(n));
 }
}
