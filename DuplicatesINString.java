import java.util.Scanner;
import java.util.HashMap;

public class DuplicatesINString {

    public static void duplicatesINString(String s){

        String [] words = s.toLowerCase().split(" ");

        HashMap<String, Integer> f = new HashMap<String, Integer>();
        for(String word : words) {
            if(f.containsKey(word)) {
                int count = f.get(word);
                f.put(word, count + 1);
            }
            else {
                f.put(word, 1);
            }
        }

        for(String word : f.keySet()) {
            if(f.get(word) > 1) {
                System.out.println(word+" : "+f.get(word));
            }
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String :");
        String s = in.nextLine();

        duplicatesINString(s);
    }
}
