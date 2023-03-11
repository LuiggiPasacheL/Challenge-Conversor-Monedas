import converters.Converter;
import converters.currency.*;
import converters.temperature.*;
import Utils.ConverterType;
import Utils.CurrencyConverterType;
import Utils.TemperatureConverterType;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Icon errorIcon = UIManager.getIcon("OptionPane.errorIcon");
        Icon informationIcon = UIManager.getIcon("OptionPane.informationIcon");
        Converter converter;
        int noClose;
        try {
            do {
                ConverterType selected = (ConverterType) JOptionPane.showInputDialog(null, "Ingrese un valor",
                        "Titulo", JOptionPane.PLAIN_MESSAGE, informationIcon, ConverterType.values(), 0);

                switch (selected) {
                    case MONEDA -> {

                        float value = Float.parseFloat(JOptionPane.showInputDialog(null,
                                "Ingrese el valor que desea convertir"));

                        CurrencyConverterType currencySelected = (CurrencyConverterType) JOptionPane.showInputDialog(
                                null, "Elige la moneda a la que deseas convertir tu dinero",
                                "Titulo", JOptionPane.PLAIN_MESSAGE, informationIcon, CurrencyConverterType.values(),
                                0);

                        switch (currencySelected) {
                            case SOLES_DOLARES -> converter = new DolarConverter(true);
                            case SOLES_EUROS -> converter = new EuroConverter(true);
                            case SOLES_LIBRAS_ESTERLINAS -> converter = new LibrasConverter(true);
                            case SOLES_YEN_JAPONES -> converter = new YenConverter(true);
                            case SOLES_WON_SUL_COREANO -> converter = new WonSulCoreanoConverter(true);
                            case DOLARES_SOLES -> converter = new DolarConverter(false);
                            case EUROS_SOLES -> converter = new EuroConverter(false);
                            case YEN_JAPONES_SOLES -> converter = new YenConverter(false);
                            case WON_SUL_COREANO_SOLES -> converter = new WonSulCoreanoConverter(false);
                            case LIBRAS_ESTERLINAS_SOLES -> converter = new LibrasConverter(false);
                            default -> throw new IllegalStateException("No se permite esta opción: " + currencySelected);
                        }
                        JOptionPane.showMessageDialog(null, converter.getMessage(value));
                    }
                    case TEMPERATURA -> {
                        float value = Float.parseFloat(JOptionPane.showInputDialog(null,
                                "Ingrese el valor que desea convertir"));

                        TemperatureConverterType temperatureSelected = (TemperatureConverterType) JOptionPane.showInputDialog(
                                null, "Elige la moneda a la que deseas convertir tu dinero",
                                "Titulo", JOptionPane.PLAIN_MESSAGE, informationIcon, TemperatureConverterType.values(),
                                0);

                        switch (temperatureSelected) {
                            case CELSIUS_FARENHEIT -> converter = new CelciusToFarenheitConverter();
                            case FARENHEIT_CELCIUS -> converter = new FarenheitToCelciusConverter();
                            case KELVIN_CELCIUS -> converter = new KelvinToCelciusConverter();
                            case CELSIUS_KELVIN -> converter = new CelciusToKelvinConverter();
                            case FARENHEIT_KELVIN -> converter = new FarenheitToKelvinConverter();
                            case KELVIN_FARENHEIT -> converter = new KelvinToFarenheitConverter();
                            default -> throw new IllegalStateException("No se permite esta opción: " + temperatureSelected);
                        }
                        JOptionPane.showMessageDialog(null, converter.getMessage(value));
                    }
                    default -> JOptionPane.showMessageDialog(null, "Ha seleccionado un valor incorrecto",
                            "Error", JOptionPane.PLAIN_MESSAGE, errorIcon);
                }
                noClose = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
            } while (noClose == 0);

            JOptionPane.showMessageDialog(null, "Programa terminado");
        } catch (IllegalStateException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.PLAIN_MESSAGE, errorIcon);
        }
    }
}
