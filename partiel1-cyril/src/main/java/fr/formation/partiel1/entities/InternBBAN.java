package fr.formation.partiel1.entities;

import java.util.Objects;

public class InternBBAN {
    // BEGIN CLASS

    private String country = "FR";

    private int checkDigit = 33;

    private BasicBankAccountNumber bBAN;

    public InternBBAN(String country, int checkDigit,
	    BasicBankAccountNumber bBAN) {
	setCountry(country);
	setCheckDigit(checkDigit);
	setBBAN(bBAN);
    }
    // END CLASS

    private void setCountry(String country) {
	Objects.requireNonNull(country);
	this.country = country;
    }

    private void setCheckDigit(int checkDigit) {
	this.checkDigit = checkDigit;
    }

    private void setBBAN(BasicBankAccountNumber bBAN) {
	bBAN = bBAN;
    }

    public String getCountry() {
	return country;
    }

    public int getCheckDigit() {
	return checkDigit;
    }

    public BasicBankAccountNumber getBBAN() {
	return bBAN;
    }
}
