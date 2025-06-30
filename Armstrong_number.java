import java.util.*;
public class Armstrong_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the number: ");
        int N=sc.nextInt();
        int temp=N;
        int temp1=N;
        int sum=0;
        int count=0;
        while(N>0){
            count++;
            N=N/10;
        }

        System.err.println(count);
        while(temp>0){
            int last=temp%10;
            sum=sum+(int)Math.pow(last,count);
            temp=temp/10;
        }
        if(sum==temp1){
            System.err.println("Number is armstrong");
        }
        else{
            System.err.println("Number is not armstrong");
        }
    }
}
