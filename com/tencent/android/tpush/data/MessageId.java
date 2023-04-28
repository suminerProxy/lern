package com.tencent.android.tpush.data;

import java.io.Serializable;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MessageId implements Serializable {
    public static final short FLAG_ACK = 1;
    public static final short FLAG_UNACK = 0;
    private static final long serialVersionUID = 8708157897391765794L;
    public long accessId;
    public byte apn;
    public long host;
    public long id;
    public short isAck;
    public byte isp;
    public byte pact;
    public String pkgName;
    public int port;
    public int pushChannel;
    public long pushTime;
    public long receivedTime;
    public long serverTime;
    public String serviceHost;
    public long ttl;
    public long busiMsgId = 0;
    public long timestamp = 0;
    public long msgType = -1;
    public long multiPkg = 0;
    public String date = "";
    public long channelId = -1;
    public String nGroupId = "";
    public String statTag = "";
    public String groupId = "";
    public int revokeId = 0;

    public boolean isMsgAcked() {
        return this.isAck == 1;
    }

    public String toString() {
        return "MessageId [id=" + this.id + ", isAck=" + ((int) this.isAck) + ", isp=" + ((int) this.isp) + ", apn=" + ((int) this.apn) + ", accessId=" + this.accessId + ", receivedTime=" + this.receivedTime + ", pact=" + ((int) this.pact) + ", host=" + this.host + ", port=" + this.port + ", serviceHost=" + this.serviceHost + ", pkgName=" + this.pkgName + ", busiMsgId=" + this.busiMsgId + ", timestamp=" + this.timestamp + ", msgType=" + this.msgType + ", multiPkg=" + this.multiPkg + ", date=" + this.date + ", serverTime=" + this.serverTime + ", ttl=" + this.ttl + "], revokeId=" + this.revokeId;
    }
}
