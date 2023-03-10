package Converters.Currency;

import Converters.Converter;

public class YenConverter extends CurrencyConverter {
    public YenConverter(boolean to) {
        super(36.10F, to);
        this.currency = "Yenes";
        this.symbol = "¥";
    }
}
