# 1. Java 11 기반 이미지 사용
FROM openjdk:11-jre-slim

# 2. 프로젝트의 JAR 파일을 도커 이미지에 복사
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# 3. 애플리케이션 실행
ENTRYPOINT ["java", "-jar", "/app.jar"]

# 4. 포트 열기 (Spring Boot 프로젝트 포트 8000)
EXPOSE 8000
