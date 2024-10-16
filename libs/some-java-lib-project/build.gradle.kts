plugins {
    id("java-library")
}

group = "com.example.libs"

repositories {
    mavenCentral()
}

testing {
    suites {
        @Suppress("UnstableApiUsage")
        withType<JvmTestSuite> {
            useJUnitJupiter()
        }
    }
}
