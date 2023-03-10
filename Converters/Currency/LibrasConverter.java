package Converters.Currency;

import Converters.Converter;

public class LibrasConverter extends CurrencyConverter {

    public LibrasConverter(boolean to) {
        super(0.22F, to);
        this.currency = "Libras Esterlinas";
        this.symbol = "£";
    }
}
