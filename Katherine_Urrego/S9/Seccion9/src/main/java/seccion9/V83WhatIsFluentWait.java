package seccion9;

public class V83WhatIsFluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VIDEO 83: What is Fluent wait? Its advantages
		
		/*
		 * There iss another explicit wait mechanism type called FLUENT WAIT
		 * 
		 * EXPLICIT WAIT can be achieved in 2 ways: 1.WebDriverWait 2.FluentWait
	
		 * 
		 * How different it is from WebDriver Wait? Fluent wait finds the web element
		 * repeareadly at regular intervals of time until the timeout or till the
		 * objects gets found
		 * 
		 * Unlike WebDriver, we need to build customized wait methods based on condition
		 * 
		 * Both WbeDriverWait and FluenWait classes implement WAIT interface
		 * 
		 * Sample usage:
		 * // Waiting 30 seconds for an element to be present on the page, checking //
		 * for its presence once every 5 seconds. 
		 * Wait<WebDriver> wait = new FluentWait<WebDriver>(driver) .withTimeout(Duration.ofSeconds(30L))
		 * .pollingEvery(Duration.ofSeconds(5L))
		 * .ignoring(NoSuchElementException.class);
		 * 
		 * WebElement foo = wait.until(new Function<WebDriver, WebElement>() { public
		 * WebElement apply(WebDriver driver) { return driver.findElement(By.id("foo"));
		 * } });
		 */
	}

}
