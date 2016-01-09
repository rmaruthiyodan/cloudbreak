package com.sequenceiq.cloudbreak.core.flow;

public enum FlowPhases {
    PROVISIONING_SETUP,
    PREPARE_IMAGE,
    CHECK_IMAGE,
    PROVISIONING,
    METADATA_SETUP,
    METADATA_COLLECT,
    //TODO fix flow initializer and avoid using singleton map
    UPSCALE_METADATA_COLLECT,
    DOWNSCALE_METADATA_COLLECT,
    TLS_SETUP,
    BOOTSTRAP_CLUSTER,
    CONSUL_METADATA_SETUP,
    RUN_CLUSTER_CONTAINERS,
    AMBARI_START,
    CLUSTER_INSTALL,
    CLUSTER_RESET,
    STACK_CREATION_FAILED,
    STACK_START,
    STACK_STOP_REQUESTED,
    CLUSTER_START_REQUESTED,
    STACK_STATUS_UPDATE_FAILED,
    STACK_STOP,
    UPSCALE_STACK_SYNC,
    ADD_INSTANCES,
    REMOVE_INSTANCE,
    EXTEND_METADATA,
    BOOTSTRAP_NEW_NODES,
    ADD_CLUSTER_CONTAINERS,
    EXTEND_CONSUL_METADATA,
    STACK_DOWNSCALE,
    CLUSTER_START,
    CLUSTER_STATUS_UPDATE_FAILED,
    CLUSTER_STOP,
    CLUSTER_UPSCALE,
    CLUSTER_DOWNSCALE,
    TERMINATION,
    FORCED_TERMINATION,
    TERMINATION_FAILED,
    UPDATE_ALLOWED_SUBNETS,
    CLUSTER_SYNC,
    STACK_SYNC,
    CLUSTER_USERNAME_PASSWORD_UPDATE,
    NONE
}
