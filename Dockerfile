FROM java:8 
COPY target/customerService-0.0.1-SNAPSHOT.jar  customer-service.jar
EXPOSE 8081
ENTRYPOINT [ "sh", "-c", "java -Xms64m -Xmx512m -XX:+UseTLAB -XX:+ResizeTLAB -XX:ReservedCodeCacheSize=128m  -XX:+UseCodeCacheFlushing  -jar  customer-service.jar" ]
