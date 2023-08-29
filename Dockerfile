FROM eclipse-temurin:17
COPY target/webdev.jar webdev.jar
CMD ["java","-jar","webdev.jar"]