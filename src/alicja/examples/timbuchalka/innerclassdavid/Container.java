package alicja.examples.timbuchalka.innerclassdavid;

public class Container {

    private int a;

    public Container(int a) {
        this.a = a;
        Inner.MoreInner moreInner= new Inner(4).new MoreInner("");
        //if you wan to create an instance of the most inner class in the most outter class
        //you need to go through all the classes like in the syntax above.
    }

    public int getA() {
        return a;
    }

    class Inner{
        private int b;

        public Inner(int b) {

            this.b = b+a;
            MoreInner more = new MoreInner("");
        }

        class MoreInner{

            private String string;

            public MoreInner(String string) {
                this.string = string;
                //in the most inner class you can access all attributes and methods from the outer classes.(a and b)

                Inner inner = new Inner(4);
            }
        }

    }

    private class PrivateInner{
        private boolean c;

        public PrivateInner(boolean c) {
            this.c = c;
        }
    }
// private class - you can use it only withiin Container class and those inner of this class. you cannot use it outside

}
