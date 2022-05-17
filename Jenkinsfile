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
         success {
             mail to: 'fmfelbohemia@gmail.com',
             subject: "Completed Pipeline: ${currentBuild.fullDisplayName}",
             body: "Your build completed successfully "
    
         }
         failure{
           
           mail to: 'fmfelbohemia@gmail.com',
             subject: "Completed Pipeline: ${currentBuild.fullDisplayName}",
             body: "Your build failed with errors, work on it and re-push "
         }
       
     }
}
