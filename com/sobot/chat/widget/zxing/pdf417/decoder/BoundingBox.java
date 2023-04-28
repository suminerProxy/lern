package com.sobot.chat.widget.zxing.pdf417.decoder;

import com.sobot.chat.widget.zxing.NotFoundException;
import com.sobot.chat.widget.zxing.ResultPoint;
import com.sobot.chat.widget.zxing.common.BitMatrix;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class BoundingBox {
    private final ResultPoint bottomLeft;
    private final ResultPoint bottomRight;
    private final BitMatrix image;
    private final int maxX;
    private final int maxY;
    private final int minX;
    private final int minY;
    private final ResultPoint topLeft;
    private final ResultPoint topRight;

    public BoundingBox(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) throws NotFoundException {
    }

    public static BoundingBox merge(BoundingBox boundingBox, BoundingBox boundingBox2) throws NotFoundException {
    }

    public BoundingBox addMissingRows(int i2, int i3, boolean z) throws NotFoundException {
    }

    public ResultPoint getBottomLeft() {
    }

    public ResultPoint getBottomRight() {
    }

    public int getMaxX() {
    }

    public int getMaxY() {
    }

    public int getMinX() {
    }

    public int getMinY() {
    }

    public ResultPoint getTopLeft() {
    }

    public ResultPoint getTopRight() {
    }

    public BoundingBox(BoundingBox boundingBox) {
    }
}
