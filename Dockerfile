FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY Hello.java .

RUN javac Hello.java

ENTRYPOINT ["java", "Hello"]
