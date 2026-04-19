class MyHashSet {
private LinkedList<Integer>[] set;
    public MyHashSet() {
            set = new LinkedList[1000];
            for(int i=0; i<1000; i++){
                set[i] = new LinkedList<>();
            
    }
    }
    public int hashvalue(int key) {
            return key%1000;
        }
    
    public void add(int key) {
        int index = hashvalue(key);
            if(!set[index].contains(key)){
                set[index].add(key);
            }
    }
    
    public void remove(int key) {
        int index = hashvalue(key);
            if(set[index].contains(key)){
                set[index].remove((Integer)key);
            }
    }
    
    public boolean contains(int key) {
        int index = hashvalue(key);
            if(set[index].contains(key)){
                return true;
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