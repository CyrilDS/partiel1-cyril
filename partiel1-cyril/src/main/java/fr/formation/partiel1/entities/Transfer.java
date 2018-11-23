package fr.formation.partiel1.entities;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @author Cyril
 */
public class Transfer {

    /**
     * This class provides a transfer with 5 arguments: account A = account
     * banking orign accountB = account banking beneficiary amount = amount of
     * transfer ccy= Currencies of transfer timestamp= timestamp of transfer
     */
    // BEGIN CLASS
    private AccountSender accountA;

    private AccountBeneficiary accountB;

    private double amount = 150.50;

    private LocalDateTime timestamp = LocalDateTime.of(2018, 11, 23, 10, 00,
	    30);

    public Transfer(AccountBeneficiary accountB, AccountSender accountA,
	    double amount, LocalDateTime timestamp) {
	setAccountB(accountB);
	setAccountA(accountA);
	setAmount(amount);
	setTimestamp(timestamp);
    }

    public void setAccountA(AccountSender accountA) {
	Objects.requireNonNull(accountA);
	this.accountA = accountA;
    }

    public void setAccountB(AccountBeneficiary accountB) {
	Objects.requireNonNull(accountB);
	this.accountB = accountB;
    }

    public void setAmount(double amount) {
	Objects.requireNonNull(amount);
	this.amount = amount;
    }

    public void setTimestamp(LocalDateTime timestamp) {
	Objects.requireNonNull(timestamp);
	this.timestamp = timestamp;
    }

    public LocalDateTime getTimestamp() {
	return timestamp;
    }
    // END CLASS
}
