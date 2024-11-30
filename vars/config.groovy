// vars/config.groovy
def config = [
    gitRepo: "https://github.com/example/sonarqube-playbooks.git", // Repository URL
    branch: "main",                                              // Branch to clone
    playbookPath: "playbooks/install-sonarqube.yml",             // Playbook path
    inventory: "inventories/hosts",                              // Inventory file
    notificationChannels: ["slack", "email"],                    // Notification methods
    slackChannel: "#jenkins-rohit",                              // Slack channel
    emailRecipients: "mailtorohitchopra@example.com"             // Email recipients
]
return config
