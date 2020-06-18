FROM openjdk:11.0.7

MAINTAINER Gibbon TEAM

RUN mkdir /opt/ap-quiz
ADD target/ap-quiz.jar /opt/ap-quiz/
WORKDIR /opt/ap-quiz
COPY /src/main/resources/application-prod.properties /opt/ap-quiz/config/application.properties

EXPOSE 9191 8080

CMD ["java","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=9191","-jar","ap-quiz.jar","--debug"]
