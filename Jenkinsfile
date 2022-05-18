pipeline{
    environment{
      registry = "felbohemia/braintrainer"
      registryCredential = 'dockerhub_id'
      dockerImage = ''
    }
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
       stage("Package"){
          steps{
             sh "./mvnw package" 
          }        
       }
       stage("Initialize"){
        def dockerHome = tool 'myDocker'
        env.PATH = "${dockerHome}/bin:${env.PATH}"
       }
       stage("Docker build"){
          steps{
             script{
               dockerImage = docker.build registry + "$BUILD_NUMBER"
             }
          }        
       }
       stage("Docker push"){
          steps{
             script{
               docker.withRegistry('', registryCredential){
                dockerImage.push()
               }
             }
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
