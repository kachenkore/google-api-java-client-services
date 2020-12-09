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
 * Google Groups provide your users the ability to send messages to groups of people using the
 * group's email address. For more information about common tasks, see the [Developer's Guide
 * ](/admin-sdk/directory/v1/guides/manage-groups).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin SDK API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Group extends com.google.api.client.json.GenericJson {

  /**
   * Value is `true` if this group was created by an administrator rather than a user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean adminCreated;

  /**
   * List of a group's alias email addresses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> aliases;

  /**
   * An extended description to help users determine the purpose of a group. For example, you can
   * include information about who should join the group, the types of messages to send to the
   * group, links to FAQs about the group, or related groups. Maximum length is `4,096` characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The number of users that are direct members of the group. If a group is a member (child) of
   * this group (the parent), members of the child group are not counted in the `directMembersCount`
   * property of the parent group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long directMembersCount;

  /**
   * The group's email address. If your account has multiple domains, select the appropriate domain
   * for the email address. The `email` must be unique. This property is required when creating a
   * group. Group email addresses are subject to the same character usage rules as usernames, see
   * the [administration help center](http://support.google.com/a/bin/answer.py?answer=33386) for
   * the details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * ETag of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The unique ID of a group. A group `id` can be used as a group request URI's `groupKey`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The type of the API resource. For Groups resources, the value is `admin#directory#group`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The group's display name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * List of the group's non-editable alias email addresses that are outside of the account's
   * primary domain or subdomains. These are functioning email addresses used by the group. This is
   * a read-only property returned in the API's response for a group. If edited in a group's POST or
   * PUT request, the edit is ignored by the API service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> nonEditableAliases;

  /**
   * Value is `true` if this group was created by an administrator rather than a user.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAdminCreated() {
    return adminCreated;
  }

  /**
   * Value is `true` if this group was created by an administrator rather than a user.
   * @param adminCreated adminCreated or {@code null} for none
   */
  public Group setAdminCreated(java.lang.Boolean adminCreated) {
    this.adminCreated = adminCreated;
    return this;
  }

  /**
   * List of a group's alias email addresses.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAliases() {
    return aliases;
  }

  /**
   * List of a group's alias email addresses.
   * @param aliases aliases or {@code null} for none
   */
  public Group setAliases(java.util.List<java.lang.String> aliases) {
    this.aliases = aliases;
    return this;
  }

  /**
   * An extended description to help users determine the purpose of a group. For example, you can
   * include information about who should join the group, the types of messages to send to the
   * group, links to FAQs about the group, or related groups. Maximum length is `4,096` characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An extended description to help users determine the purpose of a group. For example, you can
   * include information about who should join the group, the types of messages to send to the
   * group, links to FAQs about the group, or related groups. Maximum length is `4,096` characters.
   * @param description description or {@code null} for none
   */
  public Group setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The number of users that are direct members of the group. If a group is a member (child) of
   * this group (the parent), members of the child group are not counted in the `directMembersCount`
   * property of the parent group.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDirectMembersCount() {
    return directMembersCount;
  }

  /**
   * The number of users that are direct members of the group. If a group is a member (child) of
   * this group (the parent), members of the child group are not counted in the `directMembersCount`
   * property of the parent group.
   * @param directMembersCount directMembersCount or {@code null} for none
   */
  public Group setDirectMembersCount(java.lang.Long directMembersCount) {
    this.directMembersCount = directMembersCount;
    return this;
  }

  /**
   * The group's email address. If your account has multiple domains, select the appropriate domain
   * for the email address. The `email` must be unique. This property is required when creating a
   * group. Group email addresses are subject to the same character usage rules as usernames, see
   * the [administration help center](http://support.google.com/a/bin/answer.py?answer=33386) for
   * the details.
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * The group's email address. If your account has multiple domains, select the appropriate domain
   * for the email address. The `email` must be unique. This property is required when creating a
   * group. Group email addresses are subject to the same character usage rules as usernames, see
   * the [administration help center](http://support.google.com/a/bin/answer.py?answer=33386) for
   * the details.
   * @param email email or {@code null} for none
   */
  public Group setEmail(java.lang.String email) {
    this.email = email;
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
  public Group setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The unique ID of a group. A group `id` can be used as a group request URI's `groupKey`.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The unique ID of a group. A group `id` can be used as a group request URI's `groupKey`.
   * @param id id or {@code null} for none
   */
  public Group setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The type of the API resource. For Groups resources, the value is `admin#directory#group`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The type of the API resource. For Groups resources, the value is `admin#directory#group`.
   * @param kind kind or {@code null} for none
   */
  public Group setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The group's display name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The group's display name.
   * @param name name or {@code null} for none
   */
  public Group setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * List of the group's non-editable alias email addresses that are outside of the account's
   * primary domain or subdomains. These are functioning email addresses used by the group. This is
   * a read-only property returned in the API's response for a group. If edited in a group's POST or
   * PUT request, the edit is ignored by the API service.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getNonEditableAliases() {
    return nonEditableAliases;
  }

  /**
   * List of the group's non-editable alias email addresses that are outside of the account's
   * primary domain or subdomains. These are functioning email addresses used by the group. This is
   * a read-only property returned in the API's response for a group. If edited in a group's POST or
   * PUT request, the edit is ignored by the API service.
   * @param nonEditableAliases nonEditableAliases or {@code null} for none
   */
  public Group setNonEditableAliases(java.util.List<java.lang.String> nonEditableAliases) {
    this.nonEditableAliases = nonEditableAliases;
    return this;
  }

  @Override
  public Group set(String fieldName, Object value) {
    return (Group) super.set(fieldName, value);
  }

  @Override
  public Group clone() {
    return (Group) super.clone();
  }

}
