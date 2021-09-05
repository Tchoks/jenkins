pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('test') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/Tchoks/maven-docker-plugin.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}