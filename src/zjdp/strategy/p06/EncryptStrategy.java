package zjdp.strategy.p06;

import java.io.File;

public interface EncryptStrategy {
    public abstract void encryptFile(File file);

    public abstract String decryptFile(File file);
}