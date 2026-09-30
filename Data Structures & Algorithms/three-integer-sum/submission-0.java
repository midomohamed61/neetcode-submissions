class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int a =0;
        int b = 1;
        int c =nums.length -1 ;
        List<List<Integer>> arr = new ArrayList<>();
        for (a = 0; a < nums.length - 2; a++) {
            b = a + 1;
            c = nums.length - 1;
            if (a > 0 && nums[a] == nums[a - 1]) {
            continue;
            }
        while(b<c){
            if(nums[b] + nums[c] == -nums[a]){
                arr.add(Arrays.asList(nums[a], nums[b], nums[c]));
                b++;
                c--;
                while (b < c && nums[b] == nums[b - 1]) {
                    b++;
                }

                while (b < c && nums[c] == nums[c + 1]) {
                    c--;
                }
                }
            else if(nums[b] + nums[c] > -nums[a])
                c--;

            else
                b++;
            }
        }
        return arr;
    }
}
