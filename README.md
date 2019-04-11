# implement List.indexOf

`while`-style and recursive implementations at the top of
OrderedList_inArraySlots.java

[Java API on the `indexOf` method](https://docs.oracle.com/javase/10/docs/api/java/util/List.html#indexOf(java.lang.Object))

based on [solutionsHolmes/5D_genericTypes/OrderedList_inArraySlots_v2/](https://github.com/stuyvesant-cs/solutionsHolmes/tree/master/5D_genericTypes/OrderedList_inArraySlots_v2)
as of 2019-04-10 04:48

# 2. Recall inverse functions and logarithms

#### What is meant by y = log2x?

#### What does its graph look like? 

# 3. describe the recursive solution 

#### 0. State the problem 

#### 1. State the recursive abstraction

#### 2. Identify the parts of this solution that correspond to the six parts of a generalized recursive solution 

0. decision between the base cases and the recursive cases 
```
        if( low > hi)  // detect base case 0 
```
```
            if( comparison == 0)    // detect base case 1
```
1. instructions to solve the base cases
```
            return -2;   // solution to base case 0 
```
```
                return pageToCheck; // solution to base case 1
```
2. instructions to solve the recursive cases 
   - combination process 
     - there is no combination process 
   - result of the recursive abstraction 
```
                    return indexOf_recursive( findMe
                                             , low
                                             , pageToCheck -1);
```
```
                    return indexOf_recursive( findMe
                                            , pageToCheck +1
                                            , hi);
```
   - leftover processing 
     - there is no leftover processing 
