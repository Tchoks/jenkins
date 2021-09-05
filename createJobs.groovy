pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipeline.groovy'))
            sandbox()
        }
    }
}