package androidx.print;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.FileNotFoundException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class PrintHelper {
    @SuppressLint({"InlinedApi"})
    public static final int COLOR_MODE_COLOR = 2;
    @SuppressLint({"InlinedApi"})
    public static final int COLOR_MODE_MONOCHROME = 1;
    public static final boolean IS_MIN_MARGINS_HANDLING_CORRECT = false;
    private static final String LOG_TAG = "PrintHelper";
    private static final int MAX_PRINT_SIZE = 3500;
    public static final int ORIENTATION_LANDSCAPE = 1;
    public static final int ORIENTATION_PORTRAIT = 2;
    public static final boolean PRINT_ACTIVITY_RESPECTS_ORIENTATION = false;
    public static final int SCALE_MODE_FILL = 2;
    public static final int SCALE_MODE_FIT = 1;
    public int mColorMode;
    public final Context mContext;
    public BitmapFactory.Options mDecodeOptions;
    public final Object mLock;
    public int mOrientation;
    public int mScaleMode;

    /* renamed from: androidx.print.PrintHelper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends AsyncTask<Void, Void, Throwable> {
        public final /* synthetic */ PrintHelper this$0;
        public final /* synthetic */ PrintAttributes val$attributes;
        public final /* synthetic */ Bitmap val$bitmap;
        public final /* synthetic */ CancellationSignal val$cancellationSignal;
        public final /* synthetic */ ParcelFileDescriptor val$fileDescriptor;
        public final /* synthetic */ int val$fittingMode;
        public final /* synthetic */ PrintAttributes val$pdfAttributes;
        public final /* synthetic */ PrintDocumentAdapter.WriteResultCallback val$writeResultCallback;

        public AnonymousClass1(PrintHelper printHelper, CancellationSignal cancellationSignal, PrintAttributes printAttributes, Bitmap bitmap, PrintAttributes printAttributes2, int i2, ParcelFileDescriptor parcelFileDescriptor, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Throwable doInBackground(Void[] voidArr) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Throwable th) {
        }

        /* renamed from: doInBackground  reason: avoid collision after fix types in other method */
        public Throwable doInBackground2(Void... voidArr) {
        }

        /* renamed from: onPostExecute  reason: avoid collision after fix types in other method */
        public void onPostExecute2(Throwable th) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnPrintFinishCallback {
        void onFinish();
    }

    @RequiresApi(19)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class PrintBitmapAdapter extends PrintDocumentAdapter {
        private PrintAttributes mAttributes;
        private final Bitmap mBitmap;
        private final OnPrintFinishCallback mCallback;
        private final int mFittingMode;
        private final String mJobName;
        public final /* synthetic */ PrintHelper this$0;

        public PrintBitmapAdapter(PrintHelper printHelper, String str, int i2, Bitmap bitmap, OnPrintFinishCallback onPrintFinishCallback) {
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        }
    }

    @RequiresApi(19)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class PrintUriAdapter extends PrintDocumentAdapter {
        public PrintAttributes mAttributes;
        public Bitmap mBitmap;
        public final OnPrintFinishCallback mCallback;
        public final int mFittingMode;
        public final Uri mImageFile;
        public final String mJobName;
        public AsyncTask<Uri, Boolean, Bitmap> mLoadBitmap;
        public final /* synthetic */ PrintHelper this$0;

        /* renamed from: androidx.print.PrintHelper$PrintUriAdapter$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 extends AsyncTask<Uri, Boolean, Bitmap> {
            public final /* synthetic */ PrintUriAdapter this$1;
            public final /* synthetic */ CancellationSignal val$cancellationSignal;
            public final /* synthetic */ PrintDocumentAdapter.LayoutResultCallback val$layoutResultCallback;
            public final /* synthetic */ PrintAttributes val$newPrintAttributes;
            public final /* synthetic */ PrintAttributes val$oldPrintAttributes;

            /* renamed from: androidx.print.PrintHelper$PrintUriAdapter$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
            public class C00041 implements CancellationSignal.OnCancelListener {
                public final /* synthetic */ AnonymousClass1 this$2;

                public C00041(AnonymousClass1 anonymousClass1) {
                }

                @Override // android.os.CancellationSignal.OnCancelListener
                public void onCancel() {
                }
            }

            public AnonymousClass1(PrintUriAdapter printUriAdapter, CancellationSignal cancellationSignal, PrintAttributes printAttributes, PrintAttributes printAttributes2, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback) {
            }

            @Override // android.os.AsyncTask
            public /* bridge */ /* synthetic */ Bitmap doInBackground(Uri[] uriArr) {
            }

            @Override // android.os.AsyncTask
            public /* bridge */ /* synthetic */ void onCancelled(Bitmap bitmap) {
            }

            @Override // android.os.AsyncTask
            public /* bridge */ /* synthetic */ void onPostExecute(Bitmap bitmap) {
            }

            @Override // android.os.AsyncTask
            public void onPreExecute() {
            }

            /* renamed from: doInBackground  reason: avoid collision after fix types in other method */
            public Bitmap doInBackground2(Uri... uriArr) {
            }

            /* renamed from: onCancelled  reason: avoid collision after fix types in other method */
            public void onCancelled2(Bitmap bitmap) {
            }

            /* renamed from: onPostExecute  reason: avoid collision after fix types in other method */
            public void onPostExecute2(Bitmap bitmap) {
            }
        }

        public PrintUriAdapter(PrintHelper printHelper, String str, Uri uri, OnPrintFinishCallback onPrintFinishCallback, int i2) {
        }

        public void cancelLoad() {
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        }
    }

    public PrintHelper(@NonNull Context context) {
    }

    public static Bitmap convertBitmapForColorMode(Bitmap bitmap, int i2) {
    }

    @RequiresApi(19)
    private static PrintAttributes.Builder copyAttributes(PrintAttributes printAttributes) {
    }

    public static Matrix getMatrix(int i2, int i3, RectF rectF, int i4) {
    }

    public static boolean isPortrait(Bitmap bitmap) {
    }

    private Bitmap loadBitmap(Uri uri, BitmapFactory.Options options) throws FileNotFoundException {
    }

    public static boolean systemSupportsPrint() {
    }

    public int getColorMode() {
    }

    public int getOrientation() {
    }

    public int getScaleMode() {
    }

    public Bitmap loadConstrainedBitmap(Uri uri) throws FileNotFoundException {
    }

    public void printBitmap(@NonNull String str, @NonNull Bitmap bitmap) {
    }

    public void setColorMode(int i2) {
    }

    public void setOrientation(int i2) {
    }

    public void setScaleMode(int i2) {
    }

    @RequiresApi(19)
    public void writeBitmap(PrintAttributes printAttributes, int i2, Bitmap bitmap, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
    }

    public void printBitmap(@NonNull String str, @NonNull Bitmap bitmap, @Nullable OnPrintFinishCallback onPrintFinishCallback) {
    }

    public void printBitmap(@NonNull String str, @NonNull Uri uri) throws FileNotFoundException {
    }

    public void printBitmap(@NonNull String str, @NonNull Uri uri, @Nullable OnPrintFinishCallback onPrintFinishCallback) throws FileNotFoundException {
    }
}
