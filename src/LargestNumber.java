import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class LargestNumber {
    public static String largestNumber(int[] arr, int n){
        if(arr == null || n==0){
            return "";
        }
        String[] str = new String[n];
        for(int i=0;i<n;i++){
            str[i]=String.valueOf(arr[i]);
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String x, String y) {
                return (y+x).compareTo(x+y);
            }
        });
        if (str[0].equals("0")) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        for (String s : str) {
            result.append(s);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(largestNumber(arr, n));
    }
}
