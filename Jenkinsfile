pipeline {
    agent any
    tools {
        maven 'mvn3_6'
        jdk 'jdk8'
    }
    stages {
        stage ('Initialize') {
            steps {
                echo 'HELLO WORLD'
            }
        }

        stage ('Build') {
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true install' 
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                }
            }
        }
    }
}
