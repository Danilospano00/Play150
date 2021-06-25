import org.corso.play150.Contatto;
import org.corso.play150.Customer;
import org.corso.play150.CRMDatabase;


public class App {
    public static void main(String[] args){
     
        
        CRMDatabase crmDatabase = new CRMDatabase();
        Contatto contatto1 = new Contatto("dz","ddfsg","kmdfl","dofkep");
        Contatto contatto5 = new Contatto("dz","ddfsg","q029","42i'09");
        Contatto contatto2 = new Contatto("dfsj","pani","totoj@nfk.it","29831");
        Contatto contatto3 = new Contatto("Danilo","Spano","spano@gmail.com","908023");
        Contatto contatto4 = new Contatto("Fede","Piera","fepie@gmail.com","928137");

        Customer customer1 = new Customer(contatto1,"ksmòd","ddajlni");
        Customer customer2 = new Customer(contatto2,"email2@","2903");
        Customer customer3 = new Customer(contatto3,"email3@","0232");
        Customer customer4 = new Customer(contatto4,"email4@","5856");
        Customer customer5 = new Customer(contatto5,"email5@","821083");




crmDatabase.aggiungiContatto(contatto1);
crmDatabase.aggiungiContatto(contatto2);
crmDatabase.aggiungiContatto(contatto3);

crmDatabase.aggiungiContatto(contatto4);
crmDatabase.aggiungiContatto(contatto5);


crmDatabase.aggiungiCustomer(customer1);
crmDatabase.aggiungiCustomer(customer2);
crmDatabase.aggiungiCustomer(customer3);
crmDatabase.aggiungiCustomer(customer4);
crmDatabase.aggiungiCustomer(customer5);





System.out.println(crmDatabase.getListaContattiSenzaAzienda().size());
System.out.println(crmDatabase.getListaAziendeConContatto().size());

}
}