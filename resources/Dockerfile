# Use an official nginx runtime as a base image
FROM nginx:latest

# Copy the custom HTML file to the nginx document root
COPY /opt/example/index.html /usr/share/nginx/html

# Expose port 80 to the outside world
EXPOSE 80

# Command to run the web server
CMD ["nginx"]