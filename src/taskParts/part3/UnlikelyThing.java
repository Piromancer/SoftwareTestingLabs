package taskParts.part3;

public abstract class UnlikelyThing {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean exists();
}
