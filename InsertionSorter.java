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
        insertionSort(elements);
    }

    private <T extends Comparable<T>> void insertionSort(ArrayList<T> list) {
        for(int indexToInsert = 1; indexToInsert < list.size(); insert(indexToInsert, list), indexToInsert++) { }
    }
    
    private <T extends Comparable<T>> void insert(int indexToInsert, ArrayList<T> list ) {
        T valueToInsert = list.get(indexToInsert);
        int indexToCompare = indexToInsert - 1;
        for(;
            indexToCompare > -1 && valueToInsert.compareTo(list.get(indexToCompare)) < 0;
            list.set(indexToCompare+1, list.get(indexToCompare)), indexToCompare--
            ) { }
        list.set(indexToCompare+1, valueToInsert); 
    }
}
