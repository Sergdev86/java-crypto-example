package com.example.service;


import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.security.crypto.encrypt.TextEncryptor;
import org.springframework.security.crypto.keygen.KeyGenerators;
import org.springframework.stereotype.Service;

/*
    * AES-256 implementation by Spring security.
*/

@Service
public class AESEncryptionService {


    private TextEncryptor encryptor;

    public String encriptTheMessageWithAES(String message){
        String password = "password";

        //  Returns hex-encoded string
        String salt = KeyGenerators.string().generateKey();

        //text encriptor initialization
        encryptor = Encryptors.text(password, salt);

        //  encripting text data and returns hex-encoded strings
        return encryptor.encrypt(message);
    }

    public String decriptTheMessageWithAES(String encriptedMessage){
        return encryptor.decrypt(encriptedMessage);
    }
}
