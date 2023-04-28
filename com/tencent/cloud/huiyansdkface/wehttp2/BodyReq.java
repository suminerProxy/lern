package com.tencent.cloud.huiyansdkface.wehttp2;

import com.tencent.cloud.huiyansdkface.okhttp3.Call;
import com.tencent.cloud.huiyansdkface.okhttp3.MediaType;
import com.tencent.cloud.huiyansdkface.okhttp3.RequestBody;
import java.io.File;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class BodyReq extends BaseReq<BodyReq> {

    /* renamed from: d  reason: collision with root package name */
    private RequestBody f11221d;

    /* renamed from: e  reason: collision with root package name */
    private File f11222e;

    /* renamed from: f  reason: collision with root package name */
    private List<MultiPart> f11223f;

    /* renamed from: g  reason: collision with root package name */
    private Map<String, String> f11224g;

    /* renamed from: h  reason: collision with root package name */
    private MediaType f11225h;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class MultiPart {

        /* renamed from: a  reason: collision with root package name */
        public String f11226a;
        public String b;
        public File c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f11227d;

        /* renamed from: e  reason: collision with root package name */
        public String f11228e;

        /* renamed from: f  reason: collision with root package name */
        public MediaType f11229f;

        public MultiPart(String str, String str2, MediaType mediaType) {
        }

        public MultiPart(String str, String str2, File file, MediaType mediaType) {
        }

        public MultiPart(String str, byte[] bArr, MediaType mediaType) {
        }

        public static MultiPart create(String str, File file, MediaType mediaType) {
        }

        public static MultiPart create(String str, String str2, MediaType mediaType) {
        }

        public static MultiPart create(String str, String str2, File file, MediaType mediaType) {
        }

        public static MultiPart create(String str, String str2, byte[] bArr, MediaType mediaType) {
        }

        public static MultiPart create(String str, byte[] bArr, MediaType mediaType) {
        }
    }

    public BodyReq(WeOkHttp weOkHttp, String str, String str2) {
    }

    private static MediaType a(File file) {
    }

    private static String a(Map<String, String> map) {
    }

    private boolean d() {
    }

    public BodyReq addBodyQuery(String str, String str2) {
    }

    public BodyReq addBodyQuery(Map<String, String> map) {
    }

    public BodyReq addPart(String str, File file) {
    }

    public BodyReq addPart(String str, File file, MediaType mediaType) {
    }

    public BodyReq addPart(String str, String str2, MediaType mediaType) {
    }

    public BodyReq addPart(String str, String str2, File file) {
    }

    public BodyReq addPart(String str, String str2, File file, MediaType mediaType) {
    }

    public BodyReq addPart(String str, String str2, byte[] bArr, MediaType mediaType) {
    }

    public BodyReq addPart(String str, byte[] bArr, MediaType mediaType) {
    }

    public BodyReq body(Object obj) {
    }

    public BodyReq bodyFile(File file) {
    }

    public BodyReq bodyFile(File file, MediaType mediaType) {
    }

    public BodyReq bodyJson(Object obj) {
    }

    public BodyReq bodyJson(String str) {
    }

    @Deprecated
    public BodyReq bodyJson(Map<String, Object> map) {
    }

    public BodyReq bodyJson(JSONArray jSONArray) {
    }

    public BodyReq bodyJson(JSONObject jSONObject) {
    }

    public BodyReq bodyText(String str) {
    }

    @Override // com.tencent.cloud.huiyansdkface.wehttp2.BaseReq
    public final Call c() {
    }

    public BodyReq formData() {
    }

    public BodyReq multiPart() {
    }

    public BodyReq multiPart(String str) {
    }
}
