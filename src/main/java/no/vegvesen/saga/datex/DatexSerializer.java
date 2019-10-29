package no.vegvesen.saga.datex;

import eu.datex.v220.D2LogicalModel;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;

public class DatexSerializer {
    public D2LogicalModel deserialize(InputStream stream) throws SerializerException {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(D2LogicalModel.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            JAXBElement<D2LogicalModel> element = (JAXBElement<D2LogicalModel>) unmarshaller.unmarshal(stream);
            return element.getValue();
        } catch (Exception e) {
            throw new SerializerException(e);
        }
    }
}
