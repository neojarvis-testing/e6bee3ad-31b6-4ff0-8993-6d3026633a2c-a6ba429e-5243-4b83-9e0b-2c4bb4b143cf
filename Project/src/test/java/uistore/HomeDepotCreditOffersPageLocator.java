package uistore;

import org.openqa.selenium.By;

public class HomeDepotCreditOffersPageLocator {
    public static By creditOffers = By.cssSelector("a[alt='Credit Offers']");
    public static By verifyCreditCardServices = By.cssSelector("h1[class='sui-h1-display sui-uppercase sui-line-clamp-unset sui-font-normal sui-text-primary']");
    public static By applyNow = By.cssSelector("a[href='https://www.homedepot.com/myaccount/savecardtoprofile?originUrl=https%3A%2F%2Fwww.homedepot.com%2Fc%2FCredit_Center&step=initial&insideCheckout=false&cmp=A~E~D~R~A~9~ZZZ0~AI~HD~ZZ_D3T']");
    public static By firstName = By.cssSelector("input[aria-label='First Name']");
    public static By lastName = By.cssSelector("input[aria-label='Last Name']");
    public static By continueContact = By.id("nextContactInfo");
    public static By streetAddress = By.cssSelector("input[aria-label='Street Address']");
    public static By city = By.cssSelector("input[aria-label='City']");
    public static By state = By.id("cui_state");
    public static By email = By.cssSelector("input[aria-label='Email Address']");
    public static By phoneNumber = By.cssSelector("input[aria-label='Phone Number']");
    public static By zipCode = By.cssSelector("input[aria-label='ZIP Code']");
    public static By continueReview = By.id("nextReviewInfo");
    public static By residentialStatus = By.id("cui_residence_status");
    public static By monthlyIncome = By.cssSelector("input[aria-label='Monthly Housing Payment']");
    public static By totalIncome = By.cssSelector("input[aria-label='Total Annual Net Income']");
}
