package edu.unisabana.dyas.patterns.observer.impl;

// Interfaz que define el comportamiento de un objeto observable
public interface IObservable {

    // Agrega un observador a la lista
    void addObserver(IObserver observer);

    // Elimina un observador de la lista
    void removeObserver(IObserver observer);

    // Notifica a todos los observadores con un comando y una fuente
    void notifyAllObservers(String command, Object source);
}
