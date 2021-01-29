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

package com.google.api.services.networkconnectivity.v1alpha1.model;

/**
 * A Spoke is an abstraction of a network attachment being attached to a Hub. A Spoke can be
 * underlying a VPN tunnel, a VLAN (interconnect) attachment, a Router appliance, etc.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Connectivity API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Spoke extends com.google.api.client.json.GenericJson {

  /**
   * The time when the Spoke was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Short description of the spoke resource
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The resource URL of the hub resource that the spoke is attached to
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hub;

  /**
   * User-defined labels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The URIs of linked interconnect attachment resources
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> linkedInterconnectAttachments;

  /**
   * The URIs of linked Router appliance resources
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RouterApplianceInstance> linkedRouterApplianceInstances;

  static {
    // hack to force ProGuard to consider RouterApplianceInstance used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(RouterApplianceInstance.class);
  }

  /**
   * The URIs of linked VPN tunnel resources
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> linkedVpnTunnels;

  /**
   * Immutable. The name of a Spoke resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The current lifecycle state of this Hub.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Google-generated UUID for this resource. This is unique across all Spoke
   * resources. If a Spoke resource is deleted and another with the same name is created, it gets a
   * different unique_id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uniqueId;

  /**
   * The time when the Spoke was updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * The time when the Spoke was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The time when the Spoke was created.
   * @param createTime createTime or {@code null} for none
   */
  public Spoke setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Short description of the spoke resource
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Short description of the spoke resource
   * @param description description or {@code null} for none
   */
  public Spoke setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The resource URL of the hub resource that the spoke is attached to
   * @return value or {@code null} for none
   */
  public java.lang.String getHub() {
    return hub;
  }

  /**
   * The resource URL of the hub resource that the spoke is attached to
   * @param hub hub or {@code null} for none
   */
  public Spoke setHub(java.lang.String hub) {
    this.hub = hub;
    return this;
  }

  /**
   * User-defined labels.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * User-defined labels.
   * @param labels labels or {@code null} for none
   */
  public Spoke setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The URIs of linked interconnect attachment resources
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLinkedInterconnectAttachments() {
    return linkedInterconnectAttachments;
  }

  /**
   * The URIs of linked interconnect attachment resources
   * @param linkedInterconnectAttachments linkedInterconnectAttachments or {@code null} for none
   */
  public Spoke setLinkedInterconnectAttachments(java.util.List<java.lang.String> linkedInterconnectAttachments) {
    this.linkedInterconnectAttachments = linkedInterconnectAttachments;
    return this;
  }

  /**
   * The URIs of linked Router appliance resources
   * @return value or {@code null} for none
   */
  public java.util.List<RouterApplianceInstance> getLinkedRouterApplianceInstances() {
    return linkedRouterApplianceInstances;
  }

  /**
   * The URIs of linked Router appliance resources
   * @param linkedRouterApplianceInstances linkedRouterApplianceInstances or {@code null} for none
   */
  public Spoke setLinkedRouterApplianceInstances(java.util.List<RouterApplianceInstance> linkedRouterApplianceInstances) {
    this.linkedRouterApplianceInstances = linkedRouterApplianceInstances;
    return this;
  }

  /**
   * The URIs of linked VPN tunnel resources
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLinkedVpnTunnels() {
    return linkedVpnTunnels;
  }

  /**
   * The URIs of linked VPN tunnel resources
   * @param linkedVpnTunnels linkedVpnTunnels or {@code null} for none
   */
  public Spoke setLinkedVpnTunnels(java.util.List<java.lang.String> linkedVpnTunnels) {
    this.linkedVpnTunnels = linkedVpnTunnels;
    return this;
  }

  /**
   * Immutable. The name of a Spoke resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Immutable. The name of a Spoke resource.
   * @param name name or {@code null} for none
   */
  public Spoke setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The current lifecycle state of this Hub.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The current lifecycle state of this Hub.
   * @param state state or {@code null} for none
   */
  public Spoke setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. Google-generated UUID for this resource. This is unique across all Spoke
   * resources. If a Spoke resource is deleted and another with the same name is created, it gets a
   * different unique_id.
   * @return value or {@code null} for none
   */
  public java.lang.String getUniqueId() {
    return uniqueId;
  }

  /**
   * Output only. Google-generated UUID for this resource. This is unique across all Spoke
   * resources. If a Spoke resource is deleted and another with the same name is created, it gets a
   * different unique_id.
   * @param uniqueId uniqueId or {@code null} for none
   */
  public Spoke setUniqueId(java.lang.String uniqueId) {
    this.uniqueId = uniqueId;
    return this;
  }

  /**
   * The time when the Spoke was updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * The time when the Spoke was updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public Spoke setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Spoke set(String fieldName, Object value) {
    return (Spoke) super.set(fieldName, value);
  }

  @Override
  public Spoke clone() {
    return (Spoke) super.clone();
  }

}
