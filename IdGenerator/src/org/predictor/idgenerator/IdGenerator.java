package org.predictor.idgenerator;

/**
 * This interface is implemented by ID generators.
 *
 * @author Maxim Khodanovich
 */
public interface IdGenerator {
    /**
     * Generate an ID.
     *
     * @return an ID
     */
    long generateId();
}
