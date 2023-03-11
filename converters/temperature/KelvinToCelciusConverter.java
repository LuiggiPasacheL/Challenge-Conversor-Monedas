package converters.temperature;

public class KelvinToCelciusConverter extends TemperatureConverter {
    public KelvinToCelciusConverter() {
        super.fromTemperature = "Kelvin";
        super.toTemperature = "Grados Celcius";
    }

    @Override
    public float convert(float value) {
        return value - 273.15F;
    }

    @Override
    public String getMessage(float value) {
        return super.getMessage(value);
    }
}
