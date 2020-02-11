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
The stable release are published to the [Bintray JCentral Repo](https://bintray.com/bintray/jcenter).

### Maven

```xml
<repository>
  <id>jcenter</id>
  <url>http://jcenter.bintray.com/</url>
</repository>
<!-- ... -->
<dependency>
  <groupId>no.vegvesen</groupId>
  <artifactId>datex-client</artifactId>
  <version>1.0</version>
</dependency>
```

### Gradle

```groovy
  //core
  implementation 'no.vegvesen:datex-client:1.0'
```

## How can I run the tests
1. Clone repo
2. Install [Gradle](https://gradle.org/)
3. Run `gradle test`

## Can I contribute?
Yes! PRs are welcome.

## License
datex-client is released under the [MIT](https://opensource.org/licenses/MIT) license.
