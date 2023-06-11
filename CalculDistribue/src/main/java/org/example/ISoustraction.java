package org.example;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ISoustraction extends Remote {
    public float soustraction (float a, float b) throws RemoteException;
}
