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
 * A message representing a Measurement.
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
public final class GoogleCloudMlV1Measurement extends com.google.api.client.json.GenericJson {

  /**
   * Time that the Trial has been running at the point of this Measurement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String elapsedTime;

  /**
   * Provides a list of metrics that act as inputs into the objective function.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudMlV1MeasurementMetric> metrics;

  static {
    // hack to force ProGuard to consider GoogleCloudMlV1MeasurementMetric used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudMlV1MeasurementMetric.class);
  }

  /**
   * The number of steps a machine learning model has been trained for. Must be non-negative.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long stepCount;

  /**
   * Time that the Trial has been running at the point of this Measurement.
   * @return value or {@code null} for none
   */
  public String getElapsedTime() {
    return elapsedTime;
  }

  /**
   * Time that the Trial has been running at the point of this Measurement.
   * @param elapsedTime elapsedTime or {@code null} for none
   */
  public GoogleCloudMlV1Measurement setElapsedTime(String elapsedTime) {
    this.elapsedTime = elapsedTime;
    return this;
  }

  /**
   * Provides a list of metrics that act as inputs into the objective function.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudMlV1MeasurementMetric> getMetrics() {
    return metrics;
  }

  /**
   * Provides a list of metrics that act as inputs into the objective function.
   * @param metrics metrics or {@code null} for none
   */
  public GoogleCloudMlV1Measurement setMetrics(java.util.List<GoogleCloudMlV1MeasurementMetric> metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * The number of steps a machine learning model has been trained for. Must be non-negative.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStepCount() {
    return stepCount;
  }

  /**
   * The number of steps a machine learning model has been trained for. Must be non-negative.
   * @param stepCount stepCount or {@code null} for none
   */
  public GoogleCloudMlV1Measurement setStepCount(java.lang.Long stepCount) {
    this.stepCount = stepCount;
    return this;
  }

  @Override
  public GoogleCloudMlV1Measurement set(String fieldName, Object value) {
    return (GoogleCloudMlV1Measurement) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudMlV1Measurement clone() {
    return (GoogleCloudMlV1Measurement) super.clone();
  }

}
