import java.util.Arrays;

class Test {
	public static boolean test() {
		int[] nums = new int[]{2,2,3,3,5,5,7,11,11,15,15,7684,7684};

		int solution = 7;

		Solution sol = new Solution();

		int res = sol.SingleNumber_XOR(nums);

		return res == solution;
	}
}
