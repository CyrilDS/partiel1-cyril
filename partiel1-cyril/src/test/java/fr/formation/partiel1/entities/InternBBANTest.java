package fr.formation.partiel1.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InternBBANTest {

    private final String COUNTRY = "FR";

    private final int CHECKDIGIT = 33;

    private BasicBankAccountNumber BBAN;

    @Test
    void shouldConstruct() {
	assertDoesNotThrow(() -> {
	    new InternBBAN(COUNTRY, CHECKDIGIT, BBAN);
	});
    }

    @Test
    void shouldNotConstructWithCountryNull() {
	assertThrows(NullPointerException.class, ()->{
		new InternBBAN(null, CHECKDIGIT, BBAN);
    });
	
    }
    // END CLASS
}
