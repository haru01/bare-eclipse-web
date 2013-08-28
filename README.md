generate .classpath, .project

    gradle eclipse

build

    GRADLE_OPTS="-XX:MaxPermSize=256M" gradle clean build integrationTest --info


guard

    guard

in eclipse

    VM arguments: -Dgeb.build.reportsDir=/tmp


## TODO
- database

## See

### flywaydb
- http://flywaydb.org/getstarted/firststeps/gradle.html
