package no.vegvesen.saga.datex;

import eu.datex.v220.D2LogicalModel;
import eu.datex.v220.MeasuredDataPublication;
import eu.datex.v220.MeasurementSiteTablePublication;
import no.vegvesen.saga.datex.DatexSerializer;
import no.vegvesen.saga.datex.SerializerException;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

public class DatexSerializerTests {

    @Test
    public void testUnmarshalStations() {
        InputStream stream = read("datex-elements.xml");
        D2LogicalModel model = new DatexSerializer().deserialize(stream);
        MeasurementSiteTablePublication publication = (MeasurementSiteTablePublication) model.getPayloadPublication();
        assertEquals("no", model.getExchange().getSupplierIdentification().getCountry().value());
        assertEquals("WOST", publication.getMeasurementSiteTable().get(0).getId());
    }

    @Test
    public void testUnmarshalData() {
        InputStream stream = read("datex-data.xml");
        D2LogicalModel model = new DatexSerializer().deserialize(stream);
        MeasuredDataPublication publication = (MeasuredDataPublication) model.getPayloadPublication();
        assertEquals("no", model.getExchange().getSupplierIdentification().getCountry().value());
        assertEquals("nob", publication.getLang());
    }

    @Test
    public void testUnmarshalNotDatexFormat() {
        InputStream stream = this.getClass().getResourceAsStream("notdatexformat.xml");
        assertThrows(SerializerException.class, () -> {
            new DatexSerializer().deserialize(stream);
        });
    }

    @Test
    public void testUnmarshalWithDeliveryBreak() {
        InputStream stream = read("datex-deliverybreak.xml");
        D2LogicalModel model = new DatexSerializer().deserialize(stream);
        assertTrue(model.getExchange().isDeliveryBreak());
    }

    private InputStream read(String file) {
        return this.getClass().getResourceAsStream(file);
    }
}
