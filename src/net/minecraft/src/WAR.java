package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.opengl.ARBVertexBufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;

public class WAR {
    private int field_21260d_FWm;
    private int field_2d29f4_aFZ = 0;
    private FloatBuffer field_b5fd3c76_Dne;
    private ByteBuffer field_97dbd47c_Dne;
    private boolean field_22c613_IjH = false;
    private double field_267cf0_Qnq;
    private double field_212608_FWm;
    private int field_267cf5_Qnq = 0;
    private boolean field_388db7_zGp = false;
    private boolean field_2e5f2c_bzF = false;
    private double field_2092a9_Dne;
    private ShortBuffer field_9efb3656_Dne;
    private int[] field_3f1c589_Dne;
    private int field_2f0dd8_div = 0;
    private boolean field_20b868_DyG = false;
    private static boolean field_21261e_FWm;
    private int field_2092ae_Dne = 0;
    private IntBuffer field_5a1a3784_FWm;
    private double field_2d29ef_aFZ;
    private int field_22c602_IjH = 10;
    private boolean field_2d2a05_aFZ = false;
    private double field_2e5f16_bzF;
    private int field_20b857_DyG;
    private boolean field_2f0de9_div = false;
    private int field_33448c_mrb;
    private int field_388da6_zGp;
    private boolean field_267d06_Qnq = false;
    private int field_2e5f1b_bzF;
    private IntBuffer field_76f31d43_Dne;
    public static final WAR field_36e5ca4_Dne;
    private static boolean field_2092bf_Dne;

    public void method_c38c5864_Dne(double d, double d2, double d3, double d4, double d5) {
        this.method_16a71da_Dne(d4, d5);
        this.method_2be429a4_Dne(d, d2, d3);
    }

    public void method_7a46289a_Dne() {
        this.method_ce7f5da9_Dne(7);
    }

    public void method_16a71da_Dne(double d, double d2) {
        this.field_267d06_Qnq = true;
        this.field_2092a9_Dne = d;
        this.field_212608_FWm = d2;
    }

    public void method_7c6f6039_FWm() {
        this.field_20b868_DyG = true;
    }

    public void method_54283b9a_Dne(float f, float f2, float f3, float f4) {
        this.method_5972745a_Dne((int)(f * 255.0f), (int)(f2 * 255.0f), (int)(f3 * 255.0f), (int)(f4 * 255.0f));
    }

    public void method_a663d9a5_FWm(double d, double d2, double d3) {
        this.field_2e5f16_bzF = d;
        this.field_267cf0_Qnq = d2;
        this.field_2d29ef_aFZ = d3;
    }

    public void method_2b33899_bzF(float f, float f2, float f3) {
        this.field_2e5f16_bzF += (double)f;
        this.field_267cf0_Qnq += (double)f2;
        this.field_2d29ef_aFZ += (double)f3;
    }

    public void method_a680f8e7_FWm(float f, float f2, float f3) {
        this.field_388db7_zGp = true;
        byte by = (byte)(f * 127.0f);
        byte by2 = (byte)(f2 * 127.0f);
        byte by3 = (byte)(f3 * 127.0f);
        this.field_20b857_DyG = by & 0xFF | (by2 & 0xFF) << 8 | (by3 & 0xFF) << 16;
    }

    public void method_5972745a_Dne(int n, int n2, int n3, int n4) {
        if (!this.field_20b868_DyG) {
            if (n > 255) {
                n = 255;
            }
            if (n2 > 255) {
                n2 = 255;
            }
            if (n3 > 255) {
                n3 = 255;
            }
            if (n4 > 255) {
                n4 = 255;
            }
            if (n < 0) {
                n = 0;
            }
            if (n2 < 0) {
                n2 = 0;
            }
            if (n3 < 0) {
                n3 = 0;
            }
            if (n4 < 0) {
                n4 = 0;
            }
            this.field_2e5f2c_bzF = true;
            this.field_2e5f1b_bzF = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? n4 << 24 | n3 << 16 | n2 << 8 | n : n << 24 | n2 << 16 | n3 << 8 | n4;
        }
    }

    private WAR(int n) {
        this.field_33448c_mrb = n;
        this.field_97dbd47c_Dne = pZS.method_f325dc6a_Dne(n * 4);
        this.field_76f31d43_Dne = this.field_97dbd47c_Dne.asIntBuffer();
        this.field_b5fd3c76_Dne = this.field_97dbd47c_Dne.asFloatBuffer();
        this.field_9efb3656_Dne = this.field_97dbd47c_Dne.asShortBuffer();
        this.field_3f1c589_Dne = new int[n];
        boolean bl = this.field_22c613_IjH = field_21261e_FWm && GLContext.getCapabilities().GL_ARB_vertex_buffer_object;
        if (this.field_22c613_IjH) {
            this.field_5a1a3784_FWm = pZS.method_ab715f95_Dne(this.field_22c602_IjH);
            ARBVertexBufferObject.glGenBuffersARB(this.field_5a1a3784_FWm);
        }
    }

