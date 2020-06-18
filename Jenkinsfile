pipeline {
    agent any

    stages {
        stage ('Check Docker Availability') {
            steps {
                sh "docker version"
            }
        }
        stage ('Compile Stage') {
            steps {
                withMaven(maven: 'maven_3_6_3') {
                    sh 'mvn clean compile'
                }
            }
        }

        stage ('Testing Stage') {
            steps {
                withMaven(maven: 'maven_3_6_3') {
                    sh 'mvn test'
                }
            }
        }

        stage ('Install Stage') {
            steps {
                withMaven(maven: 'maven_3_6_3') {
                    sh 'mvn install'
                }
            }
        }

        stage ('Docker Build') {
            steps {
                sh 'docker-compose build'
            }
        }

        stage ('Docker Up Compose') {
            steps {
                sh 'docker-compose stop'
                sh 'docker-compose up -d'
            }
        }
    }
}