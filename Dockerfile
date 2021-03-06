FROM adoptopenjdk/openjdk15:ubi
ARG JAR_FILE=target/*.jar
ENV BOT_NAME=test_javarush_tony_bot
ENV BOT_TOKEN=1610667210:AAGIeIlljBualXGWrxhBx5nNQ67NwOIiGxU
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Dbot.username=${BOT_NAME}", "-Dbot.token=${BOT_TOKEN}", "-jar", "/app.jar"]



#RUN mkdir /opt/app
#COPY japp.jar /opt/app
#CMD ["java", "-jar", "/opt/app/japp.jar"]