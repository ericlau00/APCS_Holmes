public class OrderedList_inArraySlots{
    private List_inArraySlots list; 
    
    public OrderedList_inArraySlots() { list = new List_inArraySlots(); }
    
    public int size() { return list.size(); }
    
    public String toString() { return list.toString(); }
    
    public boolean add(int value) {
        int correctIndex = sort(value,0, list.size());
        list.add(correctIndex, value);
        return true;
    }
    
    private int sort(int value, int firstIndex, int lastIndex) {
        if (firstIndex == lastIndex) return firstIndex;
        if (value < list.get(firstIndex)) return firstIndex;
        else return sort(value, firstIndex+1, lastIndex);
    }    
    
    public int get(int index) { return list.get(index); }
    
    public int remove(int index) { return list.remove(index); }
}