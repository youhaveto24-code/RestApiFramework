pipeline {
agent any


tools {
    maven 'Maven'
}

stages {

    stage('Checkout Code') {
        steps {
            git 'https://github.com/youhaveto24-code/RestApiFramework.git'
        }
    }

    stage('Build & Run Tests') {
        steps {
            sh 'mvn clean test'
        }
    }

}

post {

    success {
        echo 'Tests Passed Successfully!'
    }

    failure {
        echo 'Tests Failed!'
    }
}


}
