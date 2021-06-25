package org.corso.play150;

public class Customer {
    // private ListeAzienda listeAzienda;
    private Contatto contatto;

    private String nomeAzienda;
    private String partitaIvaAzienda;

    public Customer(Contatto contatto, String nomeAzienda, String partitaIvaAzienda) {
        this.contatto = contatto;
        this.nomeAzienda = nomeAzienda;
        this.partitaIvaAzienda = partitaIvaAzienda;
    }

    public void setContatto(Contatto contatto) {
        this.contatto = contatto;
    }

    public Contatto getContatto() {
        return contatto;
    }

    public String getNomeAzienda() {
        return nomeAzienda;
    }

    public String getPartitaIvaAzienda() {
        return partitaIvaAzienda;
    }

}
