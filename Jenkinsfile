pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat "mvn build"
            }
        }
        stage('Test') {
            steps {
                bat "mvn test"
            }
        }
        stage('Package') {
            steps {
                bat "mvn package"
            }
        }
        stage('Deploy') {
            steps {
                echo 'deploy'
            }
        }
    }
}
