package org.sonarqube

def call(Map config) {
    checkout([
        $class: 'GitSCM',
        branches: [[name: config.branch]],
        userRemoteConfigs: [[url: config.gitRepo]]
    ])
    echo "Repository cloned from ${config.gitRepo} successfully."
}
