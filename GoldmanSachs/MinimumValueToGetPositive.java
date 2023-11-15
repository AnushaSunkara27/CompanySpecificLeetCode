package GoldmanSachs;

public class MinimumValueToGetPositive {
    public int minStartValue(int[] nums) {
        int minSValue = 1;
        int result = 0;

        for(int i=0; i< nums.length; i++) {
            if(i == 0) {
                result = minSValue + nums[i];
            } else {
                result = result + nums[i];
            }
            
            if(result<1) {
                minSValue += 1;
                i = -1;
            }
        }
        return minSValue;
    }

    public static void main(String[] args) {
        int[] nums = {1,2};
        MinimumValueToGetPositive obj = new MinimumValueToGetPositive();

        System.out.println(obj.minStartValue(nums));
    }
}
