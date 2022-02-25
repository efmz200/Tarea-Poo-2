import java.util.ArrayList;

public class Tablero {
    private ArrayList<Ficha> jugadores;
    private int casillas;
    private int actual;


    public Tablero(int cant_casillas){
        casillas=cant_casillas;
        actual=0;
        jugadores= new ArrayList<Ficha>();
    }
    public void agregar_jugador(String col){
        Ficha player= new Ficha(col);
        jugadores.add(player);
    }
    public void mostrar_orden(){
        System.out.println("\nLa meta esta en la posición: "+ Integer.toString(casillas));
        for(int i=0;i<jugadores.size()-1;i++){
            Ficha player= jugadores.get(i);
            System.out.println("El jugador: "+player.getColor()+" está en la casilla: "+Integer.toString(player.getPos())+"\n");
        }
    }

    public ArrayList<Ficha> getJugadores() {
        return jugadores;
    }
    public int getCasillas() {
        return casillas;
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }
}
