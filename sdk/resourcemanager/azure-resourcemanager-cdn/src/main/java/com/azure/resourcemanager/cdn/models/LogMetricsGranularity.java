// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LogMetricsGranularity. */
public final class LogMetricsGranularity extends ExpandableStringEnum<LogMetricsGranularity> {
    /** Static value PT5M for LogMetricsGranularity. */
    public static final LogMetricsGranularity PT5M = fromString("PT5M");

    /** Static value PT1H for LogMetricsGranularity. */
    public static final LogMetricsGranularity PT1H = fromString("PT1H");

    /** Static value P1D for LogMetricsGranularity. */
    public static final LogMetricsGranularity P1D = fromString("P1D");

    /**
     * Creates a new instance of LogMetricsGranularity value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LogMetricsGranularity() {
    }

    /**
     * Creates or finds a LogMetricsGranularity from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LogMetricsGranularity.
     */
    @JsonCreator
    public static LogMetricsGranularity fromString(String name) {
        return fromString(name, LogMetricsGranularity.class);
    }

    /**
     * Gets known LogMetricsGranularity values.
     *
     * @return known LogMetricsGranularity values.
     */
    public static Collection<LogMetricsGranularity> values() {
        return values(LogMetricsGranularity.class);
    }
}
