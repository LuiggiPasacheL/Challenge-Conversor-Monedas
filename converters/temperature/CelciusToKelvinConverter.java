package converters.temperature;

public class CelciusToKelvinConverter extends TemperatureConverter {

    public CelciusToKelvinConverter() {
        super.fromTemperature = "Grados Celcius";
        super.toTemperature = "Kelvin";
    }

    @Override
    public float convert(float value) {
        return value + 273.15F;
    }
}
