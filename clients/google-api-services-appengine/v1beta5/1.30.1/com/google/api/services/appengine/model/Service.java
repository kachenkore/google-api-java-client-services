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
 * A Service resource is a logical component of an application that can share state and communicate
 * in a secure fashion with other services. For example, an application that handles customer
 * requests might include separate services to handle other tasks such as API requests from mobile
 * devices or backend data analysis. Each service has a collection of versions that define a
 * specific set of code used to implement the functionality of that service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Service extends com.google.api.client.json.GenericJson {

  /**
   * Relative name of the service within the application. Example: default.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Full path to the Service resource in the API. Example: apps/myapp/services/default.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Mapping that defines fractional HTTP traffic diversion to different versions within the
   * service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TrafficSplit split;

  /**
   * Relative name of the service within the application. Example: default.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Relative name of the service within the application. Example: default.@OutputOnly
   * @param id id or {@code null} for none
   */
  public Service setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Full path to the Service resource in the API. Example: apps/myapp/services/default.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Full path to the Service resource in the API. Example: apps/myapp/services/default.@OutputOnly
   * @param name name or {@code null} for none
   */
  public Service setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Mapping that defines fractional HTTP traffic diversion to different versions within the
   * service.
   * @return value or {@code null} for none
   */
  public TrafficSplit getSplit() {
    return split;
  }

  /**
   * Mapping that defines fractional HTTP traffic diversion to different versions within the
   * service.
   * @param split split or {@code null} for none
   */
  public Service setSplit(TrafficSplit split) {
    this.split = split;
    return this;
  }

  @Override
  public Service set(String fieldName, Object value) {
    return (Service) super.set(fieldName, value);
  }

  @Override
  public Service clone() {
    return (Service) super.clone();
  }

}
