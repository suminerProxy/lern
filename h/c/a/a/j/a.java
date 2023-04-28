package h.c.a.a.j;

import com.alipay.mobile.beehive.eventbus.Subscribe;

/* compiled from: ImageReceiver.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class a {
    public static final String b = "ImageReceiver";

    /* renamed from: a  reason: collision with root package name */
    private InterfaceC0302a f16249a;

    /* compiled from: ImageReceiver.java */
    /* renamed from: h.c.a.a.j.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface InterfaceC0302a {
        void onRgbFrameAvailable(byte[] bArr, int i2, int i3);

        void onYuvFrameAvailable(byte[] bArr, int i2, int i3, int i4);
    }

    public void a() {
    }

    @Subscribe(name = "xmedia_rgbframe")
    public void b(Object[] objArr) {
    }

    @Subscribe(name = "xmedia_yuvframe")
    public void c(Object[] objArr) {
    }

    public void d(InterfaceC0302a interfaceC0302a) {
    }

    public void e() {
    }
}
