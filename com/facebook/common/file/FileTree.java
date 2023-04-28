package com.facebook.common.file;

import com.facebook.infer.annotation.Nullsafe;
import java.io.File;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class FileTree {
    public static boolean deleteContents(File directory) {
        File[] listFiles = directory.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File file : listFiles) {
                z &= deleteRecursively(file);
            }
        }
        return z;
    }

    public static boolean deleteRecursively(File file) {
        if (file.isDirectory()) {
            deleteContents(file);
        }
        return file.delete();
    }

    public static void walkFileTree(File directory, FileTreeVisitor visitor) {
        visitor.preVisitDirectory(directory);
        File[] listFiles = directory.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    walkFileTree(file, visitor);
                } else {
                    visitor.visitFile(file);
                }
            }
        }
        visitor.postVisitDirectory(directory);
    }
}
