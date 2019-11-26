# quarkus-orm

mvn io.quarkus:quarkus-maven-plugin:1.0.0.Final:create \
    -DprojectGroupId=org.quarkus.modules \
    -DprojectArtifactId=quarkus-orm \
    -DclassName="org.quarkus.modules.FruitResource" \
    -Dpath="/fruit"
cd quarkus-orm

./mvnw compile quarkus:dev:

