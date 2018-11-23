package fr.formation.partiel1.entities;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class BasicBankAccountNumberTest {

    // BEGIN
    private final int CODEOFBANK = 30003;

    private final int SORTOFCODE = 30002;

    private final String NUMBEROFACCOUNT = "0000157841Z";

    private final int KEYOFBBAN = 25;

    @Test
    void shouldConstruct() {
	assertDoesNotThrow(() -> {
	    new BasicBankAccountNumber(CODEOFBANK, SORTOFCODE, NUMBEROFACCOUNT,
		    KEYOFBBAN);
	});
    }

    @Test
    void shouldNotConstructWithNumberOfAccountNull() {
	assertThrows(NullPointerException.class, () -> {
	    new BasicBankAccountNumber(CODEOFBANK, SORTOFCODE, null, KEYOFBBAN);
	});
    }

    // @Test
    // void shouldNotConstructWithIllegalArgument() {
    // assertThrows(IllegalArgumentException.class, () -> {
    // new BasicBankAccountNumber(CODEOFBANK, SORTOFCODE, null, KEYOFBBAN);
    // });
    // }
    @Test
    void shouldNotFailMethodGetAddress() {
	BasicBankAccountNumber basicBankAccountNumber = new BasicBankAccountNumber(CODEOFBANK, SORTOFCODE, NUMBEROFACCOUNT,
		KEYOFBBAN);
	int codeOfBankActual = basicBankAccountNumber.getCodeOfBank();
	assertEquals(CODEOFBANK, codeOfBankActual);
	int sortOfCodeActual = basicBankAccountNumber.getSortOfCode();
	assertEquals(SORTOFCODE, sortOfCodeActual);
	String numberOfAccountActual= basicBankAccountNumber.getNumberOfAccount();
	assertEquals(NUMBEROFACCOUNT, numberOfAccountActual);
	int keyOfBBANActual = basicBankAccountNumber.getKeyOfBBAN();
	assertEquals(KEYOFBBAN, keyOfBBANActual);
	
    }
    // END CLASS TEST
}
