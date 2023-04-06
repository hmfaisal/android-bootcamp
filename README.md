## About the project
A demo project to learn android app development with kotlin, Jetpack compose

### Built With

Major framework, tools used at this project

* ![kotlin](https://img.shields.io/badge/Kotlin-0095D5?&style=for-the-badge&logo=kotlin&logoColor=white)
* ![Jetpack Compose](https://img.shields.io/static/v1?style=for-the-badge&message=Jetpack+Compose&color=4285F4&logo=Jetpack+Compose&logoColor=FFFFFF&label=)
* ![intellij](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
* ![android studio](https://img.shields.io/badge/Android_Studio-3DDC84?style=for-the-badge&logo=android-studio&logoColor=white)


## Getting started

### Setting up Dev

This section is based on all installation / setting up environment on Mac machine.

#### Install homebrew if not installed yet
To install Homebrew on macOS, Open Terminal application in macOS and run the below command.
```shell
/bin/bash -c “$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```
After this completes, we can use homebrew to install available formulae or cask with just one line commands **brew install xxxx or brew install --cask xxxx**

#### Install Java
Open Terminal application in macOS and run the below command to see available java installation option
```shell
brew search --formulae java.
```
Now run the below commnad to install openjdk latest version
```shell
brew install openjdk
```
This will install java on our mac. to check the current java version type in terminal
```shell
java -version
```
But currently this will show us **"Unable to locate a Java Runtime. Please visit http://www.java.com for information on installing Java."**
To fix this open the terminal and run the following command:
```shell
sudo ln -sfn /usr/local/opt/openjdk/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk.jdk
```
Now java -version will show us the openjdk version installed on our mac

#### Xcode troubleshooting
After the updating of Mac ventura, it might happen that, if you are running git from your terminal, it will show an error **"xcrun: error: invalid active developer path (/Library/Developer/CommandLineTools)"**. Its telling that Xcode Command-line Tools needs to be updated due to OS update. to fix this issue. To solve this Log in or sign up here:

https://developer.apple.com/download/more/

Look for: "Command Line Tools for Xcode 14.x" in the list of downloads Then click the dmg and download.

### Building


### Deploying / Publishing
