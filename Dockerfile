FROM java:8 
WORKDIR /tmp
#RUN sh -c 'cd  /tmp && ls'
COPY /home/travis/build/sachiniWickramaratne/vehicle_service/target/vehicle-service-0.0.1-SNAPSHOT.jar  /customer-service.jar
RUN sh -c 'touch /customer-service.jar'
EXPOSE 8081
ENTRYPOINT [ "sh", "-c", "java -Xms64m -Xmx512m -XX:+UseTLAB -XX:+ResizeTLAB -XX:ReservedCodeCacheSize=128m  -XX:+UseCodeCacheFlushing  -jar  customer-service.jar" ]
