package org.corso.play150;

public class Customer extends Utente{
    //private ListeAzienda listeAzienda;
    private CallCenter callCenter;
    private Contatto contatto;
    private String nome;
    private String cognome;
    private String nrTelefono;
    private String email;

    private String nomeAzienda;
    private String partitaIvaAzienda;


public Customer(String nome, String cognome, String nrTelefono, String email, String nomeAzienda,
            String partitaIvaAzienda) {
        this.nome = nome;
        this.cognome = cognome;
        this.nrTelefono = nrTelefono;
        this.email = email;
        this.nomeAzienda = nomeAzienda;
        this.partitaIvaAzienda = partitaIvaAzienda;       
    }


   //aggiunge alla mappa ListaCustomerECOntatti in chiave il contatto di riferimento e in valore il customer
@Override
public void aggiungiUtente(Utente utente) {
    
}

public Contatto getContatto() {
    return contatto;
}

public String getNome() {
    return nome;
}

public String getCognome() {
    return cognome;
}

public String getNrTelefono() {
    return nrTelefono;
}

public String getEmail() {
    return email;
}

public String getNomeAzienda() {
    return nomeAzienda;
}

public String getPartitaIvaAzienda() {
    return partitaIvaAzienda;
}

}
