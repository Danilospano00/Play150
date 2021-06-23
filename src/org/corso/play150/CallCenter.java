package org.corso.play150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CallCenter {

//private ListeAzienda listeAzienda;

private List<Contatto> listaContatti = new ArrayList<>();
    private Map <Contatto, Customer> listaCustomerEContatti= new HashMap<>();



public CallCenter() {
}



public void aggiungiUtenteAllaLista(Utente utente){
   utente.aggiungiUtente(utente);
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



/*
public ListeAzienda getListeAzienda() {
    return listeAzienda;
}



public void setListeAzienda(ListeAzienda listeAzienda) {
    this.listeAzienda = listeAzienda;
}
*/



}
