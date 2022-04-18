class RandomizedSet {
    ArrayList<Integer> arr;
    HashMap<Integer,Integer> map ;
    public RandomizedSet() {
        map = new HashMap<>();
        arr = new ArrayList<Integer>();
    }
    
    public boolean insert(int val) {
        if(!map.containsKey(val)){
            arr.add(val);
            int i=0;
            for(int ele:arr){
                if(ele == val){
                    map.put(val,i);
                }
                i++;
            }
            map.put(val,i-1);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(map.containsKey(val)){
            int ind = map.get(val);
            if(ind!=arr.size()-1 && arr.size()>1){
                map.put(arr.get(arr.size()-1),ind);
                Collections.swap(arr, ind, (arr.size()-1));
            }
            map.remove(val);
            arr.remove(arr.size()-1);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        Random rand = new Random();
        return arr.get(rand.nextInt(arr.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
