package entities;

public class ValorContainer {
    private int valor;

    public ValorContainer(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public static void trocarValores(ValorContainer refA, ValorContainer refB) {
        int a = refA.getValor(), b = refB.getValor();
        refA.setValor(b);
        refB.setValor(a);
    }
}
