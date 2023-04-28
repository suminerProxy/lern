package com.sobot.chat.widget.zxing;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class PlanarYUVLuminanceSource extends LuminanceSource {
    private static final int THUMBNAIL_SCALE_FACTOR = 2;
    private final int dataHeight;
    private final int dataWidth;
    private final int left;

    /* renamed from: top  reason: collision with root package name */
    private final int f7740top;
    private final byte[] yuvData;

    public PlanarYUVLuminanceSource(byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
    }

    private void reverseHorizontal(int i2, int i3) {
    }

    @Override // com.sobot.chat.widget.zxing.LuminanceSource
    public LuminanceSource crop(int i2, int i3, int i4, int i5) {
    }

    @Override // com.sobot.chat.widget.zxing.LuminanceSource
    public byte[] getMatrix() {
    }

    @Override // com.sobot.chat.widget.zxing.LuminanceSource
    public byte[] getRow(int i2, byte[] bArr) {
    }

    public int getThumbnailHeight() {
    }

    public int getThumbnailWidth() {
    }

    @Override // com.sobot.chat.widget.zxing.LuminanceSource
    public boolean isCropSupported() {
    }

    public int[] renderThumbnail() {
    }
}
