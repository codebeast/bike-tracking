pipeline {
    agent none
    stages {
        stage('build') {
            steps {
                sh 'mvn --clean --install'
            }
        }
    }
}
