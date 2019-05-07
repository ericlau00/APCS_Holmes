/** 
  represent an abstraction of sorting an array  
  
 */
import java.util.ArrayList;

abstract class Sorter<T extends Comparable<T>> {
    protected ArrayList<T> elements;
    
    /**
      Construct an instance, saving a reference to the 
      user's data
     */
    public Sorter( ArrayList<T> usersData) {
        elements = usersData;
    }
    

    /** 
      Sort elements, using the algorithm of the subclass.
      Avoid name collision with ArrayList's sort() method.
     */
    public abstract void mySort();


    /** 
      @return a String representation of the elements
     */
    public String toString() {
        String result = "[";
        for( T e : elements)
            result += e + ",";
        return result + "]";
    }


    /** 
      @return the boolean value of the statement
         "the elements are in ascending order"
     */
    public boolean isSorted() {
        for( int i = 0
           ; i < elements.size() -1 // stop early, because comparing to next
           ; i++
           )
            if( elements.get(i).compareTo( elements.get(i+1)) > 0) return false;
        return true;
    }
}
