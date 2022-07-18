package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class muJ
extends ocu {
    private boolean field_2092bf_Dne = false;
    private int field_2092ae_Dne = 0;
    private final List field_6a0474ed_FWm;
    private final List field_f27c122c_Dne = new ArrayList();
    private final Minecraft field_493682ed_Dne;
    private final List field_7eb83e1f_bzF;

    public void method_110c4dc3_FWm(String string) {
        if (this.field_f27c122c_Dne.isEmpty() || !((String)this.field_f27c122c_Dne.get(this.field_f27c122c_Dne.size() - 1)).equals(string)) {
            this.field_f27c122c_Dne.add(string);
        }
    }

    public int method_ae128dba_bzF() {
        return this.method_7c6f602c_FWm() / 9;
    }

    private void method_7eed8410_Dne(String string, int n, int n2, boolean bl) {
        boolean bl2 = this.method_7a46289e_Dne();
        boolean bl3 = true;
        if (n != 0) {
            this.method_143f9e1c_bzF(n);
        }
        for (Object obj : this.field_493682ed_Dne.field_3791671_Dne.method_c46270c8_Dne(string, geR.method_ce7f5259_Dne((float)this.method_7a46288d_Dne() / this.method_7a46288a_Dne()))) {String string2 = (String) obj;
            if (bl2 && this.field_2092ae_Dne > 0) {
                this.field_2092bf_Dne = true;
                this.method_117d19ea_FWm(1);
            }
            if (!bl3) {
                string2 = " " + string2;
            }
            bl3 = false;
            this.field_7eb83e1f_bzF.add(0, new WMY(n2, string2, n));
        }
        while (this.field_7eb83e1f_bzF.size() > 100) {
            this.field_7eb83e1f_bzF.remove(this.field_7eb83e1f_bzF.size() - 1);
        }
        if (!bl) {
            this.field_6a0474ed_FWm.add(0, new WMY(n2, string.trim(), n));
            while (this.field_6a0474ed_FWm.size() > 100) {
                this.field_6a0474ed_FWm.remove(this.field_6a0474ed_FWm.size() - 1);
            }
        }
    }

    public void method_feb678cd_Dne(String string, Object ... objectArray) {
        this.method_8f501fe4_Dne(irb.method_2310d392_Dne().method_98148f73_Dne(string, objectArray));
    }

    public int method_7c6f602c_FWm() {
        return muJ.method_117d0e9a_FWm(this.method_7a46289e_Dne() ? this.field_493682ed_Dne.field_3758af7_Dne.field_2f0dd5_div : this.field_493682ed_Dne.field_3758af7_Dne.field_20b854_DyG);
    }

    public void method_7c6f6039_FWm() {
        this.field_7eb83e1f_bzF.clear();
        this.method_ae128dc7_bzF();
        for (int i = this.field_6a0474ed_FWm.size() - 1; i >= 0; --i) {
            WMY wMY = (WMY)this.field_6a0474ed_FWm.get(i);
            this.method_7eed8410_Dne(wMY.method_eecad346_Dne(), wMY.method_7c6f602c_FWm(), wMY.method_7a46288d_Dne(), true);
        }
    }

    public Yuy method_904c4d8e_Dne(int n, int n2) {
        if (!this.method_7a46289e_Dne()) {
            return null;
        }
        IJm iJm = new IJm(this.field_493682ed_Dne.field_3758af7_Dne, this.field_493682ed_Dne.field_2092ae_Dne, this.field_493682ed_Dne.field_21260d_FWm);
        int n3 = iJm.method_ae128dba_bzF();
        float f = this.method_7a46288a_Dne();
        int n4 = n / n3 - 3;
        int n5 = n2 / n3 - 25;
        n4 = geR.method_ce7f5259_Dne((float)n4 / f);
        n5 = geR.method_ce7f5259_Dne((float)n5 / f);
        if (n4 >= 0 && n5 >= 0) {
            int n6 = Math.min(this.method_ae128dba_bzF(), this.field_7eb83e1f_bzF.size());
            if (n4 <= geR.method_ce7f5259_Dne((float)this.method_7a46288d_Dne() / this.method_7a46288a_Dne()) && n5 < this.field_493682ed_Dne.field_3791671_Dne.field_2092ae_Dne * n6 + n6) {
                int n7 = n5 / (this.field_493682ed_Dne.field_3791671_Dne.field_2092ae_Dne + 1) + this.field_2092ae_Dne;
                return new Yuy(this.field_493682ed_Dne.field_3791671_Dne, (WMY)this.field_7eb83e1f_bzF.get(n7), n4, n5 - (n7 - this.field_2092ae_Dne) * this.field_493682ed_Dne.field_3791671_Dne.field_2092ae_Dne + n7);
            }
            return null;
        }
        return null;
    }

    public void method_143f9e1c_bzF(int n) {
        WMY wMY;
        Iterator iterator = this.field_7eb83e1f_bzF.iterator();
        do {
            if (iterator.hasNext()) continue;
            iterator = this.field_6a0474ed_FWm.iterator();
            do {
                if (iterator.hasNext()) continue;
                return;
            } while ((wMY = (WMY)iterator.next()).method_7c6f602c_FWm() != n);
            iterator.remove();
            return;
        } while ((wMY = (WMY)iterator.next()).method_7c6f602c_FWm() != n);
        iterator.remove();
    }

    public int method_7a46288d_Dne() {
        return muJ.method_ce7f5259_Dne(this.field_493682ed_Dne.field_3758af7_Dne.field_388da3_zGp);
    }

    public void method_ce7f5da9_Dne(int n) {
        if (this.field_493682ed_Dne.field_3758af7_Dne.field_267cf5_Qnq != 2) {
            int n2 = this.method_ae128dba_bzF();
            boolean bl = false;
            int n3 = 0;
            int n4 = this.field_7eb83e1f_bzF.size();
            float f = this.field_493682ed_Dne.field_3758af7_Dne.field_267cf2_Qnq * 0.9f + 0.1f;
            if (n4 > 0) {
                int n5;
                int n6;
                int n7;
                int n8;
                if (this.method_7a46289e_Dne()) {
                    bl = true;
                }
                float f2 = this.method_7a46288a_Dne();
                int n9 = geR.method_117d0e9a_FWm((float)this.method_7a46288d_Dne() / f2);
                GL11.glPushMatrix();
                GL11.glTranslatef(2.0f, 20.0f, 0.0f);
                GL11.glScalef(f2, f2, 1.0f);
                for (n8 = 0; n8 + this.field_2092ae_Dne < this.field_7eb83e1f_bzF.size() && n8 < n2; ++n8) {
                    WMY wMY = (WMY)this.field_7eb83e1f_bzF.get(n8 + this.field_2092ae_Dne);
                    if (wMY == null || (n7 = n - wMY.method_7a46288d_Dne()) >= 200 && !bl) continue;
                    double d = (double)n7 / 200.0;
                    d = 1.0 - d;
                    if ((d *= 10.0) < 0.0) {
                        d = 0.0;
                    }
                    if (d > 1.0) {
                        d = 1.0;
                    }
                    d *= d;
                    n6 = (int)(255.0 * d);
                    if (bl) {
                        n6 = 255;
                    }
                    n6 = (int)((float)n6 * f);
                    ++n3;
                    if (n6 <= 3) continue;
                    n5 = 0;
                    int n10 = -n8 * 9;
                    muJ.method_d4dc89e9_Dne(n5, n10 - 9, n5 + n9 + 4, n10, n6 / 2 << 24);
                    GL11.glEnable(3042);
                    String string = wMY.method_eecad346_Dne();
                    if (!this.field_493682ed_Dne.field_3758af7_Dne.field_20b868_DyG) {
                        string = vCA.method_39193c_Dne(string);
                    }
                    this.field_493682ed_Dne.field_3791671_Dne.method_7eed4432_Dne(string, n5, n10 - 8, 0xFFFFFF + (n6 << 24));
                }
                if (bl) {
                    n8 = this.field_493682ed_Dne.field_3791671_Dne.field_2092ae_Dne;
                    GL11.glTranslatef(-3.0f, 0.0f, 0.0f);
                    int n11 = n4 * n8 + n4;
                    n7 = n3 * n8 + n3;
                    int n12 = this.field_2092ae_Dne * n7 / n4;
                    int n13 = n7 * n7 / n11;
                    if (n11 != n7) {
                        n6 = n12 > 0 ? 170 : 96;
                        n5 = this.field_2092bf_Dne ? 0xCC3333 : 0x3333AA;
                        muJ.method_d4dc89e9_Dne(0, -n12, 2, -n12 - n13, n5 + (n6 << 24));
                        muJ.method_d4dc89e9_Dne(2, -n12, 1, -n12 - n13, 0xCCCCCC + (n6 << 24));
                    }
                }
                GL11.glPopMatrix();
            }
        }
    }

    public boolean method_7a46289e_Dne() {
        return this.field_493682ed_Dne.field_37a7e17_Dne instanceof SlE;
    }

    public static final int method_117d0e9a_FWm(float f) {
        int n = 180;
        int n2 = 20;
        return geR.method_ce7f5259_Dne(f * (float)(n - n2) + (float)n2);
    }

    public List method_adea226d_Dne() {
        return this.field_f27c122c_Dne;
    }

    public void method_117d19ea_FWm(int n) {
        this.field_2092ae_Dne += n;
        int n2 = this.field_7eb83e1f_bzF.size();
        if (this.field_2092ae_Dne > n2 - this.method_ae128dba_bzF()) {
            this.field_2092ae_Dne = n2 - this.method_ae128dba_bzF();
        }
        if (this.field_2092ae_Dne <= 0) {
            this.field_2092ae_Dne = 0;
            this.field_2092bf_Dne = false;
        }
    }

    public void method_ae128dc7_bzF() {
        this.field_2092ae_Dne = 0;
        this.field_2092bf_Dne = false;
    }

    public static final int method_ce7f5259_Dne(float f) {
        int n = 320;
        int n2 = 40;
        return geR.method_ce7f5259_Dne(f * (float)(n - n2) + (float)n2);
    }

    public float method_7a46288a_Dne() {
        return this.field_493682ed_Dne.field_3758af7_Dne.field_2d29f1_aFZ;
    }

    public muJ(Minecraft minecraft) {
        this.field_6a0474ed_FWm = new ArrayList();
        this.field_7eb83e1f_bzF = new ArrayList();
        this.field_493682ed_Dne = minecraft;
    }

    public void method_7a46289a_Dne() {
        this.field_7eb83e1f_bzF.clear();
        this.field_6a0474ed_FWm.clear();
        this.field_f27c122c_Dne.clear();
    }

    public void method_5ab44f9f_Dne(String string, int n) {
        this.method_7eed8410_Dne(string, n, this.field_493682ed_Dne.field_3733694_Dne.method_7a46288d_Dne(), false);
        this.field_493682ed_Dne.method_230e0120_Dne().method_8f501fe4_Dne("[CHAT] " + string);
    }

    public void method_8f501fe4_Dne(String string) {
        this.method_5ab44f9f_Dne(string, 0);
    }
}

