pipeline {
    agent any

    stages {
        stage('Clone Github repository') {
            steps {
                git 'https://github.com/hhoang262/aws-code-pipeline.git'
            }
        }
        stage('Build') {
            steps {
                echo 'Start building project with gradlew'
            }
            steps {
                sh './gradlew assemble'
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