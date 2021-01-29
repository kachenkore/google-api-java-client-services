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

package com.google.api.services.compute.model;

/**
 * Model definition for FirewallPolicyRuleMatcherLayer4Config.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FirewallPolicyRuleMatcherLayer4Config extends com.google.api.client.json.GenericJson {

  /**
   * The IP protocol to which this rule applies. The protocol type is required when creating a
   * firewall rule. This value can either be one of the following well known protocol strings (tcp,
   * udp, icmp, esp, ah, ipip, sctp), or the IP protocol number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipProtocol;

  /**
   * An optional list of ports to which this rule applies. This field is only applicable for UDP or
   * TCP protocol. Each entry must be either an integer or a range. If not specified, this rule
   * applies to connections through any port.
   *
   * Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> ports;

  /**
   * The IP protocol to which this rule applies. The protocol type is required when creating a
   * firewall rule. This value can either be one of the following well known protocol strings (tcp,
   * udp, icmp, esp, ah, ipip, sctp), or the IP protocol number.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpProtocol() {
    return ipProtocol;
  }

  /**
   * The IP protocol to which this rule applies. The protocol type is required when creating a
   * firewall rule. This value can either be one of the following well known protocol strings (tcp,
   * udp, icmp, esp, ah, ipip, sctp), or the IP protocol number.
   * @param ipProtocol ipProtocol or {@code null} for none
   */
  public FirewallPolicyRuleMatcherLayer4Config setIpProtocol(java.lang.String ipProtocol) {
    this.ipProtocol = ipProtocol;
    return this;
  }

  /**
   * An optional list of ports to which this rule applies. This field is only applicable for UDP or
   * TCP protocol. Each entry must be either an integer or a range. If not specified, this rule
   * applies to connections through any port.
   *
   * Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPorts() {
    return ports;
  }

  /**
   * An optional list of ports to which this rule applies. This field is only applicable for UDP or
   * TCP protocol. Each entry must be either an integer or a range. If not specified, this rule
   * applies to connections through any port.
   *
   * Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
   * @param ports ports or {@code null} for none
   */
  public FirewallPolicyRuleMatcherLayer4Config setPorts(java.util.List<java.lang.String> ports) {
    this.ports = ports;
    return this;
  }

  @Override
  public FirewallPolicyRuleMatcherLayer4Config set(String fieldName, Object value) {
    return (FirewallPolicyRuleMatcherLayer4Config) super.set(fieldName, value);
  }

  @Override
  public FirewallPolicyRuleMatcherLayer4Config clone() {
    return (FirewallPolicyRuleMatcherLayer4Config) super.clone();
  }

}
