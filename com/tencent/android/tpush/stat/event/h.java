package com.tencent.android.tpush.stat.event;

import android.content.Context;
import org.json.JSONObject;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class h extends Event {

    /* renamed from: a  reason: collision with root package name */
    private com.tencent.android.tpush.stat.b.a f9167a;
    private JSONObject b;

    public h(Context context, int i2, JSONObject jSONObject, long j2) {
        super(context, i2, j2);
        this.b = null;
        this.f9167a = new com.tencent.android.tpush.stat.b.a(context, j2);
        this.b = jSONObject;
    }

    @Override // com.tencent.android.tpush.stat.event.Event
    public EventType getType() {
        return EventType.SESSION_ENV;
    }

    @Override // com.tencent.android.tpush.stat.event.Event
    public boolean onEncode(JSONObject jSONObject) {
        jSONObject.put("ut", 1);
        JSONObject jSONObject2 = this.b;
        if (jSONObject2 != null) {
            jSONObject.put("cfg", jSONObject2);
        }
        if (com.tencent.android.tpush.stat.b.b.e(this.f9138k)) {
            jSONObject.put("ncts", 1);
        }
        this.f9167a.a(jSONObject, (Thread) null);
        return true;
    }
}
