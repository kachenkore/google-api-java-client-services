/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.cloudfunctions.v1.model;

/**
 * Describes a Cloud Function that contains user computation executed in response to an event. It
 * encapsulate function and triggers configurations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Functions API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CloudFunction extends com.google.api.client.json.GenericJson {

  /**
   * The amount of memory in MB available for a function. Defaults to 256MB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer availableMemoryMb;

  /**
   * Build environment variables that shall be available during build time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> buildEnvironmentVariables;

  /**
   * Output only. The Cloud Build ID of the latest successful deployment of the function.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String buildId;

  /**
   * Name of the Cloud Build Custom Worker Pool that should be used to build the function. The
   * format of this field is `projects/{project}/locations/{region}/workerPools/{workerPool}` where
   * {project} and {region} are the project id and region respectively where the worker pool is
   * defined and {workerPool} is the short name of the worker pool. If the project id is not the
   * same as the function, then the Cloud Functions Service Agent (service-@gcf-admin-
   * robot.iam.gserviceaccount.com) must be granted the role Cloud Build Custom Workers Builder
   * (roles/cloudbuild.customworkers.builder) in the project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String buildWorkerPool;

  /**
   * User-provided description of a function.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The name of the function (as defined in source code) that will be executed. Defaults to the
   * resource name suffix, if not specified. For backward compatibility, if function with given name
   * is not found, then the system will try to use function named "function". For Node.js this is
   * name of a function exported by the module specified in `source_location`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entryPoint;

  /**
   * Environment variables that shall be available during function execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> environmentVariables;

  /**
   * A source that fires events in response to a condition in another service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EventTrigger eventTrigger;

  /**
   * An HTTPS endpoint type of source that can be triggered via URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HttpsTrigger httpsTrigger;

  /**
   * The ingress settings for the function, controlling what traffic can reach it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ingressSettings;

  /**
   * Labels associated with this Cloud Function.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The limit on the maximum number of function instances that may coexist at a given time. In some
   * cases, such as rapid traffic surges, Cloud Functions may, for a short period of time, create
   * more instances than the specified max instances limit. If your function cannot tolerate this
   * temporary behavior, you may want to factor in a safety margin and set a lower max instances
   * value than your function can tolerate. See the [Max
   * Instances](https://cloud.google.com/functions/docs/max-instances) Guide for more details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxInstances;

  /**
   * A user-defined name of the function. Function names must be unique globally and match pattern
   * `projects/locations/functions`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The VPC Network that this cloud function can connect to. It can be either the fully-qualified
   * URI, or the short name of the network resource. If the short network name is used, the network
   * must belong to the same project. Otherwise, it must belong to a project within the same
   * organization. The format of this field is either `projects/{project}/global/networks/{network}`
   * or `{network}`, where {project} is a project id where the network is defined, and {network} is
   * the short name of the network. This field is mutually exclusive with `vpc_connector` and will
   * be replaced by it. See [the VPC documentation](https://cloud.google.com/compute/docs/vpc) for
   * more information on connecting Cloud projects.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * The runtime in which to run the function. Required when deploying a new function, optional when
   * updating an existing function. For a complete list of possible choices, see the [`gcloud`
   * command reference](/sdk/gcloud/reference/functions/deploy#--runtime).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String runtime;

  /**
   * The email of the function's service account. If empty, defaults to
   * `{project_id}@appspot.gserviceaccount.com`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccountEmail;

  /**
   * The Google Cloud Storage URL, starting with gs://, pointing to the zip archive which contains
   * the function.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceArchiveUrl;

  /**
   * **Beta Feature** The source repository where a function is hosted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SourceRepository sourceRepository;

  /**
   * Input only. An identifier for Firebase function sources. Disclaimer: This field is only
   * supported for Firebase function deployments.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceToken;

  /**
   * The Google Cloud Storage signed URL used for source uploading, generated by
   * google.cloud.functions.v1.GenerateUploadUrl
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceUploadUrl;

  /**
   * Output only. Status of the function deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * The function execution timeout. Execution is considered failed and can be terminated if the
   * function is not completed at the end of the timeout period. Defaults to 60 seconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timeout;

  /**
   * Output only. The last update timestamp of a Cloud Function.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The version identifier of the Cloud Function. Each deployment attempt results in a
   * new version of a function being created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long versionId;

  /**
   * The VPC Network Connector that this cloud function can connect to. It can be either the fully-
   * qualified URI, or the short name of the network connector resource. The format of this field is
   * `projects/locations/connectors` This field is mutually exclusive with `network` field and will
   * eventually replace it. See [the VPC documentation](https://cloud.google.com/compute/docs/vpc)
   * for more information on connecting Cloud projects.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String vpcConnector;

  /**
   * The egress settings for the connector, controlling what traffic is diverted through it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String vpcConnectorEgressSettings;

  /**
   * The amount of memory in MB available for a function. Defaults to 256MB.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAvailableMemoryMb() {
    return availableMemoryMb;
  }

  /**
   * The amount of memory in MB available for a function. Defaults to 256MB.
   * @param availableMemoryMb availableMemoryMb or {@code null} for none
   */
  public CloudFunction setAvailableMemoryMb(java.lang.Integer availableMemoryMb) {
    this.availableMemoryMb = availableMemoryMb;
    return this;
  }

  /**
   * Build environment variables that shall be available during build time.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getBuildEnvironmentVariables() {
    return buildEnvironmentVariables;
  }

  /**
   * Build environment variables that shall be available during build time.
   * @param buildEnvironmentVariables buildEnvironmentVariables or {@code null} for none
   */
  public CloudFunction setBuildEnvironmentVariables(java.util.Map<String, java.lang.String> buildEnvironmentVariables) {
    this.buildEnvironmentVariables = buildEnvironmentVariables;
    return this;
  }

  /**
   * Output only. The Cloud Build ID of the latest successful deployment of the function.
   * @return value or {@code null} for none
   */
  public java.lang.String getBuildId() {
    return buildId;
  }

  /**
   * Output only. The Cloud Build ID of the latest successful deployment of the function.
   * @param buildId buildId or {@code null} for none
   */
  public CloudFunction setBuildId(java.lang.String buildId) {
    this.buildId = buildId;
    return this;
  }

  /**
   * Name of the Cloud Build Custom Worker Pool that should be used to build the function. The
   * format of this field is `projects/{project}/locations/{region}/workerPools/{workerPool}` where
   * {project} and {region} are the project id and region respectively where the worker pool is
   * defined and {workerPool} is the short name of the worker pool. If the project id is not the
   * same as the function, then the Cloud Functions Service Agent (service-@gcf-admin-
   * robot.iam.gserviceaccount.com) must be granted the role Cloud Build Custom Workers Builder
   * (roles/cloudbuild.customworkers.builder) in the project.
   * @return value or {@code null} for none
   */
  public java.lang.String getBuildWorkerPool() {
    return buildWorkerPool;
  }

  /**
   * Name of the Cloud Build Custom Worker Pool that should be used to build the function. The
   * format of this field is `projects/{project}/locations/{region}/workerPools/{workerPool}` where
   * {project} and {region} are the project id and region respectively where the worker pool is
   * defined and {workerPool} is the short name of the worker pool. If the project id is not the
   * same as the function, then the Cloud Functions Service Agent (service-@gcf-admin-
   * robot.iam.gserviceaccount.com) must be granted the role Cloud Build Custom Workers Builder
   * (roles/cloudbuild.customworkers.builder) in the project.
   * @param buildWorkerPool buildWorkerPool or {@code null} for none
   */
  public CloudFunction setBuildWorkerPool(java.lang.String buildWorkerPool) {
    this.buildWorkerPool = buildWorkerPool;
    return this;
  }

  /**
   * User-provided description of a function.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * User-provided description of a function.
   * @param description description or {@code null} for none
   */
  public CloudFunction setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The name of the function (as defined in source code) that will be executed. Defaults to the
   * resource name suffix, if not specified. For backward compatibility, if function with given name
   * is not found, then the system will try to use function named "function". For Node.js this is
   * name of a function exported by the module specified in `source_location`.
   * @return value or {@code null} for none
   */
  public java.lang.String getEntryPoint() {
    return entryPoint;
  }

  /**
   * The name of the function (as defined in source code) that will be executed. Defaults to the
   * resource name suffix, if not specified. For backward compatibility, if function with given name
   * is not found, then the system will try to use function named "function". For Node.js this is
   * name of a function exported by the module specified in `source_location`.
   * @param entryPoint entryPoint or {@code null} for none
   */
  public CloudFunction setEntryPoint(java.lang.String entryPoint) {
    this.entryPoint = entryPoint;
    return this;
  }

  /**
   * Environment variables that shall be available during function execution.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getEnvironmentVariables() {
    return environmentVariables;
  }

  /**
   * Environment variables that shall be available during function execution.
   * @param environmentVariables environmentVariables or {@code null} for none
   */
  public CloudFunction setEnvironmentVariables(java.util.Map<String, java.lang.String> environmentVariables) {
    this.environmentVariables = environmentVariables;
    return this;
  }

  /**
   * A source that fires events in response to a condition in another service.
   * @return value or {@code null} for none
   */
  public EventTrigger getEventTrigger() {
    return eventTrigger;
  }

  /**
   * A source that fires events in response to a condition in another service.
   * @param eventTrigger eventTrigger or {@code null} for none
   */
  public CloudFunction setEventTrigger(EventTrigger eventTrigger) {
    this.eventTrigger = eventTrigger;
    return this;
  }

  /**
   * An HTTPS endpoint type of source that can be triggered via URL.
   * @return value or {@code null} for none
   */
  public HttpsTrigger getHttpsTrigger() {
    return httpsTrigger;
  }

  /**
   * An HTTPS endpoint type of source that can be triggered via URL.
   * @param httpsTrigger httpsTrigger or {@code null} for none
   */
  public CloudFunction setHttpsTrigger(HttpsTrigger httpsTrigger) {
    this.httpsTrigger = httpsTrigger;
    return this;
  }

  /**
   * The ingress settings for the function, controlling what traffic can reach it.
   * @return value or {@code null} for none
   */
  public java.lang.String getIngressSettings() {
    return ingressSettings;
  }

  /**
   * The ingress settings for the function, controlling what traffic can reach it.
   * @param ingressSettings ingressSettings or {@code null} for none
   */
  public CloudFunction setIngressSettings(java.lang.String ingressSettings) {
    this.ingressSettings = ingressSettings;
    return this;
  }

  /**
   * Labels associated with this Cloud Function.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels associated with this Cloud Function.
   * @param labels labels or {@code null} for none
   */
  public CloudFunction setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The limit on the maximum number of function instances that may coexist at a given time. In some
   * cases, such as rapid traffic surges, Cloud Functions may, for a short period of time, create
   * more instances than the specified max instances limit. If your function cannot tolerate this
   * temporary behavior, you may want to factor in a safety margin and set a lower max instances
   * value than your function can tolerate. See the [Max
   * Instances](https://cloud.google.com/functions/docs/max-instances) Guide for more details.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxInstances() {
    return maxInstances;
  }

  /**
   * The limit on the maximum number of function instances that may coexist at a given time. In some
   * cases, such as rapid traffic surges, Cloud Functions may, for a short period of time, create
   * more instances than the specified max instances limit. If your function cannot tolerate this
   * temporary behavior, you may want to factor in a safety margin and set a lower max instances
   * value than your function can tolerate. See the [Max
   * Instances](https://cloud.google.com/functions/docs/max-instances) Guide for more details.
   * @param maxInstances maxInstances or {@code null} for none
   */
  public CloudFunction setMaxInstances(java.lang.Integer maxInstances) {
    this.maxInstances = maxInstances;
    return this;
  }

  /**
   * A user-defined name of the function. Function names must be unique globally and match pattern
   * `projects/locations/functions`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * A user-defined name of the function. Function names must be unique globally and match pattern
   * `projects/locations/functions`
   * @param name name or {@code null} for none
   */
  public CloudFunction setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The VPC Network that this cloud function can connect to. It can be either the fully-qualified
   * URI, or the short name of the network resource. If the short network name is used, the network
   * must belong to the same project. Otherwise, it must belong to a project within the same
   * organization. The format of this field is either `projects/{project}/global/networks/{network}`
   * or `{network}`, where {project} is a project id where the network is defined, and {network} is
   * the short name of the network. This field is mutually exclusive with `vpc_connector` and will
   * be replaced by it. See [the VPC documentation](https://cloud.google.com/compute/docs/vpc) for
   * more information on connecting Cloud projects.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * The VPC Network that this cloud function can connect to. It can be either the fully-qualified
   * URI, or the short name of the network resource. If the short network name is used, the network
   * must belong to the same project. Otherwise, it must belong to a project within the same
   * organization. The format of this field is either `projects/{project}/global/networks/{network}`
   * or `{network}`, where {project} is a project id where the network is defined, and {network} is
   * the short name of the network. This field is mutually exclusive with `vpc_connector` and will
   * be replaced by it. See [the VPC documentation](https://cloud.google.com/compute/docs/vpc) for
   * more information on connecting Cloud projects.
   * @param network network or {@code null} for none
   */
  public CloudFunction setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * The runtime in which to run the function. Required when deploying a new function, optional when
   * updating an existing function. For a complete list of possible choices, see the [`gcloud`
   * command reference](/sdk/gcloud/reference/functions/deploy#--runtime).
   * @return value or {@code null} for none
   */
  public java.lang.String getRuntime() {
    return runtime;
  }

  /**
   * The runtime in which to run the function. Required when deploying a new function, optional when
   * updating an existing function. For a complete list of possible choices, see the [`gcloud`
   * command reference](/sdk/gcloud/reference/functions/deploy#--runtime).
   * @param runtime runtime or {@code null} for none
   */
  public CloudFunction setRuntime(java.lang.String runtime) {
    this.runtime = runtime;
    return this;
  }

  /**
   * The email of the function's service account. If empty, defaults to
   * `{project_id}@appspot.gserviceaccount.com`.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccountEmail() {
    return serviceAccountEmail;
  }

  /**
   * The email of the function's service account. If empty, defaults to
   * `{project_id}@appspot.gserviceaccount.com`.
   * @param serviceAccountEmail serviceAccountEmail or {@code null} for none
   */
  public CloudFunction setServiceAccountEmail(java.lang.String serviceAccountEmail) {
    this.serviceAccountEmail = serviceAccountEmail;
    return this;
  }

  /**
   * The Google Cloud Storage URL, starting with gs://, pointing to the zip archive which contains
   * the function.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceArchiveUrl() {
    return sourceArchiveUrl;
  }

  /**
   * The Google Cloud Storage URL, starting with gs://, pointing to the zip archive which contains
   * the function.
   * @param sourceArchiveUrl sourceArchiveUrl or {@code null} for none
   */
  public CloudFunction setSourceArchiveUrl(java.lang.String sourceArchiveUrl) {
    this.sourceArchiveUrl = sourceArchiveUrl;
    return this;
  }

  /**
   * **Beta Feature** The source repository where a function is hosted.
   * @return value or {@code null} for none
   */
  public SourceRepository getSourceRepository() {
    return sourceRepository;
  }

  /**
   * **Beta Feature** The source repository where a function is hosted.
   * @param sourceRepository sourceRepository or {@code null} for none
   */
  public CloudFunction setSourceRepository(SourceRepository sourceRepository) {
    this.sourceRepository = sourceRepository;
    return this;
  }

  /**
   * Input only. An identifier for Firebase function sources. Disclaimer: This field is only
   * supported for Firebase function deployments.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceToken() {
    return sourceToken;
  }

  /**
   * Input only. An identifier for Firebase function sources. Disclaimer: This field is only
   * supported for Firebase function deployments.
   * @param sourceToken sourceToken or {@code null} for none
   */
  public CloudFunction setSourceToken(java.lang.String sourceToken) {
    this.sourceToken = sourceToken;
    return this;
  }

  /**
   * The Google Cloud Storage signed URL used for source uploading, generated by
   * google.cloud.functions.v1.GenerateUploadUrl
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceUploadUrl() {
    return sourceUploadUrl;
  }

  /**
   * The Google Cloud Storage signed URL used for source uploading, generated by
   * google.cloud.functions.v1.GenerateUploadUrl
   * @param sourceUploadUrl sourceUploadUrl or {@code null} for none
   */
  public CloudFunction setSourceUploadUrl(java.lang.String sourceUploadUrl) {
    this.sourceUploadUrl = sourceUploadUrl;
    return this;
  }

  /**
   * Output only. Status of the function deployment.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Output only. Status of the function deployment.
   * @param status status or {@code null} for none
   */
  public CloudFunction setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * The function execution timeout. Execution is considered failed and can be terminated if the
   * function is not completed at the end of the timeout period. Defaults to 60 seconds.
   * @return value or {@code null} for none
   */
  public String getTimeout() {
    return timeout;
  }

  /**
   * The function execution timeout. Execution is considered failed and can be terminated if the
   * function is not completed at the end of the timeout period. Defaults to 60 seconds.
   * @param timeout timeout or {@code null} for none
   */
  public CloudFunction setTimeout(String timeout) {
    this.timeout = timeout;
    return this;
  }

  /**
   * Output only. The last update timestamp of a Cloud Function.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The last update timestamp of a Cloud Function.
   * @param updateTime updateTime or {@code null} for none
   */
  public CloudFunction setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Output only. The version identifier of the Cloud Function. Each deployment attempt results in a
   * new version of a function being created.
   * @return value or {@code null} for none
   */
  public java.lang.Long getVersionId() {
    return versionId;
  }

  /**
   * Output only. The version identifier of the Cloud Function. Each deployment attempt results in a
   * new version of a function being created.
   * @param versionId versionId or {@code null} for none
   */
  public CloudFunction setVersionId(java.lang.Long versionId) {
    this.versionId = versionId;
    return this;
  }

  /**
   * The VPC Network Connector that this cloud function can connect to. It can be either the fully-
   * qualified URI, or the short name of the network connector resource. The format of this field is
   * `projects/locations/connectors` This field is mutually exclusive with `network` field and will
   * eventually replace it. See [the VPC documentation](https://cloud.google.com/compute/docs/vpc)
   * for more information on connecting Cloud projects.
   * @return value or {@code null} for none
   */
  public java.lang.String getVpcConnector() {
    return vpcConnector;
  }

  /**
   * The VPC Network Connector that this cloud function can connect to. It can be either the fully-
   * qualified URI, or the short name of the network connector resource. The format of this field is
   * `projects/locations/connectors` This field is mutually exclusive with `network` field and will
   * eventually replace it. See [the VPC documentation](https://cloud.google.com/compute/docs/vpc)
   * for more information on connecting Cloud projects.
   * @param vpcConnector vpcConnector or {@code null} for none
   */
  public CloudFunction setVpcConnector(java.lang.String vpcConnector) {
    this.vpcConnector = vpcConnector;
    return this;
  }

  /**
   * The egress settings for the connector, controlling what traffic is diverted through it.
   * @return value or {@code null} for none
   */
  public java.lang.String getVpcConnectorEgressSettings() {
    return vpcConnectorEgressSettings;
  }

  /**
   * The egress settings for the connector, controlling what traffic is diverted through it.
   * @param vpcConnectorEgressSettings vpcConnectorEgressSettings or {@code null} for none
   */
  public CloudFunction setVpcConnectorEgressSettings(java.lang.String vpcConnectorEgressSettings) {
    this.vpcConnectorEgressSettings = vpcConnectorEgressSettings;
    return this;
  }

  @Override
  public CloudFunction set(String fieldName, Object value) {
    return (CloudFunction) super.set(fieldName, value);
  }

  @Override
  public CloudFunction clone() {
    return (CloudFunction) super.clone();
  }

}
