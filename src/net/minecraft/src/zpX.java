package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;

public class zpX {
    private final HashMap field_154cc8fd_FWm;
    private int field_2092ae_Dne = 0;
    private final HashMap field_ecf0af5e_Dne = new HashMap();
    private static zpX field_37ef6ca_Dne;

    public zpX() {
        this.field_154cc8fd_FWm = new HashMap();
    }

    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne++;
    }

    private String method_39193c_Dne(String string) {
        File file = new File(string);
        return file.getName().substring(0, file.getName().lastIndexOf(46));
    }

    public dGv method_28573102_Dne(String string) {
        int n = Minecraft.method_7a46288d_Dne();
        return new dGv(string, n, n, true);
    }

    public void method_478d7b17_Dne(String string, dmo dmo2) {
        this.field_154cc8fd_FWm.put(string, dmo2.method_7a46288d_Dne());
        if (!this.field_ecf0af5e_Dne.containsKey(dmo2.method_7a46288d_Dne())) {
            this.field_ecf0af5e_Dne.put(dmo2.method_7a46288d_Dne(), dmo2);
        }
    }

    public static zpX method_23188529_Dne() {
        return field_37ef6ca_Dne;
    }

    public dmo method_9699f58f_Dne(String string, int n, int n2, int n3, int n4) {
        return this.method_955da625_Dne(string, n, n2, n3, 10496, n4, 9728, 9728, false, null);
    }

    public void method_a3ae7421_Dne(dmo dmo2) {
        if (this.field_ecf0af5e_Dne.containsValue(dmo2)) {
            Minecraft.method_81a5f12e_Dne().method_230e0120_Dne().method_110c4dc3_FWm("TextureManager.registerTexture called, but this texture has already been registered. ignoring.");
        } else {
            this.field_ecf0af5e_Dne.put(dmo2.method_7a46288d_Dne(), dmo2);
        }
    }

    public List method_b6fd6de3_Dne(String string) {
        ArrayList<dmo> arrayList = new ArrayList<dmo>();
        Gax gax = Minecraft.method_81a5f12e_Dne().field_373a352_Dne.method_230121cd_Dne();
        try {
            BufferedImage bufferedImage = ImageIO.read(gax.method_dbe280e7_Dne("/" + string));
            int n = bufferedImage.getHeight();
            int n2 = bufferedImage.getWidth();
            String string2 = this.method_39193c_Dne(string);
            if (this.method_156bee63_Dne(string, gax)) {
                int n3 = n2;
                int n4 = n2;
                int n5 = n / n2;
                for (int i = 0; i < n5; ++i) {
                    dmo dmo2 = this.method_955da625_Dne(string2, 2, n3, n4, 10496, 6408, 9728, 9728, false, bufferedImage.getSubimage(0, n4 * i, n3, n4));
                    arrayList.add(dmo2);
                }
            } else if (n2 == n) {
                arrayList.add(this.method_955da625_Dne(string2, 2, n2, n, 10496, 6408, 9728, 9728, false, bufferedImage));
            } else {
                Minecraft.method_81a5f12e_Dne().method_230e0120_Dne().method_110c4dc3_FWm("TextureManager.createTexture: Skipping " + string + " because of broken aspect ratio and not animation");
            }
            return arrayList;
        }
        catch (FileNotFoundException fileNotFoundException) {
            Minecraft.method_81a5f12e_Dne().method_230e0120_Dne().method_110c4dc3_FWm("TextureManager.createTexture called for file " + string + ", but that file does not exist. Ignoring.");
        }
        catch (IOException iOException) {
            Minecraft.method_81a5f12e_Dne().method_230e0120_Dne().method_110c4dc3_FWm("TextureManager.createTexture encountered an IOException when trying to read file " + string + ". Ignoring.");
        }
        return arrayList;
    }

    private boolean method_156bee63_Dne(String string, Gax gax) {
        String string2 = "/" + string.substring(0, string.lastIndexOf(46)) + ".txt";
        boolean bl = gax.method_5ab48f74_Dne("/" + string, false);
        return Minecraft.method_81a5f12e_Dne().field_373a352_Dne.method_230121cd_Dne().method_5ab48f74_Dne(string2, !bl);
    }

    public static void method_7a46289a_Dne() {
        field_37ef6ca_Dne = new zpX();
    }

    public dmo method_955da625_Dne(String string, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, BufferedImage bufferedImage) {
        dmo dmo2 = new dmo(string, n, n2, n3, n4, n5, n6, n7, bufferedImage);
        this.method_a3ae7421_Dne(dmo2);
        return dmo2;
    }
}

