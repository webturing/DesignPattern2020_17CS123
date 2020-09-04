package zjdp.proxy.p3;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteSubject extends Remote {
    public double getArea() throws RemoteException;
}
