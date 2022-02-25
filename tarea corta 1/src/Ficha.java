public class Ficha {
    private String color;
    private int pos;
    private Dado dado= new Dado(6);

    public Ficha(String col){
        color=col;
        pos=0;
    }
    public void avanzar(){
        int avance=dado.lanzar();
        pos+= avance;
        System.out.println(color+" avanzó: "+Integer.toString(avance)+" posiciones\n");
    }
    public String getColor(){
        return color;
    }
    public int getPos() {
        return pos;
    }
}
