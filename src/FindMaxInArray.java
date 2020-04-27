import java.util.Arrays;
import java.util.Collections;

public class FindMaxInArray {
    public static void main(String[] args) {
        Integer[] arr= new Integer[]{1,2,9,10,29,100,5,7,111,82};
//        String red = Arrays.toString(arr);
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
    }
}
