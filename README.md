# city-explorer

*****IMPORTANT - Please read fully. 

This app will do the one thing asked in the challenge and will do it well.

If you require fast performance or "what if there are 100 million cities" then this approach may or may not work, depending on JVM settings, hardware etc. 

About SWAGGER
https://github.com/springfox/springfox/issues/2932
Swagger WILL NOT work just by adding dependencies, its a known issue. With more time some workaround can be found. So commenting out @Configuration and @EnableSwagger2 annotations.Also commented out the swagger related dependencies in pom.xml

In other words, the harness and classes are there, but it will not create the Swagger magic. 

****IMPORTANT
lombok.jar
This project uses Project Lombok for Getters/Setters, log etc. Depending on your IDE, you will need Lombok to be integrated, else the IDE will complain. 

****IMPORTANT
How to run the app?
The target folder has an executable jar. On a machine with JDK/JRE 8, run the following command from a command line...
java -jar cityexplorer-0.0.1-SNAPSHOT.jar 

****IMPORTANT
How to check the API end point?
Use Postman or Browser to listen to localhost:9000/city-explorer/connected?origin=trenton&destination=albany
The port is 9000 as I had other apps, and while packaging forgot to change, and there is a contextPath, a good practice for any app. 

