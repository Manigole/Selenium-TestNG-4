import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ecom {
    WebDriver driver;

    @Test(priority = 1, groups = "Group1")
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\manigole\\Documents\\Automation\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Chrome Opened Successfully");
    }

    @Test(priority = 2,groups = "Group1" )
    public void maxBrowser(){
        driver.manage().window().maximize();
        System.out.println("Chrome browser is maximized");
    }

    @Test(priority = 3, groups = "Group1")
    public void hitURL(){
        driver.get("https://smartdoko.com/");
        System.out.println("Smartdoko is accessed");
    }

    @Test(priority = 4, groups = "Group1")
    public void kidsToy(){
        driver.findElement(By.xpath("//*[@id=\"myHeader\"]/div[2]/div/div[3]/nav/div/div/div[7]/div/a")).click();
        System.out.println("Toys kids and baby is opened");
    }

    @Test(priority = 5, groups = "Group1")
    public void scrollDown(){
            JavascriptExecutor js=(JavascriptExecutor)driver;
            for (int i = 0; i < 1500; i += 7) {
                js.executeScript("window.scrollTo(0, " + i + ")");}
        }

    @Test(priority = 6, groups = "Group1")
    public void scrollUp(){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        for (int i = 1500; i > 0; i -= 7) {
            js.executeScript("window.scrollTo(0, " + i + ")");}
    }

    @Test(priority = 7, groups = "Group1")
    public void babyChair() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div[1]/div[1]/div/div[2]/a/span")).click();
        System.out.println("Baby chair clicked");
        Thread.sleep(4000);
    }

    @Test(priority = 8, groups = "Group1")
    public void select() throws InterruptedException{
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/h4/a")).click();
        System.out.println("Baby chair selected");
        Thread.sleep(4000);
    }

    @Test(priority = 10, groups = "Group1")
    public void addToDoko() throws InterruptedException{
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[2]/div[2]/div[4]/button[1]")).click();
        System.out.println("Added to doko");
        Thread.sleep(4000);
    }

    @Test(priority = 11, groups = "Group1")
    @Parameters("email")
    public void signUpEmail(String email) {
        driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys(email);
        System.out.println("Email entered");
    }

    @Test(priority = 12, groups = "Group2")
    @Parameters("pass")
    public void signUpPassword(String pass){
        driver.findElement(By.xpath("//*[@id=\"inputPassword\"]")).sendKeys(pass);
        System.out.println("Password entered");
    }

    @Test(priority = 13, groups = "Group2")
    public void signUp() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"sign-in-form\"]/input[2]")).click();
        System.out.println("Signup clicked");
        Thread.sleep(4000);
    }

    @Test(priority = 14, groups = "Group2")
    public void addCount(){

        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[2]/div[2]/div[3]/div[1]/span[2]/button")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[2]/div[2]/div[3]/div[1]/span[2]/button")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[2]/div[2]/div[3]/div[1]/span[2]/button")).click();
        System.out.println("Baby chair added to doko ");
    }

    @Test(priority = 15, groups = "Group2")
    public void removeCount() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[2]/div[2]/div[3]/div[1]/span[1]/button")).click();
        System.out.println("One umbrella removed from the doko");
        Thread.sleep(4000);
    }


    @Test(priority = 16, groups = "Group2")
    public void addToDoko1() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[2]/div[2]/div[4]/button[1]")).click();
        System.out.println("Successfully checked out");
        Thread.sleep(10000);
    }

    @Test(priority = 17, groups = "Group2")
    public void chk(){
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[2]/div[2]/div[4]/button[1]")).click();
    }

    @Test(priority = 18, groups = "Group2")
    public void continueShopping(){
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/section[2]/div/section/div[1]/div/a")).click();
        System.out.println("Shopping continued");
    }

    @Test(priority = 19, groups = "Group2")
    public void menFashion(){
        driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[2]/div/div[3]/nav/div/div/div[9]/div/a")).click();
        System.out.println("Beverages clicked");
    }

    @Test(priority = 20, groups = "Group2")
    public void clothing(){
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/div[1]/a/div/span")).click();
        System.out.println("Liquors selected");
    }

    @Test(priority = 21, groups = "Group2")
    public void jeans() throws InterruptedException{
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div/div[2]/a")).click();
        System.out.println("Jeans selected");
        Thread.sleep(4000);
    }

