package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public abstract class Sss
extends qVZ {
    private NMq field_202441f9_FWm = null;
    private NMq field_75b24407_bzF = null;
    private int field_22c602_IjH = 0;
    private boolean field_388db7_zGp;
    private onZ field_75c1bd5e_bzF = null;
    private int field_20b857_DyG = 0;
    private int field_2a9ad6_Zpi = 0;
    private int field_33448c_mrb = 0;
    protected final Set<onZ> field_83b48b6a_Dne = new HashSet();
    private boolean field_2d2a05_aFZ = false;
    private onZ field_379ef71_Dne;
    private NMq field_36a761a_Dne = null;
    protected int field_2092ae_Dne = 176;
    private boolean field_267d06_Qnq = false;
    private long field_21260e_FWm = 0L;
    private long field_2e5f1c_bzF = 0L;
    protected int field_267cf5_Qnq = 166;
    protected int field_2d29f4_aFZ;
    private int field_2f0dd8_div = 0;
    protected int field_388da6_zGp;
    private onZ field_713d73b7_aFZ = null;
    private int field_29186d_XHL;
    private long field_2092af_Dne = 0L;
    private onZ field_2033bb50_FWm = null;
    private onZ field_5e635e38_Qnq = null;
    protected boolean field_2e5f2c_bzF;
    protected static eKj field_374e248_Dne = new eKj();
    public Pdb field_36bb35e_Dne;

    @Override
    public void method_ae128dc7_bzF() {
        super.method_ae128dc7_bzF();
        if (!this.field_493682ed_Dne.field_369f6b6_Dne.method_cd4cb3d9_udO() || this.field_493682ed_Dne.field_369f6b6_Dne.field_2a9ae7_Zpi) {
            this.field_493682ed_Dne.field_369f6b6_Dne.method_a98a0660_aFZ();
        }
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        int n3;
        int n4;
        Object object;
        this.method_a98a0660_aFZ();
        int n5 = this.field_2d29f4_aFZ;
        int n6 = this.field_388da6_zGp;
        this.method_2c02b146_Dne(f, n, n2);
        GL11.glDisable(32826);
        Cit.method_7a46289a_Dne();
        GL11.glDisable(2896);
        GL11.glDisable(2929);
        super.method_2c2cec86_Dne(n, n2, f);
        Cit.method_ae128dc7_bzF();
        GL11.glPushMatrix();
        GL11.glTranslatef(n5, n6, 0.0f);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glEnable(32826);
        this.field_379ef71_Dne = null;
        int n7 = 240;
        int n8 = 240;
        oCF.method_2c2b8f69_Dne(oCF.field_21260d_FWm, (float)n7 / 1.0f, (float)n8 / 1.0f);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        for (int i = 0; i < this.field_36bb35e_Dne.field_7eb83e1f_bzF.size(); ++i) {
            object = (onZ)this.field_36bb35e_Dne.field_7eb83e1f_bzF.get(i);
            this.method_b6784eac_Dne((onZ)object);
            if (!this.method_f9adb410_Dne((onZ)object, n, n2)) continue;
            this.field_379ef71_Dne = (onZ) object;
            GL11.glDisable(2896);
            GL11.glDisable(2929);
            n4 = ((onZ)object).field_2d29f4_aFZ;
            n3 = ((onZ)object).field_388da6_zGp;
            this.method_c6b5263a_Dne(n4, n3, n4 + 16, n3 + 16, -2130706433, -2130706433);
            GL11.glEnable(2896);
            GL11.glEnable(2929);
        }
        this.method_16cca7a_Dne(n, n2);
        MOS mOS = this.field_493682ed_Dne.field_369f6b6_Dne.field_36a059b_Dne;
        Object object2 = object = this.field_36a761a_Dne == null ? mOS.method_f87a5498_FWm() : this.field_36a761a_Dne;
        if (object != null) {
            n4 = 8;
            n3 = this.field_36a761a_Dne == null ? 8 : 16;
            String string = null;
            if (this.field_36a761a_Dne != null && this.field_267d06_Qnq) {
                object = ((NMq)object).method_23040479_Dne();
                ((NMq)object).field_2092ae_Dne = geR.method_117d0e9a_FWm((float)((NMq)object).field_2092ae_Dne / 2.0f);
            } else if (this.field_2e5f2c_bzF && this.field_83b48b6a_Dne.size() > 1) {
                object = ((NMq)object).method_23040479_Dne();
                ((NMq)object).field_2092ae_Dne = this.field_29186d_XHL;
                if (((NMq)object).field_2092ae_Dne == 0) {
                    string = "" + (Object)((Object)Dne.field_ab1f2987_ooe) + "0";
                }
            }
            this.method_18d0a4bf_Dne((NMq)object, n - n5 - n4, n2 - n6 - n3, string);
        }
        if (this.field_202441f9_FWm != null) {
            float f2 = (float)(Minecraft.method_7a46288e_Dne() - this.field_2092af_Dne) / 100.0f;
            if (f2 >= 1.0f) {
                f2 = 1.0f;
                this.field_202441f9_FWm = null;
            }
            n3 = this.field_75c1bd5e_bzF.field_2d29f4_aFZ - this.field_20b857_DyG;
            int n9 = this.field_75c1bd5e_bzF.field_388da6_zGp - this.field_2f0dd8_div;
            int n10 = this.field_20b857_DyG + (int)((float)n3 * f2);
            int n11 = this.field_2f0dd8_div + (int)((float)n9 * f2);
            this.method_18d0a4bf_Dne(this.field_202441f9_FWm, n10, n11, null);
        }
        GL11.glPopMatrix();
        if (mOS.method_f87a5498_FWm() == null && this.field_379ef71_Dne != null && this.field_379ef71_Dne.method_7a46289e_Dne()) {
            NMq nMq = this.field_379ef71_Dne.method_23040479_Dne();
            this.method_eb38be35_Dne(nMq, n, n2);
        }
        GL11.glEnable(2896);
        GL11.glEnable(2929);
        Cit.method_7c6f6039_FWm();
    }

    protected void method_3c094077_Dne(onZ onZ2, int n, int n2, int n3) {
        if (onZ2 != null) {
            n = onZ2.field_267cf5_Qnq;
        }
        this.field_493682ed_Dne.field_36c390e_Dne.method_816e2042_Dne(this.field_36bb35e_Dne.field_2092ae_Dne, n, n2, n3, this.field_493682ed_Dne.field_369f6b6_Dne);
    }

    protected void method_b6186b2b_Dne(List list, int n, int n2) {
        if (!list.isEmpty()) {
            int n3;
            GL11.glDisable(32826);
            Cit.method_7a46289a_Dne();
            GL11.glDisable(2896);
            GL11.glDisable(2929);
            int n4 = 0;
            for (Object obj : list) {String string = (String) obj;
                n3 = this.field_3791671_Dne.method_8f501fd7_Dne(string);
                if (n3 <= n4) continue;
                n4 = n3;
            }
            int n5 = n + 12;
            n3 = n2 - 12;
            int n6 = 8;
            if (list.size() > 1) {
                n6 += 2 + (list.size() - 1) * 10;
            }
            if (n5 + n4 > this.field_21260d_FWm) {
                n5 -= 28 + n4;
            }
            if (n3 + n6 + 6 > this.field_2e5f1b_bzF) {
                n3 = this.field_2e5f1b_bzF - n6 - 6;
            }
            this.field_21260a_FWm = 300.0f;
            Sss.field_374e248_Dne.field_2e5f18_bzF = 300.0f;
            int n7 = -267386864;
            this.method_c6b5263a_Dne(n5 - 3, n3 - 4, n5 + n4 + 3, n3 - 3, n7, n7);
            this.method_c6b5263a_Dne(n5 - 3, n3 + n6 + 3, n5 + n4 + 3, n3 + n6 + 4, n7, n7);
            this.method_c6b5263a_Dne(n5 - 3, n3 - 3, n5 + n4 + 3, n3 + n6 + 3, n7, n7);
            this.method_c6b5263a_Dne(n5 - 4, n3 - 3, n5 - 3, n3 + n6 + 3, n7, n7);
            this.method_c6b5263a_Dne(n5 + n4 + 3, n3 - 3, n5 + n4 + 4, n3 + n6 + 3, n7, n7);
            int n8 = 0x505000FF;
            int n9 = (n8 & 0xFEFEFE) >> 1 | n8 & 0xFF000000;
            this.method_c6b5263a_Dne(n5 - 3, n3 - 3 + 1, n5 - 3 + 1, n3 + n6 + 3 - 1, n8, n9);
            this.method_c6b5263a_Dne(n5 + n4 + 2, n3 - 3 + 1, n5 + n4 + 3, n3 + n6 + 3 - 1, n8, n9);
            this.method_c6b5263a_Dne(n5 - 3, n3 - 3, n5 + n4 + 3, n3 - 3 + 1, n8, n8);
            this.method_c6b5263a_Dne(n5 - 3, n3 + n6 + 2, n5 + n4 + 3, n3 + n6 + 3, n9, n9);
            for (int i = 0; i < list.size(); ++i) {
                String string = (String)list.get(i);
                this.field_3791671_Dne.method_7eed4432_Dne(string, n5, n3, -1);
                if (i == 0) {
                    n3 += 2;
                }
                n3 += 10;
            }
            this.field_21260a_FWm = 0.0f;
            Sss.field_374e248_Dne.field_2e5f18_bzF = 0.0f;
            GL11.glEnable(2896);
            GL11.glEnable(2929);
            Cit.method_7c6f6039_FWm();
            GL11.glEnable(32826);
        }
    }

    @Override
    protected void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        super.method_2c2cf7c9_Dne(n, n2, n3);
        boolean bl = n3 == this.field_493682ed_Dne.field_3758af7_Dne.field_a22cd106_kGO.field_2092ae_Dne + 100;
        onZ onZ2 = this.method_90562fb0_Dne(n, n2);
        long l = Minecraft.method_7a46288e_Dne();
        this.field_388db7_zGp = this.field_713d73b7_aFZ == onZ2 && l - this.field_2e5f1c_bzF < 250L && this.field_2a9ad6_Zpi == n3;
        this.field_2d2a05_aFZ = false;
        if (n3 == 0 || n3 == 1 || bl) {
            int n4 = this.field_2d29f4_aFZ;
            int n5 = this.field_388da6_zGp;
            boolean bl2 = n < n4 || n2 < n5 || n >= n4 + this.field_2092ae_Dne || n2 >= n5 + this.field_267cf5_Qnq;
            int n6 = -1;
            if (onZ2 != null) {
                n6 = onZ2.field_267cf5_Qnq;
            }
            if (bl2) {
                n6 = -999;
            }
            if (this.field_493682ed_Dne.field_3758af7_Dne.field_1ed028_ATE && bl2 && this.field_493682ed_Dne.field_369f6b6_Dne.field_36a059b_Dne.method_f87a5498_FWm() == null) {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(null);
                return;
            }
            if (n6 != -1) {
                if (this.field_493682ed_Dne.field_3758af7_Dne.field_1ed028_ATE) {
                    if (onZ2 != null && onZ2.method_7a46289e_Dne()) {
                        this.field_2033bb50_FWm = onZ2;
                        this.field_36a761a_Dne = null;
                        this.field_267d06_Qnq = n3 == 1;
                    } else {
                        this.field_2033bb50_FWm = null;
                    }
                } else if (!this.field_2e5f2c_bzF) {
                    if (this.field_493682ed_Dne.field_369f6b6_Dne.field_36a059b_Dne.method_f87a5498_FWm() == null) {
                        if (n3 == this.field_493682ed_Dne.field_3758af7_Dne.field_a22cd106_kGO.field_2092ae_Dne + 100) {
                            this.method_3c094077_Dne(onZ2, n6, n3, 3);
                        } else {
                            boolean bl3 = n6 != -999 && (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54));
                            int n7 = 0;
                            if (bl3) {
                                this.field_75b24407_bzF = onZ2 != null && onZ2.method_7a46289e_Dne() ? onZ2.method_23040479_Dne() : null;
                                n7 = 1;
                            } else if (n6 == -999) {
                                n7 = 4;
                            }
                            this.method_3c094077_Dne(onZ2, n6, n3, n7);
                        }
                        this.field_2d2a05_aFZ = true;
                    } else {
                        this.field_2e5f2c_bzF = true;
                        this.field_33448c_mrb = n3;
                        this.field_83b48b6a_Dne.clear();
                        if (n3 == 0) {
                            this.field_22c602_IjH = 0;
                        } else if (n3 == 1) {
                            this.field_22c602_IjH = 1;
                        }
                    }
                }
            }
        }
        this.field_713d73b7_aFZ = onZ2;
        this.field_2e5f1c_bzF = l;
        this.field_2a9ad6_Zpi = n3;
    }

    @Override
    public void method_7c6f6039_FWm() {
        if (this.field_493682ed_Dne.field_369f6b6_Dne != null) {
            this.field_36bb35e_Dne.method_703284a3_Dne(this.field_493682ed_Dne.field_369f6b6_Dne);
        }
    }

    private onZ method_90562fb0_Dne(int n, int n2) {
        for (int i = 0; i < this.field_36bb35e_Dne.field_7eb83e1f_bzF.size(); ++i) {
            onZ onZ2 = (onZ)this.field_36bb35e_Dne.field_7eb83e1f_bzF.get(i);
            if (!this.method_f9adb410_Dne(onZ2, n, n2)) continue;
            return onZ2;
        }
        return null;
    }

    private boolean method_f9adb410_Dne(onZ onZ2, int n, int n2) {
        return this.method_c6b5263e_Dne(onZ2.field_2d29f4_aFZ, onZ2.field_388da6_zGp, 16, 16, n, n2);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    private void method_b6784eac_Dne(onZ onZ2) {
        gDn gDn2;
        int n = onZ2.field_2d29f4_aFZ;
        int n2 = onZ2.field_388da6_zGp;
        NMq nMq = onZ2.method_23040479_Dne();
        boolean bl = false;
        boolean bl2 = onZ2 == this.field_2033bb50_FWm && this.field_36a761a_Dne != null && !this.field_267d06_Qnq;
        NMq nMq2 = this.field_493682ed_Dne.field_369f6b6_Dne.field_36a059b_Dne.method_f87a5498_FWm();
        String string = null;
        if (onZ2 == this.field_2033bb50_FWm && this.field_36a761a_Dne != null && this.field_267d06_Qnq && nMq != null) {
            nMq = nMq.method_23040479_Dne();
            nMq.field_2092ae_Dne /= 2;
        } else if (this.field_2e5f2c_bzF && this.field_83b48b6a_Dne.contains(onZ2) && nMq2 != null) {
            if (this.field_83b48b6a_Dne.size() == 1) {
                return;
            }
            if (Pdb.method_c38696f5_Dne(onZ2, nMq2, true) && this.field_36bb35e_Dne.method_b6784eb0_Dne(onZ2)) {
                nMq = nMq2.method_23040479_Dne();
                bl = true;
                Pdb.method_28993b2_Dne(this.field_83b48b6a_Dne, this.field_22c602_IjH, nMq, onZ2.method_23040479_Dne() == null ? 0 : onZ2.method_23040479_Dne().field_2092ae_Dne);
                if (nMq.field_2092ae_Dne > nMq.method_7c6f602c_FWm()) {
                    string = (Object)((Object)Dne.field_ab1f2987_ooe) + "" + nMq.method_7c6f602c_FWm();
                    nMq.field_2092ae_Dne = nMq.method_7c6f602c_FWm();
                }
                if (nMq.field_2092ae_Dne > onZ2.method_7a46288d_Dne()) {
                    string = (Object)((Object)Dne.field_ab1f2987_ooe) + "" + onZ2.method_7a46288d_Dne();
                    nMq.field_2092ae_Dne = onZ2.method_7a46288d_Dne();
                }
            } else {
                this.field_83b48b6a_Dne.remove(onZ2);
                this.method_d44b4592_zGp();
            }
        }
        this.field_21260a_FWm = 100.0f;
        Sss.field_374e248_Dne.field_2e5f18_bzF = 100.0f;
        if (nMq == null && (gDn2 = onZ2.method_230f3f9a_Dne()) != null) {
            GL11.glDisable(2896);
            this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/items.png");
            this.method_f35902f6_Dne(n, n2, gDn2, 16, 16);
            GL11.glEnable(2896);
            bl2 = true;
        }
        if (!bl2) {
            if (bl) {
                Sss.method_d4dc89e9_Dne(n, n2, n + 16, n2 + 16, -2130706433);
            }
            GL11.glEnable(2929);
            field_374e248_Dne.method_5ae7aca8_FWm(this.field_3791671_Dne, this.field_493682ed_Dne.field_36d36bf_Dne, nMq, n, n2);
            field_374e248_Dne.method_75d29071_Dne(this.field_3791671_Dne, this.field_493682ed_Dne.field_36d36bf_Dne, nMq, n, n2, string);
        }
        Sss.field_374e248_Dne.field_2e5f18_bzF = 0.0f;
        this.field_21260a_FWm = 0.0f;
    }

    public Sss(Pdb pdb) {
        this.field_36bb35e_Dne = pdb;
        this.field_2d2a05_aFZ = true;
    }

    protected boolean method_c6b5263e_Dne(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = this.field_2d29f4_aFZ;
        int n8 = this.field_388da6_zGp;
        return (n5 -= n7) >= n - 1 && n5 < n + n3 + 1 && (n6 -= n8) >= n2 - 1 && n6 < n2 + n4 + 1;
    }

    protected void method_fbd61744_Dne(String string, int n, int n2) {
        this.method_b6186b2b_Dne(Arrays.asList(string), n, n2);
    }

    @Override
    protected void method_16a1040_Dne(char c, int n) {
        if (n == 1 || n == this.field_493682ed_Dne.field_3758af7_Dne.field_f0ae5e96_zGp.field_2092ae_Dne) {
            this.field_493682ed_Dne.field_369f6b6_Dne.method_a98a0660_aFZ();
        }
        this.method_ce7f5dad_Dne(n);
        if (this.field_379ef71_Dne != null && this.field_379ef71_Dne.method_7a46289e_Dne()) {
            if (n == this.field_493682ed_Dne.field_3758af7_Dne.field_a22cd106_kGO.field_2092ae_Dne) {
                this.method_3c094077_Dne(this.field_379ef71_Dne, this.field_379ef71_Dne.field_267cf5_Qnq, 0, 3);
            } else if (n == this.field_493682ed_Dne.field_3758af7_Dne.field_162fc8c7_DyG.field_2092ae_Dne) {
                this.method_3c094077_Dne(this.field_379ef71_Dne, this.field_379ef71_Dne.field_267cf5_Qnq, Sss.method_7c6f603d_FWm() ? 1 : 0, 4);
            }
        }
    }

    protected void method_eb38be35_Dne(NMq nMq, int n, int n2) {
        List list = nMq.method_38697b96_Dne(this.field_493682ed_Dne.field_369f6b6_Dne, this.field_493682ed_Dne.field_3758af7_Dne.field_342275_ooe);
        for (int i = 0; i < list.size(); ++i) {
            if (i == 0) {
                list.set(i, "\u00a7" + Integer.toHexString(nMq.method_2300fc43_Dne().field_2092ae_Dne) + (String)list.get(i));
                continue;
            }
            list.set(i, (Object)((Object)Dne.field_140f3afb_div) + (String)list.get(i));
        }
        this.method_b6186b2b_Dne(list, n, n2);
    }

    @Override
    protected void method_5972781b_Dne(int n, int n2, int n3, long l) {
        onZ onZ2 = this.method_90562fb0_Dne(n, n2);
        NMq nMq = this.field_493682ed_Dne.field_369f6b6_Dne.field_36a059b_Dne.method_f87a5498_FWm();
        if (this.field_2033bb50_FWm != null && this.field_493682ed_Dne.field_3758af7_Dne.field_1ed028_ATE) {
            if (n3 == 0 || n3 == 1) {
                if (this.field_36a761a_Dne == null) {
                    if (onZ2 != this.field_2033bb50_FWm) {
                        this.field_36a761a_Dne = this.field_2033bb50_FWm.method_23040479_Dne().method_23040479_Dne();
                    }
                } else if (this.field_36a761a_Dne.field_2092ae_Dne > 1 && onZ2 != null && Pdb.method_c38696f5_Dne(onZ2, this.field_36a761a_Dne, false)) {
                    long l2 = Minecraft.method_7a46288e_Dne();
                    if (this.field_5e635e38_Qnq == onZ2) {
                        if (l2 - this.field_21260e_FWm > 500L) {
                            this.method_3c094077_Dne(this.field_2033bb50_FWm, this.field_2033bb50_FWm.field_267cf5_Qnq, 0, 0);
                            this.method_3c094077_Dne(onZ2, onZ2.field_267cf5_Qnq, 1, 0);
                            this.method_3c094077_Dne(this.field_2033bb50_FWm, this.field_2033bb50_FWm.field_267cf5_Qnq, 0, 0);
                            this.field_21260e_FWm = l2 + 750L;
                            --this.field_36a761a_Dne.field_2092ae_Dne;
                        }
                    } else {
                        this.field_5e635e38_Qnq = onZ2;
                        this.field_21260e_FWm = l2;
                    }
                }
            }
        } else if (this.field_2e5f2c_bzF && onZ2 != null && nMq != null && nMq.field_2092ae_Dne > this.field_83b48b6a_Dne.size() && Pdb.method_c38696f5_Dne(onZ2, nMq, true) && onZ2.method_7c61cf19_Dne(nMq) && this.field_36bb35e_Dne.method_b6784eb0_Dne(onZ2)) {
            this.field_83b48b6a_Dne.add(onZ2);
            this.method_d44b4592_zGp();
        }
    }

    @Override
    protected void method_a6aca7ca_FWm(int n, int n2, int n3) {
        onZ onZ2 = this.method_90562fb0_Dne(n, n2);
        int n4 = this.field_2d29f4_aFZ;
        int n5 = this.field_388da6_zGp;
        boolean bl = n < n4 || n2 < n5 || n >= n4 + this.field_2092ae_Dne || n2 >= n5 + this.field_267cf5_Qnq;
        int n6 = -1;
        if (onZ2 != null) {
            n6 = onZ2.field_267cf5_Qnq;
        }
        if (bl) {
            n6 = -999;
        }
        if (this.field_388db7_zGp && onZ2 != null && n3 == 0 && this.field_36bb35e_Dne.method_e3987d15_Dne(null, onZ2)) {
            if (Sss.method_ae128dcb_bzF()) {
                if (onZ2 != null && onZ2.field_36a853d_Dne != null && this.field_75b24407_bzF != null) {
                    for (onZ onZ3 : this.field_36bb35e_Dne.field_7eb83e1f_bzF) {
                        if (onZ3 == null || !onZ3.method_703284a7_Dne(this.field_493682ed_Dne.field_369f6b6_Dne) || !onZ3.method_7a46289e_Dne() || onZ3.field_36a853d_Dne != onZ2.field_36a853d_Dne || !Pdb.method_c38696f5_Dne(onZ3, this.field_75b24407_bzF, true)) continue;
                        this.method_3c094077_Dne(onZ3, onZ3.field_267cf5_Qnq, n3, 1);
                    }
                }
            } else {
                this.method_3c094077_Dne(onZ2, n6, n3, 6);
            }
            this.field_388db7_zGp = false;
            this.field_2e5f1c_bzF = 0L;
        } else {
            if (this.field_2e5f2c_bzF && this.field_33448c_mrb != n3) {
                this.field_2e5f2c_bzF = false;
                this.field_83b48b6a_Dne.clear();
                this.field_2d2a05_aFZ = true;
                return;
            }
            if (this.field_2d2a05_aFZ) {
                this.field_2d2a05_aFZ = false;
                return;
            }
            if (this.field_2033bb50_FWm != null && this.field_493682ed_Dne.field_3758af7_Dne.field_1ed028_ATE) {
                if (n3 == 0 || n3 == 1) {
                    if (this.field_36a761a_Dne == null && onZ2 != this.field_2033bb50_FWm) {
                        this.field_36a761a_Dne = this.field_2033bb50_FWm.method_23040479_Dne();
                    }
                    boolean bl2 = Pdb.method_c38696f5_Dne(onZ2, this.field_36a761a_Dne, false);
                    if (n6 != -1 && this.field_36a761a_Dne != null && bl2) {
                        this.method_3c094077_Dne(this.field_2033bb50_FWm, this.field_2033bb50_FWm.field_267cf5_Qnq, n3, 0);
                        this.method_3c094077_Dne(onZ2, n6, 0, 0);
                        if (this.field_493682ed_Dne.field_369f6b6_Dne.field_36a059b_Dne.method_f87a5498_FWm() != null) {
                            this.method_3c094077_Dne(this.field_2033bb50_FWm, this.field_2033bb50_FWm.field_267cf5_Qnq, n3, 0);
                            this.field_20b857_DyG = n - n4;
                            this.field_2f0dd8_div = n2 - n5;
                            this.field_75c1bd5e_bzF = this.field_2033bb50_FWm;
                            this.field_202441f9_FWm = this.field_36a761a_Dne;
                            this.field_2092af_Dne = Minecraft.method_7a46288e_Dne();
                        } else {
                            this.field_202441f9_FWm = null;
                        }
                    } else if (this.field_36a761a_Dne != null) {
                        this.field_20b857_DyG = n - n4;
                        this.field_2f0dd8_div = n2 - n5;
                        this.field_75c1bd5e_bzF = this.field_2033bb50_FWm;
                        this.field_202441f9_FWm = this.field_36a761a_Dne;
                        this.field_2092af_Dne = Minecraft.method_7a46288e_Dne();
                    }
                    this.field_36a761a_Dne = null;
                    this.field_2033bb50_FWm = null;
                }
            } else if (this.field_2e5f2c_bzF && !this.field_83b48b6a_Dne.isEmpty()) {
                this.method_3c094077_Dne(null, -999, Pdb.method_16cca6d_Dne(0, this.field_22c602_IjH), 5);
                for (onZ onZ4 : this.field_83b48b6a_Dne) {
                    this.method_3c094077_Dne(onZ4, onZ4.field_267cf5_Qnq, Pdb.method_16cca6d_Dne(1, this.field_22c602_IjH), 5);
                }
                this.method_3c094077_Dne(null, -999, Pdb.method_16cca6d_Dne(2, this.field_22c602_IjH), 5);
            } else if (this.field_493682ed_Dne.field_369f6b6_Dne.field_36a059b_Dne.method_f87a5498_FWm() != null) {
                if (n3 == this.field_493682ed_Dne.field_3758af7_Dne.field_a22cd106_kGO.field_2092ae_Dne + 100) {
                    this.method_3c094077_Dne(onZ2, n6, n3, 3);
                } else {
                    boolean bl3;
                    boolean bl4 = bl3 = n6 != -999 && (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54));
                    if (bl3) {
                        this.field_75b24407_bzF = onZ2 != null && onZ2.method_7a46289e_Dne() ? onZ2.method_23040479_Dne() : null;
                    }
                    this.method_3c094077_Dne(onZ2, n6, n3, bl3 ? 1 : 0);
                }
            }
        }
        if (this.field_493682ed_Dne.field_369f6b6_Dne.field_36a059b_Dne.method_f87a5498_FWm() == null) {
            this.field_2e5f1c_bzF = 0L;
        }
        this.field_2e5f2c_bzF = false;
    }

    private void method_d44b4592_zGp() {
        NMq nMq = this.field_493682ed_Dne.field_369f6b6_Dne.field_36a059b_Dne.method_f87a5498_FWm();
        if (nMq != null && this.field_2e5f2c_bzF) {
            this.field_29186d_XHL = nMq.field_2092ae_Dne;
            for (onZ onZ2 : this.field_83b48b6a_Dne) {
                NMq nMq2 = nMq.method_23040479_Dne();
                int n = onZ2.method_23040479_Dne() == null ? 0 : onZ2.method_23040479_Dne().field_2092ae_Dne;
                Pdb.method_28993b2_Dne(this.field_83b48b6a_Dne, this.field_22c602_IjH, nMq2, n);
                if (nMq2.field_2092ae_Dne > nMq2.method_7c6f602c_FWm()) {
                    nMq2.field_2092ae_Dne = nMq2.method_7c6f602c_FWm();
                }
                if (nMq2.field_2092ae_Dne > onZ2.method_7a46288d_Dne()) {
                    nMq2.field_2092ae_Dne = onZ2.method_7a46288d_Dne();
                }
                this.field_29186d_XHL -= nMq2.field_2092ae_Dne - n;
            }
        }
    }

    protected abstract void method_2c02b146_Dne(float var1, int var2, int var3);

    @Override
    public void method_7a46289a_Dne() {
        super.method_7a46289a_Dne();
        this.field_493682ed_Dne.field_369f6b6_Dne.field_20257f3d_FWm = this.field_36bb35e_Dne;
        this.field_2d29f4_aFZ = (this.field_21260d_FWm - this.field_2092ae_Dne) / 2;
        this.field_388da6_zGp = (this.field_2e5f1b_bzF - this.field_267cf5_Qnq) / 2;
    }

    protected void method_16cca7a_Dne(int n, int n2) {
    }

    protected boolean method_ce7f5dad_Dne(int n) {
        if (this.field_493682ed_Dne.field_369f6b6_Dne.field_36a059b_Dne.method_f87a5498_FWm() == null && this.field_379ef71_Dne != null) {
            for (int i = 0; i < 9; ++i) {
                if (n != 2 + i) continue;
                this.method_3c094077_Dne(this.field_379ef71_Dne, this.field_379ef71_Dne.field_267cf5_Qnq, i, 2);
                return true;
            }
        }
        return false;
    }

    private void method_18d0a4bf_Dne(NMq nMq, int n, int n2, String string) {
        GL11.glTranslatef(0.0f, 0.0f, 32.0f);
        this.field_21260a_FWm = 200.0f;
        Sss.field_374e248_Dne.field_2e5f18_bzF = 200.0f;
        field_374e248_Dne.method_5ae7aca8_FWm(this.field_3791671_Dne, this.field_493682ed_Dne.field_36d36bf_Dne, nMq, n, n2);
        field_374e248_Dne.method_75d29071_Dne(this.field_3791671_Dne, this.field_493682ed_Dne.field_36d36bf_Dne, nMq, n, n2 - (this.field_36a761a_Dne == null ? 0 : 8), string);
        this.field_21260a_FWm = 0.0f;
        Sss.field_374e248_Dne.field_2e5f18_bzF = 0.0f;
    }
}

