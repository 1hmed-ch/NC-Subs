class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1) return stones[0];
        PriorityQueue<Integer> heap = new PriorityQueue<>(
            Collections.reverseOrder()
        );

        for(int i : stones){
            heap.add(i);
        }
        //System.out.println(heap);
        

        while(heap.size() > 1){
            int x = heap.poll();
            int y = heap.poll();
            if(x == y) continue;
            else if(x > y){
                heap.add(x - y);
            } else {
                heap.add(y - x);
            }
        }
        return heap.size() == 1 ? heap.peek() : 0;
    }
}
