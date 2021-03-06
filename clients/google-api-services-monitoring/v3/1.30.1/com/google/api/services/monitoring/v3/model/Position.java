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

package com.google.api.services.monitoring.v3.model;

/**
 * The position of a byte within the text.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Position extends com.google.api.client.json.GenericJson {

  /**
   * The column within the line, starting with 1, where the byte is positioned. This is a byte index
   * even though the text is UTF-8.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer column;

  /**
   * The line, starting with 1, where the byte is positioned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer line;

  /**
   * The column within the line, starting with 1, where the byte is positioned. This is a byte index
   * even though the text is UTF-8.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getColumn() {
    return column;
  }

  /**
   * The column within the line, starting with 1, where the byte is positioned. This is a byte index
   * even though the text is UTF-8.
   * @param column column or {@code null} for none
   */
  public Position setColumn(java.lang.Integer column) {
    this.column = column;
    return this;
  }

  /**
   * The line, starting with 1, where the byte is positioned.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLine() {
    return line;
  }

  /**
   * The line, starting with 1, where the byte is positioned.
   * @param line line or {@code null} for none
   */
  public Position setLine(java.lang.Integer line) {
    this.line = line;
    return this;
  }

  @Override
  public Position set(String fieldName, Object value) {
    return (Position) super.set(fieldName, value);
  }

  @Override
  public Position clone() {
    return (Position) super.clone();
  }

}
