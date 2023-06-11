package org.example;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;


public class SousServ {
    public static void main(String[] args){
        try {
            Context ctx=new InitialContext();
            SousImpl sous=new SousImpl();
            ctx.rebind("rmi: sous", sous);
            System.out.println("enregistrement des objets... . .");

        } catch (NamingException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        System.out.println("attend les invocations des clients...");
    }
}
