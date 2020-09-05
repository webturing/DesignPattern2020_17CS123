package lec01.demo;

public class Application {
    public static void main(String[] args) {
  
        Girl ake = new Girl("°¢çæ", 19);
        Girl shuanger = new Girl("Ë«¶ù", 20);
        Girl jianling = new Girl("½¨Äþ¹«Ö÷", 18);
        Girl longer = new Girl("Áú¶ù", 19);
        Girl muqianping = new Girl("ãå½£ÆÁ", 22);
        Girl zengrou = new Girl("ÔøÈá", 25);
        Girl fangrou = new Girl("·½âù", 22);

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
