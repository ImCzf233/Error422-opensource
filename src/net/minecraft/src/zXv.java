package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.net.URI;

public class zXv
extends pee_0 {
    public zXv(int n, int n2, int n3, int n4, int n5, String string) {
        super(n, n2, n3, n4, n5, string);
    }

    public void method_8f501fe4_Dne(String string) {
        try {
            URI uRI = new URI(string);
            Class<?> clazz = Class.forName("java.awt.Desktop");
            Object object = clazz.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
            clazz.getMethod("browse", URI.class).invoke(object, uRI);
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}