    public void method_117d19ea_FWm(int n) {
        this.field_2d2a05_aFZ = true;
        this.field_21260d_FWm = n;
    }

    public int method_7a46288d_Dne() {
        if (!this.field_2f0de9_div) {
            throw new IllegalStateException("Not tesselating!");
        }
        this.field_2f0de9_div = false;
        if (this.field_2092ae_Dne > 0) {
            this.field_76f31d43_Dne.clear();
            this.field_76f31d43_Dne.put(this.field_3f1c589_Dne, 0, this.field_267cf5_Qnq);
            this.field_97dbd47c_Dne.position(0);
            this.field_97dbd47c_Dne.limit(this.field_267cf5_Qnq * 4);
            if (this.field_22c613_IjH) {
                this.field_2f0dd8_div = (this.field_2f0dd8_div + 1) % this.field_22c602_IjH;
                ARBVertexBufferObject.glBindBufferARB(34962, this.field_5a1a3784_FWm.get(this.field_2f0dd8_div));
                ARBVertexBufferObject.glBufferDataARB(34962, this.field_97dbd47c_Dne, 35040);
            }
            if (this.field_267d06_Qnq) {
                if (this.field_22c613_IjH) {
                    GL11.glTexCoordPointer(2, 5126, 32, 12L);
                } else {
                    this.field_b5fd3c76_Dne.position(3);
                    GL11.glTexCoordPointer(2, 32, this.field_b5fd3c76_Dne);
                }
                GL11.glEnableClientState(32888);
            }
            if (this.field_2d2a05_aFZ) {
                oCF.method_117d19ea_FWm(oCF.field_21260d_FWm);
                if (this.field_22c613_IjH) {
                    GL11.glTexCoordPointer(2, 5122, 32, 28L);
                } else {
                    this.field_9efb3656_Dne.position(14);
                    GL11.glTexCoordPointer(2, 32, this.field_9efb3656_Dne);
                }
                GL11.glEnableClientState(32888);
                oCF.method_117d19ea_FWm(oCF.field_2092ae_Dne);
            }
            if (this.field_2e5f2c_bzF) {
                if (this.field_22c613_IjH) {
                    GL11.glColorPointer(4, 5121, 32, 20L);
                } else {
                    this.field_97dbd47c_Dne.position(20);
                    GL11.glColorPointer(4, true, 32, this.field_97dbd47c_Dne);
                }
                GL11.glEnableClientState(32886);
            }
            if (this.field_388db7_zGp) {
                if (this.field_22c613_IjH) {
                    GL11.glNormalPointer(5121, 32, 24L);
                } else {
                    this.field_97dbd47c_Dne.position(24);
                    GL11.glNormalPointer(32, this.field_97dbd47c_Dne);
                }
                GL11.glEnableClientState(32885);
            }
            if (this.field_22c613_IjH) {
                GL11.glVertexPointer(3, 5126, 32, 0L);
            } else {
                this.field_b5fd3c76_Dne.position(0);
                GL11.glVertexPointer(3, 32, this.field_b5fd3c76_Dne);
            }
            GL11.glEnableClientState(32884);
            if (this.field_388da6_zGp == 7 && field_2092bf_Dne) {
                GL11.glDrawArrays(4, 0, this.field_2092ae_Dne);
            } else {
                GL11.glDrawArrays(this.field_388da6_zGp, 0, this.field_2092ae_Dne);
            }
            GL11.glDisableClientState(32884);
            if (this.field_267d06_Qnq) {
                GL11.glDisableClientState(32888);
            }
            if (this.field_2d2a05_aFZ) {
                oCF.method_117d19ea_FWm(oCF.field_21260d_FWm);
                GL11.glDisableClientState(32888);
                oCF.method_117d19ea_FWm(oCF.field_2092ae_Dne);
            }
            if (this.field_2e5f2c_bzF) {
                GL11.glDisableClientState(32886);
            }
            if (this.field_388db7_zGp) {
                GL11.glDisableClientState(32885);
            }
        }
        int n = this.field_267cf5_Qnq * 4;
        this.method_ae128dc7_bzF();
        return n;
    }

