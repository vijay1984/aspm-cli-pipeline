import groovy.json.JsonSlurper

pipeline {
    agent any

    stages {
        stage('Checking Security Credentials ASPM CLI') {
           steps {
               script {
                echo "${apiKey}"
               }
            }
        }

        stage('Accessing ASPM ClI') {
            steps {
               script {
                def token = "http://host.docker.internal:8085/resultapi/aws/ecr/token"
                def curl_output = sh returnStdout: true, script: "curl -s ${token}"
                def slurped = new JsonSlurper().parseText("${curl_output}")
                echo slurped.password
               }
            }
        }
    }
}
