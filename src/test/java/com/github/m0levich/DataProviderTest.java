package com.github.m0levich;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Tag("DataProviderTests")
@DisplayName("Параметризованный тест")
public class DataProviderTest {
    private static final Logger LOG = LoggerFactory.getLogger(DataProviderTest.class);

    @ParameterizedTest
    @ValueSource(strings = {"First parameter","Second parameter"})
    void DataProviderTest(String string){
        LOG.info(string);
    }
}
