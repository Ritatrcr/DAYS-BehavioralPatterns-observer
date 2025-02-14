package edu.unisabana.dyas.patterns.observer.impl;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;

// Clase que gestiona la configuración y notifica cambios a los observadores
public class ConfigurationManager extends AbstractObservable {

    // Formato de fecha por defecto
    private SimpleDateFormat defaultDateFormat;

    // Formato de dinero
    private NumberFormat moneyFormat;

    // Instancia única para implementar el patrón Singleton
    private static ConfigurationManager configurationManager;

    // Constructor privado para evitar instanciación externa (Singleton)
    private ConfigurationManager() {}

    // Método para obtener la única instancia de ConfigurationManager
    public static ConfigurationManager getInstance() {
        if (configurationManager == null) {
            configurationManager = new ConfigurationManager();
        }
        return configurationManager;
    }

    // Obtiene el formato de fecha actual
    public SimpleDateFormat getDefaultDateFormat() {
        return defaultDateFormat;
    }

    // Establece un nuevo formato de fecha y notifica a los observadores
    public void setDefaultDateFormat(SimpleDateFormat defaultDateFormat) {
        this.defaultDateFormat = defaultDateFormat;
        notifyAllObservers("defaultDateFormat", this);
    }

    // Obtiene el formato de dinero actual
    public NumberFormat getMoneyFormat() {
        return moneyFormat;
    }

    // Establece un nuevo formato de dinero y notifica a los observadores
    public void setMoneyFormat(NumberFormat moneyFormat) {
        this.moneyFormat = moneyFormat;
        notifyAllObservers("moneyFormat", this);
    }
}
