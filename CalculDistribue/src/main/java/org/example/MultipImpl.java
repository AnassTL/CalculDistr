package org.example;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MultipImpl extends UnicastRemoteObject {
    protected MultipImpl() throws RemoteException {
        super(port);
    }

    public float multiplication (float a, float b) throws RemoteException{
        return a*b;
    }
}
