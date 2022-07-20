
pipeline {
    agent any
    
    parameters{
        string(name: 'HOSTNAME' , defaultValue: ' ', description: ' The hostname')
        string(name: 'PATH' , defaultValue: ' ' , description: 'The directory path')
    }
    stages {
        stage('Build') {
            steps {
                bat 'javac client.java'
            }
        }
        stage('Run') {
            steps {
                bat 'java Client "${HOSTֹֹֹNAME}" "${PATH}"'
            }
        }
    }
}
