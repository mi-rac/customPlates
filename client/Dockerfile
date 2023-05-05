# Use the official Node.js base image
FROM node:14.17.6-alpine

# Set the working directory
WORKDIR /client

# Copy package.json and package-lock.json
COPY client/package*.json ./

# Install dependencies
RUN npm install

# Copy the rest of the application files
COPY client/ .

# Expose port 3000
EXPOSE 3000

# Start the application
CMD ["npm", "start"]
