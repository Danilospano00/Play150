package org.corso.play150;

import java.util.Comparator;

public class NomeAziendaCustomerComparator implements Comparator<Customer>{

    @Override
    public int compare(Customer customer1, Customer customer2) {
        int i = -1;
        if (customer1.getNomeAzienda() != null) {
            i = (customer1.getNomeAzienda().equals(customer2.getNomeAzienda()) ? 0 : -1);

        }
        return i;
    }
    
}
