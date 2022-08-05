node{

stage("Load Master Jenkins file"){
checkout([$class: 'GitSCM', branches: [[name: "master"]], doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'RelativeTargetDirectory', relativeTargetDir: 'vars']], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'sample', url: 'https://github.com/vijay1984/aspm-cli-pipeline.git']]])
jenkinsfile= load 'vars/GetAwsEcrToken.groovy'
}
}
