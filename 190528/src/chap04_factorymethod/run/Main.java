package chap04_factorymethod.run;

import chap04_factorymethod.framework.*;
import chap04_factorymethod.idcard.*;

public class Main   {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();

        Product card1 = factory.create("ȫ�浿");
        Product card2 = factory.create("�ֿ���");
        Product card3 = factory.create("�ֵ�ȯ");

        card1.use();
        card2.use();
        card3.use();
    }
}