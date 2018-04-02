Selenium Practice
===========
# Installation
1. JDK: It stands for Java Development Kit. You need it to compile and run the code (since it's written in Java :D). Here's the [link](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) to download it. After download it, you may need to add the Java home location to PATH envirnoment variable. [Here](https://www.java.com/en/download/help/path.xml)'s the instruction to set.
2. Maven: Maven is a tool to manage the program lifecycle and dependencies. In this framework, its main purpose is to manage dependencies. You can download it [here](https://maven.apache.org/download.cgi) and find the installation guide [here](https://maven.apache.org/install.html).
3. Git: Git is a version control tool. It helps us to manage our code version easier. You can find way to download its [here](https://git-scm.com/). For ones that don't know how to use Git, don't worry since in this framework you just need to know very few Git commands, which will be listed in below section. If you want to learn seriously about Git, One recommended course is [here](https://www.datacamp.com/courses/introduction-to-git-for-data-science) in DataCamp.

Optional:

1. IDE: You'll need an editor for coding. If you want a full support from writing code to compiling and running, IDE (Integrated Development Environment) is here to help. It provides you an editor and some tools to code easier, as well as compile and run the code. There're many IDEs out there, so you can choose which suites you best. Two recommended ones are [IntelliJ](https://www.jetbrains.com/idea/download/#section=windows) and [Eclipse](https://www.eclipse.org/downloads/packages/eclipse-ide-java-developers/oxygen2). As this project is written with IntelliJ, so it might be better if you use that IDE. Beside that, there're some lightweight editors (which only help you to edit your code, no more no less) like: Visual Studio Code, Sublime, Notepad++, Notepad, etc.
2. Git GUI: If you don't want to remember Git commands like `git commit` or `git pull`, you may want to use some tools that transform these commands to GUI button, text, etc. You may want to try [SourceTree](https://www.sourcetreeapp.com/) or [Git Desktop](https://desktop.github.com/).


# Download the code
1. Ask Chi Tran to give you access to training git site of KMS. Contact Phuong Lam so that she can add you to the course repository.
2. Fork the project to your own repository (Using Fork button in the project page)
 3. Open the File Explore, navigate to the parent folder of the folder which you want to store the code (Ex: D:\Learning\Selenium). Click on the Address bar and type `cmd`. A terminal will appear.
   4. On this terminal, type `git clone [your git repository link] [the name of the folder you want to store the code]`. Please remember to give **your** repository link, not the original one. Example: https://tgit.kms-technology.com/phuonglam/test-202-introducing-selenium.git not https://tgit.kms-technology.com/fundamentals/test-202-introducing-selenium.git
  

# Compile and run with IntelliJ
1. Open the project: File > Open > Navigate to project location
2. Add JDK to IntelliJ: File > Project Structure > Platform Settings > SDKs > Click on Add button at the top of popup > JDK > Navigate to JDK home (Example: C:\Program Files\Java\jdk1.8.0_152)
3. Set JDK for the project: On the Project Structure popup > Project Settings > Project SDK > Select above JDK
4. Set project language level: On the Project Structure popup > Project Settings > Project Language Level > Select level 8. The go to Module section > Language Level > Select level 8
5. Add Run Configuration: Run > Edit Configurations > Click on Add button > JUnit > Name it "Run test" > On the "Test Type" field select "All in package" > On the "Package" field type "vn.kms.course.selenium.tests"
6. Select above configuration and run
  


# Write tests
These cases are to test the (legacy) PA system, it's deployed at http://192.168.74.25/patest.


## Deadlines Setting in home page:
1. Login to PA system using valid information: daitran/kms.
2. Verify that user is at home page.
3. Verify that the Deadlines Setting data is correct. Some suggested validation points are:
   * The **number of rows** in table is correct.
   * The **content of Description column** is correct.
   * The **deadline of below row** is **not earlier** than in **its above row**.


## Create Feedback UI:
1. Login to PA system using valid information: daitran/kms.
2. Verify that user is at homepage.
3. Go to Create Feedback page.
4. Verify Create Feedback page UI. Some suggested validation points are:
  * The default value of **Provide FB** for is _Myself_
  * The default value of **Feedback Type** is _Short feedback_
  * The default value of **For date** is _current date_
  * There are **two tabs**: _Content_ and _Attachments_ 
After finishing those test cases, if you still want to practice more, write out some test cases for the PA system, including the detailed test steps and validation points (I think it's easy since... you're testers, right? Writing test cases is what you do in your daily job) and then try to automate them.
   

# Some suggestions

* Apply [POM](https://www.guru99.com/page-object-model-pom-page-factory-in-selenium-ultimate-guide.html) to manage your code
* Try to avoid duplicate code (Tips: When you're using Ctrl+C/Ctrl+V, maybe you're duplicating code)

# Commit code
* Commit your code and push it to your repository (`git add .`, `git commit` and `git push` )
* Add Phuong Lam to your project with developer role: On the project page, click on Setting button > Members > Search for Phuong Lam > Select "Developer" for "Project Access" field > Click on Add users to project
* Inform her through email or Skype

# Contact
If you need to ask something, feel free to get Phuong at:
* Skype: phuonglm94
* Email: phuonglam@kms-technology.com
* Work location: 8.30TS



