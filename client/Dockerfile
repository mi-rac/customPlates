# Use the official Node.js base image
FROM node:14-alpine

# Set the working directory
WORKDIR /client

# Copy package.json and package-lock.json
COPY package*.json ./

# Install dependencies
RUN npm install

# Copy the rest of the application files
COPY src/ ./src/
COPY public/ ./public/

# Build the production version of the React app
RUN npm run build

# Expose port 3000
EXPOSE 3000

# Start the application
CMD ["npm", "start"]
