FROM adoptopenjdk:11 AS buildstage
RUN mkdir /opt/app
COPY . /opt/app
WORKDIR /opt/app
run ./gradlew build

FROM adoptopenjdk:11-jre AS prodstage
LABEL author="Armend Hoxha" maintainer="Armend Hoxha"
RUN mkdir /opt/app
WORKDIR /opt/app
COPY --from=buildstage /opt/app/build/libs/ .
ENTRYPOINT ["java","-jar","rest-x-0.0.1-SNAPSHOT.jar"]
