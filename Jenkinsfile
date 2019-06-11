pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-p 8002:8002' 
        }
    }
    stages {
        stage('Construccion') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
	stage('Pruebas') { 
            steps {
                sh 'mvn test' 
            }
	    post {
                always {
                	junit 'target/surefire-reports/*.xml'
		} 
            }
        }
	stage('Entrega') { 
            steps {
                sh './jenkins/scripts/deliver.sh' 
            }
        }
    }
}
