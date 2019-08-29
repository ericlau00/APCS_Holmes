/**
  Represent a merge operation for sorted lists,
  as described in README.md
 */
import java.util.ArrayList;

public class Merger {

    ArrayList<String> usersData, localData;

    /**
      Construct an instance from a list of data
      part of which is to be merged. See README
     */
    public Merger( ArrayList<String> list) {
        usersData = list;
    }


    /**
      Merge the sorted sub-lists.
     */
    public void merge(
      // indexes of sub-list boundaries; see README
        int start0  // index of first item in list0
      , int start1  // index of first item in list1
                    // = just past end of list0
      , int end1    // index past end of list1
    ) {
        localData = new ArrayList<String>(end1-start0);
        for(int i = start0; i < end1; localData.add(usersData.get(i)), i++ ) { }
        merge_recursive(start0,0,start1-start0,start1-start0,end1-start0);
        // merge_while(start0,0,start1-start0,start1-start0,end1-start0);
    }
    
    private void merge_recursive(int target, int start0, int end0, int start1, int end1) {
        if(start0==end0 && start1==end1) return;
        else {
            if(start0 == end0) usersData.set(target++,localData.get(start1++));
            else if (start1== end1) usersData.set(target++, localData.get(start0++));
            else {
                if(localData.get(start0).compareTo(localData.get(start1)) < 0) usersData.set(target++, localData.get(start0++));
                else usersData.set(target++,localData.get(start1++));
            }
            merge_recursive(target,start0,end0,start1,end1);
        }
    }
    
    private void merge_while(int target, int start0, int end0, int start1, int end1) {
        for(int elementsMerged = 0; elementsMerged < localData.size(); elementsMerged++) {
            if(start0 == end0) usersData.set(target++,localData.get(start1++));
            else if (start1== end1) usersData.set(target++, localData.get(start0++));
            else {
                if(localData.get(start0).compareTo(localData.get(start1)) < 0) usersData.set(target++, localData.get(start0++));
                else usersData.set(target++,localData.get(start1++));
            }
        }
    }

    /**
      @return a string representation of the user's data
     */
    public String toString() {
        return "" + usersData; 
    }

    
    /** 
      @return the boolean value of the statement
         "the data in the range are in ascending order"
     */
    public boolean isSorted( int startAt, int endBefore) {
        for( int i = startAt
           ; i < endBefore -1 // stop early, because comparing to next
           ; i++
           )
            if( usersData.get(i).compareTo( usersData.get(i+1)) > 0) {
                System.out.println( "trouble between position " + i 
                                  + ", which holds " + usersData.get(i)
                                  + ", and position " + (i +1)
                                  + ", which holds " + usersData.get(i +1)
                                  );
                return false;
            }
        return true;
    }
}