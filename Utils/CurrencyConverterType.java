package Utils;

public enum CurrencyConverterType {
    SOLES_DOLARES("Soles a Dolares"),
    SOLES_EUROS("Soles a Euros"),
    SOLES_LIBRAS_ESTERLINAS("Soles a Libras Esterlinas"),
    SOLES_YEN_JAPONES("Soles a Yen Japonés"),
    SOLES_WON_SUL_COREANO("Soles a Won Sul Coreano"),
    DOLARES_SOLES("Dolares a Soles"),
    EUROS_SOLES("Euros a Soles"),
    YEN_JAPONES_SOLES("Yen japones a Soles"),
    WON_SUL_COREANO_SOLES("Won Sul Coreano a Soles"),
    LIBRAS_ESTERLINAS_SOLES("Libras Esterlinas a Soles");
    String text;

    private CurrencyConverterType(String text){
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
