package uistore;

import org.openqa.selenium.By;

public class HomeDepotCreditOffersPageLocator {
    /*
     * Author: Vansh Vijay
    */
    //creditOffers locator in the footer.
    public static By creditOffers = By.cssSelector("a[alt='Credit Offers']");
    //CREDIT CARD SERVICES header text for verification
    public static By verifyCreditCardServices = By.cssSelector("h1[class='sui-h1-display sui-uppercase sui-line-clamp-unset sui-font-normal sui-text-primary']");
    //Apply Now button for credit card application
    public static By applyNow = By.cssSelector("a[href='https://www.homedepot.com/myaccount/savecardtoprofile?originUrl=https%3A%2F%2Fwww.homedepot.com%2Fc%2FCredit_Center&step=initial&insideCheckout=false&cmp=A~E~D~R~A~9~ZZZ0~AI~HD~ZZ_D3T']");
    //First Name input field
    public static By firstName = By.cssSelector("input[aria-label='First Name']");
    //Last Name input field
    public static By lastName = By.cssSelector("input[aria-label='Last Name']");
    //Continue button after contact information section
    public static By continueContact = By.id("nextContactInfo");
    //Street Address input field
    public static By streetAddress = By.cssSelector("input[aria-label='Street Address']");
    //City input field
    public static By city = By.cssSelector("input[aria-label='City']");
    //State dropdown element
    public static By state = By.id("cui_state");
    //Email input field
    public static By email = By.cssSelector("input[aria-label='Email Address']");
    //Phone Number input field
    public static By phoneNumber = By.cssSelector("input[aria-label='Phone Number']");
    //Zip Code input field
    public static By zipCode = By.cssSelector("input[aria-label='ZIP Code']");
    //Continue button to proceed to the review section
    public static By continueReview = By.id("nextReviewInfo");
    //Residential Status dropdown element
    public static By residentialStatus = By.id("cui_residence_status");
    //Monthly Income input field
    public static By monthlyIncome = By.cssSelector("input[aria-label='Monthly Housing Payment']");
    //Total Annual Net Income input field
    public static By totalIncome = By.cssSelector("input[aria-label='Total Annual Net Income']");
}
