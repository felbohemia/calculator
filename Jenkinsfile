pipeline{
    agent any
    triggers {pollSCM('* * * * *')}
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
    
    post{
        always {
             mail to: 'fmfelbohemia@gmail.com',
             subject: "Completed Pipeline: ${currentBuild.fullDisplayName}",
             body: "Your build completed, please check: ${env.BUILD_URL}"
    
        } 
     }
}
