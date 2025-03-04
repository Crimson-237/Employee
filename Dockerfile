FROM eclipse-temurin:21 AS builder
WORKDIR workspace

ARG JAR_FILE=target/employee-service.jar
COPY ${JAR_FILE} employee-service.jar

RUN java -Djarmode=layertools -jar employee-service.jar extract

FROM eclipse-temurin:21
RUN useradd spring
USER spring

WORKDIR workspace
COPY --from=builder workspace/dependencies/ ./
COPY --from=builder workspace/spring-boot-loader/ ./
COPY --from=builder workspace/snapshot-dependencies/ ./
COPY --from=builder workspace/application/ ./
ENTRYPOINT ["java", "org.springframework.boot.loader.JarLauncher"]
