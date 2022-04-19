
    You can run by individual tests

    imports JTester.Test;
    class TestRunner extends Thread {
    
    private Test test = new Test();
    
    public void run(){
        this.addTest(); //add your test cases on the test list
        test.run();     //run your test
    }

    private void addTest(){
        test.name("test1").sets(1).expects(1).comments("my mark comment on this test");   //outputs correct
        test.name("test2").sets("dog").expects("cat") //outputs wrong
        }
    }



    class Main{

    public static void main(String[] args){
        TestRunner test = new TestRunner();
        test.start();
        }
    }


    you can also group your test cases

    import JTester.TestGroup;
    
    class TestRunner extends Thread{
        Test tg1;
        Test tg2;

        public TestRunner(){
            tg1 = new TestGroup("Test Group 1");
            tg2 = new TestGroup("Test Group 2");
        }

        public void run(){
            this.testList1();
            this.testList2();
            tg1.run();
            tg2.run();
        }

        public void testList1(){
            tg1.name("test1").sets(1).expects(1).comments("my mark comment on this test");   //outputs correct
            tg1.name("test2").sets("dog").expects("cat") //outputs wrong
        }

        public void testList2(){
            tg2.name("test3").sets(1).expects(1).comments("my mark comment on this test");   //outputs correct
            tg2.name("test4").sets("dog").expects("cat") //outputs wrong
        }
    }


     class Main{

    public static void main(String[] args){
        TestRunner test = new TestRunner();
        test.start();
        }
    }