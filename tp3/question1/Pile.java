    package question1;
    
    import question1.PilePleineException;
    import question1.PileVideException;
    
    /**
     * A remplacer par votre classe Pile .
     * 
     * @author (raghed idris)
     * @version (20190324-v0.0)
     */
    public class Pile {
        public final static int TAILLE_PAR_DEFAUT = 5;
    
        private Object[] zone;
        private int ptr;
    
        /**
         * à compléter
         * 
         */
        public Pile(int taille) {
        if (taille < 0)
            taille = TAILLE_PAR_DEFAUT;
        this.zone = new Object[taille];
        this.ptr = 0;
    }

    public Pile() {
        this(TAILLE_PAR_DEFAUT);
    }

    public void empiler(Object i) throws PilePleineException {
        if (estPleine())
            throw new PilePleineException();
        this.zone[this.ptr] = i;
        this.ptr++;
    }

    public Object depiler() throws PileVideException {
        if (estVide())
            throw new PileVideException();
        this.ptr--;
        return this.zone[this.ptr];
    }

    public boolean estVide() {
        return ptr == 0;
    }

    public boolean estPleine() {
        return ptr == zone.length;
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
    }
}