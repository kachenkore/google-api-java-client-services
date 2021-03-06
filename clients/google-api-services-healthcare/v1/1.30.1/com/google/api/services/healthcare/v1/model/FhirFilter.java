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

package com.google.api.services.healthcare.v1.model;

/**
 * Filter configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FhirFilter extends com.google.api.client.json.GenericJson {

  /**
   * List of resources to include in the output. If this list is empty or not specified, all
   * resources are included in the output.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Resources resources;

  /**
   * List of resources to include in the output. If this list is empty or not specified, all
   * resources are included in the output.
   * @return value or {@code null} for none
   */
  public Resources getResources() {
    return resources;
  }

  /**
   * List of resources to include in the output. If this list is empty or not specified, all
   * resources are included in the output.
   * @param resources resources or {@code null} for none
   */
  public FhirFilter setResources(Resources resources) {
    this.resources = resources;
    return this;
  }

  @Override
  public FhirFilter set(String fieldName, Object value) {
    return (FhirFilter) super.set(fieldName, value);
  }

  @Override
  public FhirFilter clone() {
    return (FhirFilter) super.clone();
  }

}
