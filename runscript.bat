set projectpath=G:\webdriver\mastering-selenium-testing
cd %projectpath%
set classpath=%projectpath%\bin;%projectpath%\lib\*;
java org.testng.TestNG %projectpath%\testng.xml
pause