# Use an appropriate base image for Java
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/Orange-0.0.1-SNAPSHOT.jar /app/Orange.jar

# Expose the port that the application runs on
EXPOSE 8080

# Define the command to run the JAR file
ENTRYPOINT ["java", "-jar", "Orange.jar"]
