package lec01.demo;

public class Application {
    public static void main(String[] args) {
  
        Girl ake = new Girl("����", 19);
        Girl shuanger = new Girl("˫��", 20);
        Girl jianling = new Girl("��������", 18);
        Girl longer = new Girl("����", 19);
        Girl muqianping = new Girl("�彣��", 22);
        Girl zengrou = new Girl("����", 25);
        Girl fangrou = new Girl("����", 22);

        Girl[] girls = new Girl[]{
                ake,
                shuanger,
                jianling,
                longer,
                muqianping,
                zengrou,
                fangrou
        };
        for(Girl girl:girls){
            girl.findHusband(Husband.getInstance());
        }
        for(Girl girl:girls){
            girl.showMyHusband();
        }
    }
}
