public enum Bebida {

    UVA(5), MORANGO(7);

   private final int valorC;

    Bebida(int valor) {
        valorC = valor;
    }

    public int getValor() {
        return valorC;
    }

}


