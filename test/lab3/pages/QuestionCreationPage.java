package lab3.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuestionCreationPage extends Page {
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div/form/div/div[1]/label/div[4]/div/div/textarea")
    public WebElement theme;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div/form/div/div[2]/label/div[4]/div[1]/div/textarea")
    public WebElement questionText;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div/form/div/div[3]/label[1]/div[2]/div/div[1]/div/span")
    public WebElement category;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div/form/div/div[3]/label[2]/div[2]/div/div[1]/div/span")
    public WebElement subcategory;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/ul/li[2]/a")
    public WebElement surveySwitch;

    public QuestionCreationPage(WebDriver driver) {
        super(driver);
    }
}
