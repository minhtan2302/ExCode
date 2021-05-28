import java.util.Scanner; 
public class PtSNT2 {

  public static void phanTich(int n){
                  int i = 2;
        if(n==1){
            System.out.println(n+ " = " +n);
        }
        else {
            System.out.print(n+ " = ");
            while (n != 1){
                if (n % i == 0){
                    System.out.print(i+" . ");
                    n/=i;
                }
                else i++;
            }        
      }
    }
  public static int Input(){
                Scanner input= new Scanner(System.in); 
                boolean check= false;
                int n=0; 
                while(!check){
                       System.out.print(" "); 
                       try{
                             n= input.nextInt();
                             check= true;
                       }catch(Exception e){
                              System.out.println("Ban phai nhap so! hay nhap lai..."); 
                              input.nextLine();
                       }
                }
                return (n);
      }
  public static void main(String[] args) { 
    System.out.print("Nhap n");
               int n= Input(); 
               phanTich(n);
               System.out.print("\b\b\b ");
   }
}