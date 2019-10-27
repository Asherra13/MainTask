package musicalexceptions;

public class TrackInitializationException extends Exception {
    public TrackInitializationException() {
    }

    public TrackInitializationException(String message) {
        super(message);
    }

    public TrackInitializationException(Throwable cause) {
        super(cause);
    }

    public TrackInitializationException(String message, Throwable cause) {
        super(message, cause);
    }

    public TrackInitializationException(String message, Throwable cause, boolean enableSuppression,
                                            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
