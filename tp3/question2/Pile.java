package question2;
import java.util.*;
import question1.PilePleineException;
import question1.PileVideException;

/**
 * A remplacer en partie par votre classe Pile de la question 1.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Pile implements PileI {

    
    private Object[] zone;  
    private int ptr;

    public Pile(int taille) {
         if (taille <= 0)
            taille = CAPACITE_PAR_DEFAUT; // traiter le cas <=0
           this.zone = new Object[taille];
        this.ptr = 0; // a completer
    }

    public Pile() {
        this(CAPACITE_PAR_DEFAUT);
    }

    public void empiler(Object o) throws PilePleineException {
        // a completer
           if (estPleine())
            throw new PilePleineException();
        this.zone[this.ptr] = o;


        this.ptr++;
    }

    public Object depiler() throws PileVideException {
        if (estVide())
            throw new PileVideException();
        this.ptr--;
        return this.zone[this.ptr];
        //return null;
    }

    public Object sommet() throws PileVideException {
           if (estVide())
            throw new PileVideException();// a completer
       return this.zone[this.ptr];
    }

    public int capacite() {
        // a completer
        return this.zone.length;
      
    }
    
    public int taille() {
        // a completer
        return capacite()-this.ptr;
    }

    public boolean estVide() {
           return ptr == 0;// a completer
        //return false;
    }

    public boolean estPleine() {
        
        return this.ptr == capacite();// a completer
       // return false;
    }

    public boolean equals(Object o) {
        // a completer
        return false;
    }

    // fonction fournie
    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
         StringBuffer sb = new StringBuffer("[");
        for (int i = ptr - 1; i >= 0; i--) {
            sb.append(this.zone[i]);
            if (i > 0)
                sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
        //return null;
    }
}