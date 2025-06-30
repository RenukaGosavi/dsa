import java.util.*;
public class Reverse_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enetr the number");
        int N=sc.nextInt();
        int rev=0;
        while(N>0){
            int last=rev*10+N%10;
            rev=last;
            N=N/10;
        }
        System.err.println(rev);
    }
}
