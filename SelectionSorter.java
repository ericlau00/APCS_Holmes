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
        selectionSort(elements);
    }
    
    private <T extends Comparable<T>> void selectionSort(ArrayList<T> list) {
        for(int elementsSorted = 0; elementsSorted <list.size()-1; elementsSorted++) {
            T smallest = list.get(elementsSorted);
            int smallestIndex = elementsSorted;
            for(int indexToCompare = elementsSorted; indexToCompare<list.size(); indexToCompare++) {
                if(smallest.compareTo(list.get(indexToCompare)) > 0) {
                    smallestIndex = indexToCompare;
                    smallest = list.get(indexToCompare);
                }
            }
            list.set(smallestIndex, list.get(elementsSorted));
            list.set(elementsSorted, smallest);
        }
    }
}