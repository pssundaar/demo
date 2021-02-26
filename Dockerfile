From openjdk:8
ADD target/docker-Springboot.jar docker-Springboot.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "docker-Springboot.jar"]