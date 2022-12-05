public class Bombe extends Entite{

    private int malus;

    public Bombe(int x, int y, int z, int s)
    {
        super(x, y, z);
        this.malus = s;
    }
    public int coupe() { return (-this.malus);}

}
