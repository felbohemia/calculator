pipeline{
    agent any
    stages{
    
        stage("Build"){
            steps{
                sh "./mvnw compile"
            }
        }
        stage("Unit test"){
            steps{
                sh "./mvnw test"
            }
        }
        
       stage("Code coverage") {
        steps {
             sh "./mvnw jacocoTestReport"
             publishHTML (target: [
                  reportDir: 'build/reports/jacoco/test/html',
                  reportFiles: 'index.html',
                  reportName: "JaCoCo Report"
               ])
             sh "./mvnw jacocoTestCoverageVerification"
          }
       }
    }
}