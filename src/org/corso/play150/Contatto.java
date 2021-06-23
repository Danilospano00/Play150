package org.corso.play150;

public class Contatto extends Utente{
    private ListeAzienda listaContatti;
    private String nome;
    private String cognome;
    private String nrTelefono;
    private String email;


public Contatto(String nome, String cognome, String nrTelefono, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.nrTelefono = nrTelefono;
        this.email = email;
    }

    

@Override
public void aggiungiUtente(Utente utente){
listaContatti.getListaContatti().add(this); 
    
}


/*

public ListeAzienda getListeAzienda() {
    return listeAzienda;
}


public void setListeAzienda(ListeAzienda listeAzienda) {
    this.listeAzienda = listeAzienda;
}
*/

public String getNome() {
    return nome;
}


public void setNome(String nome) {
    this.nome = nome;
}


public String getCognome() {
    return cognome;
}


public void setCognome(String cognome) {
    this.cognome = cognome;
}


public String getNrTelefono() {
    return nrTelefono;
}


public void setNrTelefono(String nrTelefono) {
    this.nrTelefono = nrTelefono;
}


public String getEmail() {
    return email;
}


public void setEmail(String email) {
    this.email = email;
}




}
