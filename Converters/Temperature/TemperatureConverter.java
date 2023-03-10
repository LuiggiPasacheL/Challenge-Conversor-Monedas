package Converters.Temperature;

import Converters.Converter;

public class TemperatureConverter implements Converter {
    protected String fromTemperature;
    protected String toTemperature;

    public TemperatureConverter() {
        fromTemperature = "Grados Celsius";
        toTemperature = "Grados Celsius";
    }

    @Override
    public float convert(float value) {
        return value * 1.8F + 32;
    }

    @Override
    public String getMessage(float value) {
        return value + " " + this.fromTemperature + " es " + this.convert(value) + " " + this.toTemperature;
    }
}
