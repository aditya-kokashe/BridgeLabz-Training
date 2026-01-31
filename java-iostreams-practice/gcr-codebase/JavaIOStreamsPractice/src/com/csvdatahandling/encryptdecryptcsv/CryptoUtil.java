package com.csvdatahandling.encryptdecryptcsv;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class CryptoUtil {

    private static final String ALGO = "AES";
    private static final String KEY  = "1234567890123456"; // 16 chars

    public static String encrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGO);
        SecretKeySpec key = new SecretKeySpec(KEY.getBytes(), ALGO);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        return Base64.getEncoder().encodeToString(cipher.doFinal(data.getBytes()));
    }

    public static String decrypt(String encrypted) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGO);
        SecretKeySpec key = new SecretKeySpec(KEY.getBytes(), ALGO);
        cipher.init(Cipher.DECRYPT_MODE, key);
        return new String(cipher.doFinal(Base64.getDecoder().decode(encrypted)));
    }
}
