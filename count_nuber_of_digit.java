// package basic_math_concept;
import java.util.*;
public class count_nuber_of_digit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enetr the number: ");
        int N=sc.nextInt();
        int c=0;
        while(N>0){
            int last=N%10;
            N=N/10;
            c++;
        }
        System.out.print(c);
    }
}

    