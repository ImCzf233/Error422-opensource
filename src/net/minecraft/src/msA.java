package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.text.Bidi;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class msA {
    private float field_2092ab_Dne;
    private boolean field_388db7_zGp = false;
    private boolean field_267d06_Qnq = false;
    private boolean field_21261e_FWm;
    private float field_2d29f1_aFZ;
    private int[] field_4039e0a_FWm;
    public int field_2092ae_Dne = 9;
    private int field_21260d_FWm;
    private float field_267cf2_Qnq;
    private float field_21260a_FWm;
    private final String field_569fcf45_Dne;
    private int[] field_3f1c589_Dne = new int[256];
    public Random field_7331eae7_Dne = new Random();
    private boolean field_2092bf_Dne;
    private final Snh field_36d36bf_Dne;
    private boolean field_2d2a05_aFZ = false;
    private boolean field_20b868_DyG = false;
    private byte[] field_3f1c582_Dne = new byte[65536];
    private float field_388da3_zGp;
    private float field_2e5f18_bzF;
    private boolean field_2e5f2c_bzF = false;

    private static boolean method_117d0368_FWm(char c) {
        return c >= 'k' && c <= 'o' || c >= 'K' && c <= 'O' || c == 'r' || c == 'R';
    }

    private void method_ce7f5da9_Dne(int n) {
        String string = String.format("/font/glyph_%02X.png", n);
        this.field_36d36bf_Dne.method_8f501fe4_Dne(string);
    }

    private int method_28e01cc7_FWm(String string, int n, int n2, int n3, boolean bl) {
        if (string == null) {
            return 0;
        }
        if ((n3 & 0xFC000000) == 0) {
            n3 |= 0xFF000000;
        }
        if (bl) {
            n3 = (n3 & 0xFCFCFC) >> 2 | n3 & 0xFF000000;
        }
        this.field_2e5f18_bzF = (float)(n3 >> 16 & 0xFF) / 255.0f;
        this.field_267cf2_Qnq = (float)(n3 >> 8 & 0xFF) / 255.0f;
        this.field_2d29f1_aFZ = (float)(n3 & 0xFF) / 255.0f;
        this.field_388da3_zGp = (float)(n3 >> 24 & 0xFF) / 255.0f;
        GL11.glColor4f(this.field_2e5f18_bzF, this.field_267cf2_Qnq, this.field_2d29f1_aFZ, this.field_388da3_zGp);
        this.field_2092ab_Dne = n;
        this.field_21260a_FWm = n2;
        this.method_5ab48f70_Dne(string, bl);
        return (int)this.field_2092ab_Dne;
    }

    public int method_ce7f4716_Dne(char c) {
        if (c == '\u00a7') {
            return -1;
        }
        if (c == ' ') {
            return 4;
        }
        int n = BAQ.field_569fcf45_Dne.indexOf(c);
        if (n >= 0 && !this.field_2092bf_Dne) {
            return this.field_3f1c589_Dne[n + 32];
        }
        if (this.field_3f1c582_Dne[c] != 0) {
            int n2 = this.field_3f1c582_Dne[c] >>> 4;
            int n3 = this.field_3f1c582_Dne[c] & 0xF;
            if (n3 > 7) {
                n3 = 15;
                n2 = 0;
            }
            return (++n3 - n2) / 2 + 1;
        }
        return 0;
    }

    private String method_8dd0853d_FWm(String string) {
        while (string != null && string.endsWith("\n")) {
            string = string.substring(0, string.length() - 1);
        }
        return string;
    }

    private int method_107ddd93_FWm(String string, int n) {
        int n2;
        int n3 = string.length();
        int n4 = 0;
        int n5 = -1;
        boolean bl = false;
        for (n2 = 0; n2 < n3; ++n2) {
            char c = string.charAt(n2);
            switch (c) {
                case '\n': {
                    --n2;
                    break;
                }
                case '\u00a7': {
                    char c2;
                    if (n2 >= n3 - 1) break;
                    if ((c2 = string.charAt(++n2)) != 'l' && c2 != 'L') {
                        if (c2 != 'r' && c2 != 'R' && !msA.method_ce7f4727_Dne(c2)) break;
                        bl = false;
                        break;
                    }
                    bl = true;
                    break;
                }
                case ' ': {
                    n5 = n2;
                }
                default: {
                    n4 += this.method_ce7f4716_Dne(c);
                    if (!bl) break;
                    ++n4;
                }
            }
            if (c == '\n') {
                n5 = ++n2;
                break;
            }
            if (n4 > n) break;
        }
        return n2 != n3 && n5 != -1 && n5 < n2 ? n5 : n2;
    }

    public int method_e88b55f3_FWm(String string, int n, int n2, int n3) {
        return this.method_5ebbf668_Dne(string, n, n2, n3, false);
    }

    private void method_8f501fe4_Dne(String string) {
        BufferedImage bufferedImage;
        try {
            bufferedImage = ImageIO.read(Snh.class.getResourceAsStream(string));
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
        int n = bufferedImage.getWidth();
        int n2 = bufferedImage.getHeight();
        int[] nArray = new int[n * n2];
        bufferedImage.getRGB(0, 0, n, n2, nArray, 0, n);
        for (int i = 0; i < 256; ++i) {
            int n3;
            int n4 = i % 16;
            int n5 = i / 16;
            for (n3 = 7; n3 >= 0; --n3) {
                int n6 = n4 * 8 + n3;
                boolean bl = true;
                for (int j = 0; j < 8 && bl; ++j) {
                    int n7 = (n5 * 8 + j) * n;
                    int n8 = nArray[n6 + n7] & 0xFF;
                    if (n8 <= 0) continue;
                    bl = false;
                }
                if (!bl) break;
            }
            if (i == 32) {
                n3 = 2;
            }
            this.field_3f1c589_Dne[i] = n3 + 2;
        }
    }

    private void method_ae128dc7_bzF() {
        this.field_2e5f2c_bzF = false;
        this.field_267d06_Qnq = false;
        this.field_2d2a05_aFZ = false;
        this.field_388db7_zGp = false;
        this.field_20b868_DyG = false;
    }

    public String method_67f40a2b_Dne(String string, int n, boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        int n3 = bl ? string.length() - 1 : 0;
        int n4 = bl ? -1 : 1;
        boolean bl2 = false;
        boolean bl3 = false;
        for (int i = n3; i >= 0 && i < string.length() && n2 < n; i += n4) {
            char c = string.charAt(i);
            int n5 = this.method_ce7f4716_Dne(c);
            if (bl2) {
                bl2 = false;
                if (c != 'l' && c != 'L') {
                    if (c == 'r' || c == 'R') {
                        bl3 = false;
                    }
                } else {
                    bl3 = true;
                }
            } else if (n5 < 0) {
                bl2 = true;
            } else {
                n2 += n5;
                if (bl3) {
                    ++n2;
                }
            }
            if (n2 > n) break;
            if (bl) {
                stringBuilder.insert(0, c);
                continue;
            }
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    String method_6dbf0b00_FWm(String string, int n) {
        int n2 = this.method_107ddd93_FWm(string, n);
        if (string.length() <= n2) {
            return string;
        }
        String string2 = string.substring(0, n2);
        char c = string.charAt(n2);
        boolean bl = c == ' ' || c == '\n';
        String string3 = msA.method_39477cef_bzF(string2) + string.substring(n2 + (bl ? 1 : 0));
        return string2 + "\n" + this.method_6dbf0b00_FWm(string3, n);
    }

    private String method_39193c_Dne(String string) {
        if (string != null && Bidi.requiresBidi(string.toCharArray(), 0, string.length())) {
            int n;
            int n2;
            Bidi bidi = new Bidi(string, -2);
            byte[] byArray = new byte[bidi.getRunCount()];
            Object[] objectArray = new String[byArray.length];
            for (int i = 0; i < byArray.length; ++i) {
                int n3 = bidi.getRunStart(i);
                n2 = bidi.getRunLimit(i);
                n = bidi.getRunLevel(i);
                String string2 = string.substring(n3, n2);
                byArray[i] = (byte)n;
                objectArray[i] = string2;
            }
            String[] stringArray = (String[])objectArray.clone();
            Bidi.reorderVisually(byArray, 0, objectArray, 0, byArray.length);
            StringBuilder stringBuilder = new StringBuilder();
            for (n2 = 0; n2 < objectArray.length; ++n2) {
                int n4;
                n = byArray[n2];
                for (n4 = 0; n4 < stringArray.length; ++n4) {
                    if (!stringArray[n4].equals(objectArray[n2])) {
                        continue;
                    }
                    n = byArray[n4];
                    break;
                }
                if ((n & 1) == 0) {
                    stringBuilder.append((String)objectArray[n2]);
                    continue;
                }
                for (n4 = ((String)objectArray[n2]).length() - 1; n4 >= 0; --n4) {
                    char c = ((String)objectArray[n2]).charAt(n4);
                    if (c == '(') {
                        c = ')';
                    } else if (c == ')') {
                        c = '(';
                    }
                    stringBuilder.append(c);
                }
            }
            return stringBuilder.toString();
        }
        return string;
    }

    private void method_5ab48f70_Dne(String string, boolean bl) {
        for (int i = 0; i < string.length(); ++i) {
            WAR wAR;
            boolean bl2;
            int n;
            int n2;
            char c = string.charAt(i);
            if (c == '\u00a7' && i + 1 < string.length()) {
                n2 = "0123456789abcdefklmnor".indexOf(string.toLowerCase().charAt(i + 1));
                if (n2 < 16) {
                    this.field_2e5f2c_bzF = false;
                    this.field_267d06_Qnq = false;
                    this.field_20b868_DyG = false;
                    this.field_388db7_zGp = false;
                    this.field_2d2a05_aFZ = false;
                    if (n2 < 0 || n2 > 15) {
                        n2 = 15;
                    }
                    if (bl) {
                        n2 += 16;
                    }
                    this.field_21260d_FWm = n = this.field_4039e0a_FWm[n2];
                    GL11.glColor4f((float)(n >> 16) / 255.0f, (float)(n >> 8 & 0xFF) / 255.0f, (float)(n & 0xFF) / 255.0f, this.field_388da3_zGp);
                } else if (n2 == 16) {
                    this.field_2e5f2c_bzF = true;
                } else if (n2 == 17) {
                    this.field_267d06_Qnq = true;
                } else if (n2 == 18) {
                    this.field_20b868_DyG = true;
                } else if (n2 == 19) {
                    this.field_388db7_zGp = true;
                } else if (n2 == 20) {
                    this.field_2d2a05_aFZ = true;
                } else if (n2 == 21) {
                    this.field_2e5f2c_bzF = false;
                    this.field_267d06_Qnq = false;
                    this.field_20b868_DyG = false;
                    this.field_388db7_zGp = false;
                    this.field_2d2a05_aFZ = false;
                    GL11.glColor4f(this.field_2e5f18_bzF, this.field_267cf2_Qnq, this.field_2d29f1_aFZ, this.field_388da3_zGp);
                }
                ++i;
                continue;
            }
            n2 = BAQ.field_569fcf45_Dne.indexOf(c);
            if (this.field_2e5f2c_bzF && n2 > 0) {
                while (this.field_3f1c589_Dne[n2 + 32] != this.field_3f1c589_Dne[(n = this.field_7331eae7_Dne.nextInt(BAQ.field_569fcf45_Dne.length())) + 32]) {
                }
                n2 = n;
            }
            float f = this.field_2092bf_Dne ? 0.5f : 1.0f;
            boolean bl3 = bl2 = (n2 <= 0 || this.field_2092bf_Dne) && bl;
            if (bl2) {
                this.field_2092ab_Dne -= f;
                this.field_21260a_FWm -= f;
            }
            float f2 = this.method_2c2a7d50_Dne(n2, c, this.field_2d2a05_aFZ);
            if (bl2) {
                this.field_2092ab_Dne += f;
                this.field_21260a_FWm += f;
            }
            if (this.field_267d06_Qnq) {
                this.field_2092ab_Dne += f;
                if (bl2) {
                    this.field_2092ab_Dne -= f;
                    this.field_21260a_FWm -= f;
                }
                this.method_2c2a7d50_Dne(n2, c, this.field_2d2a05_aFZ);
                this.field_2092ab_Dne -= f;
                if (bl2) {
                    this.field_2092ab_Dne += f;
                    this.field_21260a_FWm += f;
                }
                f2 += 1.0f;
            }
            if (this.field_20b868_DyG) {
                wAR = WAR.field_36e5ca4_Dne;
                GL11.glDisable(3553);
                wAR.method_7a46289a_Dne();
                wAR.method_2be429a4_Dne(this.field_2092ab_Dne, this.field_21260a_FWm + (float)(this.field_2092ae_Dne / 2), 0.0);
                wAR.method_2be429a4_Dne(this.field_2092ab_Dne + f2, this.field_21260a_FWm + (float)(this.field_2092ae_Dne / 2), 0.0);
                wAR.method_2be429a4_Dne(this.field_2092ab_Dne + f2, this.field_21260a_FWm + (float)(this.field_2092ae_Dne / 2) - 1.0f, 0.0);
                wAR.method_2be429a4_Dne(this.field_2092ab_Dne, this.field_21260a_FWm + (float)(this.field_2092ae_Dne / 2) - 1.0f, 0.0);
                wAR.method_7a46288d_Dne();
                GL11.glEnable(3553);
            }
            if (this.field_388db7_zGp) {
                wAR = WAR.field_36e5ca4_Dne;
                GL11.glDisable(3553);
                wAR.method_7a46289a_Dne();
                int n3 = this.field_388db7_zGp ? -1 : 0;
                wAR.method_2be429a4_Dne(this.field_2092ab_Dne + (float)n3, this.field_21260a_FWm + (float)this.field_2092ae_Dne, 0.0);
                wAR.method_2be429a4_Dne(this.field_2092ab_Dne + f2, this.field_21260a_FWm + (float)this.field_2092ae_Dne, 0.0);
                wAR.method_2be429a4_Dne(this.field_2092ab_Dne + f2, this.field_21260a_FWm + (float)this.field_2092ae_Dne - 1.0f, 0.0);
                wAR.method_2be429a4_Dne(this.field_2092ab_Dne + (float)n3, this.field_21260a_FWm + (float)this.field_2092ae_Dne - 1.0f, 0.0);
                wAR.method_7a46288d_Dne();
                GL11.glEnable(3553);
            }
            this.field_2092ab_Dne += (float)((int)f2);
        }
    }

    private float method_16a5001_Dne(char c, boolean bl) {
        if (this.field_3f1c582_Dne[c] == 0) {
            return 0.0f;
        }
        int n = c / 256;
        this.method_ce7f5da9_Dne(n);
        int n2 = this.field_3f1c582_Dne[c] >>> 4;
        int n3 = this.field_3f1c582_Dne[c] & 0xF;
        float f = n2;
        float f2 = n3 + 1;
        float f3 = (float)(c % 16 * 16) + f;
        float f4 = (c & 0xFF) / 16 * 16;
        float f5 = f2 - f - 0.02f;
        float f6 = bl ? 1.0f : 0.0f;
        GL11.glBegin(5);
        GL11.glTexCoord2f(f3 / 256.0f, f4 / 256.0f);
        GL11.glVertex3f(this.field_2092ab_Dne + f6, this.field_21260a_FWm, 0.0f);
        GL11.glTexCoord2f(f3 / 256.0f, (f4 + 15.98f) / 256.0f);
        GL11.glVertex3f(this.field_2092ab_Dne - f6, this.field_21260a_FWm + 7.99f, 0.0f);
        GL11.glTexCoord2f((f3 + f5) / 256.0f, f4 / 256.0f);
        GL11.glVertex3f(this.field_2092ab_Dne + f5 / 2.0f + f6, this.field_21260a_FWm, 0.0f);
        GL11.glTexCoord2f((f3 + f5) / 256.0f, (f4 + 15.98f) / 256.0f);
        GL11.glVertex3f(this.field_2092ab_Dne + f5 / 2.0f - f6, this.field_21260a_FWm + 7.99f, 0.0f);
        GL11.glEnd();
        return (f2 - f) / 2.0f + 1.0f;
    }

    private static String method_39477cef_bzF(String string) {
        String string2 = "";
        int n = -1;
        int n2 = string.length();
        while ((n = string.indexOf(167, n + 1)) != -1) {
            if (n >= n2 - 1) continue;
            char c = string.charAt(n + 1);
            if (msA.method_ce7f4727_Dne(c)) {
                string2 = "\u00a7" + c;
                continue;
            }
            if (!msA.method_117d0368_FWm(c)) continue;
            string2 = string2 + "\u00a7" + c;
        }
        return string2;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2092bf_Dne;
    }

    public int method_5ebbf668_Dne(String string, int n, int n2, int n3, boolean bl) {
        int n4;
        this.method_ae128dc7_bzF();
        if (this.field_21261e_FWm) {
            string = this.method_39193c_Dne(string);
        }
        if (bl) {
            n4 = this.method_28e01cc7_FWm(string, n + 1, n2 + 1, n3, true);
            n4 = Math.max(n4, this.method_28e01cc7_FWm(string, n, n2, n3, false));
        } else {
            n4 = this.method_28e01cc7_FWm(string, n, n2, n3, false);
        }
        return n4;
    }

    public msA(fZI fZI2, String string, Snh snh, boolean bl) {
        this.field_4039e0a_FWm = new int[32];
        this.field_569fcf45_Dne = string;
        this.field_36d36bf_Dne = snh;
        this.field_2092bf_Dne = bl;
        this.method_7a46289a_Dne();
        snh.method_8f501fe4_Dne(string);
        for (int i = 0; i < 32; ++i) {
            int n = (i >> 3 & 1) * 85;
            int n2 = (i >> 2 & 1) * 170 + n;
            int n3 = (i >> 1 & 1) * 170 + n;
            int n4 = (i >> 0 & 1) * 170 + n;
            if (i == 6) {
                n2 += 85;
            }
            if (fZI2.field_2e5f2c_bzF) {
                int n5 = (n2 * 30 + n3 * 59 + n4 * 11) / 100;
                int n6 = (n2 * 30 + n3 * 70) / 100;
                int n7 = (n2 * 30 + n4 * 70) / 100;
                n2 = n5;
                n3 = n6;
                n4 = n7;
            }
            if (i >= 16) {
                n2 /= 4;
                n3 /= 4;
                n4 /= 4;
            }
            this.field_4039e0a_FWm[i] = (n2 & 0xFF) << 16 | (n3 & 0xFF) << 8 | n4 & 0xFF;
        }
    }

    public boolean method_7c6f603d_FWm() {
        return this.field_21261e_FWm;
    }

    public String method_4868f6e1_Dne(String string, int n) {
        return this.method_67f40a2b_Dne(string, n, false);
    }

    public void method_117d59bb_FWm(boolean bl) {
        this.field_21261e_FWm = bl;
    }

    public void method_7a46289a_Dne() {
        this.method_7c6f6039_FWm();
        this.method_8f501fe4_Dne(this.field_569fcf45_Dne);
    }

    public int method_8f501fd7_Dne(String string) {
        if (string == null) {
            return 0;
        }
        int n = 0;
        boolean bl = false;
        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            int n2 = this.method_ce7f4716_Dne(c);
            if (n2 < 0 && i < string.length() - 1) {
                if ((c = string.charAt(++i)) != 'l' && c != 'L') {
                    if (c == 'r' || c == 'R') {
                        bl = false;
                    }
                } else {
                    bl = true;
                }
                n2 = 0;
            }
            n += n2;
            if (!bl) continue;
            ++n;
        }
        return n;
    }

    private static boolean method_ce7f4727_Dne(char c) {
        return c >= '0' && c <= '9' || c >= 'a' && c <= 'f' || c >= 'A' && c <= 'F';
    }

    public int method_5ab44f92_Dne(String string, int n) {
        return this.field_2092ae_Dne * this.method_c46270c8_Dne(string, n).size();
    }

    private float method_16d0a3b_Dne(int n, boolean bl) {
        float f = n % 16 * 8;
        float f2 = n / 16 * 8;
        float f3 = bl ? 1.0f : 0.0f;
        this.field_36d36bf_Dne.method_8f501fe4_Dne(this.field_569fcf45_Dne);
        float f4 = (float)this.field_3f1c589_Dne[n] - 0.01f;
        GL11.glBegin(5);
        GL11.glTexCoord2f(f / 128.0f, f2 / 128.0f);
        GL11.glVertex3f(this.field_2092ab_Dne + f3, this.field_21260a_FWm, 0.0f);
        GL11.glTexCoord2f(f / 128.0f, (f2 + 7.99f) / 128.0f);
        GL11.glVertex3f(this.field_2092ab_Dne - f3, this.field_21260a_FWm + 7.99f, 0.0f);
        GL11.glTexCoord2f((f + f4) / 128.0f, f2 / 128.0f);
        GL11.glVertex3f(this.field_2092ab_Dne + f4 + f3, this.field_21260a_FWm, 0.0f);
        GL11.glTexCoord2f((f + f4) / 128.0f, (f2 + 7.99f) / 128.0f);
        GL11.glVertex3f(this.field_2092ab_Dne + f4 - f3, this.field_21260a_FWm + 7.99f, 0.0f);
        GL11.glEnd();
        return this.field_3f1c589_Dne[n];
    }

    msA() {
        this.field_4039e0a_FWm = new int[32];
        this.field_36d36bf_Dne = null;
        this.field_569fcf45_Dne = null;
    }

    public List method_c46270c8_Dne(String string, int n) {
        return Arrays.asList(this.method_6dbf0b00_FWm(string, n).split("\n"));
    }

    public void method_ce7f9d7a_Dne(boolean bl) {
        this.field_2092bf_Dne = bl;
    }

    public void method_5ebbb6a4_Dne(String string, int n, int n2, int n3, int n4) {
        this.method_ae128dc7_bzF();
        this.field_21260d_FWm = n4;
        string = this.method_8dd0853d_FWm(string);
        this.method_5ebbf675_Dne(string, n, n2, n3, false);
    }

    public int method_7eed4432_Dne(String string, int n, int n2, int n3) {
        return this.method_5ebbf668_Dne(string, n, n2, n3, true);
    }

    private void method_5ebbf675_Dne(String string, int n, int n2, int n3, boolean bl) {
        List list = this.method_c46270c8_Dne(string, n3);
        for (Object obj : list) {String string2 = (String) obj;
            this.method_78bbd0a3_Dne(string2, n, n2, n3, this.field_21260d_FWm, bl);
            n2 += this.field_2092ae_Dne;
        }
    }

    private float method_2c2a7d50_Dne(int n, char c, boolean bl) {
        return c == ' ' ? 4.0f : (n > 0 && !this.field_2092bf_Dne ? this.method_16d0a3b_Dne(n + 32, bl) : this.method_16a5001_Dne(c, bl));
    }

    private int method_78bbd0a3_Dne(String string, int n, int n2, int n3, int n4, boolean bl) {
        if (this.field_21261e_FWm) {
            string = this.method_39193c_Dne(string);
            int n5 = this.method_8f501fd7_Dne(string);
            n = n + n3 - n5;
        }
        return this.method_28e01cc7_FWm(string, n, n2, n4, bl);
    }

    private void method_7c6f6039_FWm() {
        try {
            InputStream inputStream = Minecraft.method_81a5f12e_Dne().field_373a352_Dne.method_230121cd_Dne().method_dbe280e7_Dne("/font/glyph_sizes.bin");
            inputStream.read(this.field_3f1c582_Dne);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }
}

