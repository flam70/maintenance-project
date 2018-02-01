package com.qualims.maintenance;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.assertj.core.api.Java6Assertions.assertThat;

@Category(AcceptanceTest.class)
public class MonAcceptanceTest {

    @Test
    public void should_return_acceptance() {
        assertThat("acceptance").isEqualTo("acceptance");
    }
}
