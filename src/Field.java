public class Field {

    class A {

        protected int field;

        public A(int val) {
            this.field = val + 1;
        }
    }

    class B extends A {

        protected int field;

        public B(int val) {
            super(val);
            this.field = super.field * 2;
        }
    }

    static class C extends B {

        protected int field;

        public C(int val) {
            super(val);
            this.field = super.field + 2;
        }

        public void printField() {
            System.out.println(super.field);
        }
    }


}
