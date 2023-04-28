package com.facebook.stetho.inspector.protocol.module;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import com.facebook.stetho.inspector.helper.ChromePeerManager;
import com.facebook.stetho.inspector.helper.ObjectIdMapper;
import com.facebook.stetho.inspector.helper.PeersRegisteredListener;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcException;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver;
import com.facebook.stetho.json.ObjectMapper;
import com.facebook.stetho.json.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;
import org.json.JSONObject;

@TargetApi(11)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class Database implements ChromeDevtoolsDomain {
    private static final int MAX_BLOB_LENGTH = 512;
    private static final int MAX_EXECUTE_RESULTS = 250;
    private static final String UNKNOWN_BLOB_LABEL = "{blob}";
    private final ChromePeerManager mChromePeerManager;
    private List<DatabaseDriver2> mDatabaseDrivers;
    private final ObjectMapper mObjectMapper;
    private final DatabasePeerRegistrationListener mPeerListener;

    /* renamed from: com.facebook.stetho.inspector.protocol.module.Database$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements BaseDatabaseDriver.ExecuteResultHandler<ExecuteSQLResponse> {
        public final /* synthetic */ Database this$0;

        public AnonymousClass1(Database database) {
        }

        @Override // com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver.ExecuteResultHandler
        public /* bridge */ /* synthetic */ ExecuteSQLResponse handleInsert(long j2) throws SQLiteException {
        }

        @Override // com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver.ExecuteResultHandler
        public /* bridge */ /* synthetic */ ExecuteSQLResponse handleRawQuery() throws SQLiteException {
        }

        @Override // com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver.ExecuteResultHandler
        public /* bridge */ /* synthetic */ ExecuteSQLResponse handleSelect(Cursor cursor) throws SQLiteException {
        }

        @Override // com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver.ExecuteResultHandler
        public /* bridge */ /* synthetic */ ExecuteSQLResponse handleUpdateDelete(int i2) throws SQLiteException {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver.ExecuteResultHandler
        public ExecuteSQLResponse handleInsert(long j2) throws SQLiteException {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver.ExecuteResultHandler
        public ExecuteSQLResponse handleRawQuery() throws SQLiteException {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver.ExecuteResultHandler
        public ExecuteSQLResponse handleSelect(Cursor cursor) throws SQLiteException {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver.ExecuteResultHandler
        public ExecuteSQLResponse handleUpdateDelete(int i2) throws SQLiteException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AddDatabaseEvent {
        @JsonProperty(required = true)
        public DatabaseObject database;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class DatabaseDescriptorHolder {
        public final DatabaseDescriptor descriptor;
        public final DatabaseDriver2 driver;

        public DatabaseDescriptorHolder(DatabaseDriver2 databaseDriver2, DatabaseDescriptor databaseDescriptor) {
        }
    }

    @Deprecated
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class DatabaseDriver extends BaseDatabaseDriver<String> {
        public DatabaseDriver(Context context) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class DatabaseObject {
        @JsonProperty(required = true)
        public String domain;
        @JsonProperty(required = true)
        public String id;
        @JsonProperty(required = true)
        public String name;
        @JsonProperty(required = true)
        public String version;
    }

    @ThreadSafe
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class DatabasePeerRegistrationListener extends PeersRegisteredListener {
        private final List<DatabaseDriver2> mDatabaseDrivers;
        @GuardedBy("this")
        private final SparseArray<DatabaseDescriptorHolder> mDatabaseHolders;
        @GuardedBy("this")
        private final ObjectIdMapper mDatabaseIdMapper;

        public /* synthetic */ DatabasePeerRegistrationListener(List list, AnonymousClass1 anonymousClass1) {
        }

        public DatabaseDescriptorHolder getDatabaseDescriptorHolder(String str) {
        }

        @Override // com.facebook.stetho.inspector.helper.PeersRegisteredListener
        public synchronized void onFirstPeerRegistered() {
        }

        @Override // com.facebook.stetho.inspector.helper.PeersRegisteredListener
        public synchronized void onLastPeerUnregistered() {
        }

        @Override // com.facebook.stetho.inspector.helper.PeersRegisteredListener
        public synchronized void onPeerAdded(JsonRpcPeer jsonRpcPeer) {
        }

        @Override // com.facebook.stetho.inspector.helper.PeersRegisteredListener
        public synchronized void onPeerRemoved(JsonRpcPeer jsonRpcPeer) {
        }

        private DatabasePeerRegistrationListener(List<DatabaseDriver2> list) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Error {
        @JsonProperty(required = true)
        public int code;
        @JsonProperty(required = true)
        public String message;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ExecuteSQLRequest {
        @JsonProperty(required = true)
        public String databaseId;
        @JsonProperty(required = true)
        public String query;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ExecuteSQLResponse implements JsonRpcResult {
        @JsonProperty
        public List<String> columnNames;
        @JsonProperty
        public Error sqlError;
        @JsonProperty
        public List<String> values;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class GetDatabaseTableNamesRequest {
        @JsonProperty(required = true)
        public String databaseId;

        private GetDatabaseTableNamesRequest() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class GetDatabaseTableNamesResponse implements JsonRpcResult {
        @JsonProperty(required = true)
        public List<String> tableNames;

        private GetDatabaseTableNamesResponse() {
        }

        public /* synthetic */ GetDatabaseTableNamesResponse(AnonymousClass1 anonymousClass1) {
        }
    }

    public static /* synthetic */ ArrayList access$200(Cursor cursor, int i2) {
    }

    private static String blobToString(byte[] bArr) {
    }

    private static boolean fastIsAscii(byte[] bArr) {
    }

    private static ArrayList<String> flattenRows(Cursor cursor, int i2) {
    }

    public void add(DatabaseDriver2 databaseDriver2) {
    }

    @ChromeDevtoolsMethod
    public void disable(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public void enable(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public JsonRpcResult executeSQL(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public JsonRpcResult getDatabaseTableNames(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) throws JsonRpcException {
    }
}
