package book.chapter12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class CodeTimings {
  protected WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = new FirefoxDriver();
    driver.get("http://selenium.polteq.com/testshop/index.php");
  }

  @AfterMethod
  public void tearDown() {
    driver.close();
  }

  /* start */
  public void loginCodeTimings() {
    // Navigate to login page
    long startTime = System.currentTimeMillis();
    driver.findElement(By.className("login")).click();

    // Fill in the form
    driver.findElement(By.id("email")).sendKeys("tester@test.com");
    driver.findElement(By.id("passwd")).sendKeys("tester");
    long endTime = System.currentTimeMillis();
    long totalTime = endTime - startTime;
    System.out.println("Totaltime: " + totalTime + "milliseconds");
    driver.findElement(By.id("SubmitLogin")).click();
  }
  /* end */

}
