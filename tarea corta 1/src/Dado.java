import java.util.Random;
public class Dado {
    private int caras;
    private Random rand;

    public Dado(int num_caras){
        caras=num_caras;
        rand = new Random();
    }
    public int lanzar(){
        int lanzamiento=rand.nextInt(caras+1);//se agrega el +1 ya que el limite es excluyente
        if (lanzamiento==0){
            return lanzar();
        }
        return lanzamiento;
    }
}
