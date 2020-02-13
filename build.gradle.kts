val artifactName = "datex-client"
val artifactGroup = "no.vegvesen"
val artifactVersion = "1.2.0"

val pomUrl = "https://github.com/vegvesen/datex-client"
val pomScmUrl = "https://github.com/vegvesen/datex-client"
val pomScmConnection = "scm:git:git://github.com/vegvesen/datex-client.git"
val pomIssueUrl = "https://github.com/vegvesen/datex-client/issues"
val pomDesc = "A serializer which can deserialize Datex II publications from XML to JAXB POJOs."

val githubRepo = "vegvesen/datex-client"
val githubReadme = "README.md"

val pomLicenseName = "MIT License"
val pomLicenseUrl = "https://opensource.org/licenses/mit-license.php"
val pomLicenseDist = "repo"

val pomDeveloperId = "mahic"
val pomDeveloperName = "Safurudin Mahic"

plugins {
    java
    `maven-publish`
    id("com.jfrog.bintray") version "1.8.4"
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation("javax.xml.bind:jaxb-api:2.3.1")
    implementation("org.glassfish.jaxb:jaxb-runtime:2.3.2")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.5.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.5.2")
}

tasks.test {
    useJUnitPlatform()
    maxHeapSize = "1024m"
}

tasks.register<Jar>("sourcesJar") {
    archiveClassifier.set("sources")
    from(sourceSets.main.get().allJava)
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = artifactGroup
            artifactId = artifactId
            version = artifactVersion
            from(components["java"])
            artifact(tasks["sourcesJar"])

            pom.withXml {
                asNode().apply {
                    appendNode("description", pomDesc)
                    appendNode("name", rootProject.name)
                    appendNode("url", pomUrl)
                    appendNode("licenses").appendNode("license").apply {
                        appendNode("name", pomLicenseName)
                        appendNode("url", pomLicenseUrl)
                        appendNode("distribution", pomLicenseDist)
                    }
                    appendNode("developers").appendNode("developer").apply {
                        appendNode("id", pomDeveloperId)
                        appendNode("name", pomDeveloperName)
                    }
                    appendNode("scm").apply {
                        appendNode("url", pomScmUrl)
                        appendNode("connection", pomScmConnection)
                    }
                }
            }
        }
    }
}

bintray {
    user = project.findProperty("bintrayUser").toString()
    key = project.findProperty("bintrayKey").toString()
    publish = true
    setPublications("maven")

    pkg.apply {
        repo = "maven"
        name = artifactName
        userOrg = "vegvesen"
        githubRepo = githubRepo
        vcsUrl = pomScmUrl
        description = pomDesc
        setLicenses("MIT")
        desc = description
        websiteUrl = "https://vegvesen.no"
        issueTrackerUrl = pomIssueUrl
        githubReleaseNotesFile = githubReadme

        version.apply {
            name = artifactVersion
            desc = pomDesc
            vcsTag = artifactVersion
        }
    }
}