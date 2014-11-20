package org.predictor.idgenerator;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class IdGeneratorImplTest {
    private static final int TEST_ITERATIONS = 250;

    @Test
    public void test() {
        IdGenerator generator = new IdGeneratorImpl();

        Set<Long> ids = new HashSet<Long>(TEST_ITERATIONS);

        for (int i = 0; i < TEST_ITERATIONS; ++i) {
            long id = generator.generateId();

            Assert.assertFalse(ids.contains(id));

            ids.add(id);

            if (i % 25 == 0) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e) {
                    continue;
                }
            }
        }
    }
}
