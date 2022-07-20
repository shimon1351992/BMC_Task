
pipeline {
    agent  any
         
    
     parameters{
        string(name: 'HOSTNAME' , defaultValue: '192.168.56.1', description: ' The hostname')
        string(name: 'PATH1' , defaultValue: 'C:/WINDOWS' , description: 'The directory path')
    }
    
    stages {
        stage('Build') {
            steps {
                bat 'javac client.java'
            }
        }
        stage('Run') {
            steps {
              bat """
              java Client ${HOSTNAME} ${PATH1}
              """
            }
        }
    }
}
