def ipadress = null
def path = null
pipeline {
    agent any
    
    parameters{
        string(name: 'HOST_NAME' , defaultValye: ' ', description: ' The host name'),
        sstring(name: 'PATH' , defaultValue: ' ' , description: 'The path'),
                                                          }
    stages {
        stage('Build') {
            steps {
                bat 'javac client.java'
            }
        }
        stage('Run') {
            steps {
                echo "$ipadress $path"
                bat 'java Client "${HOSTֹֹֹ_NAME}" "${PATH}"'
            }
        }
    }
}
