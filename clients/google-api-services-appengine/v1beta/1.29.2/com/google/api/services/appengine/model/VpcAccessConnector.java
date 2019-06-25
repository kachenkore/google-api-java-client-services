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
 * VPC access connector specification.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VpcAccessConnector extends com.google.api.client.json.GenericJson {

  /**
   * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-
   * central1/connectors/c1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-
   * central1/connectors/c1.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-
   * central1/connectors/c1.
   * @param name name or {@code null} for none
   */
  public VpcAccessConnector setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public VpcAccessConnector set(String fieldName, Object value) {
    return (VpcAccessConnector) super.set(fieldName, value);
  }

  @Override
  public VpcAccessConnector clone() {
    return (VpcAccessConnector) super.clone();
  }

}
