package com.actitimeautomation.pages.page;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectPage {
    WebDriver driver;
    @FindBy(xpath = "//div[@class='item createNewProject']")
    public WebElement createprojectButton;
    @FindBy(xpath ="//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")
    public  WebElement addProjectName;
    @FindBy(xpath = "//div[@class='customerSelectorPlaceholder selectorWithPlaceholderContainer notSelected']")
    public WebElement AddProjectDescription;
    @FindBy(xpath = "//div[text()='-- New Customer --']/following::div[1]")
    WebElement selectCust;
    @FindBy(xpath = "//div[@class='components_button withPlusIcon\']")
    public WebElement ClickOnProject;
    public ProjectPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(this.driver,this);
    }
    public void createProject(String projectName) throws InterruptedException {
        Thread.sleep(5000);
        createprojectButton.click();
        Thread.sleep(5000);
        addProjectName.sendKeys(projectName);

    }
    public void createDescription(String description){
        AddProjectDescription.click();
        selectCust.click();
        ClickOnProject.click();
    }
}
