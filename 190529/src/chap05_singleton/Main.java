package chap05_singleton;

public class Main   {public static void main(String[] args) {
        System.out.println("Start");

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2)    {
            System.out.println("obj1�� obj2�� ���� �ν��Ͻ��̴�.");
        } else  {
            System.out.println("obj1�� obj2�� �ٸ� �ν��Ͻ��̴�.");
        }

        System.out.println("End");

    }
}