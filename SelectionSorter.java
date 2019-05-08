/**
  Implement a selection sort, in the Sorters structure
 */
import java.util.ArrayList;
public class SelectionSorter<T extends Comparable<T>> extends Sorter<T> {
    /**
      Construct an instance to process the user's data
     */
    public SelectionSorter(  ArrayList<T> usersData) {
        super(usersData);
    }
    
    /**
      sort the user's data, implementing insertion sort
     */
    public void mySort() {
        selectionSort();
    }
    
    private void selectionSort() {
        for(int elementsSorted = 0; elementsSorted <elements.size()-1; elementsSorted++) {
            int smallestIndex = select(elementsSorted);
            T smallest = elements.get(smallestIndex);
            elements.set(smallestIndex, elements.set(elementsSorted, smallest));
        }
    }
    
    private int select(int elementsSorted) {
        T smallest = elements.get(elementsSorted);
        int smallestIndex = elementsSorted;
        for(int indexToCompare = elementsSorted; indexToCompare<elements.size(); indexToCompare++){
            if(smallest.compareTo(elements.get(indexToCompare)) > 0) {
                smallestIndex = indexToCompare;
                smallest = elements.get(indexToCompare);
            }
        }
        return smallestIndex;    
    }
}