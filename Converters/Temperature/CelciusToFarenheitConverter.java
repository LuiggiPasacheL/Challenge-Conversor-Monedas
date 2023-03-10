package Converters.Temperature;

import Converters.Converter;

public class CelciusToFarenheitConverter extends TemperatureConverter {

    public CelciusToFarenheitConverter() {
        super.fromTemperature = "Celcius";
        super.toTemperature = "Farenheit";
    }

    @Override
    public float convert(float value) {
        return value * 1.8F + 32;
    }
}
