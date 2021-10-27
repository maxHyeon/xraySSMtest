FROM openjdk:8-jdk-alpine
#cp /Users/maxhyeon/.m2/repository/com/example/test-api/0.0.1-SNAPSHOT/*.jar app.jar
COPY target/xraySSMtest*.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]