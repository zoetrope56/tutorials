package chap03_templatemethod;

public class Main   {
    public static void main(String[] args) {
        AbstractDisplay d1 = new charDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, World!!");
        AbstractDisplay d3 = new StringDisplay("¾È³çÇÏ¼¼¿ä.");
        //AbstractDisplay d3 = new StringDisplay("³ª¶ù¸»½Î¹Ì µä±Î¿¡ ´Þ¾Æ");

        d1.display();
        d2.display();
        d3.display();

    }

}