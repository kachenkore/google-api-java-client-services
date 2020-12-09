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

package com.google.api.services.directory;

/**
 * Available OAuth 2.0 scopes for use with the Admin SDK API.
 *
 * @since 1.4
 */
public class DirectoryScopes {

  /** View and manage customer related information. */
  public static final String ADMIN_DIRECTORY_CUSTOMER = "https://www.googleapis.com/auth/admin.directory.customer";

  /** View customer related information. */
  public static final String ADMIN_DIRECTORY_CUSTOMER_READONLY = "https://www.googleapis.com/auth/admin.directory.customer.readonly";

  /** View and manage your Chrome OS devices' metadata. */
  public static final String ADMIN_DIRECTORY_DEVICE_CHROMEOS = "https://www.googleapis.com/auth/admin.directory.device.chromeos";

  /** View your Chrome OS devices' metadata. */
  public static final String ADMIN_DIRECTORY_DEVICE_CHROMEOS_READONLY = "https://www.googleapis.com/auth/admin.directory.device.chromeos.readonly";

  /** View and manage your mobile devices' metadata. */
  public static final String ADMIN_DIRECTORY_DEVICE_MOBILE = "https://www.googleapis.com/auth/admin.directory.device.mobile";

  /** Manage your mobile devices by performing administrative tasks. */
  public static final String ADMIN_DIRECTORY_DEVICE_MOBILE_ACTION = "https://www.googleapis.com/auth/admin.directory.device.mobile.action";

  /** View your mobile devices' metadata. */
  public static final String ADMIN_DIRECTORY_DEVICE_MOBILE_READONLY = "https://www.googleapis.com/auth/admin.directory.device.mobile.readonly";

  /** View and manage the provisioning of domains for your customers. */
  public static final String ADMIN_DIRECTORY_DOMAIN = "https://www.googleapis.com/auth/admin.directory.domain";

  /** View domains related to your customers. */
  public static final String ADMIN_DIRECTORY_DOMAIN_READONLY = "https://www.googleapis.com/auth/admin.directory.domain.readonly";

  /** View and manage the provisioning of groups on your domain. */
  public static final String ADMIN_DIRECTORY_GROUP = "https://www.googleapis.com/auth/admin.directory.group";

  /** View and manage group subscriptions on your domain. */
  public static final String ADMIN_DIRECTORY_GROUP_MEMBER = "https://www.googleapis.com/auth/admin.directory.group.member";

  /** View group subscriptions on your domain. */
  public static final String ADMIN_DIRECTORY_GROUP_MEMBER_READONLY = "https://www.googleapis.com/auth/admin.directory.group.member.readonly";

  /** View groups on your domain. */
  public static final String ADMIN_DIRECTORY_GROUP_READONLY = "https://www.googleapis.com/auth/admin.directory.group.readonly";

  /** View and manage organization units on your domain. */
  public static final String ADMIN_DIRECTORY_ORGUNIT = "https://www.googleapis.com/auth/admin.directory.orgunit";

  /** View organization units on your domain. */
  public static final String ADMIN_DIRECTORY_ORGUNIT_READONLY = "https://www.googleapis.com/auth/admin.directory.orgunit.readonly";

  /** View and manage the provisioning of calendar resources on your domain. */
  public static final String ADMIN_DIRECTORY_RESOURCE_CALENDAR = "https://www.googleapis.com/auth/admin.directory.resource.calendar";

  /** View calendar resources on your domain. */
  public static final String ADMIN_DIRECTORY_RESOURCE_CALENDAR_READONLY = "https://www.googleapis.com/auth/admin.directory.resource.calendar.readonly";

  /** Manage delegated admin roles for your domain. */
  public static final String ADMIN_DIRECTORY_ROLEMANAGEMENT = "https://www.googleapis.com/auth/admin.directory.rolemanagement";

  /** View delegated admin roles for your domain. */
  public static final String ADMIN_DIRECTORY_ROLEMANAGEMENT_READONLY = "https://www.googleapis.com/auth/admin.directory.rolemanagement.readonly";

