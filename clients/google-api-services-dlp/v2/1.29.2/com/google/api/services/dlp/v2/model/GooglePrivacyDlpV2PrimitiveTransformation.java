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

package com.google.api.services.dlp.v2.model;

/**
 * A rule for transforming a value.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2PrimitiveTransformation extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2BucketingConfig bucketingConfig;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2CharacterMaskConfig characterMaskConfig;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2CryptoDeterministicConfig cryptoDeterministicConfig;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2CryptoHashConfig cryptoHashConfig;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2CryptoReplaceFfxFpeConfig cryptoReplaceFfxFpeConfig;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2DateShiftConfig dateShiftConfig;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2FixedSizeBucketingConfig fixedSizeBucketingConfig;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2RedactConfig redactConfig;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2ReplaceValueConfig replaceConfig;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2ReplaceWithInfoTypeConfig replaceWithInfoTypeConfig;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2TimePartConfig timePartConfig;

  /**
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2BucketingConfig getBucketingConfig() {
    return bucketingConfig;
  }

  /**
   * @param bucketingConfig bucketingConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2PrimitiveTransformation setBucketingConfig(GooglePrivacyDlpV2BucketingConfig bucketingConfig) {
    this.bucketingConfig = bucketingConfig;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2CharacterMaskConfig getCharacterMaskConfig() {
    return characterMaskConfig;
  }

  /**
   * @param characterMaskConfig characterMaskConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2PrimitiveTransformation setCharacterMaskConfig(GooglePrivacyDlpV2CharacterMaskConfig characterMaskConfig) {
    this.characterMaskConfig = characterMaskConfig;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2CryptoDeterministicConfig getCryptoDeterministicConfig() {
    return cryptoDeterministicConfig;
  }

  /**
   * @param cryptoDeterministicConfig cryptoDeterministicConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2PrimitiveTransformation setCryptoDeterministicConfig(GooglePrivacyDlpV2CryptoDeterministicConfig cryptoDeterministicConfig) {
    this.cryptoDeterministicConfig = cryptoDeterministicConfig;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2CryptoHashConfig getCryptoHashConfig() {
    return cryptoHashConfig;
  }

  /**
   * @param cryptoHashConfig cryptoHashConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2PrimitiveTransformation setCryptoHashConfig(GooglePrivacyDlpV2CryptoHashConfig cryptoHashConfig) {
    this.cryptoHashConfig = cryptoHashConfig;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2CryptoReplaceFfxFpeConfig getCryptoReplaceFfxFpeConfig() {
    return cryptoReplaceFfxFpeConfig;
  }

  /**
   * @param cryptoReplaceFfxFpeConfig cryptoReplaceFfxFpeConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2PrimitiveTransformation setCryptoReplaceFfxFpeConfig(GooglePrivacyDlpV2CryptoReplaceFfxFpeConfig cryptoReplaceFfxFpeConfig) {
    this.cryptoReplaceFfxFpeConfig = cryptoReplaceFfxFpeConfig;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2DateShiftConfig getDateShiftConfig() {
    return dateShiftConfig;
  }

  /**
   * @param dateShiftConfig dateShiftConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2PrimitiveTransformation setDateShiftConfig(GooglePrivacyDlpV2DateShiftConfig dateShiftConfig) {
    this.dateShiftConfig = dateShiftConfig;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2FixedSizeBucketingConfig getFixedSizeBucketingConfig() {
    return fixedSizeBucketingConfig;
  }

  /**
   * @param fixedSizeBucketingConfig fixedSizeBucketingConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2PrimitiveTransformation setFixedSizeBucketingConfig(GooglePrivacyDlpV2FixedSizeBucketingConfig fixedSizeBucketingConfig) {
    this.fixedSizeBucketingConfig = fixedSizeBucketingConfig;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2RedactConfig getRedactConfig() {
    return redactConfig;
  }

  /**
   * @param redactConfig redactConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2PrimitiveTransformation setRedactConfig(GooglePrivacyDlpV2RedactConfig redactConfig) {
    this.redactConfig = redactConfig;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2ReplaceValueConfig getReplaceConfig() {
    return replaceConfig;
  }

  /**
   * @param replaceConfig replaceConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2PrimitiveTransformation setReplaceConfig(GooglePrivacyDlpV2ReplaceValueConfig replaceConfig) {
    this.replaceConfig = replaceConfig;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2ReplaceWithInfoTypeConfig getReplaceWithInfoTypeConfig() {
    return replaceWithInfoTypeConfig;
  }

  /**
   * @param replaceWithInfoTypeConfig replaceWithInfoTypeConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2PrimitiveTransformation setReplaceWithInfoTypeConfig(GooglePrivacyDlpV2ReplaceWithInfoTypeConfig replaceWithInfoTypeConfig) {
    this.replaceWithInfoTypeConfig = replaceWithInfoTypeConfig;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2TimePartConfig getTimePartConfig() {
    return timePartConfig;
  }

  /**
   * @param timePartConfig timePartConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2PrimitiveTransformation setTimePartConfig(GooglePrivacyDlpV2TimePartConfig timePartConfig) {
    this.timePartConfig = timePartConfig;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2PrimitiveTransformation set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2PrimitiveTransformation) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2PrimitiveTransformation clone() {
    return (GooglePrivacyDlpV2PrimitiveTransformation) super.clone();
  }

}
