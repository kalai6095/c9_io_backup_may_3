#FROM java:8-jdk-alpine
#COPY ./target/work_rep-0.0.1-SNAPSHOT.jar /usr/app/
#WORKDIR /usr/app
#RUN sh -c 'touch work_rep-0.0.1-SNAPSHOT.jar'
#ENTRYPOINT ["java","-jar","work_rep-0.0.1-SNAPSHOT.jar"]
#Ref
#1. https://www.katacoda.com/courses/docker/deploying-first-container
#2. https://github.com/ONLYOFFICE/Docker-DocumentServer/blob/master/Dockerfile

FROM ubuntu:16.04
LABEL maintainer Kalaiselvan A <kalai6095@gmail.com>

ENV LANG=en_US.UTF-8 LANGUAGE=en_US:en LC_ALL=en_US.UTF-8 DEBIAN_FRONTEND=noninteractive

RUN echo "#!/bin/sh\nexit 0" > /usr/sbin/policy-rc.d && \
    apt-get -y update && \
    apt-get -yq install wget apt-transport-https curl locales && \
    apt-key adv --keyserver keyserver.ubuntu.com --recv-keys 0x8320ca65cb2de8e5 && \
    locale-gen en_US.UTF-8 && \
    curl -sL https://deb.nodesource.com/setup_8.x | bash - && \
    apt-get -y update && \
    apt-get -yq install \
    adduser \
    libcurl3 \
    nodejs \
    mysql \
    maven \
    sudo \
    net-tools \
    nano \
    supervisor \
    sudo mysql CREATE USER 'newuser'@'localhost' IDENTIFIED BY 'password';
