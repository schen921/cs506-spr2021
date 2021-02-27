class Solution {
  public int singleNumber(int[] nums) {
    List<Integer> no_duplicate_list = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      if (!no_duplicate_list.contains(nums[i])) {
        no_duplicate_list.add(nums[i]);
      } else {
        no_duplicate_list.remove(new Integer(nums[i]));
      }
    }
    return no_duplicate_list.get(0);
  }
}
