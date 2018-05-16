node('master'){

        /* option apply to build */
        options {
            timestamps() 
        }
        
        stage('Checkout') {
            checkout scm
        }
        
        stage('Build') {
            def project_path = "test pipeline"
        }
        
        stage('Execute') {
            sh 'mvn install'
        }
        
        stage('Archival') {
            publishHTML([allowMissing: true, 
                        alwaysLinkToLastBuild: true, 
                        keepAll: true, 
                        reportDir: 'target/surefire-reports/', 
                        reportFiles: 'index.html', 
                        reportName: 'HTML Report', 
                        reportTitles: ''])
            
            junit allowEmptyResults: true, 
                testResults: 'target/surefire-reports/TEST*.xml'

            
            archiveArtifacts 'target/*.jar'
        }
    }

input 'Deploy to stage environment?'
stage name:'Deploy'
node('master') {
    echo 'Deployment is done successfully'

}
