### Why does `LinkedStack` not require an explicit constructor?

`Node` already has a constructor so it is redundant.

### What is the time and (extra) space complexity of each of the `LinkedStack` methods, as well as `ReverseLines.main`?

#### `push()`
* **time:** O(1)
* **space:** O(1)

#### `peek()`
* **time:** O(1)
* **space:** O(1)

#### `pop()`
* **time:** O(1)
* **space:** O(1)

#### `isEmpty()`
* **time:** O(1)
* **space:** O(1)

#### `asList`
* **Time:** O(n)
* **Space:** O(n)

#### `ReverseLines.main`
* **time:** O(n)
* **space:** O(n)

### How else (not using `Node`) could we have implemented `LinkedStack` in such a way that it is still based on a linked list but the `asList` method uses constant time and space?

Another way would be to use a `linkedList`, the `asList()` would return it with O(1) time and space.

### Is it better for `push` and `pop` to return the item or the stack itself?  Briefly discuss the pros and cons of each design.

Better to return item because it takes less time even if you cannot access all of it at once. Stack is the reverse with the pros being that you can see everything at once, and the cons being it is less time efficient. Coding is more efficient when it runs faster.# 