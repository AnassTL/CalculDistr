package org.example;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SommeImpl extends UnicastRemoteObject {
    protected SommeImpl() throws RemoteException {
        super(port);
    }

    public float somme (float a, float b) throws RemoteException{
        return a+b;
    }

}
