/**
  Represent a date
 */
public class Date implements Comparable{
    private int y,m,d;
    

    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        // someday: ISO 8601
        return y + "-" + m + "-" + d;
    }
    
    public int compareTo(Object otherDate) {
        Date other = (Date) otherDate;
        int myDays = 365 * y + 12 * m + d;
        int otherDays = 365 * other.y + 12 * other.m + other.d;
        return Integer.compare(myDays, otherDays);
    }

}