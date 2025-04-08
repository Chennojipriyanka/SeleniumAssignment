# 💻 Selenium Automation Project – Amazon (Login & Search)

This project demonstrates Selenium WebDriver automation for testing **Login** and **Search functionality** on [Amazon.in](https://www.amazon.in/). The scripts are written in **Java** using **Maven**, and browser automation is done using **ChromeDriver**.

---

## 📌 Features Automated

| Feature            | Description                                                                 |
|--------------------|-----------------------------------------------------------------------------|
| 🔐 Login Test       | Automates login using a mobile number and password.                         |
| 🔍 Search Test      | Searches for a product (e.g., "dress") and verifies that search executes.   |

---

## 🛠️ Technologies & Tools Used

- **Java**
- **Selenium WebDriver**
- **Maven**
- **ChromeDriver**
- **TestNG** (optional if integrated later)
- IDE: **Eclipse / IntelliJ**

---

## 📁 Project Structure

SeleniumAmazonProject/ │ ├── TestData/ │ ├── HomePage.java # Code to search a product on Amazon │ └── LoginPage.java # Code to login to Amazon using credentials │ ├── pom.xml # Maven project file with dependencies └── README.md # Project documentation

yaml
Copy
Edit

---

## 🧪 How to Run the Tests

### ✅ Prerequisites

- JDK installed and configured
- Chrome browser installed
- [ChromeDriver](https://chromedriver.chromium.org/) downloaded
- IDE like IntelliJ or Eclipse
- Maven installed and configured (optional)

---

### ▶️ Run the Scripts

1. Clone or download the project
2. Open the project in your IDE
3. Update the ChromeDriver path in both files:
   ```java
   System.setProperty("webdriver.chrome.driver", "C:\\Path\\To\\chromedriver.exe");




#### Code Explanation

1️ HomePage.java – Product Search on Amazon
java
Copy
Edit
driver.get("https://www.amazon.in/");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dress");
driver.findElement(By.id("nav-search-submit-button")).submit();
Opens Amazon homepage.

Types "dress" into the search bar.

Submits the search.

2️ LoginPage.java – Amazon Login
java
Copy
Edit
driver.get("https://www.amazon.in/");
driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
driver.findElement(By.id("ap_email_login")).sendKeys("8379916604");
driver.findElement(By.className("a-button-input")).submit();
driver.findElement(By.id("ap_password")).sendKeys("Priyanka@123");
driver.findElement(By.id("signInSubmit")).submit();
Opens Amazon login page.

Enters mobile number and password.

Clicks on Sign In button.

3 ProductPage.java - Amazon add to cart
driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dress");
		driver.findElement(By.id("nav-search-submit-button")).click();
String parentWindow = driver.getWindowHandle();
driver.findElement(By.className("s-image")).click();
Set<String> allWindows = driver.getWindowHandles();
		for (String windowHandle : allWindows) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		Thread.sleep(3000); 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.id("add-to-cart-button")).click();
		System.out.println("Added to cart successfully");



#### video walkthrough
https://github.com/user-attachments/assets/24280252-4e5c-497d-9049-848a642b513e

https://github.com/user-attachments/assets/31ab7a46-87c3-43ea-a94a-8a47cab44597

