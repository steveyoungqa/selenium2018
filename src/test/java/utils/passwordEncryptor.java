package utils;

import org.junit.Test;

import java.util.Base64;

public class passwordEncryptor {

    static String decodePassword="ewuibugbugbewgbw";

    public static String getDecodePassword()
    {
        return new String(Base64.getDecoder().decode(decodePassword.getBytes()));
    }

    @Test
    public void passwordTest () {
        System.out.println(getDecodePassword());
    }
}
