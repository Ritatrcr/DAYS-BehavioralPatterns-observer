package edu.unisabana.dyas.patterns.observer.impl;

// Interfaz que define el comportamiento de un observador
public interface IObserver {

    // Método que recibe notificaciones del objeto observable
    void notifyObserver(String command, Object source);
}
