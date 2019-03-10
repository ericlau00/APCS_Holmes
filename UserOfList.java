/**
 Test list features.
 */
public class UserOfList {
    private static List_inArraySlots list;

    public static void main( String[] args ) {
        list = new List_inArraySlots();

        System.out.println( "number of elements: " + list.size() );
        System.out.println( "empty list: " + list);

        /* Populate the list with elements, but with a small enough
           number that we expect no invocation of expand().
        */
        int elemIndex;
        for( elemIndex = 0; elemIndex < 5; elemIndex++ ) {
            list.add( -elemIndex); // differs from index, but similar
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println("initial population of " + list.size() + " elements:");
        System.out.println( list + System.lineSeparator());

        // Add enough elements that expansion is expected
        for( ; elemIndex < 15; elemIndex++ ) {

            if( elemIndex == 10) System.out.println( "expansion expected");

            list.add( -elemIndex);
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println("result of second population: " + list.size() + " elements:");
        System.out.println( list + System.lineSeparator());

        // Trust no one.
        for( ; elemIndex < 35; elemIndex++ )
            list.add( -elemIndex);
        System.out.println("after second expansion: " + list.size() + " elements:");
        System.out.println( list + System.lineSeparator());
    }  // end of main()
}
