FROM openjdk:8-jdk-alpine
MAINTAINER Sanjeev Kulkarni "sanjeev.pk@gmail.com"
VOLUME /tmp
ADD */target/*app*.jar app1.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app1.jar"]