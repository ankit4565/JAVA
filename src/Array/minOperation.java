package Array;

public class minOperation {
    static void main() {
        int[] nums = new int[]{6,10,15};
        System.out.println(minOperations(nums));
    }

    public static int minOperations(int[] nums) {
        int count = 0;
        int gcdAll = nums[0];
        for (int i = 1; i < nums.length; i++) {
            gcdAll = gcd(gcdAll, nums[i]);
        }
        if (gcdAll > 1) {
            return -1;
        } else {
            count++;
            nums[0] = 1;


                int right = 0;
                int left = 0;

                while (right < nums.length) {

                    if (right - left + 1 == 2) {
                        if (gcd(nums[left], nums[right]) == 1) {
                            count++;
                            nums[right] =1;
                        }

                        left++;

                    }
                    right++;
                }

            }

        return count;
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}