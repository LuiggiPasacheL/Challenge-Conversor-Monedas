import Converters.Converter;
import Converters.Currency.*;
import Converters.Temperature.*;
import Utils.ConverterType;
import Utils.CurrencyConverterType;
import Utils.TemperatureConverterType;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Icon errorIcon = UIManager.getIcon("OptionPane.errorIcon");
        JOptionPane jOptionPane = new JOptionPane();
        Converter converter;
        int noClose;
        do {
            ConverterType selected = (ConverterType) jOptionPane.showInputDialog(null, "Ingrese un valor",
                    "Titulo", JOptionPane.PLAIN_MESSAGE, errorIcon, ConverterType.values(), 0);

            switch (selected) {
                case MONEDA -> {
                    Float value = Float.parseFloat(jOptionPane.showInputDialog(null,
                            "Ingrese el valor que desea convertir"));

                    CurrencyConverterType currencySelected = (CurrencyConverterType) jOptionPane.showInputDialog(
                            null, "Elige la moneda a la que deseas convertir tu dinero",
                            "Titulo", JOptionPane.PLAIN_MESSAGE, errorIcon, CurrencyConverterType.values(),
                            0);

                    switch (currencySelected) {
                        case SOLES_DOLARES -> {
                            converter = new DolarConverter(true);
                        }
                        case SOLES_EUROS -> {
                            converter = new EuroConverter(true);
                        }
                        case SOLES_LIBRAS_ESTERLINAS -> {
                            converter = new LibrasConverter(true);
                        }
                        case SOLES_YEN_JAPONES -> {
                            converter = new YenConverter(true);
                        }
                        case SOLES_WON_SUL_COREANO -> {
                            converter = new WonSulCoreanoConverter(true);
                        }
                        case DOLARES_SOLES -> {
                            converter = new DolarConverter(false);
                        }
                        case EUROS_SOLES -> {
                            converter = new EuroConverter(false);
                        }
                        case YEN_JAPONES_SOLES -> {
                            converter = new YenConverter(false);
                        }
                        case WON_SUL_COREANO_SOLES -> {
                            converter = new WonSulCoreanoConverter(false);
                        }
                        case LIBRAS_ESTERLINAS_SOLES -> {
                            converter = new LibrasConverter(false);
                        }
                        default -> {
                            converter = new CurrencyConverter();
                        }
                    }
                    jOptionPane.showMessageDialog(null, converter.getMessage(value));
                }
                case TEMPERATURA -> {
                    Float value = Float.parseFloat(jOptionPane.showInputDialog(null,
                            "Ingrese el valor que desea convertir"));

                    TemperatureConverterType temperatureSelected = (TemperatureConverterType) jOptionPane.showInputDialog(
                            null, "Elige la moneda a la que deseas convertir tu dinero",
                            "Titulo", JOptionPane.PLAIN_MESSAGE, errorIcon, TemperatureConverterType.values(),
                            0);

                    switch (temperatureSelected) {
                        case CELSIUS_FARENHEIT -> {
                            converter = new CelciusToFarenheitConverter();
                        }
                        case FARENHEIT_CELCIUS -> {
                            converter = new FarenheitToCelciusConverter();
                        }
                        case KELVIN_CELCIUS -> {
                            converter = new KelvinToCelciusConverter();
                        }
                        case CELSIUS_KELVIN -> {
                            converter = new CelciusToKelvinConverter();
                        }
                        case FARENHEIT_KELVIN -> {
                            converter = new FarenheitToKelvinConverter();
                        }
                        case KELVIN_FARENHEIT -> {
                            converter = new KelvinToFarenheitConverter();
                        }
                        default -> {
                            converter = new TemperatureConverter();
                        }
                    }
                    jOptionPane.showMessageDialog(null, converter.getMessage(value));
                }
                default -> {
                    jOptionPane.showMessageDialog(null, "Ha seleccionado un valor incorrecto",
                            "Error", JOptionPane.PLAIN_MESSAGE, errorIcon);
                }
            }
            noClose = jOptionPane.showConfirmDialog(null, "¿Desea continuar?");
        } while (noClose == 0);

        jOptionPane.showMessageDialog(null, "Programa terminado");
    }
}
