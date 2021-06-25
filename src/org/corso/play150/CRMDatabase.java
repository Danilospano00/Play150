package org.corso.play150;

import java.util.ArrayList;
import java.util.List;

public class CRMDatabase {

    private List<Contatto> listaContattiSenzaAzienda = new ArrayList<>();
    private List<Customer> listaAziendeConContatto = new ArrayList<>();

    private TelefonoContattoComparator telefonoContattoComparator  = new TelefonoContattoComparator();
    private EmailContattoComparator emailContattoComparator = new EmailContattoComparator();
    private PartitaIvaAziendaCustomerComparator partitaIvaAziendaCustomerComparator = new PartitaIvaAziendaCustomerComparator();
    private NomeAziendaCustomerComparator nomeAziendaCustomerComparator = new NomeAziendaCustomerComparator();


    private Customer customer;
    private Contatto contatto;

    public CRMDatabase() {        
        }

    public void aggiungiContatto(Contatto contatto) {
        if (getListaContattiSenzaAzienda().isEmpty()) {
            getListaContattiSenzaAzienda().add(contatto);
        } else {
            if (contatto != null && getListaContattiSenzaAzienda() != null) {
                for (Contatto item : getListaContattiSenzaAzienda()) {
                    if (telefonoContattoComparator.compare(contatto, item) != 0
                    && emailContattoComparator.compare(contatto, item) != 0) {
                        getListaContattiSenzaAzienda().add(contatto);
                        break;
                    }
                }
            }
        }
    }

    public void aggiungiCustomer(Customer customer) {
       if (getListaContattiSenzaAzienda().contains(customer.getContatto())) {
            if (getListaAziendeConContatto().isEmpty()) {
                getListaAziendeConContatto().add(customer);
            } else {
                for (Customer item : getListaAziendeConContatto()) {
                    if (partitaIvaAziendaCustomerComparator.compare(customer, item) != 0
                    && nomeAziendaCustomerComparator.compare(customer, item) != 0) {
                        if(comparaDueContatti(customer.getContatto(), item.getContatto())!=0)
                        getListaAziendeConContatto().add(customer);
                        System.out.println(customer.getNomeAzienda());

                    }
                    else{
                        item.setContatto(contatto);
                    }
                }
            }
        }

   }

   public int comparaDueCustomer(Customer customer1, Customer customer2) {
    if (partitaIvaAziendaCustomerComparator.compare(customer1, customer2) != 0
            && nomeAziendaCustomerComparator.compare(customer1, customer2) != 0) {
        return -1;
    }
    return 0;
}

public int comparaDueContatti(Contatto contatto1, Contatto contatto2) {
    if (telefonoContattoComparator.compare(contatto1, contatto2) != 0
            && emailContattoComparator.compare(contatto1, contatto2) != 0) {
        return -1;
    }
    return 0;
}

    public List<Contatto> getListaContattiSenzaAzienda() {
        return listaContattiSenzaAzienda;
    }

    public void setListaContattiSenzaAzienda(List<Contatto> listaContattiSenzaAzienda) {
        this.listaContattiSenzaAzienda = listaContattiSenzaAzienda;
    }

    public List<Customer> getListaAziendeConContatto() {
        return listaAziendeConContatto;
    }

    public void setListaAziendeConContatto(List<Customer> listaAziendeConContatto) {
        this.listaAziendeConContatto = listaAziendeConContatto;
    }

}
