FROM eclipse-temurin:21

WORKDIR /app

# 빌드된 JAR 파일을 Docker 이미지에 추가
COPY build/libs/demo-0.0.1-SNAPSHOT.jar app.jar

# 애플리케이션을 실행하기 위한 명령어 설정
ENTRYPOINT ["java", "-jar", "/app/app.jar"]