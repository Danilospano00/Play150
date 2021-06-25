import org.corso.play150.Contatto;
import org.corso.play150.Customer;
import org.corso.play150.DatiInseritiErrati;
import org.corso.play150.CRMDatabase;

public class App {
    public static void main(String[] args) throws DatiInseritiErrati {

        CRMDatabase crmDatabase = new CRMDatabase();


        crmDatabase.registrati("dz", "ddfsg", "kmdfl", "dofkep",null, null);
        crmDatabase.registrati("dz", "ddfsg", "q029", "42i'09",null, null);
        crmDatabase.registrati("dfsj", "pani", "totoj@nfk.it", "29831",null, null);
        crmDatabase.registrati("Danilo", "Spano", "spano@gmail.com", "908023",null, null);
        crmDatabase.registrati("Fede", "Piera", "fepie@gmail.com", "928137","nijull", null);


        System.out.println(crmDatabase.getListaContattiSenzaAzienda().size());
        System.out.println(crmDatabase.getListaAziendeConContatto().size());

    }
}