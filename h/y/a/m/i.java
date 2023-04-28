package h.y.a.m;

import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.taihebase.activity.network.model.ParameterBody;
import com.taihebase.activity.network.model.ParameterQueryBody;
import com.taihebase.activity.network.model.RealParameterBody;
import h.y.a.n.m0;
import h.y.a.n.u0;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* compiled from: ApiParams.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class i extends HashMap<String, Object> {
    private boolean encrypt;

    public i() {
        this.encrypt = false;
    }

    public static /* synthetic */ int a(Map.Entry entry, Map.Entry entry2) {
        int compareTo = ((String) entry.getKey()).compareTo((String) entry2.getKey());
        return compareTo == 0 ? entry.getValue().toString().compareTo(entry2.getValue().toString()) : compareTo;
    }

    private Iterator<Map.Entry<String, Object>> getEntry() {
        return entrySet().iterator();
    }

    private Iterator<Map.Entry<String, Object>> getSortEntry() {
        LinkedList linkedList = new LinkedList(entrySet());
        Collections.sort(linkedList, a.b);
        return linkedList.iterator();
    }

    public MultipartBody.Builder getFileUploadParams() {
        MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.addFormDataPart("terminal", "3");
        Iterator<Map.Entry<String, Object>> entry = getEntry();
        while (entry.hasNext()) {
            Map.Entry<String, Object> next = entry.next();
            String key = next.getKey();
            Object value = next.getValue();
            if (value instanceof File) {
                File file = (File) value;
                builder.addFormDataPart(key, file.getName(), RequestBody.create(MediaType.parse("image/png"), file));
            }
        }
        return builder;
    }

    public MultipartBody.Builder getFileZipUploadParams() {
        MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.addFormDataPart("terminal", "3");
        Iterator<Map.Entry<String, Object>> entry = getEntry();
        while (entry.hasNext()) {
            Map.Entry<String, Object> next = entry.next();
            String key = next.getKey();
            Object value = next.getValue();
            if (value instanceof File) {
                File file = (File) value;
                builder.addFormDataPart(key, file.getName(), RequestBody.create(MediaType.parse("application/zip"), file));
            } else {
                builder.addFormDataPart(key, value.toString());
            }
        }
        return builder;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair<okhttp3.Headers, java.lang.String> getHeadersAndParams(java.lang.String r22, java.util.Map<java.lang.String, java.lang.String> r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.y.a.m.i.getHeadersAndParams(java.lang.String, java.util.Map, boolean):android.util.Pair");
    }

    public String getPostParams(String str, boolean z, h.y.a.m.u.a aVar) {
        String jSONString;
        JSONObject jSONObject = new JSONObject();
        Iterator<Map.Entry<String, Object>> entry = getEntry();
        while (entry.hasNext()) {
            Map.Entry<String, Object> next = entry.next();
            String key = next.getKey();
            Object value = next.getValue();
            if (!(value instanceof File)) {
                jSONObject.put(key, value);
            }
        }
        if (aVar == h.y.a.m.u.a.REQUEST_BODY) {
            jSONString = JSON.toJSONString(new ParameterBody(str, m0.k(), m0.y(8), Build.MODEL, Build.VERSION.RELEASE, jSONObject));
        } else {
            jSONString = JSON.toJSONString(new ParameterQueryBody(str, m0.k(), m0.y(8), Build.MODEL, Build.VERSION.RELEASE, jSONObject));
        }
        String x = z ? h.y.a.f.k.F : u0.L().x();
        if (TextUtils.isEmpty(x)) {
            return "";
        }
        String d2 = h.y.a.n.p.d(x, jSONString);
        String o2 = m0.o(jSONString);
        RealParameterBody realParameterBody = new RealParameterBody();
        realParameterBody.data = d2;
        realParameterBody.sign = o2;
        realParameterBody.appid = "app";
        realParameterBody.terminal = "android";
        realParameterBody.version = m0.J(h.y.a.f.k.b());
        realParameterBody.aru = h.y.a.n.p.d(h.y.a.f.k.F, str);
        return JSON.toJSONString(realParameterBody);
    }

    public i(boolean z) {
        this.encrypt = false;
        this.encrypt = z;
    }
}
