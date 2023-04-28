package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import com.umeng.analytics.pro.aq;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class LocalContentUriFetchProducer extends LocalFetchProducer {
    public static final String PRODUCER_NAME = "LocalContentUriFetchProducer";
    private static final String[] PROJECTION = {aq.f14745d, "_data"};
    private final ContentResolver mContentResolver;

    public LocalContentUriFetchProducer(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, ContentResolver contentResolver) {
        super(executor, pooledByteBufferFactory);
        this.mContentResolver = contentResolver;
    }

    @Nullable
    private EncodedImage getCameraImage(Uri uri) throws IOException {
        try {
            ParcelFileDescriptor openFileDescriptor = this.mContentResolver.openFileDescriptor(uri, "r");
            Preconditions.checkNotNull(openFileDescriptor);
            return getEncodedImage(new FileInputStream(openFileDescriptor.getFileDescriptor()), (int) openFileDescriptor.getStatSize());
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    @Override // com.facebook.imagepipeline.producers.LocalFetchProducer
    public EncodedImage getEncodedImage(ImageRequest imageRequest) throws IOException {
        EncodedImage cameraImage;
        InputStream createInputStream;
        Uri sourceUri = imageRequest.getSourceUri();
        if (!UriUtil.isLocalContactUri(sourceUri)) {
            return (!UriUtil.isLocalCameraUri(sourceUri) || (cameraImage = getCameraImage(sourceUri)) == null) ? getEncodedImage((InputStream) Preconditions.checkNotNull(this.mContentResolver.openInputStream(sourceUri)), -1) : cameraImage;
        }
        if (sourceUri.toString().endsWith("/photo")) {
            createInputStream = this.mContentResolver.openInputStream(sourceUri);
        } else if (sourceUri.toString().endsWith("/display_photo")) {
            try {
                AssetFileDescriptor openAssetFileDescriptor = this.mContentResolver.openAssetFileDescriptor(sourceUri, "r");
                Preconditions.checkNotNull(openAssetFileDescriptor);
                createInputStream = openAssetFileDescriptor.createInputStream();
            } catch (IOException unused) {
                throw new IOException("Contact photo does not exist: " + sourceUri);
            }
        } else {
            InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.mContentResolver, sourceUri);
            if (openContactPhotoInputStream == null) {
                throw new IOException("Contact photo does not exist: " + sourceUri);
            }
            createInputStream = openContactPhotoInputStream;
        }
        Preconditions.checkNotNull(createInputStream);
        return getEncodedImage(createInputStream, -1);
    }

    @Override // com.facebook.imagepipeline.producers.LocalFetchProducer
    public String getProducerName() {
        return PRODUCER_NAME;
    }
}
