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

package com.google.api.services.remotebuildexecution.v1alpha.model;

/**
 * Defines whether a feature can be used or what values are accepted.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Remote Build Execution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature extends com.google.api.client.json.GenericJson {

  /**
   * A list of acceptable values. Only effective when the policy is `RESTRICTED`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowedValues;

  /**
   * The policy of the feature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String policy;

  /**
   * A list of acceptable values. Only effective when the policy is `RESTRICTED`.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowedValues() {
    return allowedValues;
  }

  /**
   * A list of acceptable values. Only effective when the policy is `RESTRICTED`.
   * @param allowedValues allowedValues or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature setAllowedValues(java.util.List<java.lang.String> allowedValues) {
    this.allowedValues = allowedValues;
    return this;
  }

  /**
   * The policy of the feature.
   * @return value or {@code null} for none
   */
  public java.lang.String getPolicy() {
    return policy;
  }

  /**
   * The policy of the feature.
   * @param policy policy or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature setPolicy(java.lang.String policy) {
    this.policy = policy;
    return this;
  }

  @Override
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature set(String fieldName, Object value) {
    return (GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature) super.set(fieldName, value);
  }

  @Override
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature clone() {
    return (GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature) super.clone();
  }

}
