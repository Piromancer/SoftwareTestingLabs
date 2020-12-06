package lab3.test;

import lab3.steps.MainSteps;
import lab3.steps.QuestionCreationSteps;
import lab3.steps.QuestionViewSteps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OtvetMailTests {
    private WebDriver driver;
    private MainSteps main;
    private QuestionCreationSteps questionCreation;
    private QuestionViewSteps questionView;

    @Before
    public void prepare() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        main = new MainSteps(driver);
        questionCreation = new QuestionCreationSteps(driver);
        questionView = new QuestionViewSteps(driver);
//        mainSteps = new MainSteps(driver);
    }

    @Test
    public void loginAuthenticatesUserOnRightCredentials(){
        main.openMain()
                .clickLogin()
                .enterUsername("testinglab3")
                .enterPassword("lab.2020")
                .checkAuthentication("testinglab3");
    }

    @Test
    public void loginDoesntAuthenticateUserOnWrongCredentials(){
        main.openMain()
                .clickLogin()
                .enterUsername("testinglab3")
                .enterPassword("wrongPass")
                .checkMessageOnPage("Неверный пароль");
    }

    @Test
    public void clickingOnQuestionShouldSendToQuestionPage(){
        main.openMain()
                .openFirstQuestion();
        questionView.checkBeingAbleToAnswer();
    }

    @Test
    public void searchOpensResultsPage(){
        main.openMain()
                .searchQuestion("ТеСт")
                .verifyCurrentUrl("https://otvet.mail.ru/search/%D0%A2%D0%B5%D0%A1%D1%82/");
    }

    @Test
    public void setLike(){
        main.openMain()
                .clickLogin()
                .enterUsername("testinglab3")
                .enterPassword("lab.2020")
                .openFirstQuestion();
        questionView.setLike();
    }

    @Test
    public void createQuestion(){
        main.loginWithCorrectCreds()
                .openQuestionCreation();
        questionCreation.fillQuestionForm("Как создать вопрос на ответ мэйл ру?", "", 2, 2)
                .checkQuestionWasPosted("Как создать вопрос на ответ мэйл ру?");
    }

    @Test
    public void createSurvey(){
        main.loginWithCorrectCreds()
                .openQuestionCreation();
        questionCreation.switchToSurvey()
                .fillSurveyForm("Как создать опрос на ответ мэйл ру?", "", 2, 2, "Так", "Сяк", "Наперекосяк")
                .checkQuestionWasPosted("Как создать опрос на ответ мэйл ру?");
    }


    @After
    public void tearDown() {
        //driver.quit();
    }
}
