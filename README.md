## Welcome to Blogging Platform ##

A blogging platform is a software or service that allows users to create, manage, and publish blogs. It provides the necessary tools and infrastructure to write content, upload media, customize the look and feel of the blog, and share posts with an audience. 

# Built using 

Java
Spring Boot(Framework)

# Prerequsites for running the application in local

1. Git installed in your machine to clone the repository.
   Installation Url: https://git-scm.com/downloads

2. Java installed in your machine.ex:jdk 21.
   Installation Url: https://www.openlogic.com/openjdk-downloads

3. Apache Maven installed in your machine ex:3.8 or higher.
   Installation Url: https://maven.apache.org/download.cgi

4. Any editor to run the code base ex:Eclipse,intelliJ IDEA.
   Installation Url: https://www.eclipse.org/downloads/  
                     https://www.jetbrains.com/idea/download/?section=windows

5. Spring tool suite installled in your IDE for running the application as a spring boot application.

6. Mongodb atlas for creating cluster and database.

7. Postman for testing the API's.
   Installation Url: https://www.jetbrains.com/idea/download/?section=windows

# Data Model

 POST Entity: Title,Body,Author,Timestamps
 Comment Entity: Body,Author,PostID,Timestamps

# Steps to start the Application

1. Clone the project from the Git repository
   Command: git clone -b develop https://github.com/Vijethabgithub/bloggingApplication.git

2. Open IDE and import the project has a Maven project.

3. Open Application.properties file and provide the  necessary details related to DB connection and server port.

4. Maven update the project.

5. Build the project through IDE or Using command.
   Command:  mvn clean -Dmaven.test.skip=true install

6. Run the application as a Spring  Boot Application.

7. Use Postman to test the end points.
   Save Post Details: http://localhost:7000/posts
   Get Post Details: http://localhost:7000/posts
   Get Post By Id: http://localhost:7000/posts/{postId}
   Delete Post By Id: http://localhost:7000/posts/{postId}
   Update Post By Id: http://localhost:7000/posts/{postId}
   Save Comment By PostId: http://localhost:7000/posts/comments/{postId}
   Get Comment By PostId: http://localhost:7000/posts/comments/{postId}

# Project Link

Github url: https://github.com/Vijethabgithub/bloggingApplication
Branch: develop


