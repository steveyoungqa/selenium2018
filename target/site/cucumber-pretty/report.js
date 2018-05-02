$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 3,
  "name": "BBC HomePage for Framework example",
  "description": "",
  "id": "bbc-homepage-for-framework-example",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@chrome"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Framework example",
  "description": "",
  "id": "bbc-homepage-for-framework-example;framework-example",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am using the \"Chrome\" browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I am on the \"https://www.bbc.co.uk/\" website",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select the Sport section using a CSS Path",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I select the Football section using an Xpath with Span text",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select the \"Tables\" section using an Xpath with Text Contains",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I search for the Team \"Crystal Palace\" using an ID locator",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 16
    }
  ],
  "location": "homePageSteps.iAmUsingTheBrowser(String)"
});
formatter.result({
  "duration": 2018976726,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.bbc.co.uk/",
      "offset": 13
    }
  ],
  "location": "homePageSteps.iAmOnTheWebsite(String)"
});
formatter.result({
  "duration": 1249962732,
  "status": "passed"
});
formatter.match({
  "location": "homePageSteps.iSelectTheSportSectionUsingACSSPath()"
});
formatter.result({
  "duration": 1379592737,
  "status": "passed"
});
formatter.match({
  "location": "homePageSteps.iSelectTheFootballSectionUsingAnXpathWithSpanText()"
});
formatter.result({
  "duration": 950348532,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tables",
      "offset": 14
    }
  ],
  "location": "homePageSteps.iSelectTheSectionUsingAnXpathWithTextContains(String)"
});
formatter.result({
  "duration": 702161213,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Crystal Palace",
      "offset": 23
    }
  ],
  "location": "homePageSteps.iSearchForTheTeamUsingAnIDLocator(String)"
});
formatter.result({
  "duration": 950323642,
  "status": "passed"
});
formatter.after({
  "duration": 3109920664,
  "status": "passed"
});
});