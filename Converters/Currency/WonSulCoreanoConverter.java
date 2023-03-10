package Converters.Currency;

import Converters.Converter;

public class WonSulCoreanoConverter extends CurrencyConverter {
    public WonSulCoreanoConverter(boolean to) {
        super(347.51F, to);
        this.currency = "Won Sules";
        this.symbol = "₩";
    }
}
