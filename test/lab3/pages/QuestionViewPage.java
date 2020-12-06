package lab3.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuestionViewPage extends Page {
    // Reports
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div/div/div[1]/div/div/div[3]/div[1]/div[1]/div/ul/li[2]/ul/li[1]/a")
    public WebElement spam;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div/div/div[1]/div/div/div[3]/div[1]/div[1]/div/ul/li[2]/ul/li[2]/a")
    public WebElement insult;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div/div/div[1]/div/div/div[3]/div[1]/div[1]/div/ul/li[2]/ul/li[3]/a")
    public WebElement otherReason;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div/div/div[1]/div/div/div[3]/div[4]/div/div/div[2]/div/a/div/div/svg/path")
    public WebElement like;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/form/div[1]/div/label/div[2]/div[1]/div[1]/textarea")
    public WebElement answer;


    public QuestionViewPage(WebDriver driver) {
        super(driver);
    }
}
