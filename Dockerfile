FROM openjdk:11
EXPOSE 8080
ADD build/libs/aws-code-pipeline-0.0.1-SNAPSHOT-plain.jar aws-code-pipeline-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/aws-code-pipeline-0.0.1-SNAPSHOT.jar"]