package com.baidu.platform.comapi.longlink;

import com.baidu.platform.comapi.exception.ComInitException;
import com.baidu.platform.comapi.exception.InvalidComException;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class LongLinkClient {

    /* renamed from: a  reason: collision with root package name */
    private int f2532a;
    private long b;
    private int c;

    private LongLinkClient(long j2, int i2) {
    }

    public static LongLinkClient create() throws ComInitException {
    }

    public synchronized int getRequestId() {
    }

    public boolean init(String str, String str2) throws InvalidComException {
    }

    public boolean isValid() {
    }

    public synchronized boolean register(LongLinkDataCallback longLinkDataCallback) throws InvalidComException {
    }

    public int release() {
    }

    public synchronized ELongLinkStatus sendData(byte[] bArr) throws InvalidComException {
    }

    public synchronized ELongLinkStatus sendFileData(String str, ArrayList<LongLinkFileData> arrayList) throws InvalidComException {
    }

    public void setModuleId(int i2) {
    }

    public boolean start() throws InvalidComException {
    }

    public void stop() throws InvalidComException {
    }

    public synchronized boolean unRegister(LongLinkDataCallback longLinkDataCallback) throws InvalidComException {
    }

    private LongLinkClient(long j2) {
    }

    public static LongLinkClient create(int i2) throws ComInitException {
    }
}
