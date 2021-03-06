package org.robolectric.android;

import android.app.PackageInstallObserver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ChangedPackages;
import android.content.pm.FeatureInfo;
import android.content.pm.IPackageDataObserver;
import android.content.pm.IPackageDeleteObserver;
import android.content.pm.IPackageInstallObserver;
import android.content.pm.IPackageMoveObserver;
import android.content.pm.IPackageStatsObserver;
import android.content.pm.InstantAppInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.IntentFilterVerificationInfo;
import android.content.pm.KeySet;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.SharedLibraryInfo;
import android.content.pm.VerifierDeviceIdentity;
import android.content.pm.VersionedPackage;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.UserHandle;
import android.os.storage.VolumeInfo;
import org.robolectric.annotation.internal.Instrument;

import java.util.Collections;
import java.util.List;

/**
 * @deprecated Use {@link org.robolectric.shadows.ShadowPackageManager} instead.
 * <pre>
 *   ShadowPackageManager shadowPackageManager = shadowOf(context.getPackageManager());
 * </pre>
 *
 * If there is functionality you are missing you can extend ShadowPackageManager.
 */
@Instrument
public class StubPackageManager extends PackageManager {

  @Override
  public PackageInfo getPackageInfo(String packageName, int flags) throws NameNotFoundException {
    return null;
  }

  @Override
  public PackageInfo getPackageInfo(VersionedPackage versionedPackage, int flags)
      throws NameNotFoundException {
    return null;
  }

  @Override
  public String[] currentToCanonicalPackageNames(String[] strings) {
    return new String[0];
  }

  @Override
  public String[] canonicalToCurrentPackageNames(String[] strings) {
    return new String[0];
  }

  @Override
  public Intent getLaunchIntentForPackage(String packageName) {
    return null;
  }

  @Override
  public Intent getLeanbackLaunchIntentForPackage(String s) {
    return null;
  }

  @Override
  public int[] getPackageGids(String packageName) throws NameNotFoundException {
    return new int[0];
  }

  @Override
  public int getPackageUid(String packageName, int userHandle) throws NameNotFoundException {
    return 0;
  }

  @Override
  public PermissionInfo getPermissionInfo(String name, int flags) throws NameNotFoundException {
    return null;
  }

  @Override
  public List<PermissionInfo> queryPermissionsByGroup(String group, int flags) throws NameNotFoundException {
    return null;
  }

  @Override
  public boolean isPermissionReviewModeEnabled() {
    return false;
  }

  @Override
  public PermissionGroupInfo getPermissionGroupInfo(String name, int flags) throws NameNotFoundException {
    return null;
  }

  @Override
  public List<PermissionGroupInfo> getAllPermissionGroups(int flags) {
    return null;
  }

  @Override
  public ApplicationInfo getApplicationInfo(String packageName, int flags) throws NameNotFoundException {
    return null;
  }

  @Override
  public ActivityInfo getActivityInfo(ComponentName className, int flags) throws NameNotFoundException {
    return null;
  }

  @Override
  public ActivityInfo getReceiverInfo(ComponentName className, int flags) throws NameNotFoundException {
    return null;
  }

  @Override
  public ServiceInfo getServiceInfo(ComponentName className, int flags) throws NameNotFoundException {
    return null;
  }

  @Override
  public ProviderInfo getProviderInfo(ComponentName componentName, int i) throws NameNotFoundException {
    return null;
  }

  @Override
  public List<PackageInfo> getInstalledPackages(int flags) {
    return null;
  }

  @Override
  public List<PackageInfo> getPackagesHoldingPermissions(String[] permissions, int flags) {
    return null;
  }

  public List<PackageInfo> getInstalledPackages(int flags, int userId) {
    return null;
  }

  @Override
  public int checkPermission(String permName, String pkgName) {
    return 0;
  }

  @Override
  public boolean isPermissionRevokedByPolicy(String permName, String pkgName) {
    return false;
  }

  @Override
  public String getPermissionControllerPackageName() {
    return null;
  }

  @Override
  public boolean addPermission(PermissionInfo info) {
    return false;
  }

  @Override
  public boolean addPermissionAsync(PermissionInfo permissionInfo) {
    return false;
  }

