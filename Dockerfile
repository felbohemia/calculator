FROM openjdk:11
COPY ./target/calculator-0.0.1-SNAPSHOT.jar /app/
WORKDIR /app
EXPOSE 8180
CMD ["java", "-jar", "calculator-0.0.1-SNAPSHOT.jar"]


