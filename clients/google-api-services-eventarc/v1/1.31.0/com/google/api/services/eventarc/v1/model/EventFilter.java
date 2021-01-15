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
 * Filters events based on exact matches on the CloudEvents attributes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Eventarc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EventFilter extends com.google.api.client.json.GenericJson {

  /**
   * Required. The name of a CloudEvents attribute. Currently, only a subset of attributes are
   * supported for filtering. All triggers MUST provide a filter for the 'type' attribute.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String attribute;

  /**
   * Required. The value for the attribute.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * Required. The name of a CloudEvents attribute. Currently, only a subset of attributes are
   * supported for filtering. All triggers MUST provide a filter for the 'type' attribute.
   * @return value or {@code null} for none
   */
  public java.lang.String getAttribute() {
    return attribute;
  }

  /**
   * Required. The name of a CloudEvents attribute. Currently, only a subset of attributes are
   * supported for filtering. All triggers MUST provide a filter for the 'type' attribute.
   * @param attribute attribute or {@code null} for none
   */
  public EventFilter setAttribute(java.lang.String attribute) {
    this.attribute = attribute;
    return this;
  }

  /**
   * Required. The value for the attribute.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * Required. The value for the attribute.
   * @param value value or {@code null} for none
   */
  public EventFilter setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public EventFilter set(String fieldName, Object value) {
    return (EventFilter) super.set(fieldName, value);
  }

  @Override
  public EventFilter clone() {
    return (EventFilter) super.clone();
  }

}
