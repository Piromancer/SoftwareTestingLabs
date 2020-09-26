package taskParts.part3;

public class Civilization extends UnlikelyThing {
    private boolean ruined;
    private boolean existed = true;

    Civilization(){
        setName("Civilization");
        ruined = false;
    }

    Civilization(String name){
        setName(name);
        this.ruined = false;
    }

    Civilization(boolean ruined){
        if(ruined) existed = false;
        setName("Civilization");
        this.ruined = ruined;
    }

    Civilization(String name, boolean ruined){
        if(ruined) existed = false;
        setName(name);
        this.ruined = ruined;
    }

    public void turnToDust() throws Exception{
        if(ruined == true) throw new Exception("Civilization is already ruined");
        ruined = true;
    }

    public boolean exists(){
        return !ruined;
    }

    public boolean getExisted(){
        return existed;
    }
}
