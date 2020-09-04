package zjdp.proxy.p7;

import java.rmi.Remote;
import java.rmi.RemoteException;

import javax.swing.JFrame;

public interface RemoteWindow extends Remote {
    public JFrame getWindow() throws RemoteException;
}
