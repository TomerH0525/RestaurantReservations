package com.tomerH.RestaurantReservations.Utils;

import java.security.KeyPair;
import java.security.KeyPairGenerator;

public class KeyGeneratorUtility {

    public static KeyPair generateRsaKey() {

        KeyPair keypair;

        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            keypair = keyPairGenerator.generateKeyPair();

        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
        return keypair;
    }
}
