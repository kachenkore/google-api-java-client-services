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

package com.google.api.services.datatransfer.model;

/**
 * Template to map fields of ApplicationDataTransfer resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin SDK API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ApplicationDataTransfer extends com.google.api.client.json.GenericJson {

  /**
   * The application's ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long applicationId;

  /**
   * The transfer parameters for the application. These parameters are used to select the data which
   * will get transferred in context of this application.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ApplicationTransferParam> applicationTransferParams;

  /**
   * Current status of transfer for this application. (Read-only)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String applicationTransferStatus;

  /**
   * The application's ID.
   * @return value or {@code null} for none
   */
  public java.lang.Long getApplicationId() {
    return applicationId;
  }

  /**
   * The application's ID.
   * @param applicationId applicationId or {@code null} for none
   */
  public ApplicationDataTransfer setApplicationId(java.lang.Long applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * The transfer parameters for the application. These parameters are used to select the data which
   * will get transferred in context of this application.
   * @return value or {@code null} for none
   */
  public java.util.List<ApplicationTransferParam> getApplicationTransferParams() {
    return applicationTransferParams;
  }

  /**
   * The transfer parameters for the application. These parameters are used to select the data which
   * will get transferred in context of this application.
   * @param applicationTransferParams applicationTransferParams or {@code null} for none
   */
  public ApplicationDataTransfer setApplicationTransferParams(java.util.List<ApplicationTransferParam> applicationTransferParams) {
    this.applicationTransferParams = applicationTransferParams;
    return this;
  }

  /**
   * Current status of transfer for this application. (Read-only)
   * @return value or {@code null} for none
   */
  public java.lang.String getApplicationTransferStatus() {
    return applicationTransferStatus;
  }

  /**
   * Current status of transfer for this application. (Read-only)
   * @param applicationTransferStatus applicationTransferStatus or {@code null} for none
   */
  public ApplicationDataTransfer setApplicationTransferStatus(java.lang.String applicationTransferStatus) {
    this.applicationTransferStatus = applicationTransferStatus;
    return this;
  }

  @Override
  public ApplicationDataTransfer set(String fieldName, Object value) {
    return (ApplicationDataTransfer) super.set(fieldName, value);
  }

  @Override
  public ApplicationDataTransfer clone() {
    return (ApplicationDataTransfer) super.clone();
  }

}
