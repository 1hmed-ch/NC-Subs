class MyHashMap {
    List<List<Integer>> myMap;

    public MyHashMap() {
        this.myMap = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        for(List<Integer> sub : this.myMap){
            if(sub.get(0) == key){
                sub.set(1, value);
                return;
            }
        }
        myMap.add(Arrays.asList(key, value));

        
        System.out.println("put :" + myMap);
    }
    
    public int get(int key) {
        for(List<Integer> sub : this.myMap){
            if(sub.get(0) == key){
                System.out.println( "get :" + myMap);
                return sub.get(1);
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        // Iterator<List<Integer>> it = myMap.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        //     if(it.next().get(0) == key){
        //         myMap.remove(it.next());
        //     } else return;
        // }
        myMap.removeIf(list -> list.get(0) == key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */