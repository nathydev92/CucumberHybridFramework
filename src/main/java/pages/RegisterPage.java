package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUtils;
import utils.ElementUtils;

public class RegisterPage {
    WebDriver driver;
    private ElementUtils elementUtils;
    public RegisterPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver,this);
        elementUtils =  new ElementUtils(driver);
    }

    @FindBy(id ="input-firstname")
    private WebElement firstNameField;

    @FindBy(id ="input-lastname")
    private WebElement lastNameField;

    @FindBy(id ="input-email")
    private WebElement emailField;

    @FindBy(id ="input-telephone")
    private WebElement telephoneField;

    @FindBy(id ="input-password")
    private WebElement passwordField;

    @FindBy(id ="input-confirm")
    private WebElement confirmPasswordField;

    @FindBy(name="agree")
    private WebElement privacyOption;

    @FindBy(xpath ="//input[@value='Continue']")
    private WebElement continueButton;

    @FindBy(xpath="//input[@name='newsletter'][@value='1']")
    private WebElement YesNewsletterOption;


    @FindBy(xpath="//div[contains(@class,'alert-dismissible')]")
    private WebElement warningMessage;

    @FindBy(xpath ="//input[@id='input-firstname']/following-sibling::div")
    private WebElement firstNameWarning;


    public void enterFirstName(String textFirstName){
        elementUtils.typeTextIntoElement(firstNameField,textFirstName, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
    }

    public void enterLastName(String textLastName){
        elementUtils.typeTextIntoElement(lastNameField,textLastName,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

    }

    public void enterEmailAddress(String emailText){
        elementUtils.typeTextIntoElement(emailField,emailText,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

    }

    public void enterTelephone(String telephoneText){
        elementUtils.typeTextIntoElement(telephoneField,telephoneText,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

    }

    public void enterPassword(String passwordText){
        elementUtils.typeTextIntoElement(passwordField,passwordText,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

    }

    public void enterConfirmPassword(String confirmPasswordText){

        elementUtils.typeTextIntoElement(confirmPasswordField,confirmPasswordText,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

    }

    public void selectPrivacyPolicy(){

        elementUtils.clickOnElement(privacyOption,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

    }

    public AccountSuccessPage clickContinueButton(){
        elementUtils.clickOnElement(continueButton,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

        return new AccountSuccessPage(driver);
    }

    public void selectYesNewsletterOption(){
        elementUtils.clickOnElement(YesNewsletterOption,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
    }


    public String getWarningMessageText(){
        return elementUtils.getTextFromElement(warningMessage,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

    }

    public String getFirstNameWarning(){
        return elementUtils.getTextFromElement(firstNameWarning,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

    }




}
