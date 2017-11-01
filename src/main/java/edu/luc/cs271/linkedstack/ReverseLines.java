package edu.luc.cs271.linkedstack;

import java.util.*;

public class ReverseLines {

  public static void main(final String[] args) {
    final Scanner input = new Scanner(System.in);
    printReverse(input);
  }
  
  private static void printReverse(final Scanner input) {
    // DONE recursively read and print successive input lines until EOF, then print them out in reverse order
    if (!input.hasNextLine()) {
      return;
    } else {
      final String line = input.nextLine();
      System.out.println(line);
      printReverse(input);
      System.out.println(line);
    }
  }
}