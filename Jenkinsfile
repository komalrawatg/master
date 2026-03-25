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

        stage('Run Tests') {
            steps {
                bat 'mvn test'
            }
        }

      stage('Generate Report') {
          steps {
              bat 'mvn surefire-report:report'
          }
      }

      stage('Publish Report') {
          steps {
              publishHTML([
                  reportDir: 'target/site',
                  reportFiles: 'surefire-report.html',
                  reportName: 'Test Report'
              ])
          }
      }
    }
}