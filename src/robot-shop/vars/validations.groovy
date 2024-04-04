stage('Validation') {
    steps {
        sh 'kubectl get svc -n robot-shop'
        sh 'kubectl get pods -n robot-shop'
    }
}