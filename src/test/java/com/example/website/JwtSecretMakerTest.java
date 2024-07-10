package com.example.website;

import javax.crypto.SecretKey;

import org.junit.jupiter.api.Test;

import io.jsonwebtoken.Jwts;
import jakarta.xml.bind.DatatypeConverter;

public class JwtSecretMakerTest {

    @Test
    public void generateSecretkey()
    {
        SecretKey key= Jwts.SIG.HS512.key().build();
        String encodedkey= DatatypeConverter.printHexBinary(key.getEncoded());
        System.out.println("key: "+encodedkey);
    }


}
