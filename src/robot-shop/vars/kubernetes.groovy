def call() {
   stage('Kubernetes status') {
      steps {
         //sh 'kubectl version'
         //sh 'kubectl get nodes'
	 sh 'ls -lhrt'
	 sh 'date'
      }
   }
}
