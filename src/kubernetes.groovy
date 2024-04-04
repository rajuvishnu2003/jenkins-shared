def call() {
   stage('Kubernetes status') {
      steps {
         sh 'kubectl version'
         sh 'kubectl get nodes'
      }
   }

   stage('Kubernetes setup') {
      steps {
         script {
            def namespaceExists = sh(script: "kubectl get ns robot-shop --output=jsonpath='{.metadata.name}'", returnStatus: true)
            if (namespaceExists == 0) {
                echo "Namespace 'robot-shop' already exists."
            } else {
                sh 'kubectl create ns robot-shop'
                echo "Namespace 'robot-shop' created."
            }
         }
      }     
   }
}