pipeline {
    agent any
    tools {
        maven 'Maven 3.8.4'
        jdk 'jdk11'
    }
    stages {
        stage('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }
        stage('Build') {
            steps {
                echo 'Building...'
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
            }
        }
        stage('Deploy') {
            when {
                branch '*/deploy'
            }
            steps {
                echo 'Deploying...'
            }
        }
    }
}