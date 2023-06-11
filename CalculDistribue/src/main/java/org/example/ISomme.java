package org.example;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ISomme extends Remote {
    public float somme (float a, float b) throws RemoteException;
}
