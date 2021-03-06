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

package com.google.api.services.dfareporting.model;

/**
 * Country List Response
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Campaign Manager 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CountriesListResponse extends com.google.api.client.json.GenericJson {

  /**
   * Country collection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Country> countries;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#countriesListResponse".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Country collection.
   * @return value or {@code null} for none
   */
  public java.util.List<Country> getCountries() {
    return countries;
  }

  /**
   * Country collection.
   * @param countries countries or {@code null} for none
   */
  public CountriesListResponse setCountries(java.util.List<Country> countries) {
    this.countries = countries;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#countriesListResponse".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#countriesListResponse".
   * @param kind kind or {@code null} for none
   */
  public CountriesListResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public CountriesListResponse set(String fieldName, Object value) {
    return (CountriesListResponse) super.set(fieldName, value);
  }

  @Override
  public CountriesListResponse clone() {
    return (CountriesListResponse) super.clone();
  }

}
