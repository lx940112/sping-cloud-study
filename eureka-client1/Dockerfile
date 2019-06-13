FROM jdk:1.8
VOLUME /tmp
ADD target/eureka-client1-0.0.1-SNAPSHOT.jar eureka-client1.jar
EXPOSE 8762
ENTRYPOINT [ "java","-jar","/eureka-client1.jar" ]