pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'sudo chmod -R 777 .'
                sh './mvnw package'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
    }
}
