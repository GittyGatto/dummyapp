FROM openjdk:8
COPY ./target/dummyApp.war /usr/src/dummyApp/
WORKDIR /usr/src/dummyApp
EXPOSE 8080
CMD ["java", "-jar", "dummyApp.war"]