pipeline {
    agent any
      tools {
        'org.jenkinsci.plugins.docker.commons.tools.DockerTool' '18.09'
      }
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

        stage ('Deployment Stage') {
            steps {
                withMaven(maven: 'maven_3_6_3') {
                    sh 'mvn deploy'
                }
            }
        }
    }
}