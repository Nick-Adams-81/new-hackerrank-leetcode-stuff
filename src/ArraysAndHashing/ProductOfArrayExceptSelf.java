package ArraysAndHashing;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] leftProducts = new int[N];
        int[] rightProducts = new int[N];
        int[] output = new int[N];

        leftProducts[0] = 1;
        rightProducts[N -1] = 1;
        for(int i = 1; i < N; i++) {
            leftProducts[i] = nums[i -1] * leftProducts[i -1];
        }
        for(int i = N -2; i >=0; i--) {
            rightProducts[i] = nums[i + 1] * rightProducts[i +1];
        }
        for(int i = 0; i < N; i++) {
            output[i] = leftProducts[i] * rightProducts[i];
        }
        return output;
    }
}
