package fr.formation.partiel1.entities;

import java.util.Objects;

/**
 * @author Cyril
 */
public class BasicBankAccountNumber {

    /**
     * This class provides a BasicBankAccountNumber with 4 arguments:
     * codeOfBank,sortOfCode,numberOfCode,KeyOfBBAN
     */
    // BEGIN CLASS
    private int codeOfBank = 30003;

    private int sortOfCode = 30002;

    private String numberOfAccount = "0000157841Z";

    private int keyOfBBAN = 25;

    public BasicBankAccountNumber(int codeOfBank, int sortOfCode,
	    String numberOfAccount, int keyOfBBAN) {
	// BEGIN CONSTRUCTOR
	setCodeOfBank(codeOfBank);
	setSortOfCode(sortOfCode);
	setNumberOfAccount(numberOfAccount);
	setKeyOfBBAN(keyOfBBAN);
	
	// END CONSTRUCTOR
    }

    private void setCodeOfBank(int codeOfBank) {
	this.codeOfBank = codeOfBank;
    }

    private void setSortOfCode(int sortOfCode) {
	this.sortOfCode = sortOfCode;
    }

    private void setNumberOfAccount(String numberOfAccount) {
	Objects.requireNonNull(numberOfAccount);
	this.numberOfAccount = numberOfAccount;
    }

    private void setKeyOfBBAN(int keyOfBBAN) {
	this.keyOfBBAN = keyOfBBAN;
    }

    public int getCodeOfBank() {
	return codeOfBank;
    }
    
    public int getSortOfCode() {
  	return sortOfCode;
      }
    
    public String getNumberOfAccount() {
	return numberOfAccount;
    }
    
    public int getKeyOfBBAN() {
   	return keyOfBBAN;
       }
   
    // END CLASS
  
}
