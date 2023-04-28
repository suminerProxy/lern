package com.sobot.chat.widget.gif;

import android.graphics.Bitmap;
import java.io.InputStream;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class GifDecoder extends Thread {
    private static final int MaxStackSize = 4096;
    public static final int STATUS_FINISH = -1;
    public static final int STATUS_FORMAT_ERROR = 1;
    public static final int STATUS_OPEN_ERROR = 2;
    public static final int STATUS_PARSING = 0;
    private int[] act;
    private GifAction action;
    private int bgColor;
    private int bgIndex;
    private byte[] block;
    private int blockSize;
    private GifFrame currentFrame;
    private int delay;
    private int dispose;
    private int frameCount;
    private int[] gct;
    private boolean gctFlag;
    private int gctSize;
    private byte[] gifData;
    private GifFrame gifFrame;
    public int height;
    private int ih;
    private Bitmap image;
    private InputStream in;
    private boolean interlace;
    private boolean isShow;
    private int iw;
    private int ix;
    private int iy;
    private int lastBgColor;
    private int lastDispose;
    private Bitmap lastImage;
    private int[] lct;
    private boolean lctFlag;
    private int lctSize;
    private int loopCount;
    private int lrh;
    private int lrw;
    private int lrx;
    private int lry;
    private int pixelAspect;
    private byte[] pixelStack;
    private byte[] pixels;
    private short[] prefix;
    private int status;
    private byte[] suffix;
    private int transIndex;
    private boolean transparency;
    public int width;

    public GifDecoder(byte[] bArr, GifAction gifAction) {
    }

    private void decodeImageData() {
    }

    private boolean err() {
    }

    private void init() {
    }

    private int read() {
    }

    private int readBlock() {
    }

    private int readByte() {
    }

    private int[] readColorTable(int i2) {
    }

    private void readContents() {
    }

    private void readGraphicControlExt() {
    }

    private void readHeader() {
    }

    private void readImage() {
    }

    private void readLSD() {
    }

    private void readNetscapeExt() {
    }

    private int readShort() {
    }

    private int readStream() {
    }

    private void resetFrame() {
    }

    private void setPixels() {
    }

    private void skip() {
    }

    public void free() {
    }

    public GifFrame getCurrentFrame() {
    }

    public int getDelay(int i2) {
    }

    public int[] getDelays() {
    }

    public GifFrame getFrame(int i2) {
    }

    public int getFrameCount() {
    }

    public Bitmap getFrameImage(int i2) {
    }

    public Bitmap getImage() {
    }

    public int getLoopCount() {
    }

    public int getStatus() {
    }

    public GifFrame next() {
    }

    public boolean parseOk() {
    }

    public void reset() {
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
    }

    public GifDecoder(InputStream inputStream, GifAction gifAction) {
    }
}
