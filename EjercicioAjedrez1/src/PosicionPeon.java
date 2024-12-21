public class PosicionPeon {
    public static void main(String[] args) {
        final int DIMENSION_TABLERO = 8;
        char[][] tablero = new char[DIMENSION_TABLERO][DIMENSION_TABLERO];
        final int POSICION_Y = 3, POSICION_X = 9;
        final int PEON_Y = 2, PEON_X = 6;
        boolean encontrado = false;
        boolean segura = false;

        // generamos el tablero con la ficha peon "p" en donde queramos.
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '\s';
            }
        }
        tablero[PEON_Y][PEON_X] = 'p';

        //comprobamos si estamos en una posicion segura
        if (POSICION_Y < 0 || POSICION_Y >= DIMENSION_TABLERO || POSICION_X < 0 || POSICION_X >= DIMENSION_TABLERO) {
            System.out.println("La pieza no está colocada dentro del tablero");
        } else {
            if (POSICION_Y == PEON_Y + 1 && (POSICION_X == PEON_X + 1 || POSICION_X == PEON_X - 1)) {
                System.out.println("no es una posicion segura");
            } else {
                System.out.println("es una posicion segua");
                segura = true;
            }
        }
    }
}
