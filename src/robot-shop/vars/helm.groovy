stage('Install Helm') {
    steps {
        sh "cd /var/lib/jenkins/workspace/kube-deploy-rs-01/robot-shop/K8s/helm && helm install robot-shop -n robot-shop ."
    }
}
