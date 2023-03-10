package Converters.Temperature;

import Converters.Converter;

public class FarenheitToKelvinConverter extends TemperatureConverter {
    public FarenheitToKelvinConverter() {
        super.fromTemperature = "Grados Farenheit";
        super.toTemperature = "Kelvin";
    }

    @Override
    public float convert(float value) {
        return 5/9 * (value - 32F) + 273.15F;
    }

    @Override
    public String getMessage(float value) {
        return super.getMessage(value);
    }
}