    public void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        this.method_5972745a_Dne(n, n2, n3, 255);
    }

    public void method_2c0148e6_Dne(float f, float f2, float f3) {
        this.method_2c2cf7c9_Dne((int)(f * 255.0f), (int)(f2 * 255.0f), (int)(f3 * 255.0f));
    }

    public void method_ce7f5da9_Dne(int n) {
        if (this.field_2f0de9_div) {
            throw new IllegalStateException("Already tesselating!");
        }
        this.field_2f0de9_div = true;
        this.method_ae128dc7_bzF();
        this.field_388da6_zGp = n;
        this.field_388db7_zGp = false;
        this.field_2e5f2c_bzF = false;
        this.field_267d06_Qnq = false;
        this.field_2d2a05_aFZ = false;
        this.field_20b868_DyG = false;
    }

    public void method_143f9e1c_bzF(int n) {
        int n2 = n >> 16 & 0xFF;
        int n3 = n >> 8 & 0xFF;
        int n4 = n & 0xFF;
        this.method_2c2cf7c9_Dne(n2, n3, n4);
    }

    private void method_ae128dc7_bzF() {
        this.field_2092ae_Dne = 0;
        this.field_97dbd47c_Dne.clear();
        this.field_267cf5_Qnq = 0;
        this.field_2d29f4_aFZ = 0;
    }

    static {
        field_2092bf_Dne = false;
        field_21261e_FWm = false;
        field_36e5ca4_Dne = new WAR(0x200000);
    }

    public void method_2be429a4_Dne(double d, double d2, double d3) {
        ++this.field_2d29f4_aFZ;
        if (this.field_388da6_zGp == 7 && field_2092bf_Dne && this.field_2d29f4_aFZ % 4 == 0) {
            for (int i = 0; i < 2; ++i) {
                int n = 8 * (3 - i);
                if (this.field_267d06_Qnq) {
                    this.field_3f1c589_Dne[this.field_267cf5_Qnq + 3] = this.field_3f1c589_Dne[this.field_267cf5_Qnq - n + 3];
                    this.field_3f1c589_Dne[this.field_267cf5_Qnq + 4] = this.field_3f1c589_Dne[this.field_267cf5_Qnq - n + 4];
                }
                if (this.field_2d2a05_aFZ) {
                    this.field_3f1c589_Dne[this.field_267cf5_Qnq + 7] = this.field_3f1c589_Dne[this.field_267cf5_Qnq - n + 7];
                }
                if (this.field_2e5f2c_bzF) {
                    this.field_3f1c589_Dne[this.field_267cf5_Qnq + 5] = this.field_3f1c589_Dne[this.field_267cf5_Qnq - n + 5];
                }
                this.field_3f1c589_Dne[this.field_267cf5_Qnq + 0] = this.field_3f1c589_Dne[this.field_267cf5_Qnq - n + 0];
                this.field_3f1c589_Dne[this.field_267cf5_Qnq + 1] = this.field_3f1c589_Dne[this.field_267cf5_Qnq - n + 1];
                this.field_3f1c589_Dne[this.field_267cf5_Qnq + 2] = this.field_3f1c589_Dne[this.field_267cf5_Qnq - n + 2];
                ++this.field_2092ae_Dne;
                this.field_267cf5_Qnq += 8;
            }
        }
        if (this.field_267d06_Qnq) {
            this.field_3f1c589_Dne[this.field_267cf5_Qnq + 3] = Float.floatToRawIntBits((float)this.field_2092a9_Dne);
            this.field_3f1c589_Dne[this.field_267cf5_Qnq + 4] = Float.floatToRawIntBits((float)this.field_212608_FWm);
        }
        if (this.field_2d2a05_aFZ) {
            this.field_3f1c589_Dne[this.field_267cf5_Qnq + 7] = this.field_21260d_FWm;
        }
        if (this.field_2e5f2c_bzF) {
            this.field_3f1c589_Dne[this.field_267cf5_Qnq + 5] = this.field_2e5f1b_bzF;
        }
        if (this.field_388db7_zGp) {
            this.field_3f1c589_Dne[this.field_267cf5_Qnq + 6] = this.field_20b857_DyG;
        }
        this.field_3f1c589_Dne[this.field_267cf5_Qnq + 0] = Float.floatToRawIntBits((float)(d + this.field_2e5f16_bzF));
        this.field_3f1c589_Dne[this.field_267cf5_Qnq + 1] = Float.floatToRawIntBits((float)(d2 + this.field_267cf0_Qnq));
        this.field_3f1c589_Dne[this.field_267cf5_Qnq + 2] = Float.floatToRawIntBits((float)(d3 + this.field_2d29ef_aFZ));
        this.field_267cf5_Qnq += 8;
        ++this.field_2092ae_Dne;
        if (this.field_2092ae_Dne % 4 == 0 && this.field_267cf5_Qnq >= this.field_33448c_mrb - 32) {
            this.method_7a46288d_Dne();
            this.field_2f0de9_div = true;
        }
    }

    public void method_16cca7a_Dne(int n, int n2) {
        int n3 = n >> 16 & 0xFF;
        int n4 = n >> 8 & 0xFF;
        int n5 = n & 0xFF;
        this.method_5972745a_Dne(n3, n4, n5, n2);
    }
}

