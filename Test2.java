import java.util.Arrays;

class Test {
	public static boolean test() {
		int[] nums = new int[]{11, 11, 111, 111, 1211, 1211, 38844, 56677, 56677};

		int solution = 38844;

		Solution sol = new Solution();

		int res = sol.SingleNumber_XOR(nums);

		return res == solution;
	}
}
