public class Game {
    private Player player;

    public void movement(String movimiento){
        switch (movimiento) {
            case "derecha" -> player.setX(player.getX() + 1);
            case "izquierda" -> player.setX(player.getX() - 1);
            case "arriba" -> player.setY(player.getY() - 1);
            case "abajo" -> player.setY(player.getY() + 1);
        }
    }
}
