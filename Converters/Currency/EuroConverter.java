package Converters.Currency;

public class EuroConverter extends CurrencyConverter {
    public EuroConverter(boolean to){
        super(0.24F, to);
        this.currency = "Euros";
        this.symbol = "€";
    }
}