  /** View and manage the provisioning of users on your domain. */
  public static final String ADMIN_DIRECTORY_USER = "https://www.googleapis.com/auth/admin.directory.user";

  /** View and manage user aliases on your domain. */
  public static final String ADMIN_DIRECTORY_USER_ALIAS = "https://www.googleapis.com/auth/admin.directory.user.alias";

  /** View user aliases on your domain. */
  public static final String ADMIN_DIRECTORY_USER_ALIAS_READONLY = "https://www.googleapis.com/auth/admin.directory.user.alias.readonly";

  /** View users on your domain. */
  public static final String ADMIN_DIRECTORY_USER_READONLY = "https://www.googleapis.com/auth/admin.directory.user.readonly";

  /** Manage data access permissions for users on your domain. */
  public static final String ADMIN_DIRECTORY_USER_SECURITY = "https://www.googleapis.com/auth/admin.directory.user.security";

  /** View and manage the provisioning of user schemas on your domain. */
  public static final String ADMIN_DIRECTORY_USERSCHEMA = "https://www.googleapis.com/auth/admin.directory.userschema";

  /** View user schemas on your domain. */
  public static final String ADMIN_DIRECTORY_USERSCHEMA_READONLY = "https://www.googleapis.com/auth/admin.directory.userschema.readonly";

  /** View and manage your data across Google Cloud Platform services. */
  public static final String CLOUD_PLATFORM = "https://www.googleapis.com/auth/cloud-platform";

  /**
   * Returns an unmodifiable set that contains all scopes declared by this class.
   *
   * @since 1.16
   */
  public static java.util.Set<String> all() {
    java.util.Set<String> set = new java.util.HashSet<String>();
    set.add(ADMIN_DIRECTORY_CUSTOMER);
    set.add(ADMIN_DIRECTORY_CUSTOMER_READONLY);
    set.add(ADMIN_DIRECTORY_DEVICE_CHROMEOS);
    set.add(ADMIN_DIRECTORY_DEVICE_CHROMEOS_READONLY);
    set.add(ADMIN_DIRECTORY_DEVICE_MOBILE);
    set.add(ADMIN_DIRECTORY_DEVICE_MOBILE_ACTION);
    set.add(ADMIN_DIRECTORY_DEVICE_MOBILE_READONLY);
    set.add(ADMIN_DIRECTORY_DOMAIN);
    set.add(ADMIN_DIRECTORY_DOMAIN_READONLY);
    set.add(ADMIN_DIRECTORY_GROUP);
    set.add(ADMIN_DIRECTORY_GROUP_MEMBER);
    set.add(ADMIN_DIRECTORY_GROUP_MEMBER_READONLY);
    set.add(ADMIN_DIRECTORY_GROUP_READONLY);
    set.add(ADMIN_DIRECTORY_ORGUNIT);
    set.add(ADMIN_DIRECTORY_ORGUNIT_READONLY);
    set.add(ADMIN_DIRECTORY_RESOURCE_CALENDAR);
    set.add(ADMIN_DIRECTORY_RESOURCE_CALENDAR_READONLY);
    set.add(ADMIN_DIRECTORY_ROLEMANAGEMENT);
    set.add(ADMIN_DIRECTORY_ROLEMANAGEMENT_READONLY);
    set.add(ADMIN_DIRECTORY_USER);
    set.add(ADMIN_DIRECTORY_USER_ALIAS);
    set.add(ADMIN_DIRECTORY_USER_ALIAS_READONLY);
    set.add(ADMIN_DIRECTORY_USER_READONLY);
    set.add(ADMIN_DIRECTORY_USER_SECURITY);
    set.add(ADMIN_DIRECTORY_USERSCHEMA);
    set.add(ADMIN_DIRECTORY_USERSCHEMA_READONLY);
    set.add(CLOUD_PLATFORM);
    return java.util.Collections.unmodifiableSet(set);
  }

  private DirectoryScopes() {
  }
}
