package taskParts.part3;

public class Riches {

    private Form interestingness;
    private Civilization location = null;

    public Form getInterestingness() {
        return interestingness;
    }

    public void setInterestingness(Form interestingness) {
        this.interestingness = interestingness;
    }

    Riches(Form interestingness){
        this.interestingness = interestingness;
    }

    Riches(Form interestingness, Civilization location){
        this.interestingness = interestingness;
        this.location = location;
    }

}
