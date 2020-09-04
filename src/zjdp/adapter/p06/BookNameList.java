package zjdp.adapter.p06;

import java.util.Enumeration;
import java.util.Vector;

public class BookNameList {
    private Vector<String> vector;
    private Enumeration bookenum;

    BookNameList() {
        vector = new Vector<String>();
    }

    public void setBookName() {   // ��ʵϵͳ���ܴ�һ����ݿ��еõ�ͼ�����
        vector.add("Java �������");
        vector.add("J2ME �������");
        vector.add("XML�������");
        vector.add("JSP �������");
    }

    public Enumeration getEnumeration() {
        return vector.elements();
    }
}