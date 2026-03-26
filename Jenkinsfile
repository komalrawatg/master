pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'JDK'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/komalrawatg/master.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Run Tests & Generate Report') {
             steps {
                 bat 'mvn clean test site'
             }
         }
     stage('Publish Report') {
         steps {
            publishHTML(target: [
                allowMissing: false,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'target/site',
                reportFiles: 'surefire-report.html',
                reportName: 'Test Report',
                includes: '**/*'
            ])
         }
     }
    }
}