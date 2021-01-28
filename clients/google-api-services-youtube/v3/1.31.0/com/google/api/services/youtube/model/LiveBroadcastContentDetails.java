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

package com.google.api.services.youtube.model;

/**
 * Detailed settings of a broadcast.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API v3. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LiveBroadcastContentDetails extends com.google.api.client.json.GenericJson {

  /**
   * This value uniquely identifies the live stream bound to the broadcast.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String boundStreamId;

  /**
   * The date and time that the live stream referenced by boundStreamId was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime boundStreamLastUpdateTimeMs;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String closedCaptionsType;

  /**
   * This setting indicates whether auto start is enabled for this broadcast. The default value for
   * this property is false. This setting can only be used by Events.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableAutoStart;

  /**
   * This setting indicates whether auto stop is enabled for this broadcast. The default value for
   * this property is false. This setting can only be used by Events.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableAutoStop;

  /**
   * This setting indicates whether HTTP POST closed captioning is enabled for this broadcast. The
   * ingestion URL of the closed captions is returned through the liveStreams API. This is mutually
   * exclusive with using the closed_captions_type property, and is equivalent to setting
   * closed_captions_type to CLOSED_CAPTIONS_HTTP_POST.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableClosedCaptions;

  /**
   * This setting indicates whether YouTube should enable content encryption for the broadcast.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableContentEncryption;

  /**
   * This setting determines whether viewers can access DVR controls while watching the video. DVR
   * controls enable the viewer to control the video playback experience by pausing, rewinding, or
   * fast forwarding content. The default value for this property is true. *Important:* You must set
   * the value to true and also set the enableArchive property's value to true if you want to make
   * playback available immediately after the broadcast ends.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableDvr;

  /**
   * This setting indicates whether the broadcast video can be played in an embedded player. If you
   * choose to archive the video (using the enableArchive property), this setting will also apply to
   * the archived video.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableEmbed;

  /**
   * Indicates whether this broadcast has low latency enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableLowLatency;

  /**
   * If both this and enable_low_latency are set, they must match. LATENCY_NORMAL should match
   * enable_low_latency=false LATENCY_LOW should match enable_low_latency=true LATENCY_ULTRA_LOW
   * should have enable_low_latency omitted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String latencyPreference;

  /**
   * The mesh for projecting the video if projection is mesh. The mesh value must be a UTF-8 string
   * containing the base-64 encoding of 3D mesh data that follows the Spherical Video V2 RFC
   * specification for an mshp box, excluding the box size and type but including the following four
   * reserved zero bytes for the version and flags.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mesh;

  /**
   * The monitorStream object contains information about the monitor stream, which the broadcaster
   * can use to review the event content before the broadcast stream is shown publicly.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MonitorStreamInfo monitorStream;

  /**
   * The projection format of this broadcast. This defaults to rectangular.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projection;

  /**
   * Automatically start recording after the event goes live. The default value for this property is
   * true. *Important:* You must also set the enableDvr property's value to true if you want the
   * playback to be available immediately after the broadcast ends. If you set this property's value
   * to true but do not also set the enableDvr property to true, there may be a delay of around one
   * day before the archived video will be available for playback.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean recordFromStart;

  /**
   * This setting indicates whether the broadcast should automatically begin with an in-stream slate
   * when you update the broadcast's status to live. After updating the status, you then need to
   * send a liveCuepoints.insert request that sets the cuepoint's eventState to end to remove the
   * in-stream slate and make your broadcast stream visible to viewers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean startWithSlate;

  /**
   * The 3D stereo layout of this broadcast. This defaults to mono.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stereoLayout;

  /**
   * This value uniquely identifies the live stream bound to the broadcast.
   * @return value or {@code null} for none
   */
  public java.lang.String getBoundStreamId() {
    return boundStreamId;
  }

  /**
   * This value uniquely identifies the live stream bound to the broadcast.
   * @param boundStreamId boundStreamId or {@code null} for none
   */
  public LiveBroadcastContentDetails setBoundStreamId(java.lang.String boundStreamId) {
    this.boundStreamId = boundStreamId;
    return this;
  }

  /**
   * The date and time that the live stream referenced by boundStreamId was last updated.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getBoundStreamLastUpdateTimeMs() {
    return boundStreamLastUpdateTimeMs;
  }

  /**
   * The date and time that the live stream referenced by boundStreamId was last updated.
   * @param boundStreamLastUpdateTimeMs boundStreamLastUpdateTimeMs or {@code null} for none
   */
  public LiveBroadcastContentDetails setBoundStreamLastUpdateTimeMs(com.google.api.client.util.DateTime boundStreamLastUpdateTimeMs) {
    this.boundStreamLastUpdateTimeMs = boundStreamLastUpdateTimeMs;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getClosedCaptionsType() {
    return closedCaptionsType;
  }

  /**
   * @param closedCaptionsType closedCaptionsType or {@code null} for none
   */
  public LiveBroadcastContentDetails setClosedCaptionsType(java.lang.String closedCaptionsType) {
    this.closedCaptionsType = closedCaptionsType;
    return this;
  }

  /**
   * This setting indicates whether auto start is enabled for this broadcast. The default value for
   * this property is false. This setting can only be used by Events.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableAutoStart() {
    return enableAutoStart;
  }

  /**
   * This setting indicates whether auto start is enabled for this broadcast. The default value for
   * this property is false. This setting can only be used by Events.
   * @param enableAutoStart enableAutoStart or {@code null} for none
   */
  public LiveBroadcastContentDetails setEnableAutoStart(java.lang.Boolean enableAutoStart) {
    this.enableAutoStart = enableAutoStart;
    return this;
  }

  /**
   * This setting indicates whether auto stop is enabled for this broadcast. The default value for
   * this property is false. This setting can only be used by Events.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableAutoStop() {
    return enableAutoStop;
  }

  /**
   * This setting indicates whether auto stop is enabled for this broadcast. The default value for
   * this property is false. This setting can only be used by Events.
   * @param enableAutoStop enableAutoStop or {@code null} for none
   */
  public LiveBroadcastContentDetails setEnableAutoStop(java.lang.Boolean enableAutoStop) {
    this.enableAutoStop = enableAutoStop;
    return this;
  }

  /**
   * This setting indicates whether HTTP POST closed captioning is enabled for this broadcast. The
   * ingestion URL of the closed captions is returned through the liveStreams API. This is mutually
   * exclusive with using the closed_captions_type property, and is equivalent to setting
   * closed_captions_type to CLOSED_CAPTIONS_HTTP_POST.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableClosedCaptions() {
    return enableClosedCaptions;
  }

  /**
   * This setting indicates whether HTTP POST closed captioning is enabled for this broadcast. The
   * ingestion URL of the closed captions is returned through the liveStreams API. This is mutually
   * exclusive with using the closed_captions_type property, and is equivalent to setting
   * closed_captions_type to CLOSED_CAPTIONS_HTTP_POST.
   * @param enableClosedCaptions enableClosedCaptions or {@code null} for none
   */
  public LiveBroadcastContentDetails setEnableClosedCaptions(java.lang.Boolean enableClosedCaptions) {
    this.enableClosedCaptions = enableClosedCaptions;
    return this;
  }

  /**
   * This setting indicates whether YouTube should enable content encryption for the broadcast.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableContentEncryption() {
    return enableContentEncryption;
  }

  /**
   * This setting indicates whether YouTube should enable content encryption for the broadcast.
   * @param enableContentEncryption enableContentEncryption or {@code null} for none
   */
  public LiveBroadcastContentDetails setEnableContentEncryption(java.lang.Boolean enableContentEncryption) {
    this.enableContentEncryption = enableContentEncryption;
    return this;
  }

  /**
   * This setting determines whether viewers can access DVR controls while watching the video. DVR
   * controls enable the viewer to control the video playback experience by pausing, rewinding, or
   * fast forwarding content. The default value for this property is true. *Important:* You must set
   * the value to true and also set the enableArchive property's value to true if you want to make
   * playback available immediately after the broadcast ends.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableDvr() {
    return enableDvr;
  }

  /**
   * This setting determines whether viewers can access DVR controls while watching the video. DVR
   * controls enable the viewer to control the video playback experience by pausing, rewinding, or
   * fast forwarding content. The default value for this property is true. *Important:* You must set
   * the value to true and also set the enableArchive property's value to true if you want to make
   * playback available immediately after the broadcast ends.
   * @param enableDvr enableDvr or {@code null} for none
   */
  public LiveBroadcastContentDetails setEnableDvr(java.lang.Boolean enableDvr) {
    this.enableDvr = enableDvr;
    return this;
  }

  /**
   * This setting indicates whether the broadcast video can be played in an embedded player. If you
   * choose to archive the video (using the enableArchive property), this setting will also apply to
   * the archived video.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableEmbed() {
    return enableEmbed;
  }

  /**
   * This setting indicates whether the broadcast video can be played in an embedded player. If you
   * choose to archive the video (using the enableArchive property), this setting will also apply to
   * the archived video.
   * @param enableEmbed enableEmbed or {@code null} for none
   */
  public LiveBroadcastContentDetails setEnableEmbed(java.lang.Boolean enableEmbed) {
    this.enableEmbed = enableEmbed;
    return this;
  }

  /**
   * Indicates whether this broadcast has low latency enabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableLowLatency() {
    return enableLowLatency;
  }

  /**
   * Indicates whether this broadcast has low latency enabled.
   * @param enableLowLatency enableLowLatency or {@code null} for none
   */
  public LiveBroadcastContentDetails setEnableLowLatency(java.lang.Boolean enableLowLatency) {
    this.enableLowLatency = enableLowLatency;
    return this;
  }

  /**
   * If both this and enable_low_latency are set, they must match. LATENCY_NORMAL should match
   * enable_low_latency=false LATENCY_LOW should match enable_low_latency=true LATENCY_ULTRA_LOW
   * should have enable_low_latency omitted.
   * @return value or {@code null} for none
   */
  public java.lang.String getLatencyPreference() {
    return latencyPreference;
  }

  /**
   * If both this and enable_low_latency are set, they must match. LATENCY_NORMAL should match
   * enable_low_latency=false LATENCY_LOW should match enable_low_latency=true LATENCY_ULTRA_LOW
   * should have enable_low_latency omitted.
   * @param latencyPreference latencyPreference or {@code null} for none
   */
  public LiveBroadcastContentDetails setLatencyPreference(java.lang.String latencyPreference) {
    this.latencyPreference = latencyPreference;
    return this;
  }

  /**
   * The mesh for projecting the video if projection is mesh. The mesh value must be a UTF-8 string
   * containing the base-64 encoding of 3D mesh data that follows the Spherical Video V2 RFC
   * specification for an mshp box, excluding the box size and type but including the following four
   * reserved zero bytes for the version and flags.
   * @see #decodeMesh()
   * @return value or {@code null} for none
   */
  public java.lang.String getMesh() {
    return mesh;
  }

  /**
   * The mesh for projecting the video if projection is mesh. The mesh value must be a UTF-8 string
   * containing the base-64 encoding of 3D mesh data that follows the Spherical Video V2 RFC
   * specification for an mshp box, excluding the box size and type but including the following four
   * reserved zero bytes for the version and flags.
   * @see #getMesh()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeMesh() {
    return com.google.api.client.util.Base64.decodeBase64(mesh);
  }

  /**
   * The mesh for projecting the video if projection is mesh. The mesh value must be a UTF-8 string
   * containing the base-64 encoding of 3D mesh data that follows the Spherical Video V2 RFC
   * specification for an mshp box, excluding the box size and type but including the following four
   * reserved zero bytes for the version and flags.
   * @see #encodeMesh()
   * @param mesh mesh or {@code null} for none
   */
  public LiveBroadcastContentDetails setMesh(java.lang.String mesh) {
    this.mesh = mesh;
    return this;
  }

  /**
   * The mesh for projecting the video if projection is mesh. The mesh value must be a UTF-8 string
   * containing the base-64 encoding of 3D mesh data that follows the Spherical Video V2 RFC
   * specification for an mshp box, excluding the box size and type but including the following four
   * reserved zero bytes for the version and flags.
   * @see #setMesh()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public LiveBroadcastContentDetails encodeMesh(byte[] mesh) {
    this.mesh = com.google.api.client.util.Base64.encodeBase64URLSafeString(mesh);
    return this;
  }

  /**
   * The monitorStream object contains information about the monitor stream, which the broadcaster
   * can use to review the event content before the broadcast stream is shown publicly.
   * @return value or {@code null} for none
   */
  public MonitorStreamInfo getMonitorStream() {
    return monitorStream;
  }

  /**
   * The monitorStream object contains information about the monitor stream, which the broadcaster
   * can use to review the event content before the broadcast stream is shown publicly.
   * @param monitorStream monitorStream or {@code null} for none
   */
  public LiveBroadcastContentDetails setMonitorStream(MonitorStreamInfo monitorStream) {
    this.monitorStream = monitorStream;
    return this;
  }

  /**
   * The projection format of this broadcast. This defaults to rectangular.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjection() {
    return projection;
  }

  /**
   * The projection format of this broadcast. This defaults to rectangular.
   * @param projection projection or {@code null} for none
   */
  public LiveBroadcastContentDetails setProjection(java.lang.String projection) {
    this.projection = projection;
    return this;
  }

  /**
   * Automatically start recording after the event goes live. The default value for this property is
   * true. *Important:* You must also set the enableDvr property's value to true if you want the
   * playback to be available immediately after the broadcast ends. If you set this property's value
   * to true but do not also set the enableDvr property to true, there may be a delay of around one
   * day before the archived video will be available for playback.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRecordFromStart() {
    return recordFromStart;
  }

  /**
   * Automatically start recording after the event goes live. The default value for this property is
   * true. *Important:* You must also set the enableDvr property's value to true if you want the
   * playback to be available immediately after the broadcast ends. If you set this property's value
   * to true but do not also set the enableDvr property to true, there may be a delay of around one
   * day before the archived video will be available for playback.
   * @param recordFromStart recordFromStart or {@code null} for none
   */
  public LiveBroadcastContentDetails setRecordFromStart(java.lang.Boolean recordFromStart) {
    this.recordFromStart = recordFromStart;
    return this;
  }

  /**
   * This setting indicates whether the broadcast should automatically begin with an in-stream slate
   * when you update the broadcast's status to live. After updating the status, you then need to
   * send a liveCuepoints.insert request that sets the cuepoint's eventState to end to remove the
   * in-stream slate and make your broadcast stream visible to viewers.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getStartWithSlate() {
    return startWithSlate;
  }

  /**
   * This setting indicates whether the broadcast should automatically begin with an in-stream slate
   * when you update the broadcast's status to live. After updating the status, you then need to
   * send a liveCuepoints.insert request that sets the cuepoint's eventState to end to remove the
   * in-stream slate and make your broadcast stream visible to viewers.
   * @param startWithSlate startWithSlate or {@code null} for none
   */
  public LiveBroadcastContentDetails setStartWithSlate(java.lang.Boolean startWithSlate) {
    this.startWithSlate = startWithSlate;
    return this;
  }

  /**
   * The 3D stereo layout of this broadcast. This defaults to mono.
   * @return value or {@code null} for none
   */
  public java.lang.String getStereoLayout() {
    return stereoLayout;
  }

  /**
   * The 3D stereo layout of this broadcast. This defaults to mono.
   * @param stereoLayout stereoLayout or {@code null} for none
   */
  public LiveBroadcastContentDetails setStereoLayout(java.lang.String stereoLayout) {
    this.stereoLayout = stereoLayout;
    return this;
  }

  @Override
  public LiveBroadcastContentDetails set(String fieldName, Object value) {
    return (LiveBroadcastContentDetails) super.set(fieldName, value);
  }

  @Override
  public LiveBroadcastContentDetails clone() {
    return (LiveBroadcastContentDetails) super.clone();
  }

}