  @Override
  public void removePermission(String name) {
  }

  @Override
  public void grantRuntimePermission(String packageName, String permissionName, UserHandle user) {

  }

  @Override
  public void revokeRuntimePermission(String packageName, String permissionName, UserHandle user) {

  }

  @Override
  public int getPermissionFlags(String permissionName, String packageName, UserHandle user) {
    return 0;
  }

  @Override
  public void updatePermissionFlags(String permissionName, String packageName, int flagMask, int flagValues, UserHandle user) {

  }

  public boolean shouldShowRequestPermissionRationale(String permission) {
    return false;
  }

  @Override
  public int checkSignatures(String pkg1, String pkg2) {
    return 0;
  }

  @Override
  public int checkSignatures(int uid1, int uid2) {
    return 0;
  }

  @Override
  public String[] getPackagesForUid(int uid) {
    return new String[0];
  }

  @Override
  public String getNameForUid(int uid) {
    return null;
  }

  @Override
  public int getUidForSharedUser(String sharedUserName) throws NameNotFoundException {
    return 0;
  }

  @Override
  public List<ApplicationInfo> getInstalledApplications(int flags) {
    return null;
  }

  @Override
  public List<ApplicationInfo> getInstalledApplicationsAsUser(int flags, int userId) {
    return null;
  }

  @Override
  public List<InstantAppInfo> getInstantApps() {
    return null;
  }

  @Override
  public Drawable getInstantAppIcon(String packageName) {
    return null;
  }

  @Override
  public boolean isInstantApp() {
    return false;
  }

  @Override
  public int getInstantAppCookieMaxSize() {
    return 0;
  }

  @Override
  public byte[] getInstantAppCookie() {
    return new byte[0];
  }

  @Override
  public boolean setInstantAppCookie(byte[] cookie) {
    return false;
  }

  @Override
  public String[] getSystemSharedLibraryNames() {
    return new String[0];
  }

  @Override
  public List<SharedLibraryInfo> getSharedLibraries(int flags) {
    return null;
  }

  @Override
  public List<SharedLibraryInfo> getSharedLibrariesAsUser(int flags, int userId) {
    return null;
  }

  @Override
  public FeatureInfo[] getSystemAvailableFeatures() {
    return new FeatureInfo[0];
  }

  @Override
  public boolean hasSystemFeature(String name) {
    return false;
  }

  @Override
  public ResolveInfo resolveActivity(Intent intent, int flags) {
    return null;
  }

  @Override
  public ResolveInfo resolveActivityAsUser(Intent intent, int flags, int userId) {
    return null;
  }

  @Override
  public List<ResolveInfo> queryIntentActivities(Intent intent, int flags) {
    return null;
  }

  @Override
  public List<ResolveInfo> queryIntentActivitiesAsUser(Intent intent, int flags, int userId) {
    return null;
  }

  @Override
  public List<ResolveInfo> queryIntentActivityOptions(ComponentName caller, Intent[] specifics, Intent intent, int flags) {
    return null;
  }

  @Override
  public List<ResolveInfo> queryBroadcastReceivers(Intent intent, int flags) {
    return null;
  }

  @Override
  public List<ResolveInfo> queryBroadcastReceivers(Intent intent, int flags, int userId) {
    return null;
  }

  @Override
  public ResolveInfo resolveService(Intent intent, int flags) {
    return null;
  }

  @Override
  public List<ResolveInfo> queryIntentServices(Intent intent, int flags) {
    return null;
  }

  @Override
  public List<ResolveInfo> queryIntentServicesAsUser(Intent intent, int flags, int userId) {
    return null;
  }

  @Override
  public ProviderInfo resolveContentProvider(String name, int flags) {
    return null;
  }

  @Override
  public ProviderInfo resolveContentProviderAsUser(String s, int i, int i1) {
    return null;
  }

  @Override
  public List<ProviderInfo> queryContentProviders(String processName, int uid, int flags) {
    return null;
  }

  @Override
  public InstrumentationInfo getInstrumentationInfo(ComponentName className, int flags) throws NameNotFoundException {
    return null;
  }

  @Override
  public List<InstrumentationInfo> queryInstrumentation(String targetPackage, int flags) {
    return null;
  }

