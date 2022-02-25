public class Main {
    public static void main(String[] args) throws Exception {
        Tablero juego=new Tablero(40);
        juego.agregar_jugador("negro");
        juego.agregar_jugador("rojo");
        juego.agregar_jugador("blanco");
        juego.agregar_jugador("azul");
        while (true){
            int turno= juego.getActual();
            if (turno>juego.getJugadores().size()-1){
                juego.mostrar_orden();
                juego.setActual(0);
            }
            else{
                System.out.println("Es turno de la ficha color: "+juego.getJugadores().get(turno).getColor());
                juego.getJugadores().get(turno).avanzar();
                if(juego.getJugadores().get(turno).getPos()>juego.getCasillas()){
                    System.out.println("La ficha color: "+juego.getJugadores().get(turno).getColor()+ " ha ganado");
                    break;
                }
                juego.setActual(turno+1);

            }
        }

    }

}