//    @Test(priority = 22, groups = "Group2")
//    public void scroll(){
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        for (int i = 0; i < 1000; i += 7) {
//            js.executeScript("window.scrollTo(0, " + i + ")");}
//    }

    @Test(priority = 23, groups = "Group2")
    public void jeansPant(){
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/h4/a")).click();
        System.out.println("jeansPant Clicked");
    }

    @Test(priority = 24, groups = "Group2")
    public void addDoko() throws InterruptedException{
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/button[2]/div")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[2]/div[2]/div[5]/button[1]")).click();
        System.out.println("Added to doko");
        Thread.sleep(15000);
    }

    @Test(priority = 25, groups = "Group2")
    public void addCheck() throws InterruptedException{
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[2]/div[2]/div[5]/button[1]")).click();
        System.out.println("checkout clicked");
        Thread.sleep(4000);
    }

    @Test(priority = 26, groups = "Group2")
    public void makePayment() throws InterruptedException{
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/section[2]/div/section/div[1]/div/button[1]")).click();
        driver.findElement(By.cssSelector("#main-content > section.cart-content.padding-y > div > section > div.card > div > button.btn.btn-blue.float-md-right")).click();
        System.out.println("Make payment clicked");
        Thread.sleep(5000);
    }

    @Test(priority = 27, groups = "Group2")
    public void billing() throws InterruptedException{
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/section/div[2]/form/div[1]/div/input")).sendKeys("Hello Friend");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/section/div[2]/form/div[2]/div[2]/input")).sendKeys("9876543210");
        driver.findElement((By.xpath("/html/body/div[2]/div[2]/div/section/div[2]/form/div[3]/input"))).sendKeys("Kathmandu");
        Select stateSelect = new Select(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/section/div[2]/form/div[5]/div[1]/select")));
        stateSelect.selectByValue("84");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/section/div[2]/form/div[5]/div[2]/input")).sendKeys("kathmandu");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/section/div[2]/form/div[5]/div[3]/input")).sendKeys("44600");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/section/div[2]/form/div[6]/label")).click();
        Thread.sleep(1000);
    }

    @Test(priority = 28, groups = "Group2")
    public void proceedCheckout() throws InterruptedException{
        Select stateSelect = new Select(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/section/div[3]/form/div[5]/div[4]/select")));
        stateSelect.selectByValue("164");
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/section/div[1]/button")).click();
        driver.findElement(By.cssSelector("#main-content > div > section > div.col-md-4.order-md-3.mb-4.cart-col > button")).click();
        Thread.sleep(10000);
    }


//    @Test(priority = 24, groups = "Group2")
//    public void Check(){
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div[2]/div[2]/div[4]/button[1]")).click();
//    }

//    @Test(priority = 24, groups = "Group2")
//    public void recheck() throws InterruptedException{
//        this.checkout();
//    }

//    @Test(priority = 24, groups = "Group2")
//    public void min(){
//        WebElement frame_element = driver.findElement(By.xpath("/html/body/div[3]/div[2]/span/iframe"));
//        driver.switchTo().frame(frame_element);
//        System.out.println("Changed To Iframe");
//        driver.findElement(By.xpath("/html/body/div/div/div/div/svg")).click();
//    }



    @Test(priority = 30, groups = "Group2")
    public void logOut(){
        driver.findElement(By.xpath("//*[@id=\"main\"]/header/div[1]/div/div[2]/ul/li[4]/a/span")).click();
        System.out.println("Logged out");
    }

//    @Test(priority = 17)
//    public void messengerMin() throws InterruptedException{
//        WebElement frame_element = driver.findElement(By.className("f39a4e870d94678"));
//        driver.switchTo().frame(frame_element);
//        System.out.println("Changed To Iframe");
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("//*[@id=\"u_0_0_ea\"]/div/div/div/div/div[1]/div/div[1]/div[3]/div[2]/div/div/svg/path[1]")).click();
//    }




}
