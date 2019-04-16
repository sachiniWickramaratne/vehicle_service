FROM java:8 
VOLUME /tmp
#RUN sh -c 'cd  /tmp && ls'
COPY target/customerService-0.0.1-SNAPSHOT.jar  /tmp/customer-service.jar
EXPOSE 8081
ENTRYPOINT [ "sh", "-c", "java -Xms64m -Xmx512m -XX:+UseTLAB -XX:+ResizeTLAB -XX:ReservedCodeCacheSize=128m  -XX:+UseCodeCacheFlushing  -jar  /tmp/customer-service.jar" ]
