package zjdp.adapter.joke;

public class Student implements CanSpeakCantonese {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void speak(CanSpeakCantonese other, String msg) {
        // TODO Auto-generated method stub
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s %d", name, age);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    public static void main(String[] args) {
        System.out.println(new Student("ZHAO Jing", 33).toString());
    }
}
