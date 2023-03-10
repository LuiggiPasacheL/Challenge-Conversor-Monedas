package Utils;

public enum ConverterType {
    MONEDA("Convertir Monedas"),
    TEMPERATURA("Convertir Valores");

    private String text;
    private ConverterType(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
