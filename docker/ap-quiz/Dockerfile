FROM openjdk:11.0.7

MAINTAINER Gibbon TEAM

RUN mkdir /opt/ap-quiz
ADD files/webservice.jar /opt/ap-quiz/
WORKDIR /opt/ap-quiz

EXPOSE 9191

CMD ["java","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=9191","-jar","webservice.jar","--debug"]
