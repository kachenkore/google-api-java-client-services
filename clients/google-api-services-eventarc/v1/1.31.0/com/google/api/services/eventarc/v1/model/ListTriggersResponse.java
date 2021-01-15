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

package com.google.api.services.eventarc.v1.model;

/**
 * The response message for the ListTriggers method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Eventarc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListTriggersResponse extends com.google.api.client.json.GenericJson {

  /**
   * A page token that can be sent to ListTriggers to request the next page. If this is empty, then
   * there are no more pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The requested triggers, up to the number specified in `page_size`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Trigger> triggers;

  /**
   * Unreachable resources, if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> unreachable;

  /**
   * A page token that can be sent to ListTriggers to request the next page. If this is empty, then
   * there are no more pages.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A page token that can be sent to ListTriggers to request the next page. If this is empty, then
   * there are no more pages.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListTriggersResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The requested triggers, up to the number specified in `page_size`.
   * @return value or {@code null} for none
   */
  public java.util.List<Trigger> getTriggers() {
    return triggers;
  }

  /**
   * The requested triggers, up to the number specified in `page_size`.
   * @param triggers triggers or {@code null} for none
   */
  public ListTriggersResponse setTriggers(java.util.List<Trigger> triggers) {
    this.triggers = triggers;
    return this;
  }

  /**
   * Unreachable resources, if any.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUnreachable() {
    return unreachable;
  }

  /**
   * Unreachable resources, if any.
   * @param unreachable unreachable or {@code null} for none
   */
  public ListTriggersResponse setUnreachable(java.util.List<java.lang.String> unreachable) {
    this.unreachable = unreachable;
    return this;
  }

  @Override
  public ListTriggersResponse set(String fieldName, Object value) {
    return (ListTriggersResponse) super.set(fieldName, value);
  }

  @Override
  public ListTriggersResponse clone() {
    return (ListTriggersResponse) super.clone();
  }

}
