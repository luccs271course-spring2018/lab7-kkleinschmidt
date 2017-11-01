### What is the purpose of the various auxiliary methods `populateList`, `populateFifoList`, and `ReverseLines.printReverse`?

These different methods help make sure the tests can make changes to the stack depending on what needs to be changed about them, like printing in reverse.

### Why do these methods need to have arguments, and how does the argument change from one recursive call to the next?

The methods need arguments to be able to store the new data found for the variables and update them. It changes to the next node in how it stores the values used in the nodes and continues to grow.

### What are the time and space complexity of each of the `populateList` `populateFifoList` methods, as well as `ReverseLines.printReverse`?

`populateList`  time and space complexity is O(n). `populateFifoList` time and space complexity is O(n). `ReverseLines.printReverse` time and space complexity is O(n).

### Which of these methods can be implemented using `while` loops? 

All these methods could be implemented using `while` loops instead.