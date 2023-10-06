FROM openjdk:17
COPY ./ /tmp
WORKDIR /tmp
ENTRYPOINT ["./gradlew","run"]