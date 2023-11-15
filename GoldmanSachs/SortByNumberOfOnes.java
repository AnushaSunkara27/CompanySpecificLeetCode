package GoldmanSachs;

import java.util.Arrays;

public class SortByNumberOfOnes {
    public int numberOfOnes(int digit) {
        if(digit == 0 || digit == 1) return digit;
        int count = 0;
        while(digit > 0) {
            if(digit % 2 == 1) {
                count += 1;
            }
            digit = digit/2;
        }
        return count;
    }

    public int[] sortByBits(int[] arr) {

        // Arrays.sort(arr, (a,b) -> {
        //     int a1 = numberOfOnes(a);
        //     int b1 = numberOfOnes(b);

        //     if(a1 != b1) {
        //         return a1-b1;
        //     } else {
        //         return a-b;
        //     }
        // });
        return arr;
    }
}
