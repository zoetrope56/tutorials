package chap03_templatemethod;

public class Main   {
    public static void main(String[] args) {
        AbstractDisplay d1 = new charDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, World!!");
        AbstractDisplay d3 = new StringDisplay("�ȳ��ϼ���.");
        //AbstractDisplay d3 = new StringDisplay("�������ι� ��ο� �޾�");

        d1.display();
        d2.display();
        d3.display();

    }

}