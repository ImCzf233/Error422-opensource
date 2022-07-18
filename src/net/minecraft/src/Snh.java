package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class Snh {
    private IntBuffer field_76f31d43_Dne;
    private final fCQ field_3753598_Dne;
    private fZI field_3758af7_Dne;
    private ZGT field_36fd085_Dne;
    private ark field_373a352_Dne;
    private Map<Object, Pfo> field_83b1c1b0_Dne;
    private HashMap field_154cc8fd_FWm;
    private int field_2092ae_Dne;
    private BufferedImage field_92a31c00_Dne;
    private final fCQ field_202f0177_FWm;
    private HashMap field_ecf0af5e_Dne = new HashMap();

    public int method_abaa98a1_Dne(String string, String string2) {
        Pfo pfo = (Pfo)this.field_83b1c1b0_Dne.get(string);
        if (pfo != null && pfo.field_92a31c00_Dne != null && !pfo.field_2092bf_Dne) {
            if (pfo.field_21260d_FWm < 0) {
                pfo.field_21260d_FWm = this.method_1420ded2_Dne(pfo.field_92a31c00_Dne);
            } else {
                this.method_6ffb7004_Dne(pfo.field_92a31c00_Dne, pfo.field_21260d_FWm);
            }
            pfo.field_2092bf_Dne = true;
        }
        return pfo != null && pfo.field_21260d_FWm >= 0 ? pfo.field_21260d_FWm : (string2 == null ? -1 : this.method_8f501fd7_Dne(string2));
    }

    public void method_110c4dc3_FWm(String string) {
        Pfo pfo = (Pfo)this.field_83b1c1b0_Dne.get(string);
        if (pfo != null) {
            --pfo.field_2092ae_Dne;
            if (pfo.field_2092ae_Dne == 0) {
                if (pfo.field_21260d_FWm >= 0) {
                    this.method_ce7f5da9_Dne(pfo.field_21260d_FWm);
                }
                this.field_83b1c1b0_Dne.remove(string);
            }
        }
    }

    public void method_7c6f6039_FWm() {
        this.field_3753598_Dne.method_7c6f6039_FWm();
        this.field_202f0177_FWm.method_7c6f6039_FWm();
    }

    public Pfo method_ce6d8658_Dne(String string, fwN fwN2) {
        Pfo pfo = (Pfo)this.field_83b1c1b0_Dne.get(string);
        if (pfo == null) {
            this.field_83b1c1b0_Dne.put(string, new Pfo(string, fwN2));
        } else {
            ++pfo.field_2092ae_Dne;
        }
        return pfo;
    }

    private void method_117d19ea_FWm(int n) {
        if (n != this.field_2092ae_Dne) {
            GL11.glBindTexture(3553, n);
            this.field_2092ae_Dne = n;
        }
    }

    public void method_ce7f5da9_Dne(int n) {
        this.field_36fd085_Dne.method_bb07ce88_FWm(n);
        GL11.glDeleteTextures(n);
    }

    public void method_6ffb7004_Dne(BufferedImage bufferedImage, int n) {
        this.method_5ef5d984_Dne(bufferedImage, n, false, false);
    }

    public void method_907a9d21_Qnq() {
        this.field_3753598_Dne.method_7a46289a_Dne();
        this.field_202f0177_FWm.method_7a46289a_Dne();
    }

    public void method_7a46289a_Dne() {
        this.field_2092ae_Dne = -1;
    }

    public Snh(ark ark2, fZI fZI2) {
        this.field_154cc8fd_FWm = new HashMap();
        this.field_36fd085_Dne = new ZGT();
        this.field_76f31d43_Dne = pZS.method_ab715f95_Dne(0x400000);
        this.field_83b1c1b0_Dne = new HashMap();
        this.field_92a31c00_Dne = new BufferedImage(64, 64, 2);
        this.field_373a352_Dne = ark2;
        this.field_3758af7_Dne = fZI2;
        Graphics graphics = this.field_92a31c00_Dne.getGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, 64, 64);
        graphics.setColor(Color.BLACK);
        int n = 10;
        int n2 = 0;
        while (n < 64) {
            String string = n2++ % 2 == 0 ? "missing" : "texture";
            graphics.drawString(string, 1, n);
            n += graphics.getFont().getSize();
            if (n2 % 2 != 0) continue;
            n += 5;
        }
        graphics.dispose();
        this.field_3753598_Dne = new fCQ(0, "terrain", "textures/blocks/", this.field_92a31c00_Dne);
        this.field_202f0177_FWm = new fCQ(1, "items", "textures/items/", this.field_92a31c00_Dne);
    }

    private int[] method_2d2a2cbc_Dne(int[] nArray) {
        int[] nArray2 = new int[nArray.length];
        for (int i = 0; i < nArray.length; ++i) {
            int n = nArray[i] >> 24 & 0xFF;
            int n2 = nArray[i] >> 16 & 0xFF;
            int n3 = nArray[i] >> 8 & 0xFF;
            int n4 = nArray[i] & 0xFF;
            int n5 = (n2 * 30 + n3 * 59 + n4 * 11) / 100;
            int n6 = (n2 * 30 + n3 * 70) / 100;
            int n7 = (n2 * 30 + n4 * 70) / 100;
            nArray2[i] = n << 24 | n5 << 16 | n6 << 8 | n7;
        }
        return nArray2;
    }

    public gDn method_9e795529_Dne(int n) {
        switch (n) {
            case 0: {
                return this.field_3753598_Dne.method_230f3f9a_Dne();
            }
        }
        return this.field_202f0177_FWm.method_230f3f9a_Dne();
    }

    public void method_8f501fe4_Dne(String string) {
        this.method_117d19ea_FWm(this.method_8f501fd7_Dne(string));
    }

    private int method_8f501fd7_Dne(String string) {
        if (string.equals("/terrain.png")) {
            this.field_3753598_Dne.method_230e7c85_Dne().method_ce7f5da9_Dne(0);
            return this.field_3753598_Dne.method_230e7c85_Dne().method_7c6f602c_FWm();
        }
        if (string.equals("/gui/items.png")) {
            this.field_202f0177_FWm.method_230e7c85_Dne().method_ce7f5da9_Dne(0);
            return this.field_202f0177_FWm.method_230e7c85_Dne().method_7c6f602c_FWm();
        }
        Integer n = (Integer)this.field_ecf0af5e_Dne.get(string);
        if (n != null) {
            return n;
        }
        String string2 = string;
        try {
            InputStream inputStream;
            boolean bl;
            int n2 = pZS.method_7a46288d_Dne();
            boolean bl2 = string.startsWith("%blur%");
            if (bl2) {
                string = string.substring(6);
            }
            if (bl = string.startsWith("%clamp%")) {
                string = string.substring(7);
            }
            if ((inputStream = this.field_373a352_Dne.method_230121cd_Dne().method_dbe280e7_Dne(string)) == null) {
                this.method_5ef5d984_Dne(this.field_92a31c00_Dne, n2, bl2, bl);
            } else {
                this.method_5ef5d984_Dne(this.method_608a2142_Dne(inputStream), n2, bl2, bl);
            }
            this.field_ecf0af5e_Dne.put(string2, n2);
            return n2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            int n3 = pZS.method_7a46288d_Dne();
            this.method_6ffb7004_Dne(this.field_92a31c00_Dne, n3);
            this.field_ecf0af5e_Dne.put(string, n3);
            return n3;
        }
    }

    private int[] method_6ffafde5_Dne(BufferedImage bufferedImage) {
        return this.method_5feb1457_Dne(bufferedImage, new int[bufferedImage.getWidth() * bufferedImage.getHeight()]);
    }

    private BufferedImage method_608a2142_Dne(InputStream inputStream) throws IOException {
        BufferedImage bufferedImage = ImageIO.read(inputStream);
        inputStream.close();
        return bufferedImage;
    }

    public void method_ae128dc7_bzF() {
        BufferedImage bufferedImage;
        Gax gax = this.field_373a352_Dne.method_230121cd_Dne();
        this.method_907a9d21_Qnq();
        Iterator<Object> iterator = this.field_36fd085_Dne.method_d412ef09_Dne().iterator();
        while (iterator.hasNext()) {
            int n = (Integer)iterator.next();
            bufferedImage = (BufferedImage)this.field_36fd085_Dne.method_394ba0a9_Dne(n);
            this.method_6ffb7004_Dne(bufferedImage, n);
        }
        for (Pfo pfo : this.field_83b1c1b0_Dne.values()) {
            pfo.field_2092bf_Dne = false;
        }
        for (Object obj : this.field_ecf0af5e_Dne.keySet()) {String string = (String) obj;
            try {
                boolean bl;
                int n = (Integer)this.field_ecf0af5e_Dne.get(string);
                boolean bl2 = string.startsWith("%blur%");
                if (bl2) {
                    string = string.substring(6);
                }
                if (bl = string.startsWith("%clamp%")) {
                    string = string.substring(7);
                }
                BufferedImage bufferedImage2 = this.method_608a2142_Dne(gax.method_dbe280e7_Dne(string));
                this.method_5ef5d984_Dne(bufferedImage2, n, bl2, bl);
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        for (Object obj : this.field_154cc8fd_FWm.keySet()) {String string = (String) obj;
            try {
                bufferedImage = this.method_608a2142_Dne(gax.method_dbe280e7_Dne(string));
                this.method_5feb1457_Dne(bufferedImage, (int[])this.field_154cc8fd_FWm.get(string));
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        Minecraft.method_81a5f12e_Dne().field_3791671_Dne.method_7a46289a_Dne();
        Minecraft.method_81a5f12e_Dne().field_2032e250_FWm.method_7a46289a_Dne();
    }

    public void method_5ef5d984_Dne(BufferedImage bufferedImage, int n, boolean bl, boolean bl2) {
        this.method_117d19ea_FWm(n);
        GL11.glTexParameteri(3553, 10241, 9728);
        GL11.glTexParameteri(3553, 10240, 9728);
        if (bl) {
            GL11.glTexParameteri(3553, 10241, 9729);
            GL11.glTexParameteri(3553, 10240, 9729);
        }
        if (bl2) {
            GL11.glTexParameteri(3553, 10242, 10496);
            GL11.glTexParameteri(3553, 10243, 10496);
        } else {
            GL11.glTexParameteri(3553, 10242, 10497);
            GL11.glTexParameteri(3553, 10243, 10497);
        }
        int n2 = bufferedImage.getWidth();
        int n3 = bufferedImage.getHeight();
        int[] nArray = new int[n2 * n3];
        bufferedImage.getRGB(0, 0, n2, n3, nArray, 0, n2);
        if (this.field_3758af7_Dne != null && this.field_3758af7_Dne.field_2e5f2c_bzF) {
            nArray = this.method_2d2a2cbc_Dne(nArray);
        }
        this.field_76f31d43_Dne.clear();
        this.field_76f31d43_Dne.put(nArray);
        this.field_76f31d43_Dne.position(0).limit(nArray.length);
        GL11.glTexImage2D(3553, 0, 6408, n2, n3, 0, 32993, 33639, this.field_76f31d43_Dne);
    }

    public void method_8d0cb47b_Dne(int[] nArray, int n, int n2, int n3) {
        this.method_117d19ea_FWm(n3);
        GL11.glTexParameteri(3553, 10241, 9728);
        GL11.glTexParameteri(3553, 10240, 9728);
        GL11.glTexParameteri(3553, 10242, 10497);
        GL11.glTexParameteri(3553, 10243, 10497);
        if (this.field_3758af7_Dne != null && this.field_3758af7_Dne.field_2e5f2c_bzF) {
            nArray = this.method_2d2a2cbc_Dne(nArray);
        }
        if (qxi_0.field_2092bf_Dne) {
            int n4 = 0;
            while (n4 < nArray.length) {
                int n5 = n4++;
                nArray[n5] = nArray[n5] + eCD.method_ce7f5d9c_Dne(999900000);
            }
        }
        this.field_76f31d43_Dne.clear();
        this.field_76f31d43_Dne.put(nArray);
        this.field_76f31d43_Dne.position(0).limit(nArray.length);
        GL11.glTexSubImage2D(3553, 0, 0, 0, n, n2, 32993, 33639, this.field_76f31d43_Dne);
    }

    public int method_1420ded2_Dne(BufferedImage bufferedImage) {
        int n = pZS.method_7a46288d_Dne();
        this.method_6ffb7004_Dne(bufferedImage, n);
        this.field_36fd085_Dne.method_ad009545_Dne(n, bufferedImage);
        return n;
    }

    public boolean method_8f501fe8_Dne(String string) {
        return this.field_83b1c1b0_Dne.containsKey(string);
    }

    private int[] method_5feb1457_Dne(BufferedImage bufferedImage, int[] nArray) {
        int n = bufferedImage.getWidth();
        int n2 = bufferedImage.getHeight();
        bufferedImage.getRGB(0, 0, n, n2, nArray, 0, n);
        return nArray;
    }

    public int[] method_5ab3dd80_Dne(String string) {
        Gax gax = this.field_373a352_Dne.method_230121cd_Dne();
        int[] nArray = (int[])this.field_154cc8fd_FWm.get(string);
        if (nArray != null) {
            return nArray;
        }
        try {
            InputStream inputStream = gax.method_dbe280e7_Dne(string);
            int[] nArray2 = inputStream == null ? this.method_6ffafde5_Dne(this.field_92a31c00_Dne) : this.method_6ffafde5_Dne(this.method_608a2142_Dne(inputStream));
            this.field_154cc8fd_FWm.put(string, nArray2);
            return nArray2;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            int[] nArray3 = this.method_6ffafde5_Dne(this.field_92a31c00_Dne);
            this.field_154cc8fd_FWm.put(string, nArray3);
            return nArray3;
        }
    }
}

