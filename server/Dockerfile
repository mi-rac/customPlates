# Use the official Maven base image with OpenJDK 11
FROM maven:3.8.3-openjdk-11

# Set the working directory
WORKDIR /server

# Copy the pom.xml and source files
COPY server/pom.xml ./
COPY server/src ./src

# Build the application
RUN mvn -f pom.xml clean package -DskipTests

# Run the application
CMD ["mvn", "exec:java"]

# Expose port 8080
EXPOSE 8080