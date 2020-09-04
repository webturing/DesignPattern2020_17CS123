/**
 *
 */
package zjdp.adapter.joke;

/**
 * @author Administrator
 */
public class HongKongGirl implements CanSpeakCantonese {
    @Override
    public void speak(CanSpeakCantonese other, String msg) {
        System.out.println(String.format("(%s) speaking with (%s) about (%s)", this.toString(), other.toString(), msg));
    }
}
