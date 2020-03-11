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

package com.google.api.services.ml.v1.model;

/**
 * A message representing a Trial.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AI Platform Training & Prediction API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudMlV1Trial extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The identifier of the client that originally requested this trial.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientId;

  /**
   * Output only. Time the Trial's status changed to COMPLETED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * The final Measurement containing the objective value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudMlV1Measurement finalMeasurement;

  /**
   * Output only. A human readable string describing why the Trial is infeasible. This should only
   * be set if trial_infeasible is true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String infeasibleReason;

  /**
   * A list of measurements that are strictly lexicographically ordered by their induced tuples
   * (steps, elapsed_time). These are used for early stopping computations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudMlV1Measurement> measurements;

  static {
    // hack to force ProGuard to consider GoogleCloudMlV1Measurement used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudMlV1Measurement.class);
  }

  /**
   * Output only. Name of the trial assigned by the service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The parameters of the Trial.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudMlV1TrialParameter> parameters;

  static {
    // hack to force ProGuard to consider GoogleCloudMlV1TrialParameter used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudMlV1TrialParameter.class);
  }

  /**
   * Output only. Time the Trial was started.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * The detailed state of a trial.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. True if the parameters in this trial should not be attempted again.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean trialInfeasible;

  /**
   * Output only. The identifier of the client that originally requested this trial.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientId() {
    return clientId;
  }

  /**
   * Output only. The identifier of the client that originally requested this trial.
   * @param clientId clientId or {@code null} for none
   */
  public GoogleCloudMlV1Trial setClientId(java.lang.String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Output only. Time the Trial's status changed to COMPLETED.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Output only. Time the Trial's status changed to COMPLETED.
   * @param endTime endTime or {@code null} for none
   */
  public GoogleCloudMlV1Trial setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The final Measurement containing the objective value.
   * @return value or {@code null} for none
   */
  public GoogleCloudMlV1Measurement getFinalMeasurement() {
    return finalMeasurement;
  }

  /**
   * The final Measurement containing the objective value.
   * @param finalMeasurement finalMeasurement or {@code null} for none
   */
  public GoogleCloudMlV1Trial setFinalMeasurement(GoogleCloudMlV1Measurement finalMeasurement) {
    this.finalMeasurement = finalMeasurement;
    return this;
  }

  /**
   * Output only. A human readable string describing why the Trial is infeasible. This should only
   * be set if trial_infeasible is true.
   * @return value or {@code null} for none
   */
  public java.lang.String getInfeasibleReason() {
    return infeasibleReason;
  }

  /**
   * Output only. A human readable string describing why the Trial is infeasible. This should only
   * be set if trial_infeasible is true.
   * @param infeasibleReason infeasibleReason or {@code null} for none
   */
  public GoogleCloudMlV1Trial setInfeasibleReason(java.lang.String infeasibleReason) {
    this.infeasibleReason = infeasibleReason;
    return this;
  }

  /**
   * A list of measurements that are strictly lexicographically ordered by their induced tuples
   * (steps, elapsed_time). These are used for early stopping computations.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudMlV1Measurement> getMeasurements() {
    return measurements;
  }

  /**
   * A list of measurements that are strictly lexicographically ordered by their induced tuples
   * (steps, elapsed_time). These are used for early stopping computations.
   * @param measurements measurements or {@code null} for none
   */
  public GoogleCloudMlV1Trial setMeasurements(java.util.List<GoogleCloudMlV1Measurement> measurements) {
    this.measurements = measurements;
    return this;
  }

  /**
   * Output only. Name of the trial assigned by the service.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Name of the trial assigned by the service.
   * @param name name or {@code null} for none
   */
  public GoogleCloudMlV1Trial setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The parameters of the Trial.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudMlV1TrialParameter> getParameters() {
    return parameters;
  }

  /**
   * The parameters of the Trial.
   * @param parameters parameters or {@code null} for none
   */
  public GoogleCloudMlV1Trial setParameters(java.util.List<GoogleCloudMlV1TrialParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Output only. Time the Trial was started.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Output only. Time the Trial was started.
   * @param startTime startTime or {@code null} for none
   */
  public GoogleCloudMlV1Trial setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * The detailed state of a trial.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The detailed state of a trial.
   * @param state state or {@code null} for none
   */
  public GoogleCloudMlV1Trial setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. True if the parameters in this trial should not be attempted again.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getTrialInfeasible() {
    return trialInfeasible;
  }

  /**
   * Output only. True if the parameters in this trial should not be attempted again.
   * @param trialInfeasible trialInfeasible or {@code null} for none
   */
  public GoogleCloudMlV1Trial setTrialInfeasible(java.lang.Boolean trialInfeasible) {
    this.trialInfeasible = trialInfeasible;
    return this;
  }

  @Override
  public GoogleCloudMlV1Trial set(String fieldName, Object value) {
    return (GoogleCloudMlV1Trial) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudMlV1Trial clone() {
    return (GoogleCloudMlV1Trial) super.clone();
  }

}
