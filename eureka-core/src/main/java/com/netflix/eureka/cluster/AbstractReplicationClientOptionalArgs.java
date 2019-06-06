package com.netflix.eureka.cluster;

import java.util.Collection;

import com.google.inject.Inject;

/**
 * @author Yuxin Bai
 */
abstract public class AbstractReplicationClientOptionalArgs<T> {
    Collection<T> additionalFilters;

    @Inject(optional = true)
    public void setAdditionalFilters(Collection<T> additionalFilters) {
        this.additionalFilters = additionalFilters;
    }

    public Collection<T> getAdditionalFilters() {
        return additionalFilters;
    }
}
