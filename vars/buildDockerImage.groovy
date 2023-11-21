def call(String imageName) {
    def dockerfilePath = libraryResource 'Dockerfile' 

    pipeline {
        agent any

        stages {
            stage('Build Docker Image') {
                steps {
                    script {
                        def customImageName = "${imageName}:${env.BUILD_NUMBER}"
                        docker.build(customImageName, "-f ${dockerfilePath} .")
                    }
                }
            }
        }
    }
}