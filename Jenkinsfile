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
         Success {
             mail to: 'fmfelbohemia@gmail.com',
             subject: "Completed Pipeline: ${currentBuild.fullDisplayName}",
             body: "Your build completed successfully "
    
         }
         Failure{
           
           mail to: 'fmfelbohemia@gmail.com',
             subject: "Completed Pipeline: ${currentBuild.fullDisplayName}",
             body: "Your build failed with errors, work on it and re-push "
         }
       
     }
}
