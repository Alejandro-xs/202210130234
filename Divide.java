public class Divide {
        public static void main(String[] args) {
        int[] arr = {1,-2,3,5,-1};
        int maxSum = findMaxSubArray(arr, 0, arr.length - 1);
        System.out.println("最大子数组和为: " + maxSum);
    }
    public static int findMaxSubArray(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left]; 
        }
        int mid = (left + right) / 2; 
        int leftMax = findMaxSubArray(nums, left, mid);
        int rightMax = findMaxSubArray(nums, mid + 1, right);
        int crossMax = findMaxCrossingSubArray(nums, left, mid, right);
        return Math.max(Math.max(leftMax, rightMax), crossMax);
    }
    private static int findMaxCrossingSubArray(int[] nums, int left, int mid, int right) {
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i >= left; i--) {
            sum += nums[i];
            if (sum > leftSum) {
                leftSum = sum;
            }
        }
        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        for (int i = mid + 1; i <= right; i++) {
            sum += nums[i];
            if (sum > rightSum) {
                rightSum = sum;
            }
        }
        return leftSum + rightSum;
    }
}