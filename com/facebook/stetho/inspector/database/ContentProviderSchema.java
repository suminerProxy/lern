package com.facebook.stetho.inspector.database;

import android.net.Uri;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ContentProviderSchema {
    private final String[] mProjection;
    private final String mTableName;
    private final Uri mUri;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Builder {
        private Table mTable;

        public static /* synthetic */ Table access$000(Builder builder) {
        }

        public ContentProviderSchema build() {
        }

        public Builder table(Table table) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Table {
        private String[] mProjection;
        private String mTableName;
        private Uri mUri;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static class Builder {
            private String[] mProjection;
            private String mTableName;
            private Uri mUri;

            public static /* synthetic */ Uri access$500(Builder builder) {
            }

            public static /* synthetic */ String[] access$600(Builder builder) {
            }

            public static /* synthetic */ String access$700(Builder builder) {
            }

            public Table build() {
            }

            public Builder name(String str) {
            }

            public Builder projection(String[] strArr) {
            }

            public Builder uri(Uri uri) {
            }
        }

        public /* synthetic */ Table(Builder builder, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ String access$100(Table table) {
        }

        public static /* synthetic */ Uri access$200(Table table) {
        }

        public static /* synthetic */ String[] access$300(Table table) {
        }

        private Table(Builder builder) {
        }
    }

    public /* synthetic */ ContentProviderSchema(Builder builder, AnonymousClass1 anonymousClass1) {
    }

    public String[] getProjection() {
    }

    public String getTableName() {
    }

    public Uri getUri() {
    }

    private ContentProviderSchema(Builder builder) {
    }
}
