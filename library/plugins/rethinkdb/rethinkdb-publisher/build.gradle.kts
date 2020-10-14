plugins {
    id("kotlinLib")
}

dependencies {
    implementation(project(":library:talaiot"))
    implementation("com.rethinkdb:rethinkdb-driver:2.3.3")
    testImplementation(project(":library:talaiot-test-utils"))
}
