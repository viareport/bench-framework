pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                input 'Promote to Release candidate?'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                input 'Promote to Release?'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}