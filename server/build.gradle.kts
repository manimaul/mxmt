plugins {
    application
}

dependencies {
    implementation(project(":tiles"))
}

application {
    mainClassName = "com.mxmariner.AppKt"
}
