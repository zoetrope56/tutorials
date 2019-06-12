package chap05_singleton;

public class TicketMaker    {
    private int ticket = 1000;

    private static TicketMaker singleton = new TicketMaker();
    
    /*
    public int getNextTicketNumber()    {
        return ticket++;
    }
    */
    private TicketMaker()   {}

    public static TicketMaker getInstance()     {
        return singleton;
    }

    // synchronized : ���� �����͸� ����ϰ� �ִ� �ش� �����带 �����ϰ� ������ ��������� �����Ϳ� ���� �� �� ������ ����
    public synchronized int getNextTicketNumber()    {
        return ticket++;
    }

}