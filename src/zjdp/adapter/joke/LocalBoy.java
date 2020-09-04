package zjdp.adapter.joke;

public class LocalBoy implements CanSpeakMandarin {
    @Override
    public void speak(CanSpeakMandarin other, String msg) {
        System.out.println(String.format("(%s) speaking with (%s) about (%s)", this.toString(), other.toString(), msg));
    }

    public static void main(String[] args) {
        LocalBoy me;
        CanSpeakMandarin teachZHAO;
        me = new LocalBoy();
        System.out.println(Integer.toHexString(me.hashCode()));
        teachZHAO = me;
        System.out.println(teachZHAO);
    }
}
