import java.util.Scanner;
public class BTEX {
    public static void Input(){
        Scanner input = new Scanner(System.In);
        boolean check = false;
        int n - 0;
        while (!check){
            System.out.println(" ");
            try{
                n = input.nextInt();
                check = true;
            }catch(Exception E){
                System.out.println("Xin Hay Nhap Lai!... Nhap So Lai")
                input.nextLine();
            }
        }
        return(n);
    }
    /*
    public static int UCLN(int a, int b){
        while (a!=b){
            if(a>b) a = a - b;
            else b = b - a;
        }
        return (a);
    }
    public static void DoiCoSo(int n , int base){
        if(n>=base) DoiCoSo (n/base,base);
        if(n%base>9) System.out.printf("%C", n%base+55);
        else
        System.out.print((n%base));
    }
    public static int TinhTong(long i){
        int Sum = 0;
        long n;
        while(i!=0){
            n = i%10;
            Sum = Sum + n; /* Sum+= n */
            i = i/10; /* i/= 10 */
        }
        return (Sum);
    } 
    */ 
    public static void PhanTich( int n ){
        int i = 2;
        if(n==1){
            System.out.println ( n+ " = " +n);
        }else{
            System.out.print(n+ "=" );
            while (n != 1){
                if(n%i==0){
                    System.out.print (i+" . ");
                    n = n/i
                }
                else i++;
            }
        }
    }
    public static void main(String[] args){

    /*  System.out.println("Nhap a");
        int a = Input();
        System.out.println("Nhap b");
        int b = Input();
        System.out.println("Uoc chung lon nhat cua "+a+" va "+b+" la: "+UCLN(a,b));
        System.out.println("Boi chung nho nhat cua "+a+" va "+b+" la: "+((a*b)/UCLN(a,b)));
    ------------------------ 
        System.out.println("Nhap n");
        int n = Input();
        System.out.println("Nhap vao co so chuyen doi sang X");
        int X = Input() 
        System.out.println("So "+n+" can chuyen doi sang "+X+" thanh: " );
        DoiCoSo(n,X);
    -------------------------
        System.out.println("Nhap n");
        int n = Input();
        System.out.println("Tong cac chu so "+n+" la: "+TinhTong(n));
    */
        
    }
}
