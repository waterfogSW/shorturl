FROM openjdk:17-jdk
ARG JAR_FILE="build/libs/*.jar"
COPY ${JAR_FILE} shorturl.jar
ENTRYPOINT ["java", "-jar","/shorturl.jar"]
