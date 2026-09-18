class KthLargest {
    List<Integer> list;
    int K;
    public KthLargest(int k, int[] nums) {
        list = new ArrayList<>();
        K = k;
        for(int i : nums)
            list.add(i);
    }
    
    public int add(int val) {
        list.add(val);
        Collections.sort(list);
        return list.get(list.size() - K);
    }

}
