class Solution {
    public int[][] kClosest(int[][] points, int k) {
    int[][] res = new int[k][2];
    Map<int[], Double> map = new HashMap<>();
    for(int[] arr : points){
        double distance = Math.hypot(arr[0], arr[1]);
        map.put(arr, distance);
    }
    System.out.println(map);
    Map<int[], Double> newMap = map.entrySet()
            .stream()
            .sorted(Map.Entry.<int[], Double>comparingByValue())
            .collect(Collectors.toMap(
                Map.Entry::getKey, Map.Entry::getValue,
                (o, n) -> o, LinkedHashMap::new
    ));
    int i = 0;
    for(int[] arr : newMap.keySet()){
        if(i<k){
            res[i] = arr;
            i++;
        } else break;

    }
    
    // PriorityQueue<List<Integer>> minHeap = new PriorityQueue<>(
    //     (list1, list2) -> {

    //     }
    // );
    return res;
    }
}
