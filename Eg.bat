set projectLocation=C:\Users\laitkor\eclipse-workspace\Simple
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause