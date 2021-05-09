package alicja.examples.book.innerclass;

public class OuterClass {

    private int a;
    private String text;

    public OuterClass(int a,String text){
        this.a=a;
        this.text=text;

    }
    public String getInner(){
        InnerClass inner = new InnerClass();
        return inner.toString();
    }


    private class InnerClass{

        @Override
        public String toString(){
            return "a=" +a +" text=" + text;
        }
    }
}
