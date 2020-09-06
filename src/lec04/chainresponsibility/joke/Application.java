package lec04.chainresponsibility.joke;

/**
 * Created by Administrator on 2020/9/6.
 */
public class Application {
    public static void main(String[] args) {
        String loveLetter = "I am a happy boy, would you like to be my girlfriend?";
        GirlHandler[] girls = new GirlHandler[]{
                new AmazingGirlHander(),
                new BeautifulGirlHander(),
                new NiceGirlHander(),
                new CuteGirlHander(),
                new RobustGirlHander(),
        };
        createChains(girls);


        girls[0].readLetter(loveLetter);
    }

    private static void createChains(GirlHandler[] girls) {
        for (int i = 0; i < girls.length - 1; i++) {
            girls[i].setPrevGirlHandler(girls[i + 1]);
        }
    }
}

/**
 * CHAIN OF RESPONSIBLEITY—晚上去上英语课，为了好开溜坐到了最后一排，哇，前面坐了
 * 好几个漂亮的MM哎，找张纸条，写上"Hi,可以做我的女朋友吗？如果不愿意请向前传"，
 * 纸条就一个接一个的传上去了，糟糕，传到第一排的MM把纸条传给老师了，听说是个老
 * 处女呀，快跑!
 * 责任链模式：在责任链模式中，很多对象由每一个对象对其下家的引用而接起来形成一条
 * 链。请求在这个链上传递，直到链上的某一个对象决定处理此请求。客户并不知道链上的
 * 哪一个对象最终处理这个请求，系统可以在不影响客户端的情况下动态的重新组织链和分
 * 配责任。处理者有两个选择：承担责任或者把责任推给下家。一个请求可以最终不被任何
 * 接收端对象所接受。
 */