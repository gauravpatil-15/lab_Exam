import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;

public class RemoveDuplicates {

    public static int[] removeDuplicates (int[] arr) {

        int [] result = new int[arr.length];
        int index = 0;

        HashSet<Integer> set = new HashSet<Integer>();

        for(int num : arr) {
            if(! set.contains(num)) {
                set.add(num);
                result[index] = num;
                index++;
            }
        }

        return Arrays.copyOf(result, index);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Size of Array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements of the array :");
        for(int i = 0; i<n; i++) {
            arr[i] = in.nextInt();
        }

        int [] uniquearr = removeDuplicates(arr);
        System.out.print(Arrays.toString(uniquearr));

    }
}
