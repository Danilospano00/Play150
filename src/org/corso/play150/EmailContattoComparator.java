package org.corso.play150;

import java.util.Comparator;

public class EmailContattoComparator implements Comparator<Contatto>{
    
    @Override
    public int compare(Contatto contatto1, Contatto contatto2) {
        int i = -1;
        if (contatto1.getEmail() != null) {
            i = (contatto1.getEmail().equals(contatto2.getEmail()) ? 0 : -1);

        }
        return i;
    }
    
}
