plugins {
    id("java")
}

group = "com.baidu"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // logback
    implementation("ch.qos.logback:logback-classic:1.5.6")
    // lombok
    compileOnly("org.projectlombok:lombok:1.18.32")
    // lombok 注解处理器
    annotationProcessor("org.projectlombok:lombok:1.18.22")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}