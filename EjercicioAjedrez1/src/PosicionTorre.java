public class PosicionTorre {
    public static void main(String[] args) {
        final int DIMENSION_TABLERO = 8;
        char[][] tablero = new char[DIMENSION_TABLERO][DIMENSION_TABLERO];
        final int POSICION_Y = 3, POSICION_X = 0;
        final int TORRE_Y = 3, TORRE_X = 3;
        final int PIEZA_SUELTA_Y = 3, PIEZA_SUELTA_X = 6;
        boolean encontrado = false;
        boolean segura = false;

        // generamos el tablero con la ficha torre "t" en donde queramos.
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '\s';
            }
        }
        tablero[TORRE_Y][TORRE_X] = 't';
        tablero[PIEZA_SUELTA_Y][PIEZA_SUELTA_X] = 'p';

        //comprobamos si estamos en una posicion segura
        if (POSICION_Y < 0 || POSICION_Y >= DIMENSION_TABLERO || POSICION_X < 0 || POSICION_X >= DIMENSION_TABLERO) {
            System.out.println("La pieza no está colocada dentro del tablero");
        } else {
            if (POSICION_Y == TORRE_Y || POSICION_X == TORRE_X) {
                if (POSICION_Y == TORRE_Y && POSICION_X > TORRE_X) {
                    int j = TORRE_X + 1;
                    while (j < POSICION_X && !encontrado) {
                        if (tablero[TORRE_Y][j] == 'p') {
                            encontrado = true;
                            System.out.println("hay un peon entre medias, es una posicion segura");
                            segura = true;
                        } else {
                            j++;
                        }
                    }
                } else if (POSICION_Y == TORRE_Y && POSICION_X < TORRE_X) {
                    int j = TORRE_X - 1;
                    while (j > POSICION_X && !encontrado) {
                        if (tablero[TORRE_Y][j] == 'p') {
                            encontrado = true;
                            System.out.println("hay un peon entre medias, es una posicion segura");
                            segura = true;
                        } else {
                            j--;
                        }
                    }
                } else if (POSICION_Y > TORRE_Y && POSICION_X == TORRE_X) {
                    int i = TORRE_Y + 1;
                    while (i < POSICION_Y && !encontrado) {
                        if (tablero[i][TORRE_X] == 'p') {
                            encontrado = true;
                            System.out.println("hay un peon entre medias, es una posicion segura");
                            segura = true;
                        } else {
                            i++;
                        }
                    }
                } else if (POSICION_Y < TORRE_Y && POSICION_X == TORRE_X) {
                    int i = TORRE_Y - 1;
                    while (i > POSICION_Y && !encontrado) {
                        if (tablero[i][TORRE_X] == 'p') {
                            encontrado = true;
                            System.out.println("hay un peon entre medias, es una posicion segura");
                            segura = true;
                        } else {
                            i--;
                        }
                    }
                }
                if (!encontrado) {
                    System.out.println("no es una posicion segura");
                }
            } else {
                System.out.println("es una posicion segura");
                segura = true;
            }
        }

    }
}
