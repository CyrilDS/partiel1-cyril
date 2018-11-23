package fr.formation.partiel1.entities;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class TransferTest {

    // BEGIN
    private AccountBeneficiary ACCOUNTBENEFICARY;

    private AccountSender ACCOUNTSENDER;

    private final double AMOUNT = 150.50;

    private final LocalDateTime TIMESTAMP = LocalDateTime.of(2018, 11, 23, 10,
	    00, 30);

    @Test
    void shouldConstruct() {
	assertDoesNotThrow(() -> {
	    new Transfer(ACCOUNTBENEFICARY, ACCOUNTSENDER, AMOUNT, TIMESTAMP);
	});
    }

    @Test
    void shouldNotConstructWithAccounts() {
	assertThrows(NullPointerException.class, () -> {
	    new Transfer(null, null, AMOUNT, null);
	});
    }
    // END
}
