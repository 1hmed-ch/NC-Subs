class MyHashSet {

    private List<Integer> list;

    public MyHashSet() {
        this.list = new ArrayList<>();
    }
    
    public void add(int key) {
        if(!this.contains(key)){
            this.list.add(key);
        }
    }
    
    public void remove(int key) {
        if(this.contains(key)){
            this.list.remove(Integer.valueOf(key));
        }
        
    }
    
    public boolean contains(int key) {
        for(int i : this.list){
            if(i == key) return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */