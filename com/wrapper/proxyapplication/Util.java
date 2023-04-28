package com.wrapper.proxyapplication;

import android.os.Process;
import h.w.a.e.c.a;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_app_com.showstartfans.activity-1_base.apk_68136.dex */
public class Util {
    public static String CPUABI = null;
    static final int ERROR_EXCEPTION = -2;
    static final int ERROR_FALSE = 0;
    static final int ERROR_FILE_EXIST = 2;
    static final int ERROR_FILE_NOT_FOUND = -1;
    static final int ERROR_FILE_NOT_FOUND_INZIP = -3;
    static final int ERROR_SUCCESS = 1;
    public static String libname;
    public static String simplelibname;
    public static int MAX_DEX_NUM = 300;
    public static String TAG = "Util";
    public static String securename0 = "00O000ll111l.dex";
    public static String securename1 = "00O000ll111l.jar";
    public static String securename2 = "000O00ll111l.dex";
    public static String securename3 = "0000000lllll.dex";
    public static String securename4 = "000000olllll.dex";
    public static String securename5 = "0OO00l111l1l";
    public static String securename6 = "o0oooOO0ooOo.dat";
    public static String securename7 = "exportService.txt";
    public static String securename8 = ".flag00O000ll111l.dex";
    public static String securename9 = ".updateIV.dat";
    public static String versionname = "tosversion";
    public static String securename11 = ".flag00O000ll111l.vdex";
    public static String securename14 = "00O000ll111l.vdex";
    public static String securename15 = "00O000ll111l.odex";
    public static String dexname = "classes.dex";
    public static boolean ifoverwrite = true;

