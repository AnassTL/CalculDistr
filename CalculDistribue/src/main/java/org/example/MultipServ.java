package org.example;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;

public class MultipServ {
    public static void main(String[] args){
        try {
            Context ctx=new InitialContext();
            MultipImpl pd=new MultipImpl();
            ctx.rebind("rmi: prd", pd);
            System.out.println("enregistrement des objets... . .");

        } catch (NamingException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        System.out.println("attend les invocations des clients...");
    }
}
