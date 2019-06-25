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
 * Response message for Instances.ListInstances.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListInstancesResponse extends com.google.api.client.json.GenericJson {

  /**
   * The instances belonging to the requested version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Instance> instances;

  static {
    // hack to force ProGuard to consider Instance used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Instance.class);
  }

  /**
   * Continuation token for fetching the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The instances belonging to the requested version.
   * @return value or {@code null} for none
   */
  public java.util.List<Instance> getInstances() {
    return instances;
  }

  /**
   * The instances belonging to the requested version.
   * @param instances instances or {@code null} for none
   */
  public ListInstancesResponse setInstances(java.util.List<Instance> instances) {
    this.instances = instances;
    return this;
  }

  /**
   * Continuation token for fetching the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Continuation token for fetching the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListInstancesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListInstancesResponse set(String fieldName, Object value) {
    return (ListInstancesResponse) super.set(fieldName, value);
  }

  @Override
  public ListInstancesResponse clone() {
    return (ListInstancesResponse) super.clone();
  }

}
