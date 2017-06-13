package org.davidmoten.rx.pool;

public interface Member2<T> extends AutoCloseable {

    boolean checkout();

    void checkin();

    /**
     * Should only be called if the Member has been checked out (managed by the
     * Pool instance).
     * 
     * @return the value of the pooled member
     */
    T value();

    void shutdown();
}