# Halan
Halan Test Automation 

Halan - Egypt's leading FinTech app for Your Everyday Needs
Egypt's leading Fintech app. Buy now and pay later, apply for a loan, Ecommerce, pay bills, and request a delivery or a ride.


website :
https://halan.com/


The main Frameworks included in the project:
SHAFT Engine on the Top of:

RestAssured

TestNG

Allure Report

Extent Reports

Project Design:
Object Model design pattern

Data Driven framework

Java Docs

How To Use this Project With SHAFT_Engine :
You can use it with any IDE like ==> EX: Eclipse IDE
If you are going to use Intelij
Please You Should First follow these steps :
IntelliJ:
As of SHAFT_Engine '4.0.20200220-beta' you can now use IntelliJ in addition to Eclipse to manage your test project.

After checking out the project to your IntelliJ you may face an exception that prevents tests execution.

In that case you need to add the SHAFT_Engine custom listeners to your TestNG execution template, as IntelliJ doesn't natively inherit this list from the pom.xml file.

listeners:
1- com.shaft.tools.listeners.AlterSuiteListener
2- com.shaft.tools.listeners.SuiteListener
3- com.shaft.tools.listeners.InvokedMethodListener


thanks
