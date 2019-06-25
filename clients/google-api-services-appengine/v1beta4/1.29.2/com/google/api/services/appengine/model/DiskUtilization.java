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

package com.google.api.services.appengine.model;

/**
 * Target scaling by disk usage. Only applicable for VM runtimes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DiskUtilization extends com.google.api.client.json.GenericJson {

  /**
   * Target bytes read per second.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer targetReadBytesPerSec;

  /**
   * Target ops read per second.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer targetReadOpsPerSec;

  /**
   * Target bytes written per second.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer targetWriteBytesPerSec;

  /**
   * Target ops written per second.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer targetWriteOpsPerSec;

  /**
   * Target bytes read per second.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTargetReadBytesPerSec() {
    return targetReadBytesPerSec;
  }

  /**
   * Target bytes read per second.
   * @param targetReadBytesPerSec targetReadBytesPerSec or {@code null} for none
   */
  public DiskUtilization setTargetReadBytesPerSec(java.lang.Integer targetReadBytesPerSec) {
    this.targetReadBytesPerSec = targetReadBytesPerSec;
    return this;
  }

  /**
   * Target ops read per second.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTargetReadOpsPerSec() {
    return targetReadOpsPerSec;
  }

  /**
   * Target ops read per second.
   * @param targetReadOpsPerSec targetReadOpsPerSec or {@code null} for none
   */
  public DiskUtilization setTargetReadOpsPerSec(java.lang.Integer targetReadOpsPerSec) {
    this.targetReadOpsPerSec = targetReadOpsPerSec;
    return this;
  }

  /**
   * Target bytes written per second.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTargetWriteBytesPerSec() {
    return targetWriteBytesPerSec;
  }

  /**
   * Target bytes written per second.
   * @param targetWriteBytesPerSec targetWriteBytesPerSec or {@code null} for none
   */
  public DiskUtilization setTargetWriteBytesPerSec(java.lang.Integer targetWriteBytesPerSec) {
    this.targetWriteBytesPerSec = targetWriteBytesPerSec;
    return this;
  }

  /**
   * Target ops written per second.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTargetWriteOpsPerSec() {
    return targetWriteOpsPerSec;
  }

  /**
   * Target ops written per second.
   * @param targetWriteOpsPerSec targetWriteOpsPerSec or {@code null} for none
   */
  public DiskUtilization setTargetWriteOpsPerSec(java.lang.Integer targetWriteOpsPerSec) {
    this.targetWriteOpsPerSec = targetWriteOpsPerSec;
    return this;
  }

  @Override
  public DiskUtilization set(String fieldName, Object value) {
    return (DiskUtilization) super.set(fieldName, value);
  }

  @Override
  public DiskUtilization clone() {
    return (DiskUtilization) super.clone();
  }

}
