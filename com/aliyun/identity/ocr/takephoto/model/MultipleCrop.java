package com.aliyun.identity.ocr.takephoto.model;

import android.app.Activity;
import android.net.Uri;
import com.aliyun.identity.ocr.takephoto.model.TImage;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MultipleCrop {
    private TImage.FromType fromType;
    public boolean hasFailed;
    private ArrayList<Uri> outUris;
    private ArrayList<TImage> tImages;
    private ArrayList<Uri> uris;

    private MultipleCrop(ArrayList<Uri> arrayList, Activity activity, TImage.FromType fromType) throws TException {
    }

    public static MultipleCrop of(ArrayList<Uri> arrayList, Activity activity, TImage.FromType fromType) throws TException {
    }

    public ArrayList<Uri> getOutUris() {
    }

    public ArrayList<Uri> getUris() {
    }

    public ArrayList<TImage> gettImages() {
    }

    public Map setCropWithUri(Uri uri, boolean z) {
    }

    public void setOutUris(ArrayList<Uri> arrayList) {
    }

    public void setUris(ArrayList<Uri> arrayList) {
    }

    public void settImages(ArrayList<TImage> arrayList) {
    }

    public static MultipleCrop of(ArrayList<Uri> arrayList, ArrayList<Uri> arrayList2, TImage.FromType fromType) {
    }

    private MultipleCrop(ArrayList<Uri> arrayList, ArrayList<Uri> arrayList2, TImage.FromType fromType) {
    }
}
