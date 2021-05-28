import java.util.Scanner;
public class DoiCoSo {
    public static int Input(){
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check){
            System.out.println (" ");
            try{
                n = input.nextInt();
                check = true;
            }catch (Exception e){
                System.out.println("Nhap lai so...! ");
                input.nextLine();
            }
        }
        return (n);
    }
    public static void  doicoso(int n, int base){
        if (n>=base) doicoso(n/base, base);
        if(n%base>9) System.out.printf("%C",n%base+55);
        else
        System.out.print((n%base));
    }
    public static void main (String [] args){
        System.out.println ("Nhap n");
        int n = Input();
        System.out.println ("Nhap vao co so can chuyen sang b");
        int b = Input();
        System.out.println("So " +n+ " chuyen sao co so "+b+ " thanh: " );
         doicoso(n,b);
    }
}
