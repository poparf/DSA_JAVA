package Queue;/*
2 primary operations
Enqueue: We add to the back
Dequeue: We remove from the front // polling

 It is used in:
 - any waiting line models a queue : movie/restaurant
 - efficiently keep track of the x most recently added elements
 - web server request management where you want fifo
 - BSF graph traversal

 Complexity:
 Enqueue    O(1)
 Dequeue    O(1)
 Peeking    O(1)
 Contains   O(n)
 Removal    O(n)
 IsEmpty    O(1)

BFS:
Let q be a queue
q.enqueue(starting_node)
starting_node.visited = true

while q is not empty do:
    node =  Q.dequeue()

    for neighbour in neighbours(node):
        if neighbour has not been visited:
            neighbour.visited = true
            q.enqueue(neighbor)



Can be implemented using an array, single linked list or doubly

 queueu: Pushing the tail node forward and adding an node
 Dequeue: pushing the head forward and removing the node


// homework
// if you know the maximum size you can have a static array
and 2 pointers to the begging and the end of the array
a lot faster than a linked list
 */


import java.util.Iterator;
import java.util.LinkedList;

public class Queue<T> implements Iterable<T> {

    private java.util.LinkedList<T> list = new java.util.LinkedList<T>();

    public Queue() {};

    public Queue(T firstElem) {
        offer(firstElem);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public T peek() {
        if(isEmpty()) throw new RuntimeException("Queue empty");
        return list.peekFirst();
    }

    public T poll() {
        if(isEmpty())
            throw new RuntimeException("Queue empty");
        return list.removeFirst();
    }

    public void offer(T elem) {
        list.addLast(elem);
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
