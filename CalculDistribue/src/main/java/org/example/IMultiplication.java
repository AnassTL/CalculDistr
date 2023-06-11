package org.example;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IMultiplication extends Remote {
        public float multiplication (float a, float b) throws RemoteException;
}
