# datex-client
A serializer which can deserialize Datex II publications from XML to JAXB POJOs.
For more information on DATEX II see https://www.datex2.eu/.

## How is it made?

[JAXB-RI v 2.3.2](https://github.com/eclipse-ee4j/jaxb-ri) is used to generate POJOs from the official [Datex II v 2.3 Schema](https://datex2.eu/schema/2/2_0/)

The top level entity is the [D2LogicalModel](https://github.com/vegvesen/datex-client/blob/master/src/main/java/eu/datex/v220/D2LogicalModel.java). See the XML layout for an [example Datex II publication](https://github.com/vegvesen/datex-client/blob/master/src/test/resources/no/vegvesen/saga/datex/client/datex-elements.xml) 

## How can I use it?

1. Point your favorite HTTP Client towards a Datex II publication endpoint. You can find a list of available of European Datex II nodes in the [Datex II Node directory](https://datex2.eu/implementations/nodes_directory) and a list of the publications available by the Norwegian Public Road Authority is [made available with documentation](https://www.vegvesen.no/en/the-npra/about-us/open-data/datex2/publications).
2. Use the DatexSerializer class `D2LogicalModel model = new DatexSerializer().deserialize(InputStream stream)`, see more [example tests](https://github.com/vegvesen/datex-client/blob/master/src/test/java/no/vegvesen/saga/datex/DatexSerializerTests.java)

## Where can I get the binary?
The binary is published in the central Maven repo

## How can I run the tests
1. Clone repo
2. Install gradle
3. Run `gradle test`

## Can I contribute?
Yes! PRs are welcome.
