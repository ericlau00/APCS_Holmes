/** 
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1
  
  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    
    public static void main(String[] commandLine) {
        //recurrence ~40
        //grade8 ~400 435 
        //binet ~400 453
        Fib fib = new Fib();
        long start = System.currentTimeMillis();
        for(int n = 1; n<401; n++) {
            System.out.println(n + ": " + fib.fib_Binet(n));
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
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
        long sub_2 = 0;
        long sub_1 = 1;
        for(int i = 1; i < n; i++) {
            long storage = sub_1;
            sub_1 += sub_2; 
            sub_2 = storage; 
        }
        return sub_1; 
    }
    /* Time complexity:
       Consider the size of the problem to be linear.
       
       As the proxy for the time required, count number of iterations. 
       
       Then cost of the the grade8 algorithm
       grows linearly 
       as the size of the problem increases,
       because as the n increases by an additional amount, the number of loops goes up
       by that additional amount. 
     */


    /** 
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        double psi = (1 - Math.sqrt(5)) / 2;
        return (Math.pow(phi,n) - Math.pow(psi,n)) / Math.sqrt(5);
    }
    /* Time complexity:
       Consider the size of the problem to be constant. 
       
       As the proxy for the time required, count number of computations.
       
       Then cost of the the binet algorithm
       grows not 
       as the size of the problem increases,
       because the number of computations stays constant. 
     */
}
