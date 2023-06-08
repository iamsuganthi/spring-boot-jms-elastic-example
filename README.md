Create elastic properties file:

```
touch src/main/resources/elasticapm.properties
```

Paste the following lines into the above mentioned file.

```
service_name=jms-demo
server_url=APM_SERVER_URL
secret_token=SECRET_TOKEN
```

To start the app:
Run ActiveMQ:
 ```
 docker run -p 61616:61616 -p 8161:8161 rmohr/activemq:5.14.3
 ```

Start the Spring boot app:

  ```
  mvn spring-boot:run
  ```