    static {
        CPUABI = null;
        libname = "";
        simplelibname = "";
        int tid = Process.myTid();
        CPUABI = getelffilearch("/proc/" + tid + "/exe");
        String str = CPUABI;
        if (str != "86" && str != "86_64") {
            simplelibname = "shell-super.com.showstartfans.activity";
            libname = "lib" + simplelibname + ".so";
            return;
        }
        simplelibname = "shellx-super.com.showstartfans.activity";
        libname = "lib" + simplelibname + ".so";
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x001a -> B:29:0x0034). Please submit an issue!!! */
    public static int readelfarch(String filename) {
        int c = 0;
        RandomAccessFile rf = null;
        try {
            try {
                try {
                    try {
                        rf = new RandomAccessFile(filename, "r");
                        rf.seek(18L);
                        c = rf.read();
                        rf.close();
                    } catch (Throwable th) {
                        if (rf != null) {
                            try {
                                rf.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (FileNotFoundException e3) {
                    e3.printStackTrace();
                    if (rf != null) {
                        rf.close();
                    }
                }
            } catch (IOException e4) {
                e4.printStackTrace();
                if (rf != null) {
                    rf.close();
                }
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        }
        return c;
    }

    public static String getelffilearch(String elffile) {
        int archcode = readelfarch(elffile);
        if (archcode != 3) {
            if (archcode != 40) {
                if (archcode != 62) {
                    if (archcode == 183) {
                        return "arm64-v8a";
                    }
                    return "unknown";
                }
                return "86_64";
            }
            return "armeabi";
        }
        return "86";
    }

    public static int DeleteFile(String filepath) {
        File tmpfile = new File(filepath);
        if (tmpfile.exists()) {
            if (!tmpfile.delete()) {
                return -2;
            }
            return 1;
        }
        return -1;
    }

    public static boolean UnzipFile(ZipFile zf, String filepathinzip, File fileinfiledir) {
        BufferedOutputStream Output_fos = null;
        BufferedInputStream bufbr = null;
        try {
            try {
                ZipEntry ze = zf.getEntry(filepathinzip);
                if (ze == null) {
                    try {
                        if (0 != 0) {
                            try {
                                Output_fos.close();
                                if (0 != 0) {
                                    try {
                                        bufbr.close();
                                    } catch (IOException e2) {
                                        e2.printStackTrace();
                                        return false;
                                    }
                                }
                            } catch (IOException e3) {
                                e3.printStackTrace();
                                if (0 != 0) {
                                    try {
                                        bufbr.close();
                                    } catch (IOException e4) {
                                        e4.printStackTrace();
                                        return false;
                                    }
                                }
                                return false;
                            }
                        }
                        return false;
                    } catch (Throwable e5) {
                        if (0 != 0) {
                            try {
                                bufbr.close();
                            } catch (IOException e6) {
                                e6.printStackTrace();
                                return false;
                            }
                        }
                        throw e5;
                    }
                }
                Output_fos = new BufferedOutputStream(new FileOutputStream(fileinfiledir));
                byte[] buf = new byte[65536];
                bufbr = new BufferedInputStream(zf.getInputStream(ze));
                while (true) {
                    int readlen = bufbr.read(buf);
                    if (readlen < 0) {
                        try {
                            try {
                                Output_fos.close();
                                try {
                                    bufbr.close();
                                    return true;
                                } catch (IOException e7) {
                                    e7.printStackTrace();
                                    return false;
                                }
                            } catch (Throwable e8) {
                                try {
                                    bufbr.close();
                                    throw e8;
                                } catch (IOException e9) {
                                    e9.printStackTrace();
                                    return false;
                                }
                            }
                        } catch (IOException e10) {
                            e10.printStackTrace();
                            try {
                                bufbr.close();
                                return false;
                            } catch (IOException e11) {
                                e11.printStackTrace();
                                return false;
                            }
                        }
                    }
                    Output_fos.write(buf, 0, readlen);
                }
            } catch (Throwable th) {
                if (Output_fos != null) {
                    try {
                        try {
                            Output_fos.close();
                            if (bufbr != null) {
                                try {
                                    bufbr.close();
                                } catch (IOException e12) {
                                    e12.printStackTrace();
                                    return false;
                                }
                            }
                        } catch (Throwable e13) {
                            if (bufbr != null) {
                                try {
                                    bufbr.close();
                                } catch (IOException e14) {
                                    e14.printStackTrace();
                                    return false;
                                }
                            }
                            throw e13;
                        }
                    } catch (IOException e15) {
                        e15.printStackTrace();
                        if (bufbr != null) {
                            try {
                                bufbr.close();
                            } catch (IOException e16) {
                                e16.printStackTrace();
                                return false;
                            }
                        }
                        return false;
                    }
                }
                throw th;
            }
        } catch (Exception e17) {
            e17.printStackTrace();
            try {
                if (Output_fos != null) {
                    try {
                        Output_fos.close();
                        if (bufbr != null) {
                            try {
                                bufbr.close();
                            } catch (IOException e18) {
                                e18.printStackTrace();
                                return false;
                            }
                        }
                    } catch (IOException e19) {
                        e19.printStackTrace();
                        if (bufbr != null) {
                            try {
                                bufbr.close();
                            } catch (IOException e20) {
                                e20.printStackTrace();
                                return false;
                            }
                        }
                        return false;
                    }
                }
                return false;
            } catch (Throwable e21) {
                if (bufbr != null) {
                    try {
                        bufbr.close();
                    } catch (IOException e22) {
                        e22.printStackTrace();
                        return false;
                    }
                }
                throw e21;
            }
        }
    }

    public static int Comparetxtinzip(ZipFile apkzf, String filepathinzip, File fileinfiledir) {
        BufferedInputStream checkzbr = null;
        BufferedInputStream checkfbr = null;
        ZipEntry cookie_entry = apkzf.getEntry(filepathinzip);
        if (cookie_entry == null) {
            try {
                if (0 != 0) {
                    try {
                        checkzbr.close();
                        if (0 != 0) {
                            try {
                                checkfbr.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                                return -2;
                            }
                        }
                    } catch (IOException e3) {
                        e3.printStackTrace();
                        if (0 != 0) {
                            try {
                                checkfbr.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                                return -2;
                            }
                        }
                        return -2;
                    }
                }
                return -3;
            } catch (Throwable e5) {
                if (0 != 0) {
                    try {
                        checkfbr.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                        return -2;
                    }
                }
                throw e5;
            }
        }
        try {
            try {
                byte[] checkzipbuf = new byte[1024];
                byte[] checkfilebuf = new byte[1024];
                checkzbr = new BufferedInputStream(apkzf.getInputStream(cookie_entry));
                int readziplen = checkzbr.read(checkzipbuf);
                String tmpzipstr = new String(checkzipbuf).substring(0, readziplen);
                checkfbr = new BufferedInputStream(new FileInputStream(fileinfiledir));
                int readfilelen = checkfbr.read(checkfilebuf);
                String tmpfilestr = new String(checkfilebuf).substring(0, readfilelen);
                int result = tmpfilestr.equals(tmpzipstr) ? 1 : 0;
                try {
                    try {
                        checkzbr.close();
                        try {
                            checkfbr.close();
                            return result;
                        } catch (IOException e7) {
                            e7.printStackTrace();
                            return -2;
                        }
                    } catch (IOException e8) {
                        e8.printStackTrace();
                        try {
                            checkfbr.close();
                            return -2;
                        } catch (IOException e9) {
                            e9.printStackTrace();
                            return -2;
                        }
                    }
                } catch (Throwable e10) {
                    try {
                        checkfbr.close();
                        throw e10;
                    } catch (IOException e11) {
                        e11.printStackTrace();
                        return -2;
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
                if (checkzbr != null) {
                    try {
                        try {
                            checkzbr.close();
                            if (checkfbr != null) {
                                try {
                                    checkfbr.close();
                                } catch (IOException e13) {
                                    e13.printStackTrace();
                                    return -2;
                                }
                            }
                        } catch (Throwable e14) {
                            if (checkfbr != null) {
                                try {
                                    checkfbr.close();
                                } catch (IOException e15) {
                                    e15.printStackTrace();
                                    return -2;
                                }
                            }
                            throw e14;
                        }
                    } catch (IOException e16) {
                        e16.printStackTrace();
                        if (checkfbr != null) {
                            try {
                                checkfbr.close();
                            } catch (IOException e17) {
                                e17.printStackTrace();
                                return -2;
                            }
                        }
                        return -2;
                    }
                }
                return -2;
            }
        } catch (Throwable e18) {
            if (checkzbr != null) {
                try {
                    try {
                        checkzbr.close();
                        if (checkfbr != null) {
                            try {
                                checkfbr.close();
                            } catch (IOException e19) {
                                e19.printStackTrace();
                                return -2;
                            }
                        }
                    } catch (Throwable e20) {
                        if (checkfbr != null) {
                            try {
                                checkfbr.close();
                            } catch (IOException e21) {
                                e21.printStackTrace();
                                return -2;
                            }
                        }
                        throw e20;
                    }
                } catch (IOException e22) {
                    e22.printStackTrace();
                    if (checkfbr != null) {
                        try {
                            checkfbr.close();
                        } catch (IOException e23) {
                            e23.printStackTrace();
                            return -2;
                        }
                    }
                    return -2;
                }
            }
            throw e18;
        }
    }

    public static boolean deleteDir(File file) {
        if (file.isDirectory()) {
            String[] children = file.list();
            for (String str : children) {
                boolean success = deleteDir(new File(file, str));
                if (!success) {
                    return false;
                }
            }
        }
        if (!file.exists()) {
            return true;
        }
        boolean result = file.delete();
        return result;
    }

    /* JADX WARN: Removed duplicated region for block: B:442:0x1119  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x116b  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x1185  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x11e5  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x1236  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x1309 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:564:0x132b  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x1389  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x13e9  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x143a  */
    /* JADX WARN: Removed duplicated region for block: B:765:0x144e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:768:0x124a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int PrepareSecurefiles(android.content.Context r32, java.util.zip.ZipFile r33) {
        /*
            Method dump skipped, instructions count: 5390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wrapper.proxyapplication.Util.PrepareSecurefiles(android.content.Context, java.util.zip.ZipFile):int");
    }

    private static boolean isFileValid(String path, long length) {
        File tmpfile = new File(path);
        if (tmpfile.exists() && tmpfile.length() == length) {
            return true;
        }
        return false;
    }

    public static void getCPUABI() {
        if (CPUABI == null) {
            try {
                String os_cpuabi = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ro.product.cpu.abi").getInputStream())).readLine();
                if (os_cpuabi.contains(a.f25806a)) {
                    CPUABI = a.f25806a;
                } else {
                    if (!os_cpuabi.contains("armeabi-v7a") && !os_cpuabi.contains("arm64-v8a")) {
                        CPUABI = "armeabi";
                    }
                    CPUABI = "armeabi-v7a";
                }
            } catch (Exception e2) {
                CPUABI = "armeabi";
            }
        }
    }

    public static long getCRC32(File fileUri) {
        CRC32 crc32 = new CRC32();
        long crc = 0;
        try {
            try {
                BufferedInputStream bufbr = new BufferedInputStream(new FileInputStream(fileUri));
                CheckedInputStream checkedinputstream = new CheckedInputStream(bufbr, crc32);
                byte[] buf = new byte[65536];
                while (checkedinputstream.read(buf) >= 0) {
                }
                crc = checkedinputstream.getChecksum().getValue();
                checkedinputstream.close();
                return crc;
            } catch (FileNotFoundException e2) {
                e2.printStackTrace();
                return crc;
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            return crc;
        }
    }

    public static String CreatenewFileName(String Oldfilename, String SplitString, String InsertString) {
        int index = Oldfilename.lastIndexOf(SplitString);
        if (index >= 0) {
            return Oldfilename.substring(0, index) + InsertString + Oldfilename.substring(index, Oldfilename.length());
        }
        return null;
    }

    public static boolean SafeUnzipFile(ZipFile zf, String filepathinzip, File fileinfiledir) {
        return SafeUnzipFile(zf, filepathinzip, fileinfiledir, 0L);
    }

    public static boolean SafeUnzipFile(ZipFile zf, String filepathinzip, File fileinfiledir, long crc) {
        BufferedOutputStream Output_fos = null;
        BufferedInputStream bufbr = null;
        try {
            try {
                ZipEntry ze = zf.getEntry(filepathinzip);
                if (ze == null) {
                    if (0 != 0) {
                        try {
                            try {
                                Output_fos.close();
                                if (0 != 0) {
                                    try {
                                        bufbr.close();
                                    } catch (IOException e2) {
                                        e2.printStackTrace();
                                        return false;
                                    }
                                }
                            } catch (Throwable e3) {
                                if (0 != 0) {
                                    try {
                                        bufbr.close();
                                    } catch (IOException e4) {
                                        e4.printStackTrace();
                                        return false;
                                    }
                                }
                                throw e3;
                            }
                        } catch (IOException e5) {
                            e5.printStackTrace();
                            if (0 != 0) {
                                try {
                                    bufbr.close();
                                } catch (IOException e6) {
                                    e6.printStackTrace();
                                    return false;
                                }
                            }
                            return false;
                        }
                    }
                    return false;
                } else if (crc != 0 && ze.getCrc() == crc) {
                    if (0 != 0) {
                        try {
                            try {
                                Output_fos.close();
                                if (0 != 0) {
                                    try {
                                        bufbr.close();
                                    } catch (IOException e7) {
                                        e7.printStackTrace();
                                        return false;
                                    }
                                }
                            } catch (Throwable e8) {
                                if (0 != 0) {
                                    try {
                                        bufbr.close();
                                    } catch (IOException e9) {
                                        e9.printStackTrace();
                                        return false;
                                    }
                                }
                                throw e8;
                            }
                        } catch (IOException e10) {
                            e10.printStackTrace();
                            if (0 != 0) {
                                try {
                                    bufbr.close();
                                } catch (IOException e11) {
                                    e11.printStackTrace();
                                    return false;
                                }
                            }
                            return false;
                        }
                    }
                    return true;
                } else {
                    byte[] buf = UnzipFile(zf, ze);
                    if (1 != 0) {
                        Output_fos = new BufferedOutputStream(new FileOutputStream(fileinfiledir));
                        Output_fos.write(buf, 0, buf.length);
                    }
                    try {
                        if (Output_fos != null) {
                            try {
                                Output_fos.close();
                                if (0 != 0) {
                                    try {
                                        bufbr.close();
                                    } catch (IOException e12) {
                                        e12.printStackTrace();
                                        return false;
                                    }
                                }
                            } catch (IOException e13) {
                                e13.printStackTrace();
                                if (0 != 0) {
                                    try {
                                        bufbr.close();
                                    } catch (IOException e14) {
                                        e14.printStackTrace();
                                        return false;
                                    }
                                }
                                return false;
                            }
                        }
                        return true;
                    } catch (Throwable e15) {
                        if (0 != 0) {
                            try {
                                bufbr.close();
                            } catch (IOException e16) {
                                e16.printStackTrace();
                                return false;
                            }
                        }
                        throw e15;
                    }
                }
            } catch (Exception e17) {
                e17.printStackTrace();
                if (Output_fos != null) {
                    try {
                        try {
                            Output_fos.close();
                            if (0 != 0) {
                                try {
                                    bufbr.close();
                                } catch (IOException e18) {
                                    e18.printStackTrace();
                                    return false;
                                }
                            }
                        } catch (Throwable e19) {
                            if (0 != 0) {
                                try {
                                    bufbr.close();
                                } catch (IOException e20) {
                                    e20.printStackTrace();
                                    return false;
                                }
                            }
                            throw e19;
                        }
                    } catch (IOException e21) {
                        e21.printStackTrace();
                        if (0 != 0) {
                            try {
                                bufbr.close();
                            } catch (IOException e22) {
                                e22.printStackTrace();
                                return false;
                            }
                        }
                        return false;
                    }
                }
                return false;
            }
        } catch (Throwable th) {
            if (Output_fos != null) {
                try {
                    try {
                        Output_fos.close();
                        if (0 != 0) {
                            try {
                                bufbr.close();
                            } catch (IOException e23) {
                                e23.printStackTrace();
                                return false;
                            }
                        }
                    } catch (IOException e24) {
                        e24.printStackTrace();
                        if (0 != 0) {
                            try {
                                bufbr.close();
                            } catch (IOException e25) {
                                e25.printStackTrace();
                                return false;
                            }
                        }
                        return false;
                    }
                } catch (Throwable e26) {
                    if (0 != 0) {
                        try {
                            bufbr.close();
                        } catch (IOException e27) {
                            e27.printStackTrace();
                            return false;
                        }
                    }
                    throw e26;
                }
            }
            throw th;
        }
    }

    public static byte[] UnzipFile(ZipFile zf, ZipEntry ze) throws IOException {
        byte[] buf = new byte[(int) ze.getSize()];
        BufferedInputStream bufbr = new BufferedInputStream(zf.getInputStream(ze));
        int totallen = 0;
        do {
            int readlen = bufbr.read(buf, totallen, ((int) ze.getSize()) - totallen);
            if (readlen < 0) {
                break;
            }
            totallen += readlen;
        } while (totallen != ze.getSize());
        if (totallen != ((int) ze.getSize())) {
            throw new IOException("incorrect zip file size");
        }
        return buf;
    }

    private static long getFileCRC32(File file) {
        long result = -1;
        byte[] filebuf = new byte[(int) file.length()];
        BufferedInputStream filebr = null;
        CRC32 crc32 = new CRC32();
        try {
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        try {
            try {
                filebr = new BufferedInputStream(new FileInputStream(file));
                int totallen = 0;
                while (true) {
                    int readlen = filebr.read(filebuf);
                    if (readlen < 0) {
                        break;
                    }
                    crc32.update(filebuf);
                    totallen += readlen;
                }
                result = crc32.getValue();
                filebr.close();
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
                if (filebr != null) {
                    filebr.close();
                }
            } catch (IOException e3) {
                e3.printStackTrace();
                if (filebr != null) {
                    filebr.close();
                }
            }
            return result;
        } catch (Throwable th) {
            if (filebr != null) {
                try {
                    filebr.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            throw th;
        }
    }

    private static boolean checkCopiedFileCrc(ZipFile zf, String filepathinzip, File file) {
        long crc = getFileCRC32(file);
        if (crc == -1) {
            return false;
        }
        try {
            ZipEntry ze = zf.getEntry(filepathinzip);
            if (ze != null && crc != 0) {
                if (ze.getCrc() == crc) {
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            return false;
        }
    }
}
