

    class SomeClass {
        /**
         *
         * 0 Static fields
         * 0.5. Static code block
         * 1. Evaluate constructor this() and super if exist
         * 2. Evaluate the attributes
         * 3. Evaluate the class code block
         * 4. Evaluate the constructor without super or this
         *
         */
        static int num = 12;
        int val = 50;
        String str = "default";

        {
            for (int i = 0; i < 5; i++) {
                System.out.println("Entering class block");
            }
        }

        static {
            for (int i = 0; i < 5; i++) {
                System.out.println("Entering static class block");
            }
        }

        public SomeClass() {
            this(100);
        }

        public SomeClass(int val) {
            val = val;
        }

        public SomeClass(String str) {
            this();
            this.str = "some-value";
        }

        public SomeClass(int val, String str) {
            this(str);
            System.out.println("");
        }


        public static void main(String[] args) {
            System.out.println("Beginning Main");
            SomeClass someClass = new SomeClass(300,"another-value");
        }
    }

