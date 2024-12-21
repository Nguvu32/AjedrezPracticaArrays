public class PosicionAlfil {
    public static void main(String[] args) {
        final int DIMENSION_TABLERO = 8;
        char[][] tablero = new char[DIMENSION_TABLERO][DIMENSION_TABLERO];
        final int POSICION_Y = 7, POSICION_X = 3;
        final int ALFIL_Y = 5, ALFIL_X = 5;
        final int PIEZA_SUELTA_Y = 6, PIEZA_SUELTA_X = 4;
        boolean encontrado = false;
        boolean segura = false;
        int diagonalDirecta = ALFIL_Y + ALFIL_X;
        int diagonalIndirecta = ALFIL_Y - ALFIL_X;

        // generamos el tablero con la ficha alfil "a" en donde queramos.
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '\s';
            }
        }
        tablero[ALFIL_Y][ALFIL_X] = 'a';
        tablero[PIEZA_SUELTA_Y][PIEZA_SUELTA_X] = 'p';
        for (int i = 0; i < tablero.length; i++) {
            System.out.println();
            for (int j = 0; j < tablero[i].length; j++) {
                if (j == 0) {
                    System.out.print("|" + tablero[i][j] + "|");
                } else {
                    System.out.print(tablero[i][j] + "|");
                }
            }
        }
        //comprobamos si estamos en una posicion segura con un peon sin color en el tablero
        if (POSICION_Y < 0 || POSICION_Y >= DIMENSION_TABLERO || POSICION_X < 0 || POSICION_X >= DIMENSION_TABLERO) {
            System.out.println("La pieza no está colocada dentro del tablero");
        } else {
            if (POSICION_Y + POSICION_X == diagonalDirecta || POSICION_Y - POSICION_X == diagonalIndirecta) {
                if (POSICION_Y > ALFIL_Y && POSICION_X > ALFIL_X) {
                    int i = ALFIL_Y + 1, j = ALFIL_X + 1;
                    while (i < POSICION_Y && j < POSICION_X && !encontrado) {
                        if (tablero[i][j] == 'p') {
                            encontrado = true;
                            System.out.println("hay un peon entre medias, es una posicion segura");
                            segura = true;
                        } else {
                            i++;
                            j++;
                        }
                    }
                } else if (POSICION_Y > ALFIL_Y && POSICION_X < ALFIL_X) {
                    int i = ALFIL_Y + 1, j = ALFIL_X - 1;
                    while (i < POSICION_Y && j > POSICION_X && !encontrado) {
                        if (tablero[i][j] == 'p') {
                            encontrado = true;
                            System.out.println("hay un peon entre medias, es una posicion segura");
                            segura = true;
                        } else {
                            i++;
                            j--;
                        }
                    }
                } else if (POSICION_Y < ALFIL_Y && POSICION_X > ALFIL_X) {
                    int i = ALFIL_Y - 1, j = ALFIL_X + 1;
                    while (i > POSICION_Y && j < POSICION_X && !encontrado) {
                        if (tablero[i][j] == 'p') {
                            encontrado = true;
                            System.out.println("hay un peon entre medias, es una posicion segura");
                            segura = true;
                        } else {
                            i--;
                            j++;
                        }
                    }
                } else if (POSICION_Y < ALFIL_Y && POSICION_X < ALFIL_X) {
                    int i = ALFIL_Y - 1, j = ALFIL_X - 1;
                    while (i > POSICION_Y && j > POSICION_X && !encontrado) {
                        if (tablero[i][j] == 'p') {
                            encontrado = true;
                            System.out.println("hay un peon entre medias, es una posicion segura");
                            segura = true;
                        } else {
                            i--;
                            j--;
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
