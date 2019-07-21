//$Id$
package ArunMaven;

public class BasePage {

	public static Webdriver driver;
	public String browser ="chrome";
	
	public Basepage(){
		if(driver==null){
			if(browser.equals("chrome")){
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\eclipse_windows\\eclipse");
				driver = new ChromeDriver();
			}
			elseif("browser.equals("firefox")){"
				System.setProperty("webdriver.gecko.driver","firefox", "");			}
			driver = new FirefoxDriver();
	}
	driver.manage().windows().maximize();
	driver.manage().timeouts.implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://automationptractice.com/index.php");
				
}
	}

	public boolean elementfound(WebElement element){
		boolean res=false;
		try{
			res=elemnt.isDisplayed();
		}
		catch(Exception e){
			e.printStackTrace();
		} 
return res;
	}
	
	public void setText(WebElement element , String name){
		if(name !=null){
			element.click();
			element.clear();
			element.senkeys(name);
		}																																																																																																																					\
	}
	public string getTextAttribute(WebElement element){
		return element.getAttribute("value");
	}
	public String getTxtAttribute(WebElement element){
		return element.getAttribute("value");
	}
	public string selectFromDropDown(WebElement element){
		
	
}
