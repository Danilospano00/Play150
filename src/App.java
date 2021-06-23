import org.corso.play150.CallCenter;
import org.corso.play150.Contatto;
import org.corso.play150.Customer;
import org.corso.play150.ListeAzienda;
import org.corso.play150.Utente;

public class App {
    public static void main(String[] args){
     
        CallCenter callCenter = new CallCenter();
        ListeAzienda listeAzienda = new ListeAzienda();

        Utente matteo = new Contatto("Matteo","Pani","333","ciaociao@fkle");
        callCenter.aggiungiUtenteAllaLista(matteo);

System.out.println(listeAzienda.getListaContatti().size());
}
}