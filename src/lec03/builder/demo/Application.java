package lec03.builder.demo;

/**
 * Created by Administrator on 2020/9/5.
 */
public class Application {
    public static void main(String[] args) {
        Builder chineseLoveLetterBuilder = new ChineseLoveLetterBuilder();
        Director director = new Director(chineseLoveLetterBuilder);
        LoverLetter letter = director.buildLetter();
        System.out.println(letter);
        Builder englishLoverLetterBuilder = new EnglishLoveLetterBuilder();
        director = new Director(englishLoverLetterBuilder);
        letter = director.buildLetter();
        System.out.println(letter);
    }
}
/**
 * BUILDER��MM����ľ���"�Ұ���"��仰�ˣ�
 * ������ͬ�ط���MM,Ҫ�ܹ������ǵķ��Ը���˵��仰Ŷ��
 * ����һ���������Է����������ÿ�����Զ���һ��������
 * ����MM��ֻҪ����Ӧ�ļ��������ܹ�����Ӧ������˵��"�Ұ���"��仰�ˣ�
 * �����MMҲ�������ɸ�࣬������ҵ�"�Ұ���"builder��
 * ����һ�����������������õķ���������� ����ģʽ��
 * ����Ʒ���ڲ�����Ͳ�Ʒ�����ɹ��̷ָ�����Ӷ�ʹһ������������ɾ��в�ͬ���ڲ�����Ĳ�
 * Ʒ���󡣽���ģʽʹ�ò�Ʒ�ڲ�������Զ����ı仯���ͻ�����֪����Ʒ�ڲ���ɵ�ϸ�ڡ�
 * ����ģʽ����ǿ��ʵ��һ�ֲַ�����еĽ�����̡�
 */