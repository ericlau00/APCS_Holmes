/** 
  test types of sorts that are polymorphic variations of Sorter
 */
import java.util.Arrays;
import java.util.ArrayList;

public class UserOfSorts {
    public static void main(String[] commandLine) {
        // arrays to be sorted
        /**
            sets up String data to be sorted, stored in an ArrayList<String>
        **/
        ArrayList< String> unsorted = new ArrayList< String>(
          /* Java's Arrays.asList provides a perspicuous
             way to build a Collection from literals,
             suitable for constructing an ArrayList */
          Arrays.asList(
            // data convenient for debugging an insertion sort
              // A single piece of data is already in order trivially.
              "B"

              // data destined for the END of the sorted region
            , "D"

              /* more data for the end, so subsequent tests
                 process a larger sorted region
                */
            , "F", "J", "L", "N"

              // data destined for the MIDDLE of the sorted region
            , "H"

              // data destined for the START of the sorted region
            , "A"

              /* buffering data, merely to keep the preceding data 
                 from having the special property of being last in
                 the input list.
               */
            , "Z"  
            ));
         
            
        ArrayList<String> soup = new ArrayList<String>(
            Arrays.asList(
            "C","F","J","M","D","B","P","A"
            )
        );

        ArrayList<String> base = new ArrayList<String>(
            Arrays.asList(
            "0"
            )
        );
        
        ArrayList<String> minimal = new ArrayList<String>(
            Arrays.asList(
            "1","0"
            )
        );
        
        ArrayList<String> scramble = new ArrayList<String>(
            Arrays.asList(
            "1","0","2","3"
            )
        );
        
        // insertion sort   
        /**
            constructs an InsertionSorter based on that data
        **/
        oneTest( "insertion sort "
               , new InsertionSorter( unsorted)
               );
               
        // selection sort 
        /**
            constructs a SelectionSorter based on that data 
        **/
                
        oneTest( "selection sort "
                , new SelectionSorter(soup)
                );
    
        oneTest( "merge sort "
                , new SelectionSorter(base)
                );
    
        oneTest( "merge sort "
                , new SelectionSorter(minimal)
                );
        
        oneTest( "merge sort "
                , new SelectionSorter(scramble)
                );
    }

    /** 
     Run one test
     */
    private static void oneTest( String description
                               , Sorter sorter
                               ) {
        System.out.println( System.lineSeparator() + description);
        /**
            invokes that Sorter’s mySort method, to sort the data
        **/
        sorter.mySort();
        System.out.println( sorter);
        /**
            checks that the result is correctly sorted.
        **/
        System.out.println( "sorted: " + sorter.isSorted());
     }
}
