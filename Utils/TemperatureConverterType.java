package Utils;

public enum TemperatureConverterType {
    CELSIUS_FARENHEIT("Grados Celcius a Grados Farenheit"),
    CELSIUS_KELVIN("Grados Celcius a Kelvin"),
    FARENHEIT_CELCIUS("Grados Farenheit a Grados Celcius"),
    KELVIN_CELCIUS("Kelvin a Grados Celcius"),
    KELVIN_FARENHEIT("Kelvin a Grados Farenheit"),
    FARENHEIT_KELVIN("Grados Farenheit a Kelvin");

    String text;

    private TemperatureConverterType(String text){
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
