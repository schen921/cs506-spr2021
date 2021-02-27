import java.util.Arrays;

class Test {
	public static boolean test() {
		int[] nums = new int[]{8, 7, 16, 5, 5, 9, 16, 7, 8};

		int solution = 9;

		Solution sol = new Solution();

		int res = sol.SingleNumber_XOR(nums);

		return res == solution;
	}
}
