package com.tencent.thumbplayer.api;

import com.tencent.thumbplayer.api.TPCommonEnum;
import com.tencent.thumbplayer.api.proxy.TPDownloadParamData;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPVideoInfo {
    private Builder builder;
    private String definition;
    private ArrayList<TPDownloadParamData> downloadParamList;
    private String fileID;
    private long height;
    @TPCommonEnum.TP_VIDEO_CODEC_TYPE
    private int videoCodecId;
    private long width;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class Builder {
        private String definition;
        private ArrayList<TPDownloadParamData> downloadParamList;
        private String fileID;
        private long height;
        @TPCommonEnum.TP_VIDEO_CODEC_TYPE
        private int videoCodecId;
        private long width;

        public static /* synthetic */ long access$000(Builder builder) {
        }

        public static /* synthetic */ long access$100(Builder builder) {
        }

        public static /* synthetic */ int access$200(Builder builder) {
        }

        public static /* synthetic */ String access$300(Builder builder) {
        }

        public static /* synthetic */ String access$400(Builder builder) {
        }

        public static /* synthetic */ ArrayList access$500(Builder builder) {
        }

        public TPVideoInfo build() {
        }

        public Builder definition(String str) {
        }

        public Builder downloadParam(TPDownloadParamData tPDownloadParamData) {
        }

        public Builder downloadParamList(ArrayList<TPDownloadParamData> arrayList) {
        }

        public Builder fileId(String str) {
        }

        public Builder size(long j2, long j3) {
        }

        public Builder videoCodecId(@TPCommonEnum.TP_VIDEO_CODEC_TYPE int i2) {
        }
    }

    private TPVideoInfo(Builder builder) {
    }

    public /* synthetic */ TPVideoInfo(Builder builder, AnonymousClass1 anonymousClass1) {
    }

    public Builder getBuilder() {
    }

    public String getDefinition() {
    }

    public ArrayList<TPDownloadParamData> getDownloadPraramList() {
    }

    public long getHeight() {
    }

    public String getProxyFileID() {
    }

    public int getVideoCodecId() {
    }

    public long getWidth() {
    }
}
