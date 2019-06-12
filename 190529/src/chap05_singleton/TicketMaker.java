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

    // synchronized : 현재 데이터를 사용하고 있는 해당 스레드를 제외하고 나머지 스레드들은 데이터에 접근 할 수 없도록 막음
    public synchronized int getNextTicketNumber()    {
        return ticket++;
    }

}