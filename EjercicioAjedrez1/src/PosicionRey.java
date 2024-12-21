public class PosicionRey {
    public static void main(String[] args) {
        final int DIMENSION_TABLERO = 8;
        char[][] tablero = new char[DIMENSION_TABLERO][DIMENSION_TABLERO];
        final int POSICION_Y = 2, POSICION_X = 5;
        final int REY_Y = 2, REY_X = 6;
        boolean encontrado = false;
        boolean segura = false;

        // generamos el tablero con la ficha rey "r" en donde queramos.
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '\s';
            }
        }
        tablero[REY_Y][REY_X] = 'r';

        //comprobamos si estamos en una posicion segura
        if (POSICION_Y < 0 || POSICION_Y >= DIMENSION_TABLERO || POSICION_X < 0 || POSICION_X >= DIMENSION_TABLERO) {
            System.out.println("La pieza no está colocada dentro del tablero");
        } else {
            if (POSICION_Y == REY_Y + 1 && (POSICION_X == REY_X || POSICION_X == REY_X - 1 || POSICION_X == REY_X + 1) ||
                    POSICION_Y == REY_Y - 1 && (POSICION_X == REY_X || POSICION_X == REY_X - 1 || POSICION_X == REY_X + 1) ||
                    POSICION_Y == REY_Y && (POSICION_X == REY_X + 1 || POSICION_X == REY_X - 1)) {
                System.out.println("no es una posicion segura");
            } else {
                System.out.println("es una posicion segura");
                segura = true;
            }
        }
    }
}
