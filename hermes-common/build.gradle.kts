plugins {
    `java-library`
    groovy
}

val versions = rootProject.extra["versions"] as Map<*, *>

dependencies {
    api(project(":hermes-api"))
    api(project(":hermes-metrics"))
    api(project(":hermes-schema"))

    api(group = "org.apache.curator", name = "curator-client", version = versions["curator"] as String) {
        exclude(module = "slf4j-log4j12")
        exclude(module = "log4j")
    }
    api(group = "org.apache.curator", name = "curator-recipes", version = versions["curator"] as String) {
        exclude(module = "slf4j-log4j12")
        exclude(module = "log4j")
    }

    api(group = "org.glassfish.jersey.core", name = "jersey-client", version = versions["jersey"] as String)
    implementation(group = "org.glassfish.jersey.inject", name = "jersey-hk2", version = versions["jersey"] as String)
    api(group = "org.glassfish.jersey.media", name = "jersey-media-json-jackson", version = versions["jersey"] as String)
    api(group = "org.glassfish.jersey.ext", name = "jersey-bean-validation", version = versions["jersey"] as String)

    api(group = "tech.allegro.schema.json2avro", name = "converter", version = versions["json2avro"] as String)

    api(group = "org.apache.commons", name = "commons-collections4", version = "4.4")
    implementation(group = "commons-codec", name = "commons-codec", version = "1.16.1")
    implementation(group = "com.google.guava", name = "guava", version = versions["guava"] as String)

    api(group = "com.fasterxml.jackson.core", name = "jackson-databind", version = versions["jackson"] as String)
    api(group = "org.apache.avro", name = "avro", version = versions["avro"] as String)
    api(group = "com.jayway.jsonpath", name = "json-path", version = "2.9.0")

    implementation(group = "io.dropwizard.metrics", name = "metrics-core", version = versions["dropwizard_metrics"] as String)

    implementation(group = "com.google.code.findbugs", name = "annotations", version = "3.0.1")
    api(group = "io.micrometer", name = "micrometer-core", version = versions["micrometer_metrics"] as String)
    api(group = "io.micrometer", name = "micrometer-registry-prometheus", version = versions["micrometer_metrics"] as String)

    implementation(group = "org.slf4j", name = "log4j-over-slf4j", version = "2.0.13")
    implementation(group = "ch.qos.logback", name = "logback-classic", version = "1.4.14")
    api(group = "org.apache.kafka", name = "kafka-clients", version = versions["kafka"] as String) {
        exclude(group = "net.sf.jopt-simple")
    }

    api(group = "jakarta.inject", name = "jakarta.inject-api", version = "2.0.1")

    testImplementation(project(":hermes-test-helper"))

    testImplementation(group = "jakarta.servlet", name = "jakarta.servlet-api", version = "6.0.0")

    testImplementation(group = "org.spockframework", name = "spock-core", version = versions["spock"] as String)
    testImplementation(group = "org.spockframework", name = "spock-junit4", version = versions["spock"] as String)
    testImplementation(group = "org.awaitility", name = "awaitility-groovy", version = "4.2.1")
    testRuntimeOnly(group = "org.junit.vintage", name = "junit-vintage-engine", version = versions["junit_jupiter"] as String)
}