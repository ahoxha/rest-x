FROM adoptopenjdk:11

LABEL author="Armend Hoxha"

RUN mkdir /opt/app

COPY . /opt/app

WORKDIR /opt/app

run ./gradlew build

ENTRYPOINT ["java","-jar","build/libs/rest-x-0.0.1-SNAPSHOT.jar"]
