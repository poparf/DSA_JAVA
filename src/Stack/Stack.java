package Stack;/*
One ended linear data structure
which models a real world stack
by having  two primary operations, namely push and pop

LIFO - last in first out

When and where is used ?
- used in undo mechanisms in text editors
- compiler syntax
- model real world stacks : books / plates
- used behind the scenes to support recursion
- can be used to do a DFS on a graph

Complexity
Pushing:    O(1)
Popping:    O(1)
Peeking:    O(1)
Searching:  O(1)
Size:       O(1)

Problem:
Given a string made up of the following brackets:
()[]{}, determine whether the brackets properly match.

[{}] - valid
(()()) - valid
{] - invalid
[()]))()


if it s the matching bracket we pop it
stack.push(brackets[0])
for i to size of brackets:
    if(reversed stack.peek(i) == brackets[i+1]) {
        stack.pop();
    }
    else {
    stack.push(brackets[i+1])
    }

    if stack is empty
        return valid
     else return not valid

     or

let S be a  stack
for bracket in bracket_string:
    rev = getReversedBracket(bracket)

    if isLeftBracket(bracket):
        S.push(bracket)
    else if S.isEmpty() or S.pop() != rev:
        return false

    return S.isEmpty();


 Problem 2
 Tower of hanoi

 Stacks can be implemented as a
vector, a linked list or a doubly linked list

// Singly linked list implementation
// Pushing is like adding in the front ( head )
// Popping is like removing from the front ( head )

 */


import java.util.Iterator;
import java.util.LinkedList;

public class Stack<T> implements Iterable <T> {

    private LinkedList<T> list = new java.util.LinkedList<T>();

    public Stack() {}

    public Stack(T firstElem) {
        push(firstElem);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    // Push an element on the stack
    public void push(T elem) {
        list.addLast(elem);
    }

    // Pop an elemnt off the stack
    // Throws an error if the stack is empty
    public T pop() {
        if(isEmpty())
            throw new java.util.EmptyStackException();
        return list.removeLast();
    }

    public T peek() {
        if(isEmpty())
            throw new java.util.EmptyStackException();
        return list.peekLast();
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
