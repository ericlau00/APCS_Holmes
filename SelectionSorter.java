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
    
    /**
    pre-condition: a list of n elements
    synopsis: runs select method from index 0 to index n-2
    post-condition: a sorted list of n elements 
    **/
    private void selectionSort() {
        for(int elementsSorted = 0; elementsSorted <elements.size()-1; select(elementsSorted), elementsSorted++) { }
    }

    /**
    pre-condition: a list of elements with n elements in the sorted region. 
    synopsis: finds the value of the smallest element in the unsorted region.
              swaps the value at the beginning of the unsorted region with the smallest value. 
    post-condition: a list of elements with n + 1 elements in the sorted region. 
    **/  
    private void select(int elementsSorted) {
        T smallest = elements.get(elementsSorted);
        int smallestIndex = elementsSorted;
        for(int indexToCompare = elementsSorted; indexToCompare<elements.size(); indexToCompare++){
            if(smallest.compareTo(elements.get(indexToCompare)) > 0) {
                smallestIndex = indexToCompare;
                smallest = elements.get(indexToCompare);
            }
        }
        elements.set(smallestIndex, elements.set(elementsSorted, smallest));
    }
}