class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Count number frequency for input arr
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Create min heap and sort on the frequency(index 0), add
        // everything from the freq map
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            heap.offer(new int[]{entry.getValue(), entry.getKey()});

            // only keep the top k elements in the heap
            if (heap.size() > k) {
                heap.poll();
            }
        }

        // return the results as an int[]
        int res[] = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = heap.poll()[1];
        }

        return res;
    }
}
