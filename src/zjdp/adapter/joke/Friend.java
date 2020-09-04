package zjdp.adapter.joke;

public class Friend implements CanSpeakMandarin, CanSpeakCantonese {
    static final String[] DIC = "讲少的啦讲多错多 少说点吧说得多错得多 你打个电话俾小华啦 你给小华打个电话吧 你写封信俾佢啦 你给他写封信吧".split(" ");

    @Override
    public void speak(CanSpeakMandarin other, String msg) {
        System.out.println(String.format("(%s) speaking with (%s) about (%s)", this.toString(), other.toString(), msg));
    }

    public String transMandarinToCantonese(String mandarin) {
        for (int i = 1; i < DIC.length; i += 2)
            if (mandarin.trim().equals(DIC[i].trim())) return DIC[i - 1];
        return "不记道啦";
    }

    public String transCantoneseToMandarin(String cantonese) {
        for (int i = 0; i < DIC.length; i += 2)
            if (cantonese.trim().equals(DIC[i].trim())) return DIC[i + 1];
        return "我不知道";
    }

    @Override
    public void speak(CanSpeakCantonese other, String msg) {
        System.out.println(String.format("(%s) speaking with (%s) about (%s)", this.toString(), other.toString(), msg));
    }
}
