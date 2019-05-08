/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter<T extends Comparable<T>> extends Sorter<T> {

    /**
      Construct an instance to process the user's data
     */
    public InsertionSorter(  ArrayList<T> usersData) {
        super(usersData);
    }
    
    /**
      sort the user's data, implementing insertion sort
     */
    public void mySort() {
        insertionSort();
    }

    private void insertionSort() {
        for(int indexToInsert = 1; indexToInsert < elements.size(); insert(indexToInsert), indexToInsert++) { }
    }
    
    private void insert(int indexToInsert) {
        T valueToInsert = elements.get(indexToInsert);
        int indexToCompare = indexToInsert - 1;
        for(;
            indexToCompare > -1 && valueToInsert.compareTo(elements.get(indexToCompare)) < 0;
            elements.set(indexToCompare+1, elements.get(indexToCompare)), indexToCompare--
            ) { }
        elements.set(indexToCompare+1, valueToInsert); 
    }
}
