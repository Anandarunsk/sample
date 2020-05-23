package Wikipedia_automation_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class wikipedia_download {
	
	public WebElement download;
	public void downloadelement()
	{
		WebDriver wd=new FirefoxDriver();
		wd.get("www.https://en.wikipedia.org//w//index.php?title=Special:ElectronPdf&page=amazon&action=show-download-screen/");
		
}}
