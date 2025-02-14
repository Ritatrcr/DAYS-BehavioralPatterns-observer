package edu.unisabana.dyas.patterns.observer.impl;

import java.util.ArrayList;
import java.util.List;

// Clase abstracta que implementa la interfaz IObservable
// Permite gestionar una lista de observadores y notificarlos
public abstract class AbstractObservable implements IObservable {

    // Lista de observadores registrados
    private final List<IObserver> observers = new ArrayList<>();

    // Agrega un observador a la lista
    @Override
    public void addObserver(IObserver observer) {
        this.observers.add(observer);
    }

    // Elimina un observador de la lista
    @Override
    public void removeObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    // Notifica a todos los observadores registrados con un comando y una fuente
    @Override
    public void notifyAllObservers(String command, Object source) {
        for (IObserver observer : observers) {
            observer.notifyObserver(command, source);
        }
    }
}
