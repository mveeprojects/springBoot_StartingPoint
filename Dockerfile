FROM openjdk:8-jdk-alpine

MAINTAINER Mark

VOLUME /tmp

ENV DIRPATH /usr/bin

ADD ./target/springbooted-1.0-SNAPSHOT.jar /usr/bin/app.jar
ADD ./jmx_exporter/config.yaml $DIRPATH/config.yaml
ADD ./jmx_exporter/jmx_prometheus_javaagent-0.2.0.jar $DIRPATH/jmx.jar

ENTRYPOINT exec java -javaagent:$DIRPATH/jmx.jar=1234:$DIRPATH/config.yaml -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.port=9010 -Dcom.sun.management.jmxremote.local.only=false -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false -jar /usr/bin/app.jar
