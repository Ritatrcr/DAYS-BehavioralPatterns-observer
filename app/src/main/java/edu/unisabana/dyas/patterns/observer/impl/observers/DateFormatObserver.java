package edu.unisabana.dyas.patterns.observer.impl.observers;

import edu.unisabana.dyas.patterns.observer.impl.IObserver;
import edu.unisabana.dyas.patterns.observer.impl.ConfigurationManager;

// Implementa la interfaz IObserver para recibir notificaciones de cambios
public class DateFormatObserver implements IObserver {

    // Método que se ejecuta cuando hay una notificación
    @Override
    public void notifyObserver(String command, Object source) {
        // Verifica si la fuente es ConfigurationManager y si el comando es "defaultDateFormat"
        if (source instanceof ConfigurationManager && "defaultDateFormat".equals(command)) {
            // Convierte la fuente al tipo ConfigurationManager
            ConfigurationManager config = (ConfigurationManager) source;
            // Imprime el nuevo formato de fecha
            System.out.println("El formato de fecha ha cambiado a: "
                    + config.getDefaultDateFormat().toPattern());
        }
    }
}
