package lab3.steps;

import lab3.pages.MainPage;
import lab3.pages.QuestionViewPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QuestionViewSteps extends Steps  {

    private QuestionViewPage page;

    public QuestionViewSteps(WebDriver driver) {
        this.driver = driver;
        page = new QuestionViewPage(this.driver);
    }

    public QuestionViewSteps checkBeingAbleToAnswer() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div/div/div/" +
                "div[2]/div/div[2]/form/div[1]/div/label/div[2]/div[1]/div[1]/textarea")));
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div/div/div/" +
                "div[2]/div/div[2]/form/div[1]/div/label/div[2]/div[1]/div[1]/textarea")).isDisplayed());
        return this;
    }

    public QuestionViewSteps setLike() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[2]" +
                "/div/div[3]/div[4]/div/div/div[2]/div/a/div")));
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[2]" +
                "/div/div[3]/div[4]/div/div/div[2]/div/a/div")).click();
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[2]" +
                "/div/div[3]/div[4]/div/div/div[2]/div/a/div")).getCssValue("display"), "rgb(40, 199, 93)");
        return this;
    }

    public QuestionViewSteps reportQuestion() {
        return this;
    }
}
