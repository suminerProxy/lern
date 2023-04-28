package com.mobile.auth.gatewayauth.sdktools.upload.pns.model;

import com.mobile.auth.x.e;
import com.mobile.auth.x.f;
import java.io.Serializable;
import java.util.List;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class PnsUploadRequest implements f, Serializable {
    private static final long serialVersionUID = -7838291328068778271L;
    private List<UploadLogDTO> uploadLogDTOList;
    private List<UploadMonitorDTO> uploadMonitorDTOList;

    /* renamed from: com.mobile.auth.gatewayauth.sdktools.upload.pns.model.PnsUploadRequest$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends e<UploadLogDTO> {
        public final /* synthetic */ PnsUploadRequest this$0;

        public AnonymousClass1(PnsUploadRequest pnsUploadRequest) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.sdktools.upload.pns.model.PnsUploadRequest$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends e<UploadMonitorDTO> {
        public final /* synthetic */ PnsUploadRequest this$0;

        public AnonymousClass2(PnsUploadRequest pnsUploadRequest) {
        }
    }

    @Override // com.mobile.auth.x.f
    public void fromJson(JSONObject jSONObject) {
    }

    public List<UploadLogDTO> getUploadLogDTOList() {
    }

    public List<UploadMonitorDTO> getUploadMonitorDTOList() {
    }

    public PnsUploadRequest setUploadLogDTOList(List<UploadLogDTO> list) {
    }

    public PnsUploadRequest setUploadMonitorDTOList(List<UploadMonitorDTO> list) {
    }

    @Override // com.mobile.auth.x.f
    public JSONObject toJson() {
    }

    public String toString() {
    }
}
