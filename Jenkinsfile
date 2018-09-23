pipeline {
    agent any
    tools {
        maven 'localMaven'
        JDK 'local_jdk'
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
            post {
                success {
                    echo 'Archive artifacts ... '
                    archiveArtifacts artifacts: '**/target/*.war'
                    echo ' ... done!'
                }
            }
        }
    }
}