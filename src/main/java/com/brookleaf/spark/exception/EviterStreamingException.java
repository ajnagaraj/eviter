package com.brookleaf.spark.exception;

public class EviterStreamingException extends RuntimeException {
    
    public EviterStreamingException(String message) {
        super(message);
    }
    
    public EviterStreamingException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public EviterStreamingException(Throwable cause) {
        super(cause);
    }
}
