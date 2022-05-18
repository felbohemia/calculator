FROM openjdk:11
ENV DOCKERVERSION=18.03.1-ce
RUN curl -fsSLO https://download.docker.com/linux/static/stable/x86_64/docker-${DOCKERVERSION}.tgz \
  && tar xzvf docker-${DOCKERVERSION}.tgz --strip 1 \
                 -C /usr/local/bin docker/docker \
  && rm docker-${DOCKERVERSION}.tgz

COPY ./target/calculator-0.0.1-SNAPSHOT.jar /app/
WORKDIR /app/
EXPOSE 8080
CMD ["java", "-jar", "calculator-0.0.1-SNAPSHOT.jar"]



