$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/AmazonSearch.feature");
formatter.feature({
  "name": "Amazon Search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Search Results",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.AmazonSearchSteps.i_launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Open Amazon Home Page",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.AmazonSearchSteps.i_Open_Amazon_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search for mobile",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.AmazonSearchSteps.search_for_mobile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search results for mobile should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.AmazonSearchSteps.search_results_for_mobile_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
});