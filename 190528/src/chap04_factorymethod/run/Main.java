package chap04_factorymethod.run;

import chap04_factorymethod.framework.*;
import chap04_factorymethod.idcard.*;

public class Main   {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();

        Product card1 = factory.create("홍길동");
        Product card2 = factory.create("최예지");
        Product card3 = factory.create("최동환");

        card1.use();
        card2.use();
        card3.use();
    }
}