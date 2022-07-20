
pipeline {
    agent{  any
         }
    
    stages {
        stage('Build') {
            steps {
                bat 'javac client.java'
            }
        }
        stage('Run') {
            steps {
                bat 'java Client'
            }
        }
    }
}
