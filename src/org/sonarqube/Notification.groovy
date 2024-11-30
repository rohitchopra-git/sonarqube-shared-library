package org.sonarqube

def call(String message, Map config) {
    if (config.notificationChannels.contains("slack")) {
        slackSend(channel: config.slackChannel, message: message)
    }
    if (config.notificationChannels.contains("email")) {
        mail(
            to: config.emailRecipients,
            subject: "SonarQube Execution Notification",
            body: message
        )
    }
    echo "Notification sent: ${message}"
}
