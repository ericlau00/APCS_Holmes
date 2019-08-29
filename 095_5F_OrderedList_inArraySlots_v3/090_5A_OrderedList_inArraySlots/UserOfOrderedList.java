public class UserOfOrderedList {
    private static OrderedList_inArraySlots list;
    
    public static void main(String[] commandLine) {
        list = new OrderedList_inArraySlots();
        
        System.out.println( "number of elements: " + list.size() );
        System.out.println( "empty list: " + list );
        
        /*
        Populate the list with elements in an ordered order 
        */
        for(int i = 2; i < 5; i++) {
            list.add(i);
            System.out.println(list);
        }
        
        /*
        Populate the list with elements in an unordered order
        */
        list.add(12);
        System.out.println(list);
        list.add(7);
        System.out.println(list);
        list.add(1);
        System.out.println(list);
        list.add(0);
        System.out.println(list);
        list.add(5);
        System.out.println(list);
        
        /*
        get method testing 
        */
        for(int index = 0; index < list.size(); index++) {
            System.out.println("element " + index + ": " + list.get(index)); 
        }
        
        /*
        remove method testing 
        */
        for(int index = 1; index < list.size(); index*=2) {
            System.out.println("element " + index + " removed: " + list.remove(index));
            System.out.println(list);
        }        
    }
}