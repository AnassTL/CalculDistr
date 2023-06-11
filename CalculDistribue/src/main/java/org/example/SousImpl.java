package org.example;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SousImpl extends UnicastRemoteObject {
    protected SousImpl() throws RemoteException {
        super(port);
    }

    public float soustraction (float a, float b) throws RemoteException{
        return a-b;
    }
}
