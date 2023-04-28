package com.facebook.stetho.inspector;

import android.content.Context;
import com.facebook.stetho.server.SocketLike;
import com.facebook.stetho.server.http.HandlerRegistry;
import com.facebook.stetho.server.http.HttpHandler;
import com.facebook.stetho.server.http.LightHttpBody;
import com.facebook.stetho.server.http.LightHttpRequest;
import com.facebook.stetho.server.http.LightHttpResponse;
import javax.annotation.Nullable;
import org.json.JSONException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ChromeDiscoveryHandler implements HttpHandler {
    private static final String PAGE_ID = "1";
    private static final String PATH_ACTIVATE = "/json/activate/1";
    private static final String PATH_PAGE_LIST = "/json";
    private static final String PATH_VERSION = "/json/version";
    private static final String PROTOCOL_VERSION = "1.1";
    private static final String USER_AGENT = "Stetho";
    private static final String WEBKIT_REV = "@188492";
    private static final String WEBKIT_VERSION = "537.36 (@188492)";
    private final Context mContext;
    private final String mInspectorPath;
    @Nullable
    private LightHttpBody mPageListResponse;
    @Nullable
    private LightHttpBody mVersionResponse;

    public ChromeDiscoveryHandler(Context context, String str) {
    }

    private CharSequence getAppLabel() {
    }

    private String getAppLabelAndVersion() {
    }

    private void handleActivate(LightHttpResponse lightHttpResponse) {
    }

    private void handlePageList(LightHttpResponse lightHttpResponse) throws JSONException {
    }

    private void handleVersion(LightHttpResponse lightHttpResponse) throws JSONException {
    }

    private String makeTitle() {
    }

    private static void setSuccessfulResponse(LightHttpResponse lightHttpResponse, LightHttpBody lightHttpBody) {
    }

    @Override // com.facebook.stetho.server.http.HttpHandler
    public boolean handleRequest(SocketLike socketLike, LightHttpRequest lightHttpRequest, LightHttpResponse lightHttpResponse) {
    }

    public void register(HandlerRegistry handlerRegistry) {
    }
}
