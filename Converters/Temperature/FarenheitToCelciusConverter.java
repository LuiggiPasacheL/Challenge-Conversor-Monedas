package Converters.Temperature;

import Converters.Converter;

public class FarenheitToCelciusConverter extends TemperatureConverter {

    public FarenheitToCelciusConverter() {
        super.fromTemperature = "Grados Farenheit";
        super.toTemperature = "Grados Celsius";
    }

    @Override
    public float convert(float value) {
        return (value - 32) * 1.8F;
    }

    @Override
    public String getMessage(float value) {
        return super.getMessage(value);
    }
}
