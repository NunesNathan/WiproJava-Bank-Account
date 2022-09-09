package com.betrybe.acc.java.bankaccount;

import java.util.Scanner;

/**
 * A class.
 */
public class Application {

  /**
   * A simple get method.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    AccountNumberFormatter anf = new AccountNumberFormatter();
    int account = 0;

    System.out.println("Informe o número da conta:");

    try {
      account = scan.nextInt();
    } catch (NumberFormatException e) {
      System.out.println("Número da conta inválido!");
    } finally {
      scan.close();
    }

    String formattedAccountNumber = anf.formatAccountNumber(account);
    System.out.printf("Numero da conta: " + formattedAccountNumber);
  }
}
