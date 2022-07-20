pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                bat 'javac test.java'
            }
        }
        stage('Run') {
            steps {
               bat 'java Test'
        }
    }
  } 
}
