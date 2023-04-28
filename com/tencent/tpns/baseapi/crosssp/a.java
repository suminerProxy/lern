package com.tencent.tpns.baseapi.crosssp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.tencent.tpns.baseapi.base.SettingsContentProvider;
import com.tencent.tpns.baseapi.base.util.Logger;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile a f13720a;
    private Context b;

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.tpns.baseapi.crosssp.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class C0260a {

        /* renamed from: a  reason: collision with root package name */
        public Context f13721a;
        private ContentValues b;

        public void a() {
            try {
                ProviderMessage.insert(this.f13721a, SettingsContentProvider.getContentUri(this.f13721a, "key", "type"), this.b);
            } catch (Throwable th) {
                Logger.e("SettingsPreferences", "apply", th);
            }
        }

        public void b() {
            a();
        }

        private C0260a(Context context) {
            this.b = new ContentValues();
            this.f13721a = context;
        }

        public C0260a a(String str, String str2) {
            this.b.put(str, str2);
            return this;
        }

        public C0260a a(String str, long j2) {
            this.b.put(str, Long.valueOf(j2));
            return this;
        }

        public C0260a a(String str, boolean z) {
            this.b.put(str, Boolean.valueOf(z));
            return this;
        }

        public C0260a a(String str, int i2) {
            this.b.put(str, Integer.valueOf(i2));
            return this;
        }

        public C0260a a(String str, float f2) {
            this.b.put(str, Float.valueOf(f2));
            return this;
        }

        public C0260a a(ContentValues contentValues) {
            if (contentValues != null) {
                this.b.putAll(contentValues);
            } else {
                Logger.w("SettingsPreferences", "putAll failed, values was null");
            }
            return this;
        }

        public void a(String str) {
            this.b.putNull(str);
        }
    }

    private a(Context context) {
        this.b = context.getApplicationContext();
    }

    public static a a(Context context) {
        if (f13720a == null) {
            synchronized (a.class) {
                if (f13720a == null) {
                    f13720a = new a(context);
                }
            }
        }
        return f13720a;
    }

    public Object b(String str, String str2) {
        try {
            return SettingsContentProvider.getObjectValue(ProviderMessage.query(this.b, SettingsContentProvider.getContentUri(this.b, str, SettingsContentProvider.MEMORY_TYPE), null, null), str2);
        } catch (Throwable th) {
            Logger.e("SettingsPreferences", "error = ", th);
            return Boolean.FALSE;
        }
    }

    public C0260a a() {
        return new C0260a(this.b);
    }

    public String a(String str, String str2) {
        Cursor cursor = null;
        try {
            cursor = ProviderMessage.query(this.b, SettingsContentProvider.getContentUri(this.b, str, "string"), null, null, null, null);
            String stringValue = SettingsContentProvider.getStringValue(cursor, str2);
            if (cursor != null) {
                try {
                    if (!cursor.isClosed()) {
                        cursor.close();
                    }
                } catch (Throwable unused) {
                }
            }
            return stringValue;
        } catch (Throwable th) {
            try {
                Logger.e("SettingsPreferences", "error = ", th);
                if (cursor != null) {
                    try {
                        if (!cursor.isClosed()) {
                            cursor.close();
                        }
                    } catch (Throwable unused2) {
                    }
                }
                return "";
            } catch (Throwable th2) {
                if (cursor != null) {
                    try {
                        if (!cursor.isClosed()) {
                            cursor.close();
                        }
                    } catch (Throwable unused3) {
                    }
                }
                throw th2;
            }
        }
    }

    public long a(String str, long j2) {
        Cursor cursor = null;
        try {
            cursor = ProviderMessage.query(this.b, SettingsContentProvider.getContentUri(this.b, str, "long"), null, null, null, null);
            long longValue = SettingsContentProvider.getLongValue(cursor, j2);
            if (cursor != null) {
                try {
                    if (!cursor.isClosed()) {
                        cursor.close();
                    }
                } catch (Throwable unused) {
                }
            }
            return longValue;
        } catch (Throwable th) {
            try {
                Logger.e("SettingsPreferences", "error = ", th);
                if (cursor != null) {
                    try {
                        if (!cursor.isClosed()) {
                            cursor.close();
                        }
                    } catch (Throwable unused2) {
                    }
                }
                return 0L;
            } catch (Throwable th2) {
                if (cursor != null) {
                    try {
                        if (!cursor.isClosed()) {
                            cursor.close();
                        }
                    } catch (Throwable unused3) {
                    }
                }
                throw th2;
            }
        }
    }

    public float a(String str, float f2) {
        Cursor cursor = null;
        try {
            cursor = ProviderMessage.query(this.b, SettingsContentProvider.getContentUri(this.b, str, "float"), null, null, null, null);
            float floatValue = SettingsContentProvider.getFloatValue(cursor, f2);
            if (cursor != null) {
                try {
                    if (!cursor.isClosed()) {
                        cursor.close();
                    }
                } catch (Throwable unused) {
                }
            }
            return floatValue;
        } catch (Throwable th) {
            try {
                Logger.e("SettingsPreferences", "error = ", th);
                if (cursor != null) {
                    try {
                        if (!cursor.isClosed()) {
                            cursor.close();
                        }
                    } catch (Throwable unused2) {
                    }
                }
                return 0.0f;
            } catch (Throwable th2) {
                if (cursor != null) {
                    try {
                        if (!cursor.isClosed()) {
                            cursor.close();
                        }
                    } catch (Throwable unused3) {
                    }
                }
                throw th2;
            }
        }
    }

    public boolean a(String str, boolean z) {
        Cursor cursor = null;
        try {
            cursor = ProviderMessage.query(this.b, SettingsContentProvider.getContentUri(this.b, str, "boolean"), null, null);
            boolean booleanValue = SettingsContentProvider.getBooleanValue(cursor, z);
            if (cursor != null) {
                try {
                    if (!cursor.isClosed()) {
                        cursor.close();
                    }
                } catch (Throwable unused) {
                }
            }
            return booleanValue;
        } catch (Throwable th) {
            try {
                Logger.e("SettingsPreferences", "error = ", th);
                if (cursor != null) {
                    try {
                        if (!cursor.isClosed()) {
                            cursor.close();
                        }
                    } catch (Throwable unused2) {
                    }
                }
                return false;
            } catch (Throwable th2) {
                if (cursor != null) {
                    try {
                        if (!cursor.isClosed()) {
                            cursor.close();
                        }
                    } catch (Throwable unused3) {
                    }
                }
                throw th2;
            }
        }
    }

    public int a(String str, int i2) {
        Cursor cursor = null;
        try {
            cursor = ProviderMessage.query(this.b, SettingsContentProvider.getContentUri(this.b, str, "integer"), null, null, null, null);
            int intValue = SettingsContentProvider.getIntValue(cursor, i2);
            if (cursor != null) {
                try {
                    if (!cursor.isClosed()) {
                        cursor.close();
                    }
                } catch (Throwable unused) {
                }
            }
            return intValue;
        } catch (Throwable th) {
            try {
                Logger.e("SettingsPreferences", "error = ", th);
                if (cursor != null) {
                    try {
                        if (!cursor.isClosed()) {
                            cursor.close();
                        }
                    } catch (Throwable unused2) {
                    }
                }
                return 0;
            } catch (Throwable th2) {
                if (cursor != null) {
                    try {
                        if (!cursor.isClosed()) {
                            cursor.close();
                        }
                    } catch (Throwable unused3) {
                    }
                }
                throw th2;
            }
        }
    }
}
