pipeline {
    agent any

    stages {
        stage('Clone Github repository') {
            steps {
                git 'https://github.com/hhoang262/aws-code-pipeline.git'
            }
        }
        stage('Clean project before build') {
            steps {
                sh './gradlew clean'
            }
        }
        stage('Starting build the project') {
            steps {
                sh './gradlew build'
            }
        }
        stage('Publish to docker hub personal') {
            steps {
                withDockerRegistry(credentialsId: '312d534c-e1fa-474a-b89c-3fb76f48720f', url: 'https://index.docker.io/v1/'){
                    sh 'docker ps'
                    sh 'docker build -t hoanghahuy2602/demo-pipeline:lastest .'
                    sh 'docker push hoanghahuy2602/demo-pipeline:lastest'
                }
            }
        }
    }
}