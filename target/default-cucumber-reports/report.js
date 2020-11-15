$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/LoginNegative.feature");
formatter.feature({
  "name": "Login negative",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@loginNegative"
    }
  ]
});
formatter.background({
  "name": "user is on the login page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.LoginTestStepdefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User navigate to registration page if they did not register yet",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@loginNegative"
    },
    {
      "name": "@Negative5"
    }
  ]
});
formatter.step({
  "name": "user clicks on the username textbox and text invalid username",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.LoginTestNegativeStepDef.user_clicks_on_the_username_textbox_and_text_invalid_username()"
});
formatter.result({
  "error_message": "io.cucumber.core.exception.CucumberException: Failed to instantiate class gmibank.stepdefinitions.LoginTestNegativeStepDef\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.cacheNewInstance(ObjectFactoryServiceLoader.java:135)\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.getInstance(ObjectFactoryServiceLoader.java:121)\r\n\tat io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:27)\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)\r\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\r\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\r\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\r\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\r\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:67)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:230)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:58)\r\nCaused by: java.lang.reflect.InvocationTargetException\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.cacheNewInstance(ObjectFactoryServiceLoader.java:129)\r\n\t... 33 more\r\nCaused by: org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d86.0.4240.198)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-3IAPGKF\u0027, ip: \u0027192.168.137.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.198, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\user\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:51492}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: b3b3518a37306c9e5f8f5575685a2f34\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions$RemoteWindow.maximize(RemoteWebDriver.java:837)\r\n\tat gmibank.utilities.Driver.getDriver(Driver.java:45)\r\n\tat gmibank.pages.LoginPage.\u003cinit\u003e(LoginPage.java:11)\r\n\tat gmibank.stepdefinitions.LoginTestNegativeStepDef.\u003cinit\u003e(LoginTestNegativeStepDef.java:12)\r\n\t... 38 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks on the password textbox and text invalid password",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.LoginTestNegativeStepDef.user_clicks_on_the_password_textbox_and_text_invalid_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on the sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.LoginTestStepdefinitions.user_clicks_on_the_sign_in_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user verify the error message",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.LoginTestNegativeStepDef.user_verify_the_error_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on this text \"You don\u0027t have an account yet? Register a new account\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.LoginTestNegativeStepDef.user_clicks_on_this_text(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user verify the Registration page",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.LoginTestNegativeStepDef.user_verify_the_Registration_page()"
});
formatter.result({
  "status": "skipped"
});
});