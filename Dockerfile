# Use a Java 17 development kit as a base image
FROM openjdk:17-jdk-buster

# Set the working directory to /src
WORKDIR /src

# Copy the application source code to the container
COPY . /src
COPY wait-for-postgres.sh /wait-for-postgres.sh

# Install Maven for building the application
ENV MAVEN_VERSION 3.8.2
RUN curl -fsSL https://archive.apache.org/dist/maven/maven-3/$MAVEN_VERSION/binaries/apache-maven-$MAVEN_VERSION-bin.tar.gz | tar xzf - -C /opt \
    && ln -s /opt/apache-maven-$MAVEN_VERSION /opt/maven
ENV PATH="/opt/maven/bin:${PATH}"

# Set script to be executable
RUN chmod +x /wait-for-postgres.sh

# Build the application
RUN mvn clean package

# Expose port 8080 for the application
EXPOSE 8080

# Start the Spring Boot application when the container starts
CMD /wait-for-postgres.sh db java -cp target plates.backend.CustomPlatesApplication
