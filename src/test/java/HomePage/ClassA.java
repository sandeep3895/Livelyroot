package HomePage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class ClassA {
public static WebDriver driver;
Actions ac;
@BeforeSuite
public void OpenURL() {
	driver=new ChromeDriver();
	driver.get("https://www.livelyroot.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
}
//@Test(priority=1)
//public void SearchProduct() throws InterruptedException {
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//
//    // 1️⃣ Click the search icon to open the search bar
//    WebElement searchIcon = wait.until(ExpectedConditions.elementToBeClickable(
//            By.xpath("//button[contains(@class,'search-icon')] | //img[@class='medium-up--hide image-element']")
//    ));
//    searchIcon.click();
//
//    // 2️⃣ Wait for the visible search input field
//    WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(
//            By.xpath("//input[@type='search' and @name='q']")));
//
//    // 3️⃣ Send keys and press ENTER
//    searchBox.sendKeys("Office Plants");
//    searchBox.sendKeys(Keys.ENTER);
//      Thread.sleep(3000);
//}
//@Test(priority=2)
//public void ClickGardenClub() throws InterruptedException {
//	driver.findElement(By.xpath("//toggle-menu")).click();
//	driver.findElement(By.xpath("//span[text()='Garden Club']")).click();
//	Thread.sleep(5000);
//}
//@Test(priority = 1)
//public void ClickShopPlants() throws InterruptedException {
//    JavascriptExecutor js = (JavascriptExecutor) driver;
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//
//    // Hover or open the "Shop Plants" section if needed
//    WebElement shopPlantsMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
//            By.xpath("//div[@class='slide-nav__image']/following-sibling::span[contains(text(), 'Shop Plants')]")));
//    js.executeScript("arguments[0].scrollIntoView();", shopPlantsMenu);
//    Thread.sleep(2000);
//    js.executeScript("arguments[0].click();", shopPlantsMenu);
//
//    // Wait for the submenu to appear
//    WebElement popularCollections = wait.until(ExpectedConditions.visibilityOfElementLocated(
//            By.xpath("(//span[text()='Popular Collections'])[1]")));
//    js.executeScript("arguments[0].scrollIntoView();", popularCollections);
//    Thread.sleep(1000);
//    js.executeScript("arguments[0].click();", popularCollections);
//
//    System.out.println("Clicked on Popular Collections successfully!");
//}
//@Test(priority=1)
//public void Click_BestSellers() throws InterruptedException {
//	driver.findElement(By.xpath("//img[@src='//www.livelyroot.com/cdn/shop/collections/Best_Selling_Plants.jpg?v=1747198854&width=1080']")).click();
//	Thread.sleep(7000);
//	driver.findElement(By.xpath("//img[@src='https://cdn.shopify.com/s/files/1/0068/4215/5090/t/115/assets/5724ee3406dc--PB-MT-SWP-WH-6IN1-kitchen.jpg']")).click();
//	Thread.sleep(4000);
////	driver.findElement(By.xpath("(//button[@data-collapsible-id='filter-plant-size'])[2]")).click();
////	Thread.sleep(3000);
//	driver.findElement(By.xpath("//label[text()='M']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//label[@for='template--15535860809810__main-2490396409938-2-1']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[@type='submit' and @name='add']")).click();
//	Thread.sleep(3000);
//	//driver.findElement(By.xpath("//input[@type='text' and @class='js-qty__num']")).clear();
////   despite clearing the text field the value is being updated to 14 instead of 4
////	driver.findElement(By.xpath("//input[@type='text' and @class='js-qty__num']")).sendKeys("4");
//	WebElement e1=driver.findElement(By.xpath("//span[text()='+']/parent::button"));
////	int i=1;
////	while(i<=5) {
//		e1.click();
//		Thread.sleep(3500);
////		i+=1;
////	}
//	driver.findElement(By.xpath("//button[@name='checkout']")).click();
//	Thread.sleep(8000);
//}
@Test(priority=1)
public void ClickOrchids() throws InterruptedException {
	driver.get("https://www.livelyroot.com/");
	driver.findElement(By.xpath("//a[@class='site-header__logo-link']")).click();
	driver.findElement(By.xpath("//img[@src='//www.livelyroot.com/cdn/shop/collections/Pl_3in_3_pack_Assorted-Phalaenopsis-Orchid_Orange-Eco-Pots_01.jpg?v=1746674567&width=1080']")).click();
	driver.findElement(By.xpath("(//div[@class='grid-item__meta'])[6]")).click();
	driver.findElement(By.xpath("(//div[@class='variant__button-label-wrapper ']//label)[3]")).click();
	driver.findElement(By.xpath("//button[@class='btn btn--full add-to-cart ']")).click();
	driver.findElement(By.xpath("//button[@name='checkout']")).click();
	Thread.sleep(6000);
	
}
@AfterSuite
public void closeURL() {
	driver.close();
}
}
