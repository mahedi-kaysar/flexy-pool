package com.vladmihalcea.flexypool.event;

/**
 * <code>TimeThresholdExceededEvent</code> - Event generated when a time threshold is exceeded
 *
 * @author Vlad Mihalcea
 * @since 1.2.3
 */
public abstract class TimeThresholdExceededEvent extends Event {

    private static final long serialVersionUID = 8983594872506186227L;

    private final long timeThresholdMillis;

    private final long actualTimeMillis;

    /**
     * Init constructor
     *
     * @param uniqueName          FlexyPool unique name
     * @param timeThresholdMillis time threshold millis
     * @param actualTimeMillis    actual time millis
     */
    public TimeThresholdExceededEvent(String uniqueName, long timeThresholdMillis, long actualTimeMillis) {
        super(uniqueName);
        this.timeThresholdMillis = timeThresholdMillis;
        this.actualTimeMillis = actualTimeMillis;
    }

    /**
     * Get time threshold millis
     * @return time threshold millis
     */
    public long getTimeThresholdMillis() {
        return timeThresholdMillis;
    }

    /**
     * Get actual time millis
     * @return actual time millis
     */
    public long getActualTimeMillis() {
        return actualTimeMillis;
    }
}
