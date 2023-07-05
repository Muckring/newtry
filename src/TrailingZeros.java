import java.util.Arrays;

public class TrailingZeros {
    public static void main(String[] args) {

        int [] nums = {9, 0, 4, 0, 0, 5};

        for (int i = 0; i<nums.length-1; i++) {
            if (nums[i] == 0 && nums[i+1] > 0) {
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            } else if (nums[i] == 0 && nums[i+1] == 0) {
                continue;

            }
        }

        System.out.println(Arrays.toString(nums));
    }
}




