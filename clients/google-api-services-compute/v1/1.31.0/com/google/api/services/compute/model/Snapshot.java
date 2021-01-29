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
 * Represents a Persistent Disk Snapshot resource.
 *
 * You can use snapshots to back up data on a regular interval. For more information, read  Creating
 * persistent disk snapshots. (== resource_for {$api_version}.snapshots ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Snapshot extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] Set to true if snapshots are automatically created by applying resource policy on
   * the target disk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean autoCreated;

  /**
   * Creates the new snapshot in the snapshot chain labeled with the specified name. The chain name
   * must be 1-63 characters long and comply with RFC1035. This is an uncommon option only for
   * advanced service owners who needs to create separate snapshot chains, for example, for
   * chargeback tracking. When you describe your snapshot resource, this field is visible only if it
   * has a non-empty value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String chainName;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output Only] Size of the source disk, specified in GB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long diskSizeGb;

  /**
   * [Output Only] Number of bytes downloaded to restore a snapshot to a disk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long downloadBytes;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] Type of the resource. Always compute#snapshot for Snapshot resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A fingerprint for the labels being applied to this snapshot, which is essentially a hash of the
   * labels set used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update labels. You must always provide an
   * up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   * fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve a snapshot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String labelFingerprint;

  /**
   * Labels to apply to this snapshot. These can be later modified by the setLabels method. Label
   * values may be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * [Output Only] Integer license codes indicating which licenses are attached to this snapshot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> licenseCodes;

  /**
   * [Output Only] A list of public visible licenses that apply to this snapshot. This can be
   * because the original image had licenses attached (such as a Windows image).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> licenses;

  /**
   * An opaque location hint used to place the snapshot close to other resources. This field is for
   * use by internal tools that use the public API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locationHint;

  /**
   * Name of the resource; provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * [Output Only] Reserved for future use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean satisfiesPzs;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * Encrypts the snapshot using a customer-supplied encryption key.
   *
   * After you encrypt a snapshot using a customer-supplied key, you must provide the same key if
   * you use the snapshot later. For example, you must provide the encryption key when you create a
   * disk from the encrypted snapshot in a future request.
   *
   * Customer-supplied encryption keys do not protect access to metadata of the snapshot.
   *
   * If you do not provide an encryption key when creating the snapshot, then the snapshot will be
   * encrypted using an automatically generated key and you do not need to provide a key to use the
   * snapshot later.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CustomerEncryptionKey snapshotEncryptionKey;

  /**
   * The source disk used to create this snapshot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceDisk;

  /**
   * The customer-supplied encryption key of the source disk. Required if the source disk is
   * protected by a customer-supplied encryption key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CustomerEncryptionKey sourceDiskEncryptionKey;

  /**
   * [Output Only] The ID value of the disk used to create this snapshot. This value may be used to
   * determine whether the snapshot was taken from the current or a previous instance of a given
   * disk name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceDiskId;

  /**
   * [Output Only] The status of the snapshot. This can be CREATING, DELETING, FAILED, READY, or
   * UPLOADING.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * [Output Only] A size of the storage used by the snapshot. As snapshots share storage, this
   * number is expected to change with snapshot creation/deletion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long storageBytes;

  /**
   * [Output Only] An indicator whether storageBytes is in a stable state or it is being adjusted as
   * a result of shared storage reallocation. This status can either be UPDATING, meaning the size
   * of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-
   * date.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String storageBytesStatus;

  /**
   * Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> storageLocations;

  /**
   * [Output Only] Set to true if snapshots are automatically created by applying resource policy on
   * the target disk.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAutoCreated() {
    return autoCreated;
  }

  /**
   * [Output Only] Set to true if snapshots are automatically created by applying resource policy on
   * the target disk.
   * @param autoCreated autoCreated or {@code null} for none
   */
  public Snapshot setAutoCreated(java.lang.Boolean autoCreated) {
    this.autoCreated = autoCreated;
    return this;
  }

  /**
   * Creates the new snapshot in the snapshot chain labeled with the specified name. The chain name
   * must be 1-63 characters long and comply with RFC1035. This is an uncommon option only for
   * advanced service owners who needs to create separate snapshot chains, for example, for
   * chargeback tracking. When you describe your snapshot resource, this field is visible only if it
   * has a non-empty value.
   * @return value or {@code null} for none
   */
  public java.lang.String getChainName() {
    return chainName;
  }

  /**
   * Creates the new snapshot in the snapshot chain labeled with the specified name. The chain name
   * must be 1-63 characters long and comply with RFC1035. This is an uncommon option only for
   * advanced service owners who needs to create separate snapshot chains, for example, for
   * chargeback tracking. When you describe your snapshot resource, this field is visible only if it
   * has a non-empty value.
   * @param chainName chainName or {@code null} for none
   */
  public Snapshot setChainName(java.lang.String chainName) {
    this.chainName = chainName;
    return this;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public Snapshot setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public Snapshot setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output Only] Size of the source disk, specified in GB.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDiskSizeGb() {
    return diskSizeGb;
  }

  /**
   * [Output Only] Size of the source disk, specified in GB.
   * @param diskSizeGb diskSizeGb or {@code null} for none
   */
  public Snapshot setDiskSizeGb(java.lang.Long diskSizeGb) {
    this.diskSizeGb = diskSizeGb;
    return this;
  }

  /**
   * [Output Only] Number of bytes downloaded to restore a snapshot to a disk.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDownloadBytes() {
    return downloadBytes;
  }

  /**
   * [Output Only] Number of bytes downloaded to restore a snapshot to a disk.
   * @param downloadBytes downloadBytes or {@code null} for none
   */
  public Snapshot setDownloadBytes(java.lang.Long downloadBytes) {
    this.downloadBytes = downloadBytes;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public Snapshot setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#snapshot for Snapshot resources.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#snapshot for Snapshot resources.
   * @param kind kind or {@code null} for none
   */
  public Snapshot setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A fingerprint for the labels being applied to this snapshot, which is essentially a hash of the
   * labels set used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update labels. You must always provide an
   * up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   * fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve a snapshot.
   * @see #decodeLabelFingerprint()
   * @return value or {@code null} for none
   */
  public java.lang.String getLabelFingerprint() {
    return labelFingerprint;
  }

  /**
   * A fingerprint for the labels being applied to this snapshot, which is essentially a hash of the
   * labels set used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update labels. You must always provide an
   * up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   * fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve a snapshot.
   * @see #getLabelFingerprint()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeLabelFingerprint() {
    return com.google.api.client.util.Base64.decodeBase64(labelFingerprint);
  }

  /**
   * A fingerprint for the labels being applied to this snapshot, which is essentially a hash of the
   * labels set used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update labels. You must always provide an
   * up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   * fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve a snapshot.
   * @see #encodeLabelFingerprint()
   * @param labelFingerprint labelFingerprint or {@code null} for none
   */
  public Snapshot setLabelFingerprint(java.lang.String labelFingerprint) {
    this.labelFingerprint = labelFingerprint;
    return this;
  }

  /**
   * A fingerprint for the labels being applied to this snapshot, which is essentially a hash of the
   * labels set used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update labels. You must always provide an
   * up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   * fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve a snapshot.
   * @see #setLabelFingerprint()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public Snapshot encodeLabelFingerprint(byte[] labelFingerprint) {
    this.labelFingerprint = com.google.api.client.util.Base64.encodeBase64URLSafeString(labelFingerprint);
    return this;
  }

  /**
   * Labels to apply to this snapshot. These can be later modified by the setLabels method. Label
   * values may be empty.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels to apply to this snapshot. These can be later modified by the setLabels method. Label
   * values may be empty.
   * @param labels labels or {@code null} for none
   */
  public Snapshot setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * [Output Only] Integer license codes indicating which licenses are attached to this snapshot.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getLicenseCodes() {
    return licenseCodes;
  }

  /**
   * [Output Only] Integer license codes indicating which licenses are attached to this snapshot.
   * @param licenseCodes licenseCodes or {@code null} for none
   */
  public Snapshot setLicenseCodes(java.util.List<java.lang.Long> licenseCodes) {
    this.licenseCodes = licenseCodes;
    return this;
  }

  /**
   * [Output Only] A list of public visible licenses that apply to this snapshot. This can be
   * because the original image had licenses attached (such as a Windows image).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLicenses() {
    return licenses;
  }

  /**
   * [Output Only] A list of public visible licenses that apply to this snapshot. This can be
   * because the original image had licenses attached (such as a Windows image).
   * @param licenses licenses or {@code null} for none
   */
  public Snapshot setLicenses(java.util.List<java.lang.String> licenses) {
    this.licenses = licenses;
    return this;
  }

  /**
   * An opaque location hint used to place the snapshot close to other resources. This field is for
   * use by internal tools that use the public API.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocationHint() {
    return locationHint;
  }

  /**
   * An opaque location hint used to place the snapshot close to other resources. This field is for
   * use by internal tools that use the public API.
   * @param locationHint locationHint or {@code null} for none
   */
  public Snapshot setLocationHint(java.lang.String locationHint) {
    this.locationHint = locationHint;
    return this;
  }

  /**
   * Name of the resource; provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource; provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public Snapshot setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * [Output Only] Reserved for future use.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSatisfiesPzs() {
    return satisfiesPzs;
  }

  /**
   * [Output Only] Reserved for future use.
   * @param satisfiesPzs satisfiesPzs or {@code null} for none
   */
  public Snapshot setSatisfiesPzs(java.lang.Boolean satisfiesPzs) {
    this.satisfiesPzs = satisfiesPzs;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public Snapshot setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * Encrypts the snapshot using a customer-supplied encryption key.
   *
   * After you encrypt a snapshot using a customer-supplied key, you must provide the same key if
   * you use the snapshot later. For example, you must provide the encryption key when you create a
   * disk from the encrypted snapshot in a future request.
   *
   * Customer-supplied encryption keys do not protect access to metadata of the snapshot.
   *
   * If you do not provide an encryption key when creating the snapshot, then the snapshot will be
   * encrypted using an automatically generated key and you do not need to provide a key to use the
   * snapshot later.
   * @return value or {@code null} for none
   */
  public CustomerEncryptionKey getSnapshotEncryptionKey() {
    return snapshotEncryptionKey;
  }

  /**
   * Encrypts the snapshot using a customer-supplied encryption key.
   *
   * After you encrypt a snapshot using a customer-supplied key, you must provide the same key if
   * you use the snapshot later. For example, you must provide the encryption key when you create a
   * disk from the encrypted snapshot in a future request.
   *
   * Customer-supplied encryption keys do not protect access to metadata of the snapshot.
   *
   * If you do not provide an encryption key when creating the snapshot, then the snapshot will be
   * encrypted using an automatically generated key and you do not need to provide a key to use the
   * snapshot later.
   * @param snapshotEncryptionKey snapshotEncryptionKey or {@code null} for none
   */
  public Snapshot setSnapshotEncryptionKey(CustomerEncryptionKey snapshotEncryptionKey) {
    this.snapshotEncryptionKey = snapshotEncryptionKey;
    return this;
  }

  /**
   * The source disk used to create this snapshot.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceDisk() {
    return sourceDisk;
  }

  /**
   * The source disk used to create this snapshot.
   * @param sourceDisk sourceDisk or {@code null} for none
   */
  public Snapshot setSourceDisk(java.lang.String sourceDisk) {
    this.sourceDisk = sourceDisk;
    return this;
  }

  /**
   * The customer-supplied encryption key of the source disk. Required if the source disk is
   * protected by a customer-supplied encryption key.
   * @return value or {@code null} for none
   */
  public CustomerEncryptionKey getSourceDiskEncryptionKey() {
    return sourceDiskEncryptionKey;
  }

  /**
   * The customer-supplied encryption key of the source disk. Required if the source disk is
   * protected by a customer-supplied encryption key.
   * @param sourceDiskEncryptionKey sourceDiskEncryptionKey or {@code null} for none
   */
  public Snapshot setSourceDiskEncryptionKey(CustomerEncryptionKey sourceDiskEncryptionKey) {
    this.sourceDiskEncryptionKey = sourceDiskEncryptionKey;
    return this;
  }

  /**
   * [Output Only] The ID value of the disk used to create this snapshot. This value may be used to
   * determine whether the snapshot was taken from the current or a previous instance of a given
   * disk name.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceDiskId() {
    return sourceDiskId;
  }

  /**
   * [Output Only] The ID value of the disk used to create this snapshot. This value may be used to
   * determine whether the snapshot was taken from the current or a previous instance of a given
   * disk name.
   * @param sourceDiskId sourceDiskId or {@code null} for none
   */
  public Snapshot setSourceDiskId(java.lang.String sourceDiskId) {
    this.sourceDiskId = sourceDiskId;
    return this;
  }

  /**
   * [Output Only] The status of the snapshot. This can be CREATING, DELETING, FAILED, READY, or
   * UPLOADING.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * [Output Only] The status of the snapshot. This can be CREATING, DELETING, FAILED, READY, or
   * UPLOADING.
   * @param status status or {@code null} for none
   */
  public Snapshot setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * [Output Only] A size of the storage used by the snapshot. As snapshots share storage, this
   * number is expected to change with snapshot creation/deletion.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStorageBytes() {
    return storageBytes;
  }

  /**
   * [Output Only] A size of the storage used by the snapshot. As snapshots share storage, this
   * number is expected to change with snapshot creation/deletion.
   * @param storageBytes storageBytes or {@code null} for none
   */
  public Snapshot setStorageBytes(java.lang.Long storageBytes) {
    this.storageBytes = storageBytes;
    return this;
  }

  /**
   * [Output Only] An indicator whether storageBytes is in a stable state or it is being adjusted as
   * a result of shared storage reallocation. This status can either be UPDATING, meaning the size
   * of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-
   * date.
   * @return value or {@code null} for none
   */
  public java.lang.String getStorageBytesStatus() {
    return storageBytesStatus;
  }

  /**
   * [Output Only] An indicator whether storageBytes is in a stable state or it is being adjusted as
   * a result of shared storage reallocation. This status can either be UPDATING, meaning the size
   * of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-
   * date.
   * @param storageBytesStatus storageBytesStatus or {@code null} for none
   */
  public Snapshot setStorageBytesStatus(java.lang.String storageBytesStatus) {
    this.storageBytesStatus = storageBytesStatus;
    return this;
  }

  /**
   * Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getStorageLocations() {
    return storageLocations;
  }

  /**
   * Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
   * @param storageLocations storageLocations or {@code null} for none
   */
  public Snapshot setStorageLocations(java.util.List<java.lang.String> storageLocations) {
    this.storageLocations = storageLocations;
    return this;
  }

  @Override
  public Snapshot set(String fieldName, Object value) {
    return (Snapshot) super.set(fieldName, value);
  }

  @Override
  public Snapshot clone() {
    return (Snapshot) super.clone();
  }

}
