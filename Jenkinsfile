pipeline {
    agent any
    stages {
        stage('maven-build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('docker-build') {
             steps {
                 sh 'mvn docker:build'
              }
         }
    }
}
