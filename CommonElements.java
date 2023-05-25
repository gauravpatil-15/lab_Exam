import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class CommonElements {

    public static int[] commonElements (int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length];
        int index = 0;

        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();

        for(int num : arr1) {
            set1.add(num);
        }
        for(int num : arr2) {
            set2.add(num);
        }

        for(int num : set2) {
            if(set1.contains(num)) {
                result[index] = num;
                index++;
            }
        }
        return Arrays.copyOf(result, index);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Size of 1st array : ");
        int n = in.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the Elements of the 1st array :");
        for(int i = 0; i<n; i++) {
            arr1[i] = in.nextInt();
        }

        System.out.println("Enter Size of 2nd array : ");
        int m = in.nextInt();
        int [] arr2 = new int[m];
        System.out.println("Enter the Elements of the 2nd array :");
        for(int i = 0; i<m; i++) {
            arr2[i] = in.nextInt();
        }

        int [] commonElements = commonElements(arr1, arr2);

        System.out.println("Common Elements : "+Arrays.toString(commonElements));
    }
}
