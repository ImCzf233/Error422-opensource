/*
 * Decompiled with CFR 0.152.
 */
package com.jdotsoft.jarloader;

import com.jdotsoft.jarloader.JarClassLoader;

public class ERR422Loader {
    public static void main(String[] args) {
        JarClassLoader err422 = new JarClassLoader();
        try {
            err422.invokeMain("net.minecraft.client.Minecraft", args);
        }
        catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

