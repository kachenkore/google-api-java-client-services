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

package com.google.api.services.directory.model;

/**
 * Model definition for ChromeOsDevices.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin SDK API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ChromeOsDevices extends com.google.api.client.json.GenericJson {

  /**
   * List of Chrome OS Device objects.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ChromeOsDevice> chromeosdevices;

  static {
    // hack to force ProGuard to consider ChromeOsDevice used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ChromeOsDevice.class);
  }

  /**
   * ETag of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Kind of resource this is.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Token used to access the next page of this result. To access the next page, use this token's
   * value in the `pageToken` query string of this request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List of Chrome OS Device objects.
   * @return value or {@code null} for none
   */
  public java.util.List<ChromeOsDevice> getChromeosdevices() {
    return chromeosdevices;
  }

  /**
   * List of Chrome OS Device objects.
   * @param chromeosdevices chromeosdevices or {@code null} for none
   */
  public ChromeOsDevices setChromeosdevices(java.util.List<ChromeOsDevice> chromeosdevices) {
    this.chromeosdevices = chromeosdevices;
    return this;
  }

  /**
   * ETag of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * ETag of the resource.
   * @param etag etag or {@code null} for none
   */
  public ChromeOsDevices setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Kind of resource this is.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Kind of resource this is.
   * @param kind kind or {@code null} for none
   */
  public ChromeOsDevices setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Token used to access the next page of this result. To access the next page, use this token's
   * value in the `pageToken` query string of this request.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Token used to access the next page of this result. To access the next page, use this token's
   * value in the `pageToken` query string of this request.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ChromeOsDevices setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ChromeOsDevices set(String fieldName, Object value) {
    return (ChromeOsDevices) super.set(fieldName, value);
  }

  @Override
  public ChromeOsDevices clone() {
    return (ChromeOsDevices) super.clone();
  }

}
