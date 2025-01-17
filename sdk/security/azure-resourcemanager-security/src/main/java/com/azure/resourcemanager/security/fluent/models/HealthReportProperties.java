// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.security.models.EnvironmentDetails;
import com.azure.resourcemanager.security.models.HealthDataClassification;
import com.azure.resourcemanager.security.models.Issue;
import com.azure.resourcemanager.security.models.ResourceDetailsAutoGenerated;
import com.azure.resourcemanager.security.models.StatusAutoGenerated;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes properties of the health report. */
@Fluent
public final class HealthReportProperties {
    /*
     * The resource details of the health report
     */
    @JsonProperty(value = "resourceDetails")
    private ResourceDetailsAutoGenerated resourceDetails;

    /*
     * The environment details of the resource
     */
    @JsonProperty(value = "environmentDetails")
    private EnvironmentDetails environmentDetails;

    /*
     * The classification of the health report
     */
    @JsonProperty(value = "healthDataClassification")
    private HealthDataClassification healthDataClassification;

    /*
     * The status of the health report
     */
    @JsonProperty(value = "status")
    private StatusAutoGenerated status;

    /*
     * The affected defenders plans by unhealthy report
     */
    @JsonProperty(value = "affectedDefendersPlans")
    private List<String> affectedDefendersPlans;

    /*
     * A collection of the issues in the report
     */
    @JsonProperty(value = "issues")
    private List<Issue> issues;

    /** Creates an instance of HealthReportProperties class. */
    public HealthReportProperties() {
    }

    /**
     * Get the resourceDetails property: The resource details of the health report.
     *
     * @return the resourceDetails value.
     */
    public ResourceDetailsAutoGenerated resourceDetails() {
        return this.resourceDetails;
    }

    /**
     * Set the resourceDetails property: The resource details of the health report.
     *
     * @param resourceDetails the resourceDetails value to set.
     * @return the HealthReportProperties object itself.
     */
    public HealthReportProperties withResourceDetails(ResourceDetailsAutoGenerated resourceDetails) {
        this.resourceDetails = resourceDetails;
        return this;
    }

    /**
     * Get the environmentDetails property: The environment details of the resource.
     *
     * @return the environmentDetails value.
     */
    public EnvironmentDetails environmentDetails() {
        return this.environmentDetails;
    }

    /**
     * Set the environmentDetails property: The environment details of the resource.
     *
     * @param environmentDetails the environmentDetails value to set.
     * @return the HealthReportProperties object itself.
     */
    public HealthReportProperties withEnvironmentDetails(EnvironmentDetails environmentDetails) {
        this.environmentDetails = environmentDetails;
        return this;
    }

    /**
     * Get the healthDataClassification property: The classification of the health report.
     *
     * @return the healthDataClassification value.
     */
    public HealthDataClassification healthDataClassification() {
        return this.healthDataClassification;
    }

    /**
     * Set the healthDataClassification property: The classification of the health report.
     *
     * @param healthDataClassification the healthDataClassification value to set.
     * @return the HealthReportProperties object itself.
     */
    public HealthReportProperties withHealthDataClassification(HealthDataClassification healthDataClassification) {
        this.healthDataClassification = healthDataClassification;
        return this;
    }

    /**
     * Get the status property: The status of the health report.
     *
     * @return the status value.
     */
    public StatusAutoGenerated status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the health report.
     *
     * @param status the status value to set.
     * @return the HealthReportProperties object itself.
     */
    public HealthReportProperties withStatus(StatusAutoGenerated status) {
        this.status = status;
        return this;
    }

    /**
     * Get the affectedDefendersPlans property: The affected defenders plans by unhealthy report.
     *
     * @return the affectedDefendersPlans value.
     */
    public List<String> affectedDefendersPlans() {
        return this.affectedDefendersPlans;
    }

    /**
     * Set the affectedDefendersPlans property: The affected defenders plans by unhealthy report.
     *
     * @param affectedDefendersPlans the affectedDefendersPlans value to set.
     * @return the HealthReportProperties object itself.
     */
    public HealthReportProperties withAffectedDefendersPlans(List<String> affectedDefendersPlans) {
        this.affectedDefendersPlans = affectedDefendersPlans;
        return this;
    }

    /**
     * Get the issues property: A collection of the issues in the report.
     *
     * @return the issues value.
     */
    public List<Issue> issues() {
        return this.issues;
    }

    /**
     * Set the issues property: A collection of the issues in the report.
     *
     * @param issues the issues value to set.
     * @return the HealthReportProperties object itself.
     */
    public HealthReportProperties withIssues(List<Issue> issues) {
        this.issues = issues;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceDetails() != null) {
            resourceDetails().validate();
        }
        if (environmentDetails() != null) {
            environmentDetails().validate();
        }
        if (healthDataClassification() != null) {
            healthDataClassification().validate();
        }
        if (status() != null) {
            status().validate();
        }
        if (issues() != null) {
            issues().forEach(e -> e.validate());
        }
    }
}
