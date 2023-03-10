package Converters.Temperature;

import Converters.Converter;

public class KelvinToFarenheitConverter extends TemperatureConverter {
    public KelvinToFarenheitConverter() {
        super.fromTemperature = "Kelvin";
        super.toTemperature = "Farenheit";
    }

    @Override
    public float convert(float value) {
        return 1.8F * (value - 273.15F) + 32F;
    }

    @Override
    public String getMessage(float value) {
        return super.getMessage(value);
    }
}
