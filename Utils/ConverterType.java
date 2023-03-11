package Utils;

public enum ConverterType {
    MONEDA("Convertir Monedas"),
    TEMPERATURA("Convertir Temperatura");

    private final String text;
    ConverterType(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
