package com.brookleaf.spark.streamer;

import com.brookleaf.spark.exception.EviterStreamingException;

public interface SparkStreamer {
    void start() throws EviterStreamingException;
}