  @Override
  public Drawable getDrawable(String packageName, int resid, ApplicationInfo appInfo) {
    return null;
  }

  @Override
  public Drawable getActivityIcon(ComponentName activityName) throws NameNotFoundException {
    return null;
  }

  @Override
  public Drawable getActivityIcon(Intent intent) throws NameNotFoundException {
    return null;
  }

  @Override
  public Drawable getActivityBanner(ComponentName componentName) throws NameNotFoundException {
    return null;
  }

  @Override
  public Drawable getActivityBanner(Intent intent) throws NameNotFoundException {
    return null;
  }

  @Override
  public Drawable getDefaultActivityIcon() {
    return null;
  }

  @Override
  public Drawable getApplicationIcon(ApplicationInfo info) {
    return null;
  }

  @Override
  public Drawable getApplicationIcon(String packageName) throws NameNotFoundException {
    return null;
  }

  @Override
  public Drawable getApplicationBanner(ApplicationInfo applicationInfo) {
    return null;
  }

  @Override
  public Drawable getApplicationBanner(String s) throws NameNotFoundException {
    return null;
  }

  @Override
  public Drawable getActivityLogo(ComponentName componentName) throws NameNotFoundException {
    return null;
  }

  @Override
  public Drawable getActivityLogo(Intent intent) throws NameNotFoundException {
    return null;
  }

  @Override
  public Drawable getApplicationLogo(ApplicationInfo applicationInfo) {
    return null;
  }

  @Override
  public Drawable getApplicationLogo(String s) throws NameNotFoundException {
    return null;
  }

  @Override
  public Drawable getUserBadgedIcon(Drawable drawable, UserHandle userHandle) {
    return null;
  }

  @Override
  public Drawable getUserBadgedDrawableForDensity(Drawable drawable, UserHandle userHandle, Rect rect, int i) {
    return null;
  }

  @Override
  public Drawable getUserBadgeForDensity(UserHandle userHandle, int i) {
    return null;
  }

  @Override
  public CharSequence getUserBadgedLabel(CharSequence charSequence, UserHandle userHandle) {
    return null;
  }

  @Override
  public CharSequence getText(String packageName, int resid, ApplicationInfo appInfo) {
    return null;
  }

  @Override
  public XmlResourceParser getXml(String packageName, int resid, ApplicationInfo appInfo) {
    return null;
  }

  @Override
  public CharSequence getApplicationLabel(ApplicationInfo info) {
    return null;
  }

  @Override
  public Resources getResourcesForActivity(ComponentName activityName) throws NameNotFoundException {
    return null;
  }

  @Override
  public Resources getResourcesForApplication(ApplicationInfo app) throws NameNotFoundException {
    return null;
  }

  @Override
  public Resources getResourcesForApplication(String appPackageName) throws NameNotFoundException {
    return null;
  }

  @Override
  public Resources getResourcesForApplicationAsUser(String appPackageName, int userId) throws NameNotFoundException {
    return null;
  }

  @Override
  public void installPackage(Uri packageURI, IPackageInstallObserver observer, int flags, String installerPackageName) {

  }

  @Override
  public void installPackage(Uri uri, PackageInstallObserver packageInstallObserver, int i, String s) {

  }

  @Override
  public int installExistingPackage(String packageName) throws NameNotFoundException {
    return 0;
  }

  @Override
  public String getInstallerPackageName(String packageName) {
    return null;
  }

  @Override
  public void clearApplicationUserData(String packageName, IPackageDataObserver observer) {

  }

  @Override
  public void deleteApplicationCacheFiles(String packageName, IPackageDataObserver observer) {

  }

  @Override
  public void freeStorageAndNotify(long freeStorageSize, IPackageDataObserver observer) {

  }

  @Override
  public void freeStorageAndNotify(String volumeUuid, long freeStorageSize, IPackageDataObserver observer) {

  }

  @Override
  public void freeStorage(long freeStorageSize, IntentSender pi) {

  }

  @Override
  public void freeStorage(String volumeUuid, long freeStorageSize, IntentSender pi) {

  }

  public void getPackageSizeInfo(String packageName, int userHandle, IPackageStatsObserver observer) {

  }

  @Override
  public void addPackageToPreferred(String packageName) {
  }

