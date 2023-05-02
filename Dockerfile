# Use a Java development kit as a base image
FROM openjdk:20-slim-buster

# Set the working directory to /app
WORKDIR /app

# Copy the application source code to the container
COPY . /app

# Install Maven for building the application
RUN apt-get update && apt-get install -y maven

# Build the application
RUN mvn clean package

# Expose port 8080 for the application
EXPOSE 8080

# Compile the Java source file
RUN javac -d target src/main/java/plates/backend/CustomPlatesApplication.java

# Start the Spring Boot application when the container starts
CMD ["java", "-cp", "target", "plates.backend.CustomPlatesApplication"]
