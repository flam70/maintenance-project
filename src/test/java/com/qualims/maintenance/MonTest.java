package com.qualims.maintenance;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.assertj.core.api.Java6Assertions.assertThat;

@Category(UnitTest.class)
public class MonTest {

    @Test
    public void should_return_1() {
        assertThat(1).isEqualTo(1);
    }
}
