package no.vegvesen.saga.datex;

public class SerializerException extends RuntimeException {
    public SerializerException(Exception e) {
        super(e);
    }
}
