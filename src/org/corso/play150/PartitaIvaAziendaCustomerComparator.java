package org.corso.play150;
import java.util.Comparator;


public class PartitaIvaAziendaCustomerComparator implements Comparator<Customer>{

    @Override
    public int compare(Customer customer1, Customer customer2) {
        int i = -1;
        if (customer1.getNomeAzienda() != null) {
            i = (customer1.getPartitaIvaAzienda().equals(customer2.getPartitaIvaAzienda()) ? 0 : -1);

        }
        return i;
    }
    
}

