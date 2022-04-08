package tester;

import java.util.ArrayList;

public class Test{
    private  ArrayList<String> nme;
    private ArrayList<String> type;
    private ArrayList<String> comment;

    private  ArrayList<Integer> intTest;
    private  ArrayList<Double> doubleTest;
    private  ArrayList<Boolean> booleanTest;
    private  ArrayList<Character> characterTest;
    private  ArrayList<String> StringTest;
    private  ArrayList<Object> objectTest;

    private   ArrayList<Integer> intValue;
    private  ArrayList<Double> doubleValue;
    private   ArrayList<Boolean> booleanValue;
    private ArrayList<Character> characterValue;
    private ArrayList<String> StringValue;
    private  ArrayList<Object> objectValue;

    public Test(){
     nme = new ArrayList<>();
     type = new ArrayList<>();
     comment = new ArrayList<>();

     intTest = new ArrayList<>();
     doubleTest = new ArrayList<>();
     booleanTest = new ArrayList<>();
     characterTest = new ArrayList<>();
     StringTest = new ArrayList<>();
     objectTest = new ArrayList<>();

     intValue = new ArrayList<>();
     doubleValue = new ArrayList<>();
     booleanValue = new ArrayList<>();
     characterValue = new ArrayList<>();
     StringValue = new ArrayList<>();
     objectValue = new ArrayList<>();
    }

   
    public void run(){
        int countInt = 0;
        int countDouble = 0;
        int countBoolean = 0;
        int countCharacter = 0;
        int countString = 0;
        int countObject = 0;
        for(int i = 0; i<this.nme.size(); i++){
            if(this.type.get(i).equals("int")){
                if(this.intTest.get(countInt) != this.intValue.get(countInt))
                    System.out.println("Test: " + this.nme.get(i) + "     WRONG     comment:  " + comment.get(i));
                else
                    System.out.println("Test: " + this.nme.get(i) + "     CORRECT     comment:  "+ comment.get(i));
                countInt++;
            }
            else if(this.type.get(i).equals("double")){
                if(this.doubleTest.get(countDouble) != this.doubleValue.get(countDouble))
                    System.out.println("Test: " + this.nme.get(i) + "     WRONG     comment:  "+ comment.get(i));
                else
                    System.out.println("Test: " + this.nme.get(i) + "     CORRECT     comment:  "+ comment.get(i));
                countDouble++;
            }
            else if(this.type.get(i).equals("boolean")){
                if(this.booleanTest.get(countBoolean) != this.booleanValue.get(countBoolean))
                    System.out.println("Test: " + this.nme.get(i) + "     WRONG     comment:  "+ comment.get(i));
                else
                    System.out.println("Test: " + this.nme.get(i) + "     CORRECT     comment:  "+ comment.get(i));
                countBoolean++;
            }
            else if(this.type.get(i).equals("character")){
                if(this.characterTest.get(countCharacter) != this.characterValue.get(countCharacter))
                    System.out.println("Test: " + this.nme.get(i) + "     WRONG     comment:  "+ comment.get(i));
                else
                    System.out.println("Test: " + this.nme.get(i) + "     CORRECT     comment:  "+ comment.get(i));
                countCharacter++;
            }
            else if(this.type.get(i).equals("String")){
                if(!this.StringTest.get(countString).equals(this.StringValue.get(countString)))
                    System.out.println("Test: " + this.nme.get(i) + "     WRONG     comment: "+ comment.get(i));
                else
                    System.out.println("Test: " + this.nme.get(i) + "     CORRECT     comment: "+ comment.get(i));
                countString++;
            }
            else {
                if  (this.objectTest.get(countObject) != this.objectValue.get(countObject)){
                    System.out.println("Test: " + this.nme.get(i) + "     WRONG     comment: "+ comment.get(i));
                    countObject++;
                }
                else{
                    System.out.println("Test: " + this.nme.get(i) + "     CORRECT     comment: "+ comment.get(i));
                    countObject++;
                }
            }
              
        }
    }

    public Test name(String str){
        if(this.nme.contains(str)){
            System.out.println("Warning: Test \'" + str + "\' duplicate name");
        }
        this.nme.add(str);
        return this;
    }

    // sets
    public Test sets(int test){
        this.type.add("int");
        this.intTest.add(test);
        return this;
    }

    public Test sets(double test){
        this.type.add("double");
        this.doubleTest.add(test);
        return this;
    }

    public Test sets(boolean test){
        this.type.add("boolean");
        this.booleanTest.add(test);
        return this;
    }

    public Test sets(char test){
        this.type.add("character");
        this.characterTest.add(test);
        return this;
    }

    public Test sets(String test){
        this.type.add("String");
        this.StringTest.add(test);
        return this;
    }

    public Test sets(Object test){
        this.type.add(test.getClass().getSimpleName());
        this.objectTest.add(test);
        return this;
    }

    
    // expects
    
    public Test expects(int val){
        
        this.intValue.add(val);
        if(!this.type.get(this.type.size() - 1).equals("int"))
            System.out.println("expects param dtype not same with sets dtype at: " + this.nme.get(this.type.size() - 1));
        return this;
    }

    public Test expects(double val){
       
        this.doubleValue.add(val);
        if(!this.type.get(this.type.size() - 1).equals("double"))
            System.out.println("expects param dtype not same with sets dtype at: " + this.nme.get(this.type.size() - 1));
        return this;
    }

    public Test expects(boolean val){
        
        this.booleanValue.add(val);
        if(!this.type.get(this.type.size() - 1).equals("boolean"))
            System.out.println("expects param dtype not same with sets dtype at: " + this.nme.get(this.type.size() - 1));
        return this;
    }

    public Test expects(char val){
        
        this.characterValue.add(val);
        if(!this.type.get(this.type.size() - 1).equals("char"))
            System.out.println("expects param dtype not same with sets dtype at: " + this.nme.get(this.type.size() - 1));
        return this;
    }

    public Test expects(String val){
       
        this.StringValue.add(val);
        if(!this.type.get(this.type.size() - 1).equals("String"))
            System.out.println("expects param dtype not same with sets dtype at: " + this.nme.get(this.type.size() - 1));
        return this;
    }

    public Test expects(Object val){
        
        this.objectValue.add(val);
        if(!this.type.get(this.type.size() - 1).equals(val.getClass().getSimpleName()))
            System.out.println("expects param dtype not same with sets dtype at: " + this.nme.get(this.type.size() - 1));
        return this;
    }

    // comments
    public void comments(String str){
        String tmp = " ";
        if( str.equals(" ") || str == null)
            this.comment.add(tmp);
        else
            this.comment.add(str);
            
    }
}