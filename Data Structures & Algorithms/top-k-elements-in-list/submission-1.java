
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // 1. Count frequency
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 2. Convert Map Entries to List
        List<Map.Entry<Integer, Integer>> list =
                new ArrayList<>(map.entrySet());

        // 3. Sort by frequency (highest first)
        list.sort((a, b) -> b.getValue() - a.getValue());

        // 4. Take the first k elements
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }

        return result;
    }
}