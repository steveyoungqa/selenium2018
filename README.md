Creating a Brand new Selenium Repo from scratch to demonstrate simple and advanced concepts and examples to be used as a referenece
for when starting to develop a new Selenium/Appium framework from scratch



     Create a New IntelliJ Idea New>Project>Maven project, checking the Create from archetype checkbox, use any group ID i.e 001 and give the Artifact ID a name
     Create this README.md file in the main selenium2018 folder root
     Download the latest version of chromedriver and place into the root folder: Grab it from: https://sites.google.com/a/chromium.org/chromedriver/downloads
     Download the latest version of geckodriver (Firefox) and place into the root folder: Grab it from: https://github.com/mozilla/geckodriver/releases
 
Next we have to configure our pom.xml file for all of the Maven dependencies to run browser tests where they will be automatically downloaded

    Now we create our Framework project structure:
    right click on src/test/java and create a new Package called 