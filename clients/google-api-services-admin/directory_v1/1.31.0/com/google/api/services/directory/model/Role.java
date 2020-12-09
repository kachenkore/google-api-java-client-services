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
 * Model definition for Role.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin SDK API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Role extends com.google.api.client.json.GenericJson {

  /**
   * ETag of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Returns `true` if the role is a super admin role.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isSuperAdminRole;

  /**
   * Returns `true` if this is a pre-defined system role.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isSystemRole;

  /**
   * The type of the API resource. This is always `admin#directory#role`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A short description of the role.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String roleDescription;

  /**
   * ID of the role.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long roleId;

  /**
   * Name of the role.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String roleName;

  /**
   * The set of privileges that are granted to this role.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RolePrivileges> rolePrivileges;

  static {
    // hack to force ProGuard to consider RolePrivileges used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(RolePrivileges.class);
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
  public Role setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Returns `true` if the role is a super admin role.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsSuperAdminRole() {
    return isSuperAdminRole;
  }

  /**
   * Returns `true` if the role is a super admin role.
   * @param isSuperAdminRole isSuperAdminRole or {@code null} for none
   */
  public Role setIsSuperAdminRole(java.lang.Boolean isSuperAdminRole) {
    this.isSuperAdminRole = isSuperAdminRole;
    return this;
  }

  /**
   * Returns `true` if this is a pre-defined system role.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsSystemRole() {
    return isSystemRole;
  }

  /**
   * Returns `true` if this is a pre-defined system role.
   * @param isSystemRole isSystemRole or {@code null} for none
   */
  public Role setIsSystemRole(java.lang.Boolean isSystemRole) {
    this.isSystemRole = isSystemRole;
    return this;
  }

  /**
   * The type of the API resource. This is always `admin#directory#role`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The type of the API resource. This is always `admin#directory#role`.
   * @param kind kind or {@code null} for none
   */
  public Role setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A short description of the role.
   * @return value or {@code null} for none
   */
  public java.lang.String getRoleDescription() {
    return roleDescription;
  }

  /**
   * A short description of the role.
   * @param roleDescription roleDescription or {@code null} for none
   */
  public Role setRoleDescription(java.lang.String roleDescription) {
    this.roleDescription = roleDescription;
    return this;
  }

  /**
   * ID of the role.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRoleId() {
    return roleId;
  }

  /**
   * ID of the role.
   * @param roleId roleId or {@code null} for none
   */
  public Role setRoleId(java.lang.Long roleId) {
    this.roleId = roleId;
    return this;
  }

  /**
   * Name of the role.
   * @return value or {@code null} for none
   */
  public java.lang.String getRoleName() {
    return roleName;
  }

  /**
   * Name of the role.
   * @param roleName roleName or {@code null} for none
   */
  public Role setRoleName(java.lang.String roleName) {
    this.roleName = roleName;
    return this;
  }

  /**
   * The set of privileges that are granted to this role.
   * @return value or {@code null} for none
   */
  public java.util.List<RolePrivileges> getRolePrivileges() {
    return rolePrivileges;
  }

  /**
   * The set of privileges that are granted to this role.
   * @param rolePrivileges rolePrivileges or {@code null} for none
   */
  public Role setRolePrivileges(java.util.List<RolePrivileges> rolePrivileges) {
    this.rolePrivileges = rolePrivileges;
    return this;
  }

  @Override
  public Role set(String fieldName, Object value) {
    return (Role) super.set(fieldName, value);
  }

  @Override
  public Role clone() {
    return (Role) super.clone();
  }

  /**
   * Model definition for RoleRolePrivileges.
   */
  public static final class RolePrivileges extends com.google.api.client.json.GenericJson {

    /**
     * The name of the privilege.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String privilegeName;

    /**
     * The obfuscated ID of the service this privilege is for. This value is returned with
     * [`Privileges.list()`](/admin-sdk/directory/v1/reference/privileges/list).
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String serviceId;

    /**
     * The name of the privilege.
     * @return value or {@code null} for none
     */
    public java.lang.String getPrivilegeName() {
      return privilegeName;
    }

    /**
     * The name of the privilege.
     * @param privilegeName privilegeName or {@code null} for none
     */
    public RolePrivileges setPrivilegeName(java.lang.String privilegeName) {
      this.privilegeName = privilegeName;
      return this;
    }

    /**
     * The obfuscated ID of the service this privilege is for. This value is returned with
     * [`Privileges.list()`](/admin-sdk/directory/v1/reference/privileges/list).
     * @return value or {@code null} for none
     */
    public java.lang.String getServiceId() {
      return serviceId;
    }

    /**
     * The obfuscated ID of the service this privilege is for. This value is returned with
     * [`Privileges.list()`](/admin-sdk/directory/v1/reference/privileges/list).
     * @param serviceId serviceId or {@code null} for none
     */
    public RolePrivileges setServiceId(java.lang.String serviceId) {
      this.serviceId = serviceId;
      return this;
    }

    @Override
    public RolePrivileges set(String fieldName, Object value) {
      return (RolePrivileges) super.set(fieldName, value);
    }

    @Override
    public RolePrivileges clone() {
      return (RolePrivileges) super.clone();
    }

  }

}
