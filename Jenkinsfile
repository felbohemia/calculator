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
             sh "./mvnw verify"     
          }
       }
    }
}