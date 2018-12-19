package com.javacore;

public class Main {

    public static void main(String[] args) {
      printSquareStar(28);


    }

  public static void printSquareStar(int number) {
    if (number < 5) {
      System.out.println("Invalid Value");
    } else {
      for (int j = 1; j <= number; j++) {
        if (j == number || j == 1) {
          for (int i = 1; i <= number; i++) {
            System.out.print("*");
          }
        }


        for (int k = 1; k <= number; k++) {
          if (j == 1 || j == number) {
            continue;
          }
          if (k == 1 || k == number || (j == k) || (k == ((number - j) + 1))) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }

        System.out.println();
      }
    }

  }

}

