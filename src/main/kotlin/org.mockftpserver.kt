@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

val DependencyHandler.`mock-ftp-server`: String
    get() = "org.mockftpserver:MockFtpServer:2.7.1"