  @Override
  public void removePackageFromPreferred(String packageName) {
  }

  @Override
  public List<PackageInfo> getPreferredPackages(int flags) {
    return null;
  }

  @Override
  public void addPreferredActivity(IntentFilter filter, int match, ComponentName[] set, ComponentName activity) {
  }

  @Override
  public void replacePreferredActivity(IntentFilter filter, int match, ComponentName[] set, ComponentName activity) {

  }

  @Override
  public void clearPackagePreferredActivities(String packageName) {
  }

  @Override
  public int getPreferredActivities(List<IntentFilter> outFilters, List<ComponentName> outActivities, String packageName) {
    return 0;
  }

  @Override
  public void setComponentEnabledSetting(ComponentName componentName, int newState, int flags) {
  }

  @Override
  public int getComponentEnabledSetting(ComponentName componentName) {
    return 0;
  }

  @Override
  public void setApplicationEnabledSetting(String packageName, int newState, int flags) {
  }

  @Override
  public int getApplicationEnabledSetting(String packageName) {
    return 0;
  }

  @Override
  public boolean setApplicationHiddenSettingAsUser(String s, boolean b, UserHandle userHandle) {
    return false;
  }

  @Override
  public boolean getApplicationHiddenSettingAsUser(String s, UserHandle userHandle) {
    return false;
  }

  @Override
  public boolean isSafeMode() {
    return false;
  }

  @Override
  public void addOnPermissionsChangeListener(OnPermissionsChangedListener listener) {

  }

  @Override
  public void removeOnPermissionsChangeListener(OnPermissionsChangedListener listener) {

  }

  @Override
  public KeySet getKeySetByAlias(String s, String s1) {
    return null;
  }

  @Override
  public KeySet getSigningKeySet(String s) {
    return null;
  }

  @Override
  public boolean isSignedBy(String s, KeySet keySet) {
    return false;
  }

  @Override
  public boolean isSignedByExactly(String s, KeySet keySet) {
    return false;
  }

  public void movePackage(String packageName, IPackageMoveObserver observer, int flags) {

  }

  @Override
  public int getMoveStatus(int moveId) {
    return 0;
  }

  @Override
  public void registerMoveCallback(MoveCallback callback, Handler handler) {
  }

  @Override
  public void unregisterMoveCallback(MoveCallback callback) {

  }

  @Override
  public int movePackage(String packageName, VolumeInfo vol) {
    return 0;
  }

  @Override
  public VolumeInfo getPackageCurrentVolume(ApplicationInfo app) {
    return null;
  }

  @Override
  public List<VolumeInfo> getPackageCandidateVolumes(ApplicationInfo app) {
    return null;
  }

  @Override
  public int movePrimaryStorage(VolumeInfo vol) {
    return 0;
  }

  @Override
  public VolumeInfo getPrimaryStorageCurrentVolume() {
    return null;
  }

  @Override
  public List<VolumeInfo> getPrimaryStorageCandidateVolumes() {
    return null;
  }

  @Override
  public VerifierDeviceIdentity getVerifierDeviceIdentity() {
    return null;
  }

  @Override
  public boolean isUpgrade() {
    return false;
  }

  @Override
  public PackageInstaller getPackageInstaller() {
    return null;
  }

  @Override
  public void addCrossProfileIntentFilter(IntentFilter intentFilter, int i, int i1, int i2) {

  }

  @Override
  public void clearCrossProfileIntentFilters(int i) {

  }

  @Override
  public Drawable loadItemIcon(PackageItemInfo packageItemInfo, ApplicationInfo applicationInfo) {
    return null;
  }

  @Override
  public Drawable loadUnbadgedItemIcon(PackageItemInfo packageItemInfo, ApplicationInfo applicationInfo) {
    return null;
  }

  @Override
  public boolean isPackageAvailable(String s) {
    return false;
  }

  @Override
  public int getInstallReason(String packageName, UserHandle user) {
    return 0;
  }

  @Override
  public boolean canRequestPackageInstalls() {
    return false;
  }

  @Override
  public void verifyPendingInstall(int id, int verificationCode) {
  }

  @Override
  public void extendVerificationTimeout(int id, int verificationCodeAtTimeout, long millisecondsToDelay) {

  }

