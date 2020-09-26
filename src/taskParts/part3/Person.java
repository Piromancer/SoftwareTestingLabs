package taskParts.part3;

public class Person {
    private String name;
    private boolean isMale;

    Person(String name, boolean isMale){
        this.name = name;
        this.isMale = isMale;
    }

    public void shrug(){
        if(isMale)
            System.out.println(name + " пожал плечами");
        else
            System.out.println(name + " пожала плечами");
    }

    public void think(String statement){
        if(isMale)
            System.out.println(name + " подумал, что " + statement);
        else
            System.out.println(name + " подумала, что " + statement);
    }

    public void assume(String statement){
        if(isMale)
            System.out.println(name + " предположил, что " + statement);
        else
            System.out.println(name + " предположила, что " + statement);
    }

    public void assume(UnlikelyThing thing){
        if(isMale)
            System.out.println(name + " предположил, что " + thing.getName() + " существует");
        else
            System.out.println(name + " предположил, что " + thing.getName() + " существует");
    }
}
