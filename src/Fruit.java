public class Fruit  extends Entite{
//    public Fruit()
//    {
//        super();
//    }
    private int bonus;
    public Fruit(int x, int y, int z, int s)
    {
        super(x, y, z);
        this.bonus = s;
    }
    public int coupe() { return (this.bonus);}


}
