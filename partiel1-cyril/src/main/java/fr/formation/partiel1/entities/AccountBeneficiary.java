package fr.formation.partiel1.entities;

import java.util.Objects;

public class AccountBeneficiary {

    private String nameOfAccountBeneficary = "Michel DUPONT";

    private InternBBAN internBBANBeneficary;

    public AccountBeneficiary(String nameOfAccountBeneficary,
	    InternBBAN internBBANBeneficary) {
	super();
	setNameOfAccountBeneficary(nameOfAccountBeneficary);
	setInternBBANBeneficary(internBBANBeneficary);
    }

    private void setNameOfAccountBeneficary(String nameOfAccountBeneficary) {
	Objects.requireNonNull(nameOfAccountBeneficary);
	this.nameOfAccountBeneficary = nameOfAccountBeneficary;
    }

    private void setInternBBANBeneficary(InternBBAN internBBANBeneficary) {
	this.internBBANBeneficary = internBBANBeneficary;
    }

    public String getNameOfAccountBeneficary() {
	return nameOfAccountBeneficary;
    }

    public InternBBAN getInternBBANBeneficary() {
	return internBBANBeneficary;
    }
}
