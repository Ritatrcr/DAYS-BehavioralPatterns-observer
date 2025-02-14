package edu.unisabana.dyas.patterns.observer.impl.observers;

import edu.unisabana.dyas.patterns.observer.impl.IObserver;
import edu.unisabana.dyas.patterns.observer.impl.ConfigurationManager;

// Implementa la interfaz IObserver para recibir notificaciones de cambios
public class MoneyFormatObserver implements IObserver {

    // Método que se ejecuta cuando hay una notificación
    @Override
    public void notifyObserver(String command, Object source) {
        // Verifica si la fuente es ConfigurationManager y si el comando es "moneyFormat"
        if (source instanceof ConfigurationManager && "moneyFormat".equals(command)) {
            // Convierte la fuente al tipo ConfigurationManager
            ConfigurationManager config = (ConfigurationManager) source;
            // Imprime el nuevo formato de dinero aplicado a un valor de ejemplo
            System.out.println("El formato de dinero ha cambiado a: "
                    + config.getMoneyFormat().format(12345.67));
        }
    }
}
