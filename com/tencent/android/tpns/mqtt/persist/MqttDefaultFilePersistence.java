package com.tencent.android.tpns.mqtt.persist;

import com.tencent.android.tpns.mqtt.MqttClientPersistence;
import com.tencent.android.tpns.mqtt.MqttPersistable;
import com.tencent.android.tpns.mqtt.MqttPersistenceException;
import com.tencent.android.tpns.mqtt.internal.FileLock;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Enumeration;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class MqttDefaultFilePersistence implements MqttClientPersistence {
    private static FilenameFilter FILENAME_FILTER = null;
    private static final String LOCK_FILENAME = ".lck";
    private static final String MESSAGE_BACKUP_FILE_EXTENSION = ".bup";
    private static final String MESSAGE_FILE_EXTENSION = ".msg";
    private File clientDir;
    private File dataDir;
    private FileLock fileLock;

    public MqttDefaultFilePersistence() {
    }

    private void checkIsOpen() throws MqttPersistenceException {
    }

    private static FilenameFilter getFilenameFilter() {
    }

    private File[] getFiles() throws MqttPersistenceException {
    }

    private boolean isSafeChar(char c) {
    }

    private void restoreBackups(File file) throws MqttPersistenceException {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttClientPersistence
    public void clear() throws MqttPersistenceException {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttClientPersistence
    public void close() throws MqttPersistenceException {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttClientPersistence
    public boolean containsKey(String str) throws MqttPersistenceException {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttClientPersistence
    public MqttPersistable get(String str) throws MqttPersistenceException {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttClientPersistence
    public Enumeration keys() throws MqttPersistenceException {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttClientPersistence
    public void open(String str, String str2) throws MqttPersistenceException {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttClientPersistence
    public void put(String str, MqttPersistable mqttPersistable) throws MqttPersistenceException {
    }

    @Override // com.tencent.android.tpns.mqtt.MqttClientPersistence
    public void remove(String str) throws MqttPersistenceException {
    }

    public MqttDefaultFilePersistence(String str) {
    }
}
