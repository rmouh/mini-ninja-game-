abstract public class Entite {
    protected int x, y, z;
    private int score;
    public Entite(int x,int y, int z)
    {
        //this.score = s;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public boolean touched(int x, int y){
        int dx = this.x - x;
        int dy = this.y - y;

        //return (this.x == x && this.y = y)
        return (Math.sqrt(dx*dx + dy*dy) <= this.z);
    }
    abstract public int coupe ();
}
