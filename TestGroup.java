package JTester;

public class TestGroup extends Test {
    
    private String groupName;

    public TestGroup(String groupName){
        this.groupName = groupName;
    }

    @Override
    public void run(){
        System.out.println(this.groupName);
        super.run();
        System.out.println();
        System.out.println();
    }

}
