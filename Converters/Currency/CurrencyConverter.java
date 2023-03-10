package Converters.Currency;

import Converters.Converter;

public class CurrencyConverter implements Converter {
    protected String currency;
    protected String symbol;
    protected float valueConvert;

    protected CurrencyConverter(float valueConvert, boolean to, String currency, String symbol) {
        if (to == true) {
            this.valueConvert = valueConvert;
            this.currency = currency;
            this.symbol = symbol;
        } else {
            this.valueConvert = 1 / valueConvert;
            this.currency = "Soles";
            this.symbol = "S/";
        }
    }

    protected CurrencyConverter(float valueConvert, boolean to) {
        if (to == true) {
            this.valueConvert = valueConvert;
        } else {
            this.valueConvert = 1 / valueConvert;
        }
        this.currency = "Soles";
        this.symbol = "S/";
    }

    public CurrencyConverter(){
        this(1F, true);
        this.currency = "Soles";
        this.symbol = "S/";
    }

    public float convert(float value){
        return valueConvert * value;
    }

    public String getMessage(float value){
        return "Tienes " + this.symbol + this.convert(value) + " " + this.currency;
    }
}
