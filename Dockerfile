FROM eclipse-temurin:21-jdk
COPY target/springboot-images-new.jar springboot-images-new.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","springboot-images-new.jar"]