  @Override
  public void verifyIntentFilter(int verificationId, int verificationCode, List<String> outFailedDomains) {

  }

  public int getIntentVerificationStatus(String packageName, int userId) {
    return 0;
  }

  public boolean updateIntentVerificationStatus(String packageName, int status, int userId) {
    return false;
  }

  @Override
  public List<IntentFilterVerificationInfo> getIntentFilterVerifications(String packageName) {
    return null;
  }

  @Override
  public List<IntentFilter> getAllIntentFilters(String packageName) {
    return null;
  }

  public String getDefaultBrowserPackageName(int userId) {
    return null;
  }

  public boolean setDefaultBrowserPackageName(String packageName, int userId) {
    return false;
  }

  @Override
  public void setInstallerPackageName(String targetPackage, String installerPackageName) {
  }

  @Override
  public void deletePackage(String packageName, IPackageDeleteObserver observer, int flags) {
  }

  @Override
  public ComponentName getHomeActivities(List<ResolveInfo> outActivities) {
    return null;
  }

  @Override
  public List<ResolveInfo> queryIntentContentProvidersAsUser(Intent intent, int flags, int userId) {
    return Collections.emptyList();
  }

  @Override
  public List<ResolveInfo> queryIntentContentProviders(Intent intent, int flags) {
    return Collections.emptyList();
  }

  @Override
  public PackageInfo getPackageArchiveInfo(String archiveFilePath, int flags) {
    return null;
  }

  public boolean isPackageSuspendedForUser(String packageName, int userId) {
    return false;
  }

  @Override
  public void setApplicationCategoryHint(String packageName, int categoryHint) {

  }

  public String[] setPackagesSuspendedAsUser(
            String[] packageNames, boolean suspended, int userId) {
    return null;
  }

  public void flushPackageRestrictionsAsUser(int userId) {
  }

  public void getPackageSizeInfoAsUser(String packageName, int userId,
            IPackageStatsObserver observer) {
  }

  public void deleteApplicationCacheFilesAsUser(String packageName, int userId,
            IPackageDataObserver observer) {
  }

  public void deletePackageAsUser(String packageName, IPackageDeleteObserver observer,
            int flags, int userId) {
  }

  public String getDefaultBrowserPackageNameAsUser(int userId) {
    return null;
  }

  public boolean updateIntentVerificationStatusAsUser(String packageName, int status,
            int userId) {
     return false;
  }

  public int getIntentVerificationStatusAsUser(String packageName, int userId) {
    return 0;
  }

  public int installExistingPackageAsUser(String packageName, int userId)
            throws NameNotFoundException {
    return 0;
  }

  public boolean setDefaultBrowserPackageNameAsUser(String packageName,
            int userId) {
    return false;
  }
  public Drawable getUserBadgeForDensityNoBackground(UserHandle user, int density) {
    return null;
  }
  public Drawable getManagedUserBadgedDrawable(Drawable drawable, Rect badgeLocation,
        int badgeDensity) {
    return null;
  }
  public List<ResolveInfo> queryBroadcastReceiversAsUser(Intent intent,
            int flags, int userId) {
    return null;
  }
  public boolean hasSystemFeature(String name, int version) {
    return false;
  }

  public String getServicesSystemSharedLibraryPackageName() {
    return null;
  }

  public List<PackageInfo> getInstalledPackagesAsUser(int flags,
            int userId) {
    return null;
  }
  public ApplicationInfo getApplicationInfoAsUser(String packageName,
            int flags, int userId) throws NameNotFoundException {
    return null;
  }
  public int getPackageUidAsUser(String packageName, int userId)
            throws NameNotFoundException {
    return 0;
  }

  public int getPackageUidAsUser(String packageName, int flags,
            int userId) throws NameNotFoundException {
    return 0;
  }
  public int[] getPackageGids(String packageName, int flags)
            throws NameNotFoundException {
    return null;
  }
  public PackageInfo getPackageInfoAsUser(String packageName,
            int flags, int userId) throws NameNotFoundException {
    return null;
  }
  public String getSharedSystemSharedLibraryPackageName() {
    return "";
  }

  @Override
  public ChangedPackages getChangedPackages(int sequenceNumber) {
    return null;
  }
}
