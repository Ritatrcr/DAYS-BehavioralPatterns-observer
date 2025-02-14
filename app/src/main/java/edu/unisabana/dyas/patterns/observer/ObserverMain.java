package edu.unisabana.dyas.patterns.observer;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import edu.unisabana.dyas.patterns.observer.impl.ConfigurationManager;
import edu.unisabana.dyas.patterns.observer.impl.observers.DateFormatObserver;
import edu.unisabana.dyas.patterns.observer.impl.observers.MoneyFormatObserver;

public class ObserverMain {
    public static void main(String[] args) {
        // Obtiene la instancia única de ConfigurationManager (Singleton)
        ConfigurationManager conf = ConfigurationManager.getInstance();

        // Establece un formato de fecha y un formato de dinero iniciales
        conf.setDefaultDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        conf.setMoneyFormat(new DecimalFormat("##.00"));
        System.out.println("Configuración inicial establecida.");

        // Crea los observadores para los formatos de fecha y dinero
        DateFormatObserver dateFormatObserver = new DateFormatObserver();
        MoneyFormatObserver moneyFormatObserver = new MoneyFormatObserver();

        // Registra los observadores en ConfigurationManager
        conf.addObserver(dateFormatObserver);
        conf.addObserver(moneyFormatObserver);
        System.out.println("Observadores registrados.\n");

        // Cambia el formato de fecha y dinero (los observadores recibirán la notificación)
        conf.setDefaultDateFormat(new SimpleDateFormat("dd/MM/yyyy"));
        conf.setMoneyFormat(new DecimalFormat("###,#00.00"));
        System.out.println("Configuración actualizada.\n");

        // Cambia nuevamente los formatos
        conf.setDefaultDateFormat(new SimpleDateFormat("MM/yyyy/dd"));
        conf.setMoneyFormat(new DecimalFormat("###,#00"));

        // Elimina los observadores de ConfigurationManager
        conf.removeObserver(dateFormatObserver);
        conf.removeObserver(moneyFormatObserver);
        System.out.println("Observadores eliminados.\n");

        // Cambia los formatos después de eliminar los observadores (no habrá notificaciones)
        conf.setDefaultDateFormat(new SimpleDateFormat("MM/yyyy"));
        conf.setMoneyFormat(new DecimalFormat("###,##0.00"));
    }
}
