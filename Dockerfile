# Use a base image with JDK
FROM openjdk:17-jdk

# Set the working directory
WORKDIR /app

# Copy the jar file into the container
COPY target/myapp.jar /app/myapp.jar

# Expose port 8080 for the application
EXPOSE 8080

# Define the command to run the application
CMD ["java", "-jar", "myapp.jar"]
