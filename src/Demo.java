/**
 * Created by Administrator on 2020/9/5. DAG
 */
interface CanSing {
    void sing();
}

interface CanDance {
    void dance();
}

interface CanSingAndDance extends CanSing, CanDance {

}

public class Demo implements CanSingAndDance {

    @Override
    public void sing() {

    }

    @Override
    public void dance() {

    }
}
