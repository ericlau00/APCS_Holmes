/**
  test OrderedList
 */

public class UserOfOrderedList {
    public static OrderedList_inArraySlots orderedList =
      new OrderedList_inArraySlots();

    public static void main(String[] commandLine) {
        System.out.println( orderedList);
        System.out.println( System.lineSeparator());

        addOne( "populate an empty list"
               , 0
               ,"[0,]"
               );

        addOne( "add an element that belongs at the front"
               , -11
               ,"[-11,0,]"
               );

        addOne( "add an element that belongs at the back"
               , 5
               ,"[-11,0,5,]"
               );

        addOne( "add an element that belongs somewhere in the middle"
               , 2
               ,"[-11,0,2,5,]"
               );

        addOne( "add an element that is the same as another element"
               , 0
               ,"[-11,0,0,2,5,]"
               );

        getOne( "get an element that belongs at the front"
               , 0
               ,"-11"
               );
         
        getOne( "get an element that belongs at the end "
               , orderedList.size() - 1
               ,"5"
               );
       
        getOne( "get element 2 "
               , 2
               ,"0"
               );
               
        removeOne( "remove an element that belongs at the end "
               , orderedList.size() - 1
               ,"[-11,0,0,2,]"
               );
               
        sizeOne( "size of list with 4 elements "
               ,"4"
               ); 

        removeOne( "remove element 1 "
               , 1
               ,"[-11,0,2,]"
               ); 
               
        sizeOne( "size of list with 3 elements "
               ,"3"
               ); 
               
        removeOne( "remove an element that belongs at the front "
               , 0
               ,"[0,2,]"
               ); 
    }

    
    /**
      run one test
     */
    private static void addOne( String description
                              , int value
                              , String expect
                              ) {
        System.out.println( description);
        orderedList.add( value);

        // check 
        System.out.println( 
            "result:   "
          + orderedList
          + " ...expecting "
          + expect
          + System.lineSeparator());
    }
    
    private static void getOne( String description
                              , int index 
                              , String expect 
                              ) {
        System.out.println( description ); 
        
        System.out.println(
            "result:    "
          + orderedList.get( index )
          + " ...expecting "
          + expect 
          + System.lineSeparator());
    }
    
    private static void removeOne( String description
                                 , int index 
                                 , String expect 
                                 ) {
        System.out.println( description );
        orderedList.remove(index);
        
        System.out.println( 
            "result:    "
          + orderedList
          + " ...expecting "
          + expect 
          + System.lineSeparator());
    }

    private static void sizeOne( String description
                               , String expect 
                               ) {
        System.out.println( description );
        System.out.println( orderedList );
        
        System.out.println(
            "result:    "
          + orderedList.size()
          + " ... expecting "
          + expect 
          + System.lineSeparator());
    }
}    
