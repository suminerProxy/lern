package com.tencent.android.tpns.mqtt.internal.security;

import com.tencent.android.tpns.mqtt.MqttSecurityException;
import com.tencent.android.tpns.mqtt.logging.Logger;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Hashtable;
import java.util.Properties;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SSLSocketFactoryFactory {
    public static final String CIPHERSUITES = "com.ibm.ssl.enabledCipherSuites";
    private static final String CLASS_NAME = "com.tencent.android.tpns.mqtt.internal.security.SSLSocketFactoryFactory";
    public static final String CLIENTAUTH = "com.ibm.ssl.clientAuthentication";
    public static final String DEFAULT_PROTOCOL = "TLS";
    public static final String JSSEPROVIDER = "com.ibm.ssl.contextProvider";
    public static final String KEYSTORE = "com.ibm.ssl.keyStore";
    public static final String KEYSTOREMGR = "com.ibm.ssl.keyManager";
    public static final String KEYSTOREPROVIDER = "com.ibm.ssl.keyStoreProvider";
    public static final String KEYSTOREPWD = "com.ibm.ssl.keyStorePassword";
    public static final String KEYSTORETYPE = "com.ibm.ssl.keyStoreType";
    public static final String SSLPROTOCOL = "com.ibm.ssl.protocol";
    public static final String SYSKEYMGRALGO = "ssl.KeyManagerFactory.algorithm";
    public static final String SYSKEYSTORE = "javax.net.ssl.keyStore";
    public static final String SYSKEYSTOREPWD = "javax.net.ssl.keyStorePassword";
    public static final String SYSKEYSTORETYPE = "javax.net.ssl.keyStoreType";
    public static final String SYSTRUSTMGRALGO = "ssl.TrustManagerFactory.algorithm";
    public static final String SYSTRUSTSTORE = "javax.net.ssl.trustStore";
    public static final String SYSTRUSTSTOREPWD = "javax.net.ssl.trustStorePassword";
    public static final String SYSTRUSTSTORETYPE = "javax.net.ssl.trustStoreType";
    public static final String TRUSTSTORE = "com.ibm.ssl.trustStore";
    public static final String TRUSTSTOREMGR = "com.ibm.ssl.trustManager";
    public static final String TRUSTSTOREPROVIDER = "com.ibm.ssl.trustStoreProvider";
    public static final String TRUSTSTOREPWD = "com.ibm.ssl.trustStorePassword";
    public static final String TRUSTSTORETYPE = "com.ibm.ssl.trustStoreType";
    private static final byte[] key = null;
    private static final String[] propertyKeys = null;
    private static final String xorTag = "{xor}";
    private Hashtable configs;
    private Properties defaultProperties;
    private Logger logger;

    public SSLSocketFactoryFactory() {
    }

    private void checkPropertyKeys(Properties properties) throws IllegalArgumentException {
    }

    private void convertPassword(Properties properties) {
    }

    public static char[] deObfuscate(String str) {
    }

    private KeyManager[] getKeyManagersForSSLContext(String str) throws NoSuchAlgorithmException, NoSuchProviderException, MqttSecurityException {
    }

    private String getProperty(String str, String str2, String str3) {
    }

    private String getPropertyFromConfig(String str, String str2) {
    }

    private SSLContext getSSLContext(String str) throws MqttSecurityException {
    }

    private TrustManager[] getTrustManagersForSSLContext(String str) throws NoSuchAlgorithmException, NoSuchProviderException, MqttSecurityException {
    }

    public static boolean isSupportedOnJVM() throws LinkageError, ExceptionInInitializerError {
    }

    private boolean keyValid(String str) {
    }

    public static String obfuscate(char[] cArr) {
    }

    public static String packCipherSuites(String[] strArr) {
    }

    public static byte[] toByte(char[] cArr) {
    }

    public static char[] toChar(byte[] bArr) {
    }

    public static String[] unpackCipherSuites(String str) {
    }

    public SSLSocketFactory createSocketFactory(String str) throws MqttSecurityException {
    }

    public boolean getClientAuthentication(String str) {
    }

    public Properties getConfiguration(String str) {
    }

    public String[] getEnabledCipherSuites(String str) {
    }

    public String getJSSEProvider(String str) {
    }

    public String getKeyManager(String str) {
    }

    public String getKeyStore(String str) {
    }

    public char[] getKeyStorePassword(String str) {
    }

    public String getKeyStoreProvider(String str) {
    }

    public String getKeyStoreType(String str) {
    }

    public String getSSLProtocol(String str) {
    }

    public String getTrustManager(String str) {
    }

    public String getTrustStore(String str) {
    }

    public char[] getTrustStorePassword(String str) {
    }

    public String getTrustStoreProvider(String str) {
    }

    public String getTrustStoreType(String str) {
    }

    public void initialize(Properties properties, String str) throws IllegalArgumentException {
    }

    public void merge(Properties properties, String str) throws IllegalArgumentException {
    }

    public boolean remove(String str) {
    }

    public SSLSocketFactoryFactory(Logger logger) {
    }
}
