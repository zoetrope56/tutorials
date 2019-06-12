package chap04_factorymethod.idcard;

import chap04_factorymethod.framework.*;

public class IDCard extends Product {
    private String owner;
    IDCard(String owner)    {
        System.out.println(owner+"�� ī�带 ����ϴ�.");
        this.owner = owner;

    }

    public void use()   {
        System.out.println(owner+"�� ī�带 ����մϴ�.");
    }

    public String getOwner()    {
        return owner;
    }

}