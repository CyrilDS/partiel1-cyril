package fr.formation.partiel1.controller;

import java.awt.PageAttributes.MediaType;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import fr.formation.partiel1.entities.AccountBeneficiary;
import fr.formation.partiel1.entities.AccountSender;
import fr.formation.partiel1.entities.Transfer;

@Path("transfer")
public class TransferController {

    private final static Map<String, Transfer> TRANSFER = new HashMap<>();
    static {
	TRANSFER.put("1", transfer1());
	TRANSFER.put("2", transfer2());
    }

    @GET
    @Path("history/one/{code}")
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public Transfer one(@PathParam("code") String code) {
	return TRANSFER.get(code);
    }

    private static Transfer transfer1() {
	LocalDateTime timestamp = LocalDateTime.of(2018, 11, 21, 15, 00, 30);
	String nameAccountA = "Cyril Dupont";
	String countryA = "FR";
	int checkDigitA = 33;
	int codeOfBankA = 30003;
	int sortOfCodeA = 30002;
	String numberOfAccountA = "0000157841Z";
	int keyOfBBANA = 25;
	double amount = 150.50;
	String nameAccountB = "Michel Dupont";
	String countryB = "FR";
	int checkDigitB = 33;
	int codeOfBankB = 30003;
	int sortOfCodeB = 30002;
	String numberOfAccountB = "0000157934L";
	int keyOfBBANB = 56;
	return transfer1();
    }

    private static Transfer transfer2() {
	LocalDateTime timestamp = LocalDateTime.of(2018, 11, 23, 10, 00, 30);
	String nameAccountA = "Cyril Dupont";
	String countryA = "FR";
	int checkDigitA = 33;
	int codeOfBankA = 30003;
	int sortOfCodeA = 30002;
	String numberOfAccountA = "0000157841Z";
	int keyOfBBANA = 25;
	double amount = 150.50;
	String nameAccountB = "Michel Dupont";
	String countryB = "FR";
	int checkDigitB = 33;
	int codeOfBankB = 30003;
	int sortOfCodeB = 30002;
	String numberOfAccountB = "0000157934L";
	int keyOfBBANB = 56;
	return transfer2();
    }
}
