package org.sonarqube

def call(Map config) {
    def playbookCmd = """
        ansible-playbook ${config.playbookPath} \
        -i ${config.inventory}
    """
    sh playbookCmd
    echo "Ansible Playbook executed successfully."
}
