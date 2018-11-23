package fr.formation.partiel1.entities;

import java.util.Objects;

public class AccountSender {

    private String nameOfAccountSender = "Cyril DUPONT";

    private InternBBAN internBBANSender;

    public AccountSender(String nameOfAccountSender,
	    InternBBAN internBBANSender) {
	super();
	setNameOfAccountBeneficary(nameOfAccountSender);
	setInternBBANBeneficary(internBBANSender);
    }

    private void setNameOfAccountBeneficary(String nameOfAccountSender) {
	Objects.requireNonNull(nameOfAccountSender);
	this.nameOfAccountSender = nameOfAccountSender;
    }

    private void setInternBBANBeneficary(InternBBAN internBBANBeneficary) {
	this.internBBANSender = internBBANBeneficary;
    }

    public String getNameOfAccountBeneficary() {
	return nameOfAccountSender;
    }

    public InternBBAN getInternBBANBeneficary() {
	return internBBANSender;
    }
}
