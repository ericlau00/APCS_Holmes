# in-place selection sort

Rearrange
an unordered `ArrayList<Integer>`
and use it as the data in an `OrderedList_inArraySlots`.

The re-use is probably contrary to Java's conventions
for its built-in classes. But as a pedagogical tool,
it has the advantage of allowing
the User program to check that the sort
is done in-place.

## count the cost

0. If the number of the elements in the input triples,
the time required to run the reigning champ algorithm
will grow by three times. The loop in the reigning champ
has to loop through every element once, and thus it will
have to loop through three times the number of elements, 
taking three times as long. 
[Justify, in about 2 sentences.]

0. If the number of the elements in the input triples,
the number of times that the reigning champ algorithm
will be invoked will grow by three times beucase the 
algorithm has to lop through every element once. This 
means that the loop will go through three times as 
many elements. 
[Justify, in about 2 sentences.]

0. If the number of the elements in the input triples,
the time required for the selection sort
will grow by 9 times. If each invocation of reigning champ triples,
and the algorithm is invoked 3 more times, then the resulting time
should be the product of the two multipliers. 
[Justify, in about 2 sentences.]
