def ipadress = null
def path = null
pipeline {
    agent any
    stages {
           stage('input') {
            steps {
                script{
                    ipadress = input(
                        message: 'what is the ipadress?',
                        ok:'submit',
                        parameters: [string(defaultValue: ' ', name: 'ip_adress', trim: true)]
                        )
                     path = input(
                        message: 'what is the ipadress?',
                        ok:'submit',
                        parameters: [string(defaultValue: ' ', name: 'path', trim: true)]
                        )
                }
               '
            }
        }
        stage('Build') {
            steps {
                bat 'javac client.java'
            }
        }
        stage('Run') {
            steps {
                bat 'java Client $ipadress $path'
            }
        }
    }
}
