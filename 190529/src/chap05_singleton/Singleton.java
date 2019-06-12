package chap05_singleton;

public class Singleton  {
    private static Singleton singleton = new Singleton();
    private Singleton() {
        System.out.println("�ν��Ͻ��� �����մϴ�.");
    }

    public static Singleton getInstance()   {
        return singleton;
    }

}