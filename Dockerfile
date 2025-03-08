FROM gradle:7.1-jdk11 AS build

WORKDIR /app

COPY build.gradle settings.gradle ./
COPY src ./src

RUN gradle build --no-daemon

FROM openjdk:17-slim

WORKDIR /app

ENV APP_NAME=performance-jvm
ENV JAR_FILE=${APP_NAME}-0.0.1-SNAPSHOT.jar

COPY --from=build /app/build/libs/${JAR_FILE} /app/${APP_NAME}.jar

ENTRYPOINT ["java", "-jar", "/app/performance-jvm.jar"]

EXPOSE 8080