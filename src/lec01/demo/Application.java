package lec01.demo;

public class Application {
    public static void main(String[] args) {

        Girl ake = new Girl("阿珂", 19);
        Girl shuanger = new Girl("双儿", 20);
        Girl jianling = new Girl("建宁公主", 18);
        Girl longer = new Girl("龙儿", 19);
        Girl muqianping = new Girl("沐剑屏", 22);
        Girl zengrou = new Girl("曾柔", 25);
        Girl fangrou = new Girl("方怡", 22);

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
