package no.vegvesen.saga.datex;

import eu.datex.v220.D2LogicalModel;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class JAXBContextFactory {

    private static JAXBContext context = null;
    public static synchronized JAXBContext createJAXBContext() throws JAXBException {
        if(context == null){
            context = JAXBContext.newInstance(D2LogicalModel.class);
        }
        return context;
    }

}
