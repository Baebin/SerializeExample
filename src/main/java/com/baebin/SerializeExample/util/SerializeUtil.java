package com.baebin.SerializeExample.util;

import java.io.*;
import java.util.Base64;

public class SerializeUtil {
    public static String serialize(Object object) {
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream oout = new ObjectOutputStream(out);
            oout.writeObject(object);

            return Base64.getEncoder().encodeToString(out.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Object desrialize(String object) {
        byte[] data = Base64.getDecoder().decode(object);

        try {
            ByteArrayInputStream in = new ByteArrayInputStream(data);
            ObjectInputStream oin = new ObjectInputStream(in);

            return oin.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}