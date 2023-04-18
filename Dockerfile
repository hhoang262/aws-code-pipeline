FROM openjdk:11
EXPOSE 80
ADD build/libs/aws-code-pipeline-0.0.1-SNAPSHOT-plain.jar aws-code-pipeline-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/aws-code-pipeline-0.0.1-SNAPSHOT.jar"]