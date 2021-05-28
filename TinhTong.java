
import java.util.Scanner;
public class  TinhTong {
    public static int Input(){
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check){
            System.out.println(" ");
            try{
                n = input.nextInt();
                check = true;
            }catch (Exception e){
                System.out.println ("Nhap lai so...!");
                input.nextLine();
            }
        }
        return(n);
    }
    public static int tinhtong(long i){
        int sum = 0;
        long n ;
        while(i!=0){
            n = i%10;
            sum+= n ; /* sum = sum + n */
            i/=10; /* i=i/10 */
        }
        return (sum);
    }
    public static void main (String[] args){
        System.out.println ("Nhap n");
        int n = Input();
        System.out.println ("Tong cac chu so cua "+n+" = "+tinhtong(n));
    }
}