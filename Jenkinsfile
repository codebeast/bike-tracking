pipeline {
    agent any
    stages {
        stage('maven-build') {
            steps {
                sh 'sudo mvn clean install'
            }
        }
        stage('docker-build') {
             steps {
                 sh 'sudo mvn docker:build docker:push
              }
         }
    }
}
