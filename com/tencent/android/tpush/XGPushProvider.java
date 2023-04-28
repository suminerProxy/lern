package com.tencent.android.tpush;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.tencent.android.tpush.common.i;
import com.tencent.android.tpush.data.RegisterEntity;
import com.tencent.android.tpush.encrypt.Rijndael;
import com.tencent.android.tpush.logging.TLogger;
import com.tencent.android.tpush.message.e;
import com.tencent.android.tpush.service.cache.CacheManager;
import com.tencent.tpns.baseapi.base.device.GuidInfoManager;
import java.net.URISyntaxException;
import java.util.Arrays;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class XGPushProvider extends ContentProvider {
    public static String AUTH_PRIX = ".XGVIP_PUSH_AUTH";
    public static final String TAG = "XGPushProvider";

    /* renamed from: a  reason: collision with root package name */
    private Context f8578a = null;
    private String b = null;
    private UriMatcher c = new UriMatcher(-1);

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.android.tpush.XGPushProvider$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8579a;

        static {
            int[] iArr = new int[TypeStr.values().length];
            f8579a = iArr;
            try {
                iArr[TypeStr.config.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8579a[TypeStr.config_all.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8579a[TypeStr.hearbeat_cyclecheck.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8579a[TypeStr.hearbeat.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8579a[TypeStr.pullupxg.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8579a[TypeStr.hearbeat_all.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8579a[TypeStr.token.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8579a[TypeStr.register.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8579a[TypeStr.msg.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8579a[TypeStr.msg_all.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8579a[TypeStr.feedback.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8579a[TypeStr.feedback_all.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private void a() {
        if (XGPushManager.getContext() == null) {
            XGPushManager.setContext(this.f8578a);
        }
        if (com.tencent.android.tpush.service.b.e() == null) {
            com.tencent.android.tpush.service.b.b(this.f8578a);
        }
        fetchProviderAuthorities(this.f8578a);
    }

    private void b() {
        Context applicationContext = getContext().getApplicationContext();
        this.f8578a = applicationContext;
        if (XGPushConfig.autoInit) {
            i.a(applicationContext);
        } else {
            a();
        }
        this.b = this.f8578a.getPackageName();
        String str = this.b + AUTH_PRIX;
        UriMatcher uriMatcher = this.c;
        TypeStr typeStr = TypeStr.config;
        uriMatcher.addURI(str, typeStr.getStr(), typeStr.getType());
        UriMatcher uriMatcher2 = this.c;
        TypeStr typeStr2 = TypeStr.config_all;
        uriMatcher2.addURI(str, typeStr2.getStr(), typeStr2.getType());
        UriMatcher uriMatcher3 = this.c;
        TypeStr typeStr3 = TypeStr.msg;
        uriMatcher3.addURI(str, typeStr3.getStr(), typeStr3.getType());
        UriMatcher uriMatcher4 = this.c;
        TypeStr typeStr4 = TypeStr.msg_all;
        uriMatcher4.addURI(str, typeStr4.getStr(), typeStr4.getType());
        UriMatcher uriMatcher5 = this.c;
        TypeStr typeStr5 = TypeStr.hearbeat;
        uriMatcher5.addURI(str, typeStr5.getStr(), typeStr5.getType());
        UriMatcher uriMatcher6 = this.c;
        TypeStr typeStr6 = TypeStr.hearbeat_all;
        uriMatcher6.addURI(str, typeStr6.getStr(), typeStr6.getType());
        UriMatcher uriMatcher7 = this.c;
        TypeStr typeStr7 = TypeStr.feedback;
        uriMatcher7.addURI(str, typeStr7.getStr(), typeStr7.getType());
        UriMatcher uriMatcher8 = this.c;
        TypeStr typeStr8 = TypeStr.feedback_all;
        uriMatcher8.addURI(str, typeStr8.getStr(), typeStr8.getType());
        UriMatcher uriMatcher9 = this.c;
        TypeStr typeStr9 = TypeStr.token;
        uriMatcher9.addURI(str, typeStr9.getStr(), typeStr9.getType());
        UriMatcher uriMatcher10 = this.c;
        TypeStr typeStr10 = TypeStr.register;
        uriMatcher10.addURI(str, typeStr10.getStr(), typeStr10.getType());
        UriMatcher uriMatcher11 = this.c;
        TypeStr typeStr11 = TypeStr.insert_mid_new;
        uriMatcher11.addURI(str, typeStr11.getStr(), typeStr11.getType());
        UriMatcher uriMatcher12 = this.c;
        TypeStr typeStr12 = TypeStr.insert_mid_old;
        uriMatcher12.addURI(str, typeStr12.getStr(), typeStr12.getType());
        UriMatcher uriMatcher13 = this.c;
        TypeStr typeStr13 = TypeStr.pullupxg;
        uriMatcher13.addURI(str, typeStr13.getStr(), typeStr13.getType());
        UriMatcher uriMatcher14 = this.c;
        TypeStr typeStr14 = TypeStr.hearbeat_cyclecheck;
        uriMatcher14.addURI(str, typeStr14.getStr(), typeStr14.getType());
    }

    public static void fetchProviderAuthorities(Context context) {
        try {
            String packageName = context.getPackageName();
            ProviderInfo providerInfo = context.getPackageManager().getProviderInfo(new ComponentName(packageName, XGPushProvider.class.getName()), 0);
            AUTH_PRIX = providerInfo.authority.replace(packageName, "");
            TLogger.i(TAG, "name:" + providerInfo.name + ", authority:" + providerInfo.authority + ", AUTH_PRIX:" + AUTH_PRIX);
        } catch (Throwable th) {
            TLogger.w(TAG, "unexpected for fetchProviderAuthorities", th);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        TLogger.w(TAG, "delete uri:" + uri + ",selection:" + str + ",selectionArgs:" + Arrays.toString(strArr));
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int match = this.c.match(uri);
        TLogger.i(TAG, "getType uri:" + uri + ",match:" + match);
        TypeStr typeStr = TypeStr.getTypeStr(match);
        if (typeStr == null) {
            return null;
        }
        switch (AnonymousClass1.f8579a[typeStr.ordinal()]) {
            case 1:
                return "CONFIG";
            case 2:
                return "CONFIG_ALL";
            case 3:
                com.tencent.android.tpush.service.util.b.a(this.f8578a, true);
                break;
            case 4:
                break;
            case 5:
                TLogger.i(TAG, "Start XGService by provider");
                com.tencent.android.tpush.service.b.a(this.f8578a);
                return null;
            case 6:
                return "HEARTBEAT_ALL";
            case 7:
                return GuidInfoManager.getToken(this.f8578a);
            case 8:
                RegisterEntity currentAppRegisterEntity = CacheManager.getCurrentAppRegisterEntity(this.f8578a);
                TLogger.i(TAG, "get RegisterEntity:" + currentAppRegisterEntity);
                return Rijndael.encrypt(RegisterEntity.encode(currentAppRegisterEntity));
            default:
                return null;
        }
        e.a(this.f8578a).a(false);
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        String asString;
        int match = this.c.match(uri);
        TypeStr typeStr = TypeStr.getTypeStr(match);
        if (typeStr == null) {
            return null;
        }
        TLogger.i(TAG, "insert uri:" + uri + ",match:" + match + ",values:" + contentValues);
        if (AnonymousClass1.f8579a[typeStr.ordinal()] != 9) {
            return null;
        }
        try {
            asString = contentValues.getAsString("key");
        } catch (URISyntaxException e2) {
            e2.printStackTrace();
        }
        if (asString == null) {
            TLogger.e(TAG, "key is null");
            return null;
        }
        Intent parseUri = Intent.parseUri(asString, 0);
        parseUri.addCategory("android.intent.category.BROWSABLE");
        parseUri.setComponent(null);
        if (Build.VERSION.SDK_INT >= 15) {
            parseUri.getClass().getMethod("setSelector", Intent.class).invoke(parseUri, null);
        }
        e.a(this.f8578a).b(parseUri);
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        TLogger.i(TAG, "XGPushProvider onCreate");
        b();
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        TLogger.i(TAG, "query uri:" + uri + ",projection:" + Arrays.toString(strArr) + ",selection:" + str + ",selectionArgs:" + Arrays.toString(strArr2) + ",sortOrder:" + str2);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int match = this.c.match(uri);
        TypeStr typeStr = TypeStr.getTypeStr(match);
        if (typeStr == null) {
            return 0;
        }
        TLogger.i(TAG, "update uri:" + uri + ",values:" + contentValues + ",selection:" + str + ",selectionArgs:" + Arrays.toString(strArr) + ",match:" + match);
        if (AnonymousClass1.f8579a[typeStr.ordinal()] != 11) {
            return 0;
        }
        String decrypt = Rijndael.decrypt(contentValues.getAsString("feedback"));
        TLogger.i(TAG, "feeback: " + decrypt);
        return 0;
    }
}
