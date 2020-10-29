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

package com.google.api.services.datalabeling.v1beta1.model;

/**
 * Results for listing FeedbackMessages.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Data Labeling API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse extends com.google.api.client.json.GenericJson {

  /**
   * The list of feedback messages to return.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDatalabelingV1beta1FeedbackMessage> feedbackMessages;

  static {
    // hack to force ProGuard to consider GoogleCloudDatalabelingV1beta1FeedbackMessage used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDatalabelingV1beta1FeedbackMessage.class);
  }

  /**
   * A token to retrieve next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of feedback messages to return.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDatalabelingV1beta1FeedbackMessage> getFeedbackMessages() {
    return feedbackMessages;
  }

  /**
   * The list of feedback messages to return.
   * @param feedbackMessages feedbackMessages or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse setFeedbackMessages(java.util.List<GoogleCloudDatalabelingV1beta1FeedbackMessage> feedbackMessages) {
    this.feedbackMessages = feedbackMessages;
    return this;
  }

  /**
   * A token to retrieve next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token to retrieve next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public GoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse set(String fieldName, Object value) {
    return (GoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse clone() {
    return (GoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse) super.clone();
  }

}
