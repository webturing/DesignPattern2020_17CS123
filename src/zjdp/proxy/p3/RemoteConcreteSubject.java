﻿package zjdp.proxy.p3;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteConcreteSubject extends UnicastRemoteObject implements RemoteSubject {
    double width, height;

    RemoteConcreteSubject(double width, double height) throws RemoteException {
        this.width = width;
        this.height = height;
    }

    public double getArea() throws RemoteException {
        return width * height;
    }
}

