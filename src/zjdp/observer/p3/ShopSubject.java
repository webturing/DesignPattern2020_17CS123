package zjdp.observer.p3;

import java.util.ArrayList;

public class ShopSubject implements Subject {
    String goodsName;
    double oldPrice, newPrice;
    ArrayList<Observer> customerList;

    ShopSubject() {
        customerList = new ArrayList<Observer>();
    }

    public void addObserver(Observer o) {
        if (!(customerList.contains(o))) customerList.add(o);
    }

    public void deleteObserver(Observer o) {
        if (customerList.contains(o)) customerList.remove(o);
    }

    public void notifyObservers() {
        for (int i = 0; i < customerList.size(); i++) {
            Observer observer = customerList.get(i);
            observer.update(); // �����ù۲���ִ�и��²���,�����ṩ���
        }
    }

    public void setDiscountGoods(String name, double oldP, double newP) { // ���ô�����Ʒ
        goodsName = name;
        oldPrice = oldP;
        newPrice = newP;
        notifyObservers(); // ֪ͨ���еĹ۲���
    }

    public String getGoodsName() { // �ṩ�����Ʒ���ֵķ���
        return goodsName;
    }

    public double getOldPrice() { // �ṩ�����Ʒԭ�۵ķ���
        return oldPrice;
    }

    public double getNewPrice() { // �ṩ�����Ʒ�ۿۺ�ļ۸�ķ���
        return newPrice;
    }
}
