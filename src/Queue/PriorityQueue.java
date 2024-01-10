package Queue;/*
A priority queue is an Abstract Data Type (ADT) that operates
similar to a normal queue except that each element has a certain
priority. The priority of the elements in the priority queue determine the order in
which elements are removed from the PQ,

PQ only supports comparable data, meaning the data inserted into the PQ must
be able to be ordered in some way either from least to greatest or greatest to least.
This is so that we are able to assign relative priorities to each elements.

poll() remove the elements with the highest priority
For the program to know which element has the
highest priority, it does not sort the elements after each add
It uses a Heap.

A heap is a tree based data structure that satisfies the heap invariant
(also called heap property):
If A is a parent node of B then A is ordered with respect to B for all nodes A, B in the heap.

All childs of a parent node are less/bigger that the parent node itself.

Min Heaps / Max Heaps

Heaps are canonical data structures for Priority Queues.
But they re not the same.

! Heaps must be trees ! No cycles !

When and where is a PQ used?
- Dijkstra's Shortest Path algorithm
- Dynamically fetch the 'next best' or the 'next worst' element
- Used in Huffman coding ( used in lossless data compression )
- A(star) use PQs to continuously grab the next most promising node
- Used by Minimum spanning tree (MST) algorithms

Complexity:
Binary Heap construction: O(n)  -> used in heap sort
Polling: O(log(n))
Peeking: O(1)
Adding:  O(log(n))
Naive removing: O(n)   ( removing an element that is not the root )
Advanced removing with help from a hash table: O(log(n))
Naive contains: O(n)
Contains check with help of a hash table: O(1)



Turning Min PQ into Max PQ
Why?
Often the STL provides only a min PQ

All elements in a PQ must implement a comparable interface
We can just reverse the comparation

If the elements are numbers we can negate the numbers !

 */

public class PriorityQueue {
}
