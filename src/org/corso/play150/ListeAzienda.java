package org.corso.play150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListeAzienda {
    
    private List<Contatto> listaContatti = new ArrayList<>();
    private Map <Contatto, Customer> listaCustomerEContatti;


    public ListeAzienda(){
        listaContatti = new ArrayList<>();
        listaCustomerEContatti= new HashMap<>();
    }

    public List<Contatto> getListaContatti() {
        return listaContatti;
    }
    public void setListaContatti(List<Contatto> listaContatti) {
        this.listaContatti = listaContatti;
    }
    public Map<Contatto, Customer> getListaCustomerEContatti() {
        return listaCustomerEContatti;
    }
    public void setListaCustomerEContatti(Map<Contatto, Customer> listaCustomerEContatti) {
        this.listaCustomerEContatti = listaCustomerEContatti;
    }

}
