import java.util.*;

public class Two_Sum {

    public static boolean searching(int[] arr, int target) {

        Arrays.sort(arr);

        int left = 0, right = arr.length - 1;

        while(left < right) {

            int sum = arr[left] + arr[right];

            if(sum == target)
                return true;

            else if(sum < target)
                left++;

            else 
                right--;
        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr = {9, 2, 45, 24, 56, 2, 1, 7, 5, 6, 9};
        int target = 69;
        if(searching(arr, target) == true )
            System.out.println("The two number sum equal to the given target exists");
        else
            System.out.println("The two number sum equal to the given target doesn't exist");

    }

}
