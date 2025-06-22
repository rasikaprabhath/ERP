# Use official Tomcat base image with OpenJDK
FROM tomcat:9.0-jdk11-openjdk

# Remove default webapps (optional cleanup)
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy built WAR file to ROOT.war (to access via / URL)
COPY target/erp-sales.war /usr/local/tomcat/webapps/ROOT.war

# Expose Tomcat port
EXPOSE 8080

# Start Tomcat server
CMD ["catalina.sh", "run"]
