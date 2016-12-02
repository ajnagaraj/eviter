package com.brookleaf.spark.streamer;

import org.apache.spark.streaming.api.java.JavaDStream;

import java.util.List;

public interface SparkStream<T> {
    JavaDStream getStream();
    JavaDStream getStream(List<String> filters);
}
