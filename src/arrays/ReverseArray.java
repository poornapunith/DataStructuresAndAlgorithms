package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,3,5,7));
//        Collections.reverse(list);
//        System.out.println(list);

        int[] list = {1,4,5,7};
        int n= list.length;
        for (int i = 0; i < n/2; i++) {
            int temp = list[i];
            list[i] = list[n-i-1];
            list[n-i-1] = temp;
        }

        System.out.println(Arrays.toString(list));

    }
}
