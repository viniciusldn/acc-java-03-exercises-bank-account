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
    System.out.println("-------------------- entre com o número da sua conta --------------------"
        + "\n" + "Digite o número da conta:");
    int acconuntNumber = scan.nextInt();

    scan.close();
    AccountNumberFormatter acountFormatter = new AccountNumberFormatter();
    String formattedAccountNumber = acountFormatter.formatAccountNumber(acconuntNumber);
    System.out.println("Numero da conta: " + formattedAccountNumber);

  }

}
