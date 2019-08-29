# 52_List_ofPolymorphicTypes

The purpose of this exercise is to attempt to understand the inner workings of how Java handles lists that can store objects of varying types. The
solution is to utilize an array that can hold an Object type, as pre-defined by Java.

## List_inArraySlots
Fields:
- private Object[] objectElements
- private int filledElements
- private static final int INITIAL_CAPACITY

Constructors:
- List_inArraySlots()

Methods;
- size()
- toString()
- add(Object)
- expand()
- get(int)