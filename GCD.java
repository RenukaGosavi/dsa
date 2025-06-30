import java.util.*;
public class GCD {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter first number: ");
        int N1=sc.nextInt();
        System.err.print("Enter second number");
        int N2=sc.nextInt();
        int gcd=1;
        for(int i=1;i<=Math.min(N1,N2);i++){
            if(N1%i==0 && N2%i==0){
                gcd=i;
            }
        }
        System.err.println(gcd);
    }
}
