package chap03_templatemethod;

public class charDisplay extends AbstractDisplay    {
    private char ch;
    
    
    public charDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");

    }

    @Override
    public void print() {
        System.out.print(ch);

    }

    @Override
    public void close() {
        System.out.println(">>");

    }


}