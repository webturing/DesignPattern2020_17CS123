package zjdp.facade.p05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public String readFileContent(String fileName) {
        StringBuffer str = new StringBuffer();
        try {
            FileReader inOne = new FileReader(fileName);
            BufferedReader inTwo = new BufferedReader(inOne);
            String s = null;
            while ((s = inTwo.readLine()) != null) {
                str.append(s);
                str.append("\n");
            }
            inOne.close();
            inTwo.close();
        } catch (IOException exp) {
        }
        return new String(str);
    }
}
