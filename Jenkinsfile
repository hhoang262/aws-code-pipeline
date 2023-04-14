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
        stage('Starting build and test the project') {
            steps {
                sh './gradlew build'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}