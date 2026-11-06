pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out source code from GitHub...'

                git branch: 'main',
                    url: 'https://github.com/sahithisirikonda01/DevOps_week5.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Compiling Java files...'
                bat 'javac factorial.java TestFactorial.java'
            }
        }

        stage('Test') {
            steps {
                echo 'Running factorial test...'
                bat 'java TestFactorial'
            }
        }

        stage('Run') {
            steps {
                echo 'Running factorial program...'
                bat 'java factorial'
            }
        }

        stage('Package') {
            steps {
                echo 'Creating JAR file...'

                bat 'jar cfm factorial.jar manifest.txt factorial.class TestFactorial.class'

                archiveArtifacts artifacts: 'factorial.jar',
                    fingerprint: true
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully!'
        }

        failure {
            echo 'Pipeline failed!'
        }
    }
}