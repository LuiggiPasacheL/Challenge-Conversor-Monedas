package converters.currency;

import converters.Converter;

public abstract class CurrencyConverter implements Converter {
    protected final String currency;
    protected final String symbol;
    protected final float valueConvert;

    protected CurrencyConverter(float valueConvert, boolean to, String currency, String symbol) {
        if (to) {
            this.valueConvert = valueConvert;
            this.currency = currency;
            this.symbol = symbol;
        } else {
            this.valueConvert = 1 / valueConvert;
            this.currency = "Soles";
            this.symbol = "S/";
        }
    }

    public float convert(float value){
        return valueConvert * value;
    }

    public String getMessage(float value){
        return "Tienes " + this.symbol + this.convert(value) + " " + this.currency;
    }
}
