package com.facebook.common.util;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import com.facebook.infer.annotation.Assertions;
import com.facebook.infer.annotation.Nullsafe;
import com.facebook.infer.annotation.PropagatesNullable;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class UriUtil {
    public static final String DATA_SCHEME = "data";
    public static final String HTTPS_SCHEME = "https";
    public static final String HTTP_SCHEME = "http";
    public static final String LOCAL_ASSET_SCHEME = "asset";
    private static final Uri LOCAL_CONTACT_IMAGE_URI = Uri.withAppendedPath((Uri) Assertions.assumeNotNull(ContactsContract.AUTHORITY_URI), "display_photo");
    public static final String LOCAL_CONTENT_SCHEME = "content";
    public static final String LOCAL_FILE_SCHEME = "file";
    public static final String LOCAL_RESOURCE_SCHEME = "res";
    public static final String QUALIFIED_RESOURCE_SCHEME = "android.resource";

    @Nullable
    public static AssetFileDescriptor getAssetFileDescriptor(ContentResolver contentResolver, final Uri srcUri) {
        if (isLocalContentUri(srcUri)) {
            try {
                return contentResolver.openAssetFileDescriptor(srcUri, "r");
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Nullable
    public static String getRealPathFromUri(ContentResolver contentResolver, final Uri srcUri) {
        int columnIndex;
        Cursor cursor = null;
        r1 = null;
        r1 = null;
        String string = null;
        if (isLocalContentUri(srcUri)) {
            try {
                Cursor query = contentResolver.query(srcUri, null, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst() && (columnIndex = query.getColumnIndex("_data")) != -1) {
                            string = query.getString(columnIndex);
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (query != null) {
                    query.close();
                    return string;
                }
                return string;
            } catch (Throwable th2) {
                th = th2;
            }
        } else if (isLocalFileUri(srcUri)) {
            return srcUri.getPath();
        } else {
            return null;
        }
    }

    @Nullable
    public static String getSchemeOrNull(@Nullable Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    public static Uri getUriForFile(File file) {
        return Uri.fromFile(file);
    }

    public static Uri getUriForQualifiedResource(String packageName, int resourceId) {
        return new Uri.Builder().scheme(QUALIFIED_RESOURCE_SCHEME).authority(packageName).path(String.valueOf(resourceId)).build();
    }

    public static Uri getUriForResourceId(int resourceId) {
        return new Uri.Builder().scheme(LOCAL_RESOURCE_SCHEME).path(String.valueOf(resourceId)).build();
    }

    public static boolean isDataUri(@Nullable Uri uri) {
        return "data".equals(getSchemeOrNull(uri));
    }

    public static boolean isLocalAssetUri(@Nullable Uri uri) {
        return LOCAL_ASSET_SCHEME.equals(getSchemeOrNull(uri));
    }

    public static boolean isLocalCameraUri(Uri uri) {
        String uri2 = uri.toString();
        return uri2.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || uri2.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString());
    }

    public static boolean isLocalContactUri(Uri uri) {
        return uri.getPath() != null && isLocalContentUri(uri) && "com.android.contacts".equals(uri.getAuthority()) && !uri.getPath().startsWith((String) Assertions.assumeNotNull(LOCAL_CONTACT_IMAGE_URI.getPath()));
    }

    public static boolean isLocalContentUri(@Nullable Uri uri) {
        return "content".equals(getSchemeOrNull(uri));
    }

    public static boolean isLocalFileUri(@Nullable Uri uri) {
        return "file".equals(getSchemeOrNull(uri));
    }

    public static boolean isLocalResourceUri(@Nullable Uri uri) {
        return LOCAL_RESOURCE_SCHEME.equals(getSchemeOrNull(uri));
    }

    public static boolean isNetworkUri(@Nullable Uri uri) {
        String schemeOrNull = getSchemeOrNull(uri);
        return "https".equals(schemeOrNull) || "http".equals(schemeOrNull);
    }

    public static boolean isQualifiedResourceUri(@Nullable Uri uri) {
        return QUALIFIED_RESOURCE_SCHEME.equals(getSchemeOrNull(uri));
    }

    @Nullable
    public static Uri parseUriOrNull(@Nullable String uriAsString) {
        if (uriAsString != null) {
            return Uri.parse(uriAsString);
        }
        return null;
    }

    @Nullable
    public static URL uriToUrl(@PropagatesNullable @Nullable Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }
}
