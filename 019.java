boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {

    int posicionBrazoMasFuerte = 0;
    int posicionBrazoMasDebil = 1;

    int [] brazosPropios = clasificaBrazos( yourLeft, yourRight );
    int [] brazosAmigo = clasificaBrazos( friendsLeft, friendsRight );

    boolean resultado = false;
    if ( brazosPropios[ posicionBrazoMasFuerte ] == brazosAmigo[ posicionBrazoMasFuerte ] && 
            brazosPropios[ posicionBrazoMasDebil ] == brazosAmigo[ posicionBrazoMasDebil ] ){

        resultado = true;
    }

    return resultado;
}

boolean sonIgualFuerteBrazos ( int brazo1, int brazo2 ){
    return brazo1 == brazo2;
}

int [] clasificaBrazos ( int brazoIzquierdo, int brazoDerecho ){
    int [] brazos = new int [ 2 ];

    int posicionBrazoMasFuerte = 0;
    int posicionBrazoMasDebil = 1;

    if ( brazoIzquierdo > brazoDerecho ){

        brazos[ posicionBrazoMasFuerte ] = brazoIzquierdo;
        brazos[ posicionBrazoMasDebil ] = brazoDerecho;
    } else {
        brazos[ posicionBrazoMasFuerte ] = brazoDerecho;
        brazos[ posicionBrazoMasDebil ] = brazoIzquierdo;
    }

    return brazos;

}