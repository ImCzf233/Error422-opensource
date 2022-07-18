package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class dmo {
    private final int field_20b857_DyG;
    private boolean field_21261e_FWm;
    private final int field_22c602_IjH;
    private ByteBuffer field_97dbd47c_Dne;
    private boolean field_267d06_Qnq;
    private boolean field_2e5f2c_bzF;
    private final int field_33448c_mrb;
    private final boolean field_2092bf_Dne;
    private final int field_2f0dd8_div;
    private final int field_29186d_XHL;
    private final String field_569fcf45_Dne;
    private int field_21260d_FWm;
    private final int field_267cf5_Qnq;
    private final int field_2d29f4_aFZ;
    private int field_2e5f1b_bzF;
    private final int field_388da6_zGp;
    private int field_2092ae_Dne;
    private fBi field_37534bf_Dne;

    public void method_dec1fe41_Dne(int n, int n2, dmo dmo2) {
        GL11.glBindTexture(this.field_2f0dd8_div, this.field_2092ae_Dne);
        GL11.glTexSubImage2D(this.field_2f0dd8_div, 0, n, n2, dmo2.method_ae128dba_bzF(), dmo2.method_907a9d14_Qnq(), this.field_20b857_DyG, 5121, (ByteBuffer)dmo2.method_8da2c4db_Dne().position(0));
        this.field_267d06_Qnq = true;
    }

    public void method_f23809c9_Dne(fBi fBi2, int n) {
        if (this.field_2f0dd8_div != 32879) {
            fBi fBi3 = new fBi(0, 0, this.field_267cf5_Qnq, this.field_2d29f4_aFZ);
            fBi3.method_129522fe_Dne(fBi2);
            this.field_97dbd47c_Dne.position(0);
            for (int i = fBi3.method_7c6f602c_FWm(); i < fBi3.method_7c6f602c_FWm() + fBi3.method_907a9d14_Qnq(); ++i) {
                int n2 = i * this.field_267cf5_Qnq * 4;
                for (int j = fBi3.method_7a46288d_Dne(); j < fBi3.method_7a46288d_Dne() + fBi3.method_ae128dba_bzF(); ++j) {
                    this.field_97dbd47c_Dne.put(n2 + j * 4 + 0, (byte)(n >> 24 & 0xFF));
                    this.field_97dbd47c_Dne.put(n2 + j * 4 + 1, (byte)(n >> 16 & 0xFF));
                    this.field_97dbd47c_Dne.put(n2 + j * 4 + 2, (byte)(n >> 8 & 0xFF));
                    this.field_97dbd47c_Dne.put(n2 + j * 4 + 3, (byte)(n >> 0 & 0xFF));
                }
            }
            if (this.field_2e5f2c_bzF) {
                this.method_7a46289a_Dne();
            } else {
                this.field_267d06_Qnq = false;
            }
        }
    }

    public int method_ae128dba_bzF() {
        return this.field_267cf5_Qnq;
    }

    public int method_907a9d14_Qnq() {
        return this.field_2d29f4_aFZ;
    }

    public void method_1420dedf_Dne(BufferedImage bufferedImage) {
        if (this.field_2f0dd8_div != 32879) {
            int n = bufferedImage.getWidth();
            int n2 = bufferedImage.getHeight();
            if (n <= this.field_267cf5_Qnq && n2 <= this.field_2d29f4_aFZ) {
                int[] nArray = new int[]{3, 0, 1, 2};
                int[] nArray2 = new int[]{3, 2, 1, 0};
                int[] nArray3 = this.field_20b857_DyG == 32993 ? nArray2 : nArray;
                int[] nArray4 = new int[this.field_267cf5_Qnq * this.field_2d29f4_aFZ];
                int n3 = bufferedImage.getTransparency();
                bufferedImage.getRGB(0, 0, this.field_267cf5_Qnq, this.field_2d29f4_aFZ, nArray4, 0, n);
                byte[] byArray = new byte[this.field_267cf5_Qnq * this.field_2d29f4_aFZ * 4];
                for (int i = 0; i < this.field_2d29f4_aFZ; ++i) {
                    for (int j = 0; j < this.field_267cf5_Qnq; ++j) {
                        int n4 = i * this.field_267cf5_Qnq + j;
                        int n5 = n4 * 4;
                        byArray[n5 + nArray3[0]] = (byte)(nArray4[n4] >> 24 & 0xFF);
                        byArray[n5 + nArray3[1]] = (byte)(nArray4[n4] >> 16 & 0xFF);
                        byArray[n5 + nArray3[2]] = (byte)(nArray4[n4] >> 8 & 0xFF);
                        byArray[n5 + nArray3[3]] = (byte)(nArray4[n4] >> 0 & 0xFF);
                    }
                }
                this.field_97dbd47c_Dne = ByteBuffer.allocateDirect(byArray.length);
                this.field_97dbd47c_Dne.clear();
                this.field_97dbd47c_Dne.put(byArray);
                this.field_97dbd47c_Dne.limit(byArray.length);
                if (this.field_2e5f2c_bzF) {
                    this.method_7a46289a_Dne();
                } else {
                    this.field_267d06_Qnq = false;
                }
            } else {
                Minecraft.method_81a5f12e_Dne().method_230e0120_Dne().method_110c4dc3_FWm("transferFromImage called with a BufferedImage with dimensions (" + n + ", " + n2 + ") larger than the Texture dimensions (" + this.field_267cf5_Qnq + ", " + this.field_2d29f4_aFZ + "). Ignoring.");
            }
        }
    }

    public final fBi method_230ec31e_Dne() {
        return this.field_37534bf_Dne;
    }

    private dmo(String string, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        this.field_569fcf45_Dne = string;
        this.field_2e5f1b_bzF = n;
        this.field_267cf5_Qnq = n2;
        this.field_2d29f4_aFZ = n3;
        this.field_388da6_zGp = n4;
        this.field_20b857_DyG = n6;
        this.field_22c602_IjH = n7;
        this.field_33448c_mrb = n8;
        this.field_29186d_XHL = n5;
        this.field_37534bf_Dne = new fBi(0, 0, n2, n3);
        this.field_2f0dd8_div = n3 == 1 && n4 == 1 ? 3552 : (n4 == 1 ? 3553 : 32879);
        boolean bl = this.field_2092bf_Dne = n7 != 9728 && n7 != 9729 || n8 != 9728 && n8 != 9729;
        if (n != 2) {
            this.field_2092ae_Dne = GL11.glGenTextures();
            GL11.glBindTexture(this.field_2f0dd8_div, this.field_2092ae_Dne);
            GL11.glTexParameteri(this.field_2f0dd8_div, 10241, n7);
            GL11.glTexParameteri(this.field_2f0dd8_div, 10240, n8);
            GL11.glTexParameteri(this.field_2f0dd8_div, 10242, n5);
            GL11.glTexParameteri(this.field_2f0dd8_div, 10243, n5);
        } else {
            this.field_2092ae_Dne = -1;
        }
        this.field_21260d_FWm = zpX.method_23188529_Dne().method_7a46288d_Dne();
    }

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }

    public int method_7c6f602c_FWm() {
        return this.field_2092ae_Dne;
    }

    public void method_f97e7cb3_Dne(int n, int n2, dmo dmo2, boolean bl) {
        if (this.field_2f0dd8_div != 32879) {
            ByteBuffer byteBuffer = dmo2.method_8da2c4db_Dne();
            this.field_97dbd47c_Dne.position(0);
            byteBuffer.position(0);
            for (int i = 0; i < dmo2.method_907a9d14_Qnq(); ++i) {
                int n3 = n2 + i;
                int n4 = i * dmo2.method_ae128dba_bzF() * 4;
                int n5 = n3 * this.field_267cf5_Qnq * 4;
                if (bl) {
                    n3 = n2 + (dmo2.method_907a9d14_Qnq() - i);
                }
                for (int j = 0; j < dmo2.method_ae128dba_bzF(); ++j) {
                    int n6 = n5 + (j + n) * 4;
                    int n7 = n4 + j * 4;
                    if (bl) {
                        n6 = n + j * this.field_267cf5_Qnq * 4 + n3 * 4;
                    }
                    this.field_97dbd47c_Dne.put(n6 + 0, byteBuffer.get(n7 + 0));
                    this.field_97dbd47c_Dne.put(n6 + 1, byteBuffer.get(n7 + 1));
                    this.field_97dbd47c_Dne.put(n6 + 2, byteBuffer.get(n7 + 2));
                    this.field_97dbd47c_Dne.put(n6 + 3, byteBuffer.get(n7 + 3));
                }
            }
            this.field_97dbd47c_Dne.position(this.field_267cf5_Qnq * this.field_2d29f4_aFZ * 4);
            if (this.field_2e5f2c_bzF) {
                this.method_7a46289a_Dne();
            } else {
                this.field_267d06_Qnq = false;
            }
        }
    }

    public int method_7a46288d_Dne() {
        return this.field_21260d_FWm;
    }

    public void method_ce7f5da9_Dne(int n) {
        if (this.field_388da6_zGp == 1) {
            GL11.glEnable(3553);
        } else {
            GL11.glEnable(32879);
        }
        oCF.method_ce7f5da9_Dne(oCF.field_2092ae_Dne + n);
        GL11.glBindTexture(this.field_2f0dd8_div, this.field_2092ae_Dne);
        if (!this.field_267d06_Qnq) {
            this.method_7a46289a_Dne();
        }
    }

    public dmo(String string, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, BufferedImage bufferedImage) {
        this(string, n, n2, n3, n4, n5, n6, n7, n8);
        if (bufferedImage == null) {
            if (n2 != -1 && n3 != -1) {
                byte[] byArray = new byte[n2 * n3 * n4 * 4];
                for (int i = 0; i < byArray.length; ++i) {
                    byArray[i] = 0;
                }
                this.field_97dbd47c_Dne = ByteBuffer.allocateDirect(byArray.length);
                this.field_97dbd47c_Dne.clear();
                this.field_97dbd47c_Dne.put(byArray);
                this.field_97dbd47c_Dne.position(0).limit(byArray.length);
                if (this.field_2e5f2c_bzF) {
                    this.method_7a46289a_Dne();
                } else {
                    this.field_267d06_Qnq = false;
                }
            } else {
                this.field_21261e_FWm = false;
            }
        } else {
            this.field_21261e_FWm = true;
            this.method_1420dedf_Dne(bufferedImage);
            if (n != 2) {
                this.method_7a46289a_Dne();
                this.field_2e5f2c_bzF = false;
            }
        }
    }

    public dmo(String string, int n, int n2, int n3, int n4, int n5, int n6, int n7, BufferedImage bufferedImage) {
        this(string, n, n2, n3, 1, n4, n5, n6, n7, bufferedImage);
    }

    public void method_7a46289a_Dne() {
        this.field_97dbd47c_Dne.flip();
        if (this.field_2d29f4_aFZ != 1 && this.field_388da6_zGp != 1) {
            GL12.glTexImage3D(this.field_2f0dd8_div, 0, this.field_20b857_DyG, this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp, 0, this.field_20b857_DyG, 5121, this.field_97dbd47c_Dne);
        } else if (this.field_2d29f4_aFZ != 1) {
            GL11.glTexImage2D(this.field_2f0dd8_div, 0, this.field_20b857_DyG, this.field_267cf5_Qnq, this.field_2d29f4_aFZ, 0, this.field_20b857_DyG, 5121, this.field_97dbd47c_Dne);
        } else {
            GL11.glTexImage1D(this.field_2f0dd8_div, 0, this.field_20b857_DyG, this.field_267cf5_Qnq, 0, this.field_20b857_DyG, 5121, this.field_97dbd47c_Dne);
        }
        this.field_267d06_Qnq = true;
    }

    public void method_8f501fe4_Dne(String string) {
        BufferedImage bufferedImage = new BufferedImage(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, 2);
        ByteBuffer byteBuffer = this.method_8da2c4db_Dne();
        byte[] byArray = new byte[this.field_267cf5_Qnq * this.field_2d29f4_aFZ * 4];
        byteBuffer.position(0);
        byteBuffer.get(byArray);
        for (int i = 0; i < this.field_267cf5_Qnq; ++i) {
            for (int j = 0; j < this.field_2d29f4_aFZ; ++j) {
                int n = j * this.field_267cf5_Qnq * 4 + i * 4;
                int n2 = 0;
                int n3 = n2 | (byArray[n + 2] & 0xFF) << 0;
                n3 |= (byArray[n + 1] & 0xFF) << 8;
                n3 |= (byArray[n + 0] & 0xFF) << 16;
                bufferedImage.setRGB(i, j, n3 |= (byArray[n + 3] & 0xFF) << 24);
            }
        }
        this.field_97dbd47c_Dne.position(this.field_267cf5_Qnq * this.field_2d29f4_aFZ * 4);
        try {
            ImageIO.write((RenderedImage)bufferedImage, "png", new File(Minecraft.method_9189e6b3_Dne(), string));
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public ByteBuffer method_8da2c4db_Dne() {
        return this.field_97dbd47c_Dne;
    }
}

