package lab3.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class MainPage extends Page {

    @FindBy(xpath = "//*[@id=\"PH_authLink\"]")
    public WebElement loginButton;

    @FindBys( {
            @FindBy(xpath = "//*[@id=\"ColumnCenter\"]/div/div/div[6]/div[1]/a[2]"),
            @FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/a")
        } )
    public WebElement firstQuestionLink;
    @FindBy(xpath = "//*[@id=\"portal-menu__toolbar\"]/div[1]/div/div[2]/div/span/span[2]/span[3]/span/form/span[1]/span[1]/input")
    public WebElement searchBar;
    @FindBy(xpath = "//*[@id=\"portal-menu__toolbar\"]/div[1]/div/div[2]/div/span/span[2]/span[3]/span/form/span[2]/button")
    public WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"ColumnCenter\"]/div/div/div[4]/div/a[2]")
    public WebElement onVoteFilter;
    @FindBy(xpath = "//*[@id=\"ColumnCenter\"]/div/div/div[4]/div/a[3]")
    public WebElement bestFilter;

    @FindBy(xpath = "//*[@id=\"portal-menu__toolbar\"]/div[1]/div/div[2]/div/span/span[1]/span[1]/span[2]/span[2]/span[4]/a/span")
    public WebElement scienceFilter;

    public WebElement username;
    public WebElement password;

    public MainPage(WebDriver driver) {
        super(driver);
    }

}
