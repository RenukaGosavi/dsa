
import java.util.Scanner;

public class array {
    public void Largest_element_array(int arr[]) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.err.println(largest);
    }

    public void Second_largest_element(int arr[]) {
        int largest = arr[0];
        int prev = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                prev = largest;
                largest = arr[i];
            }
        }
        System.err.println(prev);
    }

    public void Sorted_Unsorted(int arr[]) {
        int largest = arr[0];
        int l = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];

            } else {
                l = 1;
                break;
            }
        }
        if (l == -1) {
            System.err.println("Sorted");
        } else {
            System.err.println("Unsorted");
        }
    }

    public void move_zero_atend(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 0) {
                    if (arr[j] == 0) {
                        j++;
                        System.err.println(j);
                    } else {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }

    public void sort_array(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.err.print(arr[k] + " ");
        }

        System.out.println();
    }

    public void Reverse_array(int arr[]) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int k = 0; k < arr.length; k++) {
            System.err.print(arr[k] + " ");
        }
        System.err.println();
    }

    public void rotate_array(int arr[], Scanner sc) {
        System.err.println("Enetr the number of Rotations: ");
        int rotation = sc.nextInt();
        while (rotation > 0) {
            int temp = arr[0];

            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }
            arr[arr.length - 1] = temp;
            rotation--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i] + " ");
        }

        System.err.println();
    }

    public void remove_duplicates(int arr[]) {
        // int i=0, j = 0;
        // int n=arr.length-1;
        // while (i < n ) {
        //     if (arr[i] == arr[i + 1]) {
        //         i++;
        //     } else {
        //         arr[j] = arr[i];
        //         j++;
        //         i++;
        //     }
        // }
        
    int j = 0;
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] != arr[j]) {
            j++;
            arr[j] = arr[i];
        }
    }

        for (int k = 0; k <= j; k++) {
            System.err.print(arr[k] + " ");
        }
        System.err.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={1,5,2,2,10,7,12,12,12};
        // int[] arr={1,2,3,4,5,6};
        array obj = new array();
        obj.Largest_element_array(arr);
        obj.Second_largest_element(arr);
        obj.Sorted_Unsorted(arr);
        obj.sort_array(arr);
        obj.Reverse_array(arr);
        obj.rotate_array(arr, sc);
        obj.remove_duplicates(arr);

    }
}