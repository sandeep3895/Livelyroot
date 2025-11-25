package HomePage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClassB {
public static WebDriver driver;
Actions ac;
@BeforeSuite
public void OpenURL() {
	driver=new ChromeDriver();
	driver.get("https://www.livelyroot.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
}
//@Test
//public void ClickShopPlants() throws InterruptedException {
//	ac=new Actions(driver);
//	Thread.sleep(25000);
//	driver.findElement(By.xpath("//toggle-menu/button[@type='button']")).click();
//	WebElement ShopPlants=driver.findElement(By.xpath("(//button[@type='button'])[16]"));
//	ac.moveToElement(ShopPlants);
//	driver.findElement(By.xpath("(//span[text()='Popular Collections'])[1]")).click();
//	Thread.sleep(2500);
//	System.out.println("Clicked on popular collections ");
//}

//@Test
//public void ClickGardenClub() throws InterruptedException {
//	driver.findElement(By.xpath("//button[@class='site-nav__link site-nav__link--icon medium-up--hide mobile-nav-trigger']")).click();
//	driver.findElement(By.xpath("//span[text()='Garden Club']")).click();
//	Thread.sleep(5000);
//}
@Test(priority=4)
public void Click_BestSellers() throws InterruptedException {
	driver.get("https://www.livelyroot.com/");
	driver.findElement(By.xpath("//img[@src='//www.livelyroot.com/cdn/shop/collections/Best_Selling_Plants.jpg?v=1747198854&width=1080']")).click();
	Thread.sleep(7000);
	driver.findElement(By.xpath("//img[@src='https://cdn.shopify.com/s/files/1/0068/4215/5090/t/115/assets/5724ee3406dc--PB-MT-SWP-WH-6IN1-kitchen.jpg']")).click();
	Thread.sleep(4000);
//	driver.findElement(By.xpath("(//button[@data-collapsible-id='filter-plant-size'])[2]")).click();
//	Thread.sleep(3000);
	driver.findElement(By.xpath("//label[text()='M']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[@for='template--15535860809810__main-2490396409938-2-1']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit' and @name='add']")).click();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//input[@type='text' and @class='js-qty__num']")).clear();
//   despite clearing the text field the value is being updated to 14 instead of 4
//	driver.findElement(By.xpath("//input[@type='text' and @class='js-qty__num']")).sendKeys("4");
	WebElement e1=driver.findElement(By.xpath("//span[text()='+']/parent::button"));
//	int i=1;
//	while(i<=5) {
		e1.click();
		Thread.sleep(3500);
//		i+=1;
//	}
	driver.findElement(By.xpath("//button[@name='checkout']")).click();
	Thread.sleep(8000);
}

@Test(priority=3)
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

@Test(priority=1)
public void ShopHolidayDecor() throws InterruptedException{
	driver.findElement(By.xpath("(//div[@class='grid-item__meta'])[5]")).click();
	driver.findElement(By.xpath("//label[text()='XL']")).click();
	driver.findElement(By.xpath("//label[@for='template--15535860809810__main-4862525472850-2-1']")).click();
	driver.findElement(By.xpath("(//button[@type='submit'])[4]")).click();
	Thread.sleep(3000);
  WebElement e1=driver.findElement(By.xpath("(//button[@class='js-qty__adjust js-qty__adjust--plus'])[1]"));
  //int i=1;
  //while(i<=5) {
  	e1.click();
  	Thread.sleep(3000);
  	//i+=1;
 // }
  driver.findElement(By.xpath("//button[@name='checkout']")).click();
  Thread.sleep(4000);
}

@Test(priority=2)
public void PorchandPatio() throws InterruptedException{
	driver.get("https://www.livelyroot.com/");
	driver.findElement(By.xpath("(//div[@class='product-grid-item'])[9]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//label[@for='template--15535860809810__main-7498944512082-2-1']")).click();
	driver.findElement(By.xpath("(//button[@type='submit'])[4]")).click();
	Thread.sleep(3500);
	driver.findElement(By.xpath("//button[@name='checkout']")).click();
	Thread.sleep(10000);
}
//@Test
//public void BlackFridaySale() throws InterruptedException{
//	//driver.findElement(By.xpath("//img[@class='gP50U']")).click();
//	driver.get("https://www.livelyroot.com/");
//	Thread.sleep(10000);
//	driver.findElement(By.xpath("//button[@class='site-nav__link site-nav__link--icon medium-up--hide mobile-nav-trigger']")).click();
//	driver.findElement(By.xpath("//span[text()='Black Friday Sale']")).click();
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("(//a[@class='grid-item__link'])[6]")).click();
//	Thread.sleep(7000);
//	driver.findElement(By.xpath("//button[@name='add']")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//button[@name='checkout']")).click();
//	Thread.sleep(6500);
//	driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
//}


@AfterSuite
public void CloseURL() {
	driver.close();
}
}
