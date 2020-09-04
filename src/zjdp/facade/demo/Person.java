package zjdp.facade.demo;

public class Person {
    String nameString;

    public Person(String string) {
        this.nameString = string;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return nameString;
    }

    public void takePhoto(Camera camera) {
        // TODO Auto-generated method stub
    }

    public void playfool(FoolPlayer foolplayer) {
        foolplayer.foolplay();
    }
}
