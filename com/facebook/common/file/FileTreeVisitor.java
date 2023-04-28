package com.facebook.common.file;

import java.io.File;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface FileTreeVisitor {
    void postVisitDirectory(File directory);

    void preVisitDirectory(File directory);

    void visitFile(File file);
}
