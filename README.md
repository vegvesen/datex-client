# datex-client

A simple serializer library which can deserialize Datex II publications from XML to JAXB POJOs.
For more information on DATEX II see https://www.datex2.eu/.

## How is it made?

[JAXB-RI v 2.3.2](https://github.com/eclipse-ee4j/jaxb-ri) is used to generate POJOs from the official [Datex II v 2.3 Schema](https://datex2.eu/schema/2/2_0/)

The following command is used to generate POJOs:

```
./xjc.sh -no-header -p eu.datex.v220 -npa https://datex2.eu/sites/default/files/DATEXIISchema_2_2_0_0.xsd
```

The top level entity is the [D2LogicalModel](https://github.com/vegvesen/datex-client/blob/master/src/main/java/eu/datex/v220/D2LogicalModel.java). See the XML layout for an [example Datex II publication](https://github.com/vegvesen/datex-client/blob/master/src/test/resources/no/vegvesen/saga/datex/client/datex-elements.xml)

## How can I use it?

1. Point your favorite HTTP Client towards a Datex II publication endpoint. You can find a list of available of European Datex II nodes in the [Datex II Node directory](https://datex2.eu/implementations/nodes_directory) and a list of the publications available by the Norwegian Public Road Authority is [made available with documentation](https://www.vegvesen.no/en/the-npra/about-us/open-data/datex2/publications).
2. Use the DatexSerializer class `D2LogicalModel model = new DatexSerializer().deserialize(InputStream stream)`, see more [example tests](https://github.com/vegvesen/datex-client/blob/master/src/test/java/no/vegvesen/saga/datex/DatexSerializerTests.java)

## Where can I get it?

You can either (if using Gradle) [reference the source code as a dependency](https://blog.gradle.org/introducing-source-dependencies), e.g. in your `settings.gradle`:

```groovy
sourceControl {
    gitRepository("https://github.com/vegvesen/datex-client.git") {
        producesModule("no.vegvesen:datex-client")
    }
}
```

And then reference the needed tag in your `build.gradle`:

```groovy
dependencies {
    implementation 'no.vegvesen:datex-client:1.2.0'
}
```

Or, you can use [jitpack](https://jitpack.io) as a repository which will automatically build and download the dependency:

### Maven

```xml
<repository>
  <id>jitpack</id>
  <url>https://jitpack.io</url>
</repository>
<!-- ... -->
<dependency>
  <groupId>com.github.vegvesen</groupId>
  <artifactId>datex-client</artifactId>
  <version>1.2.0</version>
</dependency>
```

### Gradle

```groovy
repositories {
    ...
    maven { url 'https://jitpack.io' }
}
dependencies {
    implementation 'com.github.vegvesen:datex-client:1.2.0'
}
```

## How to create new releases

1. Bump the `artifactVersion` in `build.gradle.kts`
1. Run `./gradlew githubRelease`

## How can I run the tests

1. Clone repo
2. Install [Gradle](https://gradle.org/)
3. Run `gradle test`

## Can I contribute?

Yes! PRs are welcome.

## License

datex-client is released under the [MIT](https://opensource.org/licenses/MIT) license.
