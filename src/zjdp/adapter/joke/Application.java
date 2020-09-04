package zjdp.adapter.joke;

public class Application {
    public static void main(String[] args) {
        HongKongGirl sarah = new HongKongGirl();
        LocalBoy me = new LocalBoy();
        // sarah.speak(me);
        // me.speak(sarah);
        Friend kent = new Friend();
        String mandarin = "你给他写封信吧";
        me.speak(kent, mandarin);
        String cantonese = kent.transMandarinToCantonese(mandarin);
        kent.speak(sarah, cantonese);
        cantonese = "讲少的啦讲多错多";
        sarah.speak(kent, cantonese);
        mandarin = kent.transCantoneseToMandarin(cantonese);
        kent.speak(me, mandarin);
    }
}
