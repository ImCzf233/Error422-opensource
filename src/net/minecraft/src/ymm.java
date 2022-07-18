package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class ymm {
    public static void method_16cca7a_Dne(int n, int n2) {
        qxi_0.field_493682ed_Dne.field_3791671_Dne.method_7eed4432_Dne("\u00a7mMinecraft " + qxi_0.field_569fcf45_Dne + " \u00a7r\u00a7cERR422\u00a7r", 2, 2, 0xFFFFFF);
        String string = "Copyright Mojang AB. \u00a7rDo not distribute!\u00a7r";
        qxi_0.field_493682ed_Dne.field_3791671_Dne.method_7eed4432_Dne(string, n - qxi_0.field_493682ed_Dne.field_3791671_Dne.method_8f501fd7_Dne(string) - 2, n2 - 10, 0xFFFFFF);
        sRv.method_7a46289a_Dne();
        if (qxi_0.field_2092bf_Dne) {
            String[] stringArray = new String[]{"java.lang.NullPointerException", "updateRenderer(EntityRenderer.java:450)", "renderWorld(EntityRenderer.java:870)", "refreshTextures(RenderEngine.java:41)", "createTexture(RenderEngine.java:216)", "renderEntity(\u00a7k??????????\u00a7r.java:870)", "getTexture(RenderEngine.java:612)", "refreshTextureMaps(?.java:130)", "updateLightmap(EntityRenderer.java:582)", "updateCameraAndRender(EntityRenderer.java:135)", "Minecraft.runGameLoop(Minecraft.java:385)", "Minecraft.run(Minecraft.java:521)", "java.lang.Thread.run(Thread.java:048)"};
            for (Object obj : stringArray) {String string2 = (String) obj;
                qxi_0.field_493682ed_Dne.field_3791671_Dne.method_7eed4432_Dne(string2, eCD.method_ce7f5d9c_Dne(n), eCD.method_ce7f5d9c_Dne(n2), 0xFF0000);
            }
            for (int i = 0; i < 60; ++i) {
                qxi_0.field_493682ed_Dne.field_3791671_Dne.method_7eed4432_Dne("\u00a7k??????????\u00a7r(\u00a7k??????????\u00a7r.tmp:" + eCD.method_ce7f5d9c_Dne(10000) + ")", eCD.method_ce7f5d9c_Dne(n), eCD.method_ce7f5d9c_Dne(n2), 0xFF0000);
            }
        }
    }
}

