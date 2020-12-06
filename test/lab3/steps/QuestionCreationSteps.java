package lab3.steps;

import lab3.pages.MainPage;
import lab3.pages.QuestionCreationPage;
import org.openqa.selenium.WebDriver;

public class QuestionCreationSteps extends Steps  {

    private QuestionCreationPage page;

    public QuestionCreationSteps(WebDriver driver) {
        this.driver = driver;
        page = new QuestionCreationPage(this.driver);
    }

    public QuestionCreationSteps fillQuestionForm(String theme, String text, int category, int subcategory) {
        return this;
    }

    public QuestionCreationSteps checkQuestionWasPosted(String request) {
        return this;
    }

    public QuestionCreationSteps switchToSurvey() {
        return this;
    }

    public QuestionCreationSteps fillSurveyForm(String theme, String text, int category, int subcategory, String ... choices) {
        return this;
    }
}
