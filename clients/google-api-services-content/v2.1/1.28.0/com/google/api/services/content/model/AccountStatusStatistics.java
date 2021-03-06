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

package com.google.api.services.content.model;

/**
 * Model definition for AccountStatusStatistics.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AccountStatusStatistics extends com.google.api.client.json.GenericJson {

  /**
   * Number of active offers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long active;

  /**
   * Number of disapproved offers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long disapproved;

  /**
   * Number of expiring offers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long expiring;

  /**
   * Number of pending offers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long pending;

  /**
   * Number of active offers.
   * @return value or {@code null} for none
   */
  public java.lang.Long getActive() {
    return active;
  }

  /**
   * Number of active offers.
   * @param active active or {@code null} for none
   */
  public AccountStatusStatistics setActive(java.lang.Long active) {
    this.active = active;
    return this;
  }

  /**
   * Number of disapproved offers.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDisapproved() {
    return disapproved;
  }

  /**
   * Number of disapproved offers.
   * @param disapproved disapproved or {@code null} for none
   */
  public AccountStatusStatistics setDisapproved(java.lang.Long disapproved) {
    this.disapproved = disapproved;
    return this;
  }

  /**
   * Number of expiring offers.
   * @return value or {@code null} for none
   */
  public java.lang.Long getExpiring() {
    return expiring;
  }

  /**
   * Number of expiring offers.
   * @param expiring expiring or {@code null} for none
   */
  public AccountStatusStatistics setExpiring(java.lang.Long expiring) {
    this.expiring = expiring;
    return this;
  }

  /**
   * Number of pending offers.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPending() {
    return pending;
  }

  /**
   * Number of pending offers.
   * @param pending pending or {@code null} for none
   */
  public AccountStatusStatistics setPending(java.lang.Long pending) {
    this.pending = pending;
    return this;
  }

  @Override
  public AccountStatusStatistics set(String fieldName, Object value) {
    return (AccountStatusStatistics) super.set(fieldName, value);
  }

  @Override
  public AccountStatusStatistics clone() {
    return (AccountStatusStatistics) super.clone();
  }

}
