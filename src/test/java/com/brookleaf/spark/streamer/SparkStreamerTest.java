package com.brookleaf.spark.streamer;

import org.apache.spark.streaming.api.java.JavaDStream;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class SparkStreamerTest {
    @Mock
    private SparkStream sparkStream;
    
    @Test
    public void shouldStartStreamingWithoutFailure() {
        JavaDStream<String> mockedDStream = mock(JavaDStream.class);
        when(sparkStream.getStream()).thenReturn(mockedDStream);
        
        SparkStreamer streamer = new TwitterSparkStreamer(sparkStream);
        streamer.start();
    }
}
