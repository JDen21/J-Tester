sample:

import file.class;
import tester.test;
class TestRunner extends Thread {
    private Test test = new Test();
    public void run(){
        this.addTest();
        test.run();
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
