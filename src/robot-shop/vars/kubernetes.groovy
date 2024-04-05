def call() {
    stage('Kubernetes') {
        steps {
            script {
                // Define the kubeconfig path
                def kubeconfigPath = '/root/.kube/config'

                // Use withKubeConfig step to define kubeconfig
                withKubeConfig(kubeconfigPath) {
                    // Your Kubernetes-related steps here
                    sh 'kubectl get nodes'
		    sh 'kubectl get svc -n robot-shop'
                }
            }
        }
    }
}

