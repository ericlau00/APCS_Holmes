/** 
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1
  
  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    /** 
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public static long fib_recurrence( int n) {
        if(n < 3) //binary decision between base cases and recursive cases 
            return 1; //solution to the base cases. 
        else 
            return 
                fib_recurrence(n-1) //invocation of the recursive abstraction 
                + //combination process 
                fib_recurrence(n-2); //invocation of the recursive abstraction 
    }
     /* These are class methods because the output of the methods will be the same for all instances of Fib. 
    */


    /** 
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {

    }
    /* Time complexity:
       Consider the size of the problem to be ...
       
       As the proxy for the time required, count...
       
       Then cost of the the recurrence algorithm
       grows ?? 
       as the size of the problem increases,
       because ??
     */


    /** 
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
        return -2; // invalid Fibonacci number
    }
    /* Time complexity:
       Consider the size of the problem to be ...
       
       As the proxy for the time required, count...
       
       Then cost of the the recurrence algorithm
       grows ?? 
       as the size of the problem increases,
       because ??
     */
}
