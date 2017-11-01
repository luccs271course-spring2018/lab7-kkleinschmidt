package edu.luc.cs271.linkedstack;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;

  private int n = 0;
  
  @Override
  public E push(final E obj) {
    // DONE
    top = new Node<E>(obj, top);
    n++;
    return obj;
  }

  @Override
  public E peek() {
    // DONE
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    return top.data;
  }

  @Override
  public E pop() {
    // DONE
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    Node<E> newTop = top;
    top = top.next;
    n--;
    return newTop.data;
  }

  @Override
  public boolean isEmpty() {
    // DONE
    if (top == null) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public List<E> asList() {
    final ArrayList<E> result = new ArrayList<>(n);
    populateList(top, result); // DONE replace null with the right reference
    return result;
  }

  private void populateList(final Node<E> curr, final List<E> result) {
    // DONE recursively populate the list in the desired order
    if (curr == null) {
      return;
    }
    result.add(curr.data);
    populateList(curr.next, result);
  }

  @Override
  public List<E> asFifoList() {
    final ArrayList<E> result = new ArrayList<>(n);
    populateFifoList(top, result); // DONE replace null with the right reference
    return result;
  }

  private void populateFifoList(final Node<E> curr, final List<E> result) {
    // DONE recursively populate the list in the desired order
    if (curr == null) {
      return;
    }
    result.add(0, curr.data);
    populateFifoList(curr.next, result);
  }
}