plugins {
    id("java")
}

group = "org.mark"
version = "v0.0.4"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.xerial:sqlite-jdbc:3.46.0.0")
}

tasks.named<Javadoc>("javadoc") {
    options {
        this as StandardJavadocDocletOptions
        addBooleanOption("Xdoclint:-accessibility", true)
    }
}

tasks.named<Test>("test") {
    useJUnitPlatform()

    maxHeapSize = "1G"

    testLogging {
        events("passed", "failed")
    }
}