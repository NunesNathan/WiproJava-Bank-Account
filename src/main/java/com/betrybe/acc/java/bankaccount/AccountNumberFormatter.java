package com.betrybe.acc.java.bankaccount;


import org.apache.commons.lang3.StringUtils;

/**
 * AccountNumberFormatter.
 */
public class AccountNumberFormatter {
  private static final int lengthNecessary = 6;

  /**
   * Formata o número da conta.
   *
   * @param literalAccountNumber número da conta
   */
  public String formatAccountNumber(int literalAccountNumber) {
    String accountNumber = String.valueOf(literalAccountNumber);
    int accountNumberLength = accountNumber.length();

    if (accountNumberLength < lengthNecessary) {
      return StringUtils.leftPad(accountNumber, lengthNecessary, '0');
    }

    if (accountNumberLength > lengthNecessary) {
      return StringUtils.right(accountNumber, lengthNecessary);
    }

    return accountNumber;
  }

}