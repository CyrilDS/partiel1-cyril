package fr.formation.partiel1.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ListOfTransfers {
    
    private List<Transfer> listOfTransfers = new ArrayList<>();
    
    public boolean addListOfTransfers(Transfer transfer) {
  	Objects.requireNonNull(transfer, "Transfer is required");
  	return listOfTransfers.add(transfer);
      }
    
    
    public List<Transfer> getListOfTransfers1() {
        return  Collections.unmodifiableList(listOfTransfers);
    }
    
    public List<Transfer> getListOfTransfers() {
        return listOfTransfers;
    }
    
    
    
}
