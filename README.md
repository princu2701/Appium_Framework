# Appium Framework

This project demonstrates how to extract data and run an emulator within an IDE using Appium. It includes conditions to automate the process of starting and stopping the emulator, providing a seamless workflow for mobile testing.

## Setup Instructions

1. **Prerequisites:**
   - **JDK:** Make sure you have JDK 8 or higher installed.
   - **Maven:** Ensure that Apache Maven is installed and configured.

2. **Clone the Repository:**
   ```bash
   git clone https://github.com/yourusername/appium-framework.git
   cd appium-framework


   <dependencies>
    <!-- Selenium Java -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.x.x</version>
    </dependency>

    <!-- WebDriver Manager -->
    <dependency>
        <groupId>io.github.bonigarcia</groupId>
        <artifactId>webdrivermanager</artifactId>
        <version>5.x.x</version>
    </dependency>

    <!-- Extent Reports -->
    <dependency>
        <groupId>com.aventstack</groupId>
        <artifactId>extentreports</artifactId>
        <version>5.x.x</version>
    </dependency>

    <!-- Java Client for Appium -->
    <dependency>
        <groupId>io.appium</groupId>
        <artifactId>java-client</artifactId>
        <version>8.x.x</version>
    </dependency>

    <!-- TestNG -->
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.x.x</version>
        <scope>test</scope>
    </dependency>
</dependencies>


<build>
    <plugins>
        <!-- Maven Surefire Plugin for running TestNG -->
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>3.x.x</version>
            <configuration>
                <suiteXmlFiles>
                    <suiteXmlFile>testng.xml</suiteXmlFile>
                </suiteXmlFiles>
            </configuration>
        </plugin>
    </plugins>
</build>


================

How to Run Tests --

Using Spring Tool Suite (STS):

Navigate to the MainTest class, where the WebDriver has been initialized.
Right-click on the file and select Run As > TestNG Test to execute the tests.
Using Maven:

Run the tests via Maven from the command line:
bash
Copy code
mvn test
Project Structure
css
Copy code
├── src
│   ├── main
│   │   └── java
│   └── test
│       └── java
├── pom.xml
└── testng.xml
pom.xml Example
xml
Copy code
<project xmlns="https://maven.apache.org/POM/4.0.0" 
         xmlns:xsi="https://www.w3.org/2001/XMLSchema-instance" 
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  
  <modelVersion>4.0.0</modelVersion>
  <groupId>AppiumFramework</groupId>
  <artifactId>AppiumFramework</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  
  <properties>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
  </properties>

  <build>
    <pluginManagement>
      <plugins>
        <!-- Compiler Plugin -->
        <plugin>
          <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-compiler-plugin</artifactId>
          <version>3.13.0</version>
        </plugin>

        <!-- Surefire Plugin -->
        <plugin>
          <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-surefire-plugin</artifactId>
          <version>3.3.1</version>
          <configuration>
            <includes>
              <exclude>**/*maintest</exclude>
            </includes>
          </configuration>
        </plugin>
      </plugins>
    </pluginManagement>
  </build>

  <dependencies>
    <!-- Selenium Java -->
    <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-java</artifactId>
      <version>3.141.59</version>
    </dependency>

    <!-- WebDriver Manager -->
    <dependency>
      <groupId>io.github.bonigarcia</groupId>
      <artifactId>webdrivermanager</artifactId>
      <version>5.9.2</version>
    </dependency>

    <!-- TestNG -->
    <dependency>
      <groupId>org.testng</groupId>
      <artifactId>testng</artifactId>
      <version>7.10.2</version>
      <scope>test</scope>
    </dependency>

    <!-- Java Client for Appium -->
    <dependency>
      <groupId>io.appium</groupId>
      <artifactId>java-client</artifactId>
      <version>7.3.0</version>
    </dependency>

    <!-- Extent Reports -->
    <dependency>
      <groupId>com.aventstack</groupId>
      <artifactId>extentreports</artifactId>
      <version>4.0.9</version>
    </dependency>
  </dependencies>

</project>


