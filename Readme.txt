This project is done using Java 8, Springboot framework,Jpa repository,database is PostgreSql, IDE is sts  version is 4.4.12.1,Postman

Requirements: 
1. Install sts of above version in your C drive make sure it has a separate folder just inside the drive. Don't try to install in you user or program files

2. Install java 8 or jdk 1.8 is globally and take a copy of it and paste it where your sts folder is.

3. Install PostgreSQL. When you opened or opened servers it it need password(0000) after that create a database name as akash and then right click on it and go to restore then choose the file that i gave you name as akashUser.
	If this show this error 'Utility file not found. Please correct the Binary Path in the Preferences dialog' Please go to this link('https://stackoverflow.com/questions/69544583/utility-file-not-found-please-configure-the-binary-path-in-the-preferences-dial') and do as it same.

4. These steps are important to do database operations. The akashUser file is not include inside this project please copy and paste it on your desktop and remove from this file from inside project.

5. Install Postman and do required this like login.Then use this url localhost:8080/users.

6. Now open sts and click on file(top left corner) > import > choose the folder of my project. After import run it as a java application. when servers got run got to poastman and do operations.

 7. I don't use SQLite database due to some issue with dialect and the version of hibernate by which it is not compatible with dialect. Please do ask if anything is not going well.
