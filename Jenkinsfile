pipeline {
    agent any
    stages {
        stage('BUILD') {
            steps {
                echo 'BUILDED'
            }
        }
        stage('DEPLOY') {
            steps {
                echo 'DEPLOYED'
            }
        }
        stage('TEST') {
            steps {
                bat 'mvn test -Dtest="RestAssuredTest1,RestAssuredTest2,RestAssuredTest3,RestAssuredTest4"'
                echo 'TESTED'
            }
        }
        stage('RELEASE') {
            steps {
                echo 'RELEASED'
            }
        }
    }
}
