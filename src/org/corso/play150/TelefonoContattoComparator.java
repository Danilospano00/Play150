package org.corso.play150;

import java.util.Comparator;

public class TelefonoContattoComparator implements Comparator<Contatto> {


    @Override
    public int compare(Contatto contatto1, Contatto contatto2) {
        int i = -1;
        if (contatto1.getNrTelefono() != null) {
            i = (contatto1.getNrTelefono().equals(contatto2.getNrTelefono()) ? 0 : -1);

        }
        return i;
    }
}
