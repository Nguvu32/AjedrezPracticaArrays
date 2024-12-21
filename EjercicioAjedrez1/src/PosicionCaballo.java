public class PosicionCaballo {
    public static void main(String[] args) {
        final int DIMENSION_TABLERO = 8;
        char[][] tablero = new char[DIMENSION_TABLERO][DIMENSION_TABLERO];
        final int POSICION_Y = 3, POSICION_X = 2;
        final int CABALLO_Y = 4, CABALLO_X = 4;
        boolean encontrado = false;
        boolean segura = false;

        // generamos el tablero con la ficha caballo "c" en donde queramos.
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '\s';
            }
        }
        tablero[CABALLO_Y][CABALLO_X] = 'c';

        //comprobamos si estamos en una posicion segura
        if (POSICION_Y < 0 || POSICION_Y >= DIMENSION_TABLERO || POSICION_X < 0 || POSICION_X >= DIMENSION_TABLERO) {
            System.out.println("La pieza no está colocada dentro del tablero");
        } else {
            if (POSICION_Y == CABALLO_Y - 1) {
                if (POSICION_X == CABALLO_X - 2) {
                    System.out.println("no es una posicion segura");
                } else if (POSICION_X == CABALLO_X + 2) {
                    System.out.println("no es una posicion segura");
                } else {
                    System.out.println("es una posicion segura");
                    segura = true;
                }
            } else if (POSICION_Y == CABALLO_Y + 1) {
                if (POSICION_X == CABALLO_X - 2) {
                    System.out.println("no es una posicion segura");
                } else if (POSICION_X == CABALLO_X + 2) {
                    System.out.println("no es una posicion segura");
                } else {
                    System.out.println("es una posicion segura");
                    segura = true;
                }
            } else if (POSICION_Y == CABALLO_Y + 2) {
                if (POSICION_X == CABALLO_X - 1) {
                    System.out.println("no es una posicion segura");
                } else if (POSICION_X == CABALLO_X + 1) {
                    System.out.println("no es una posicion segura");
                } else {
                    System.out.println("es una posicion segura");
                    segura = true;
                }
            } else if (POSICION_Y == CABALLO_Y - 2) {
                if (POSICION_X == CABALLO_X - 1) {
                    System.out.println("no es una posicion segura");
                } else if (POSICION_X == CABALLO_X + 1) {
                    System.out.println("no es una posicion segura");
                } else {
                    System.out.println("es una posicion segura");
                    segura = true;
                }
            } else {
                System.out.println("es una posicion segura");
                segura = true;
            }
        }
    }
}
