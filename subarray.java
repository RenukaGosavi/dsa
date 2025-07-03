public class subarray {
    public static void main(String[] args){
        // int[] arr={1,1,1,1,1,3};
        // int[] arr={3,3,1,1,1,1,2,3};
        int[] arr = {2, 2, 2, 2};
        int n=arr.length;
        int k=3;
        int i=0,j=0,sum=0,length=0;
        while(j<n){
            sum=sum+arr[j];

            if(sum>k){
                sum-=arr[i];
                i++;
                length--;
            }
            j++;
            length++;
        }
        System.err.println("subarray length: "+length);
    }
}
