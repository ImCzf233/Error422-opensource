package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class VXB
extends MlO {
    private GpK field_367c64a_Dne;
    private mHN field_3787699_Dne;
    private onZ field_379ef71_Dne = null;
    private List field_6a0474ed_FWm;
    private boolean field_388db7_zGp = false;
    private float field_2092ab_Dne = 0.0f;
    private static pam field_37a3550_Dne = new pam("tmp", true, 45);
    private static int field_20b857_DyG = JcN.field_368f2f7_Dne.method_7a46288d_Dne();
    private boolean field_267d06_Qnq = false;
    private boolean field_2d2a05_aFZ;

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        boolean bl = Mouse.isButtonDown(0);
        int n3 = this.field_2d29f4_aFZ;
        int n4 = this.field_388da6_zGp;
        int n5 = n3 + 175;
        int n6 = n4 + 18;
        int n7 = n5 + 14;
        int n8 = n6 + 112;
        if (!this.field_2d2a05_aFZ && bl && n >= n5 && n2 >= n6 && n < n7 && n2 < n8) {
            this.field_267d06_Qnq = this.method_907a9d25_Qnq();
        }
        if (!bl) {
            this.field_267d06_Qnq = false;
        }
        this.field_2d2a05_aFZ = bl;
        if (this.field_267d06_Qnq) {
            this.field_2092ab_Dne = ((float)(n2 - n6) - 7.5f) / ((float)(n8 - n6) - 15.0f);
            if (this.field_2092ab_Dne < 0.0f) {
                this.field_2092ab_Dne = 0.0f;
            }
            if (this.field_2092ab_Dne > 1.0f) {
                this.field_2092ab_Dne = 1.0f;
            }
            ((FOg)this.field_36bb35e_Dne).method_ce7f5266_Dne(this.field_2092ab_Dne);
        }
        super.method_2c2cec86_Dne(n, n2, f);
        for (JcN jcN : JcN.field_835f4052_Dne) {
            if (this.method_6ef94c17_FWm(jcN, n, n2)) break;
        }
        if (this.field_379ef71_Dne != null && field_20b857_DyG == JcN.field_6162a71f_Zpi.method_7a46288d_Dne() && this.method_c6b5263e_Dne(this.field_379ef71_Dne.field_2d29f4_aFZ, this.field_379ef71_Dne.field_388da6_zGp, 16, 16, n, n2)) {
            this.method_fbd61744_Dne(irb.method_2310d392_Dne().method_39193c_Dne("inventory.binSlot"), n, n2);
        }
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glDisable(2896);
    }

    public VXB(FiG fiG) {
        super(new FOg(fiG));
        fiG.field_20257f3d_FWm = this.field_36bb35e_Dne;
        this.field_21261e_FWm = true;
        fiG.method_df3461c5_Dne(qlg.field_36522b5_Dne, 1);
        this.field_267cf5_Qnq = 136;
        this.field_2092ae_Dne = 195;
    }

    private void method_50083c73_FWm(JcN jcN) {
        int n = field_20b857_DyG;
        field_20b857_DyG = jcN.method_7a46288d_Dne();
        FOg fOg = (FOg)this.field_36bb35e_Dne;
        this.field_83b48b6a_Dne.clear();
        fOg.field_f27c122c_Dne.clear();
        jcN.method_ea14418b_Dne(fOg.field_f27c122c_Dne);
        if (jcN == JcN.field_6162a71f_Zpi) {
            Pdb pdb = this.field_493682ed_Dne.field_369f6b6_Dne.field_36bb35e_Dne;
            if (this.field_6a0474ed_FWm == null) {
                this.field_6a0474ed_FWm = fOg.field_7eb83e1f_bzF;
            }
            fOg.field_7eb83e1f_bzF = new ArrayList();
            for (int i = 0; i < pdb.field_7eb83e1f_bzF.size(); ++i) {
                int n2;
                int n3;
                int n4;
                uod uod2 = new uod(this, (onZ)pdb.field_7eb83e1f_bzF.get(i), i);
                fOg.field_7eb83e1f_bzF.add(uod2);
                if (i >= 5 && i < 9) {
                    n4 = i - 5;
                    n3 = n4 / 2;
                    n2 = n4 % 2;
                    uod2.field_2d29f4_aFZ = 9 + n3 * 54;
                    uod2.field_388da6_zGp = 6 + n2 * 27;
                    continue;
                }
                if (i >= 0 && i < 5) {
                    uod2.field_388da6_zGp = -2000;
                    uod2.field_2d29f4_aFZ = -2000;
                    continue;
                }
                if (i >= pdb.field_7eb83e1f_bzF.size()) continue;
                n4 = i - 9;
                n3 = n4 % 9;
                n2 = n4 / 9;
                uod2.field_2d29f4_aFZ = 9 + n3 * 18;
                uod2.field_388da6_zGp = i >= 36 ? 112 : 54 + n2 * 18;
            }
            this.field_379ef71_Dne = new onZ(field_37a3550_Dne, 0, 173, 112);
            fOg.field_7eb83e1f_bzF.add(this.field_379ef71_Dne);
        } else if (n == JcN.field_6162a71f_Zpi.method_7a46288d_Dne()) {
            fOg.field_7eb83e1f_bzF = this.field_6a0474ed_FWm;
            this.field_6a0474ed_FWm = null;
        }
        if (this.field_3787699_Dne != null) {
            if (jcN == JcN.field_f09ab1ef_zGp) {
                this.field_3787699_Dne.method_87b77874_aFZ(true);
                this.field_3787699_Dne.method_7ed9b9d3_Qnq(false);
                this.field_3787699_Dne.method_117d59bb_FWm(true);
                this.field_3787699_Dne.method_8f501fe4_Dne("");
                this.method_d44b4592_zGp();
            } else {
                this.field_3787699_Dne.method_87b77874_aFZ(false);
                this.field_3787699_Dne.method_7ed9b9d3_Qnq(true);
                this.field_3787699_Dne.method_117d59bb_FWm(false);
            }
        }
        this.field_2092ab_Dne = 0.0f;
        fOg.method_ce7f5266_Dne(0.0f);
    }

    static pam method_2313c3af_Dne() {
        return field_37a3550_Dne;
    }

    @Override
    protected void method_a6aca7ca_FWm(int n, int n2, int n3) {
        if (n3 == 0) {
            int n4 = n - this.field_2d29f4_aFZ;
            int n5 = n2 - this.field_388da6_zGp;
            for (JcN jcN : JcN.field_835f4052_Dne) {
                if (!this.method_9bc38496_Dne(jcN, n4, n5)) continue;
                this.method_50083c73_FWm(jcN);
                return;
            }
        }
        super.method_a6aca7ca_FWm(n, n2, n3);
    }

    protected boolean method_6ef94c17_FWm(JcN jcN, int n, int n2) {
        int n3 = jcN.method_ae128dba_bzF();
        int n4 = 28 * n3;
        int n5 = 0;
        if (n3 == 5) {
            n4 = this.field_2092ae_Dne - 28 + 2;
        } else if (n3 > 0) {
            n4 += n3;
        }
        int n6 = jcN.method_ae128dcb_bzF() ? n5 - 32 : n5 + this.field_267cf5_Qnq;
        if (this.method_c6b5263e_Dne(n4 + 3, n6 + 3, 23, 27, n, n2)) {
            this.method_fbd61744_Dne(jcN.method_d1f1ed87_FWm(), n, n2);
            return true;
        }
        return false;
    }

    @Override
    protected void method_16cca7a_Dne(int n, int n2) {
        JcN jcN = JcN.field_835f4052_Dne[field_20b857_DyG];
        if (jcN.method_7a46289e_Dne()) {
            this.field_3791671_Dne.method_e88b55f3_FWm(jcN.method_d1f1ed87_FWm(), 8, 6, 0x404040);
        }
    }

    private boolean method_907a9d25_Qnq() {
        return field_20b857_DyG != JcN.field_6162a71f_Zpi.method_7a46288d_Dne() && JcN.field_835f4052_Dne[field_20b857_DyG].method_7c6f603d_FWm() && ((FOg)this.field_36bb35e_Dne).method_7a46289e_Dne();
    }

    @Override
    public void method_ae128dc7_bzF() {
        if (!this.field_493682ed_Dne.field_36c390e_Dne.method_a98a0664_aFZ()) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(new gTB(this.field_493682ed_Dne.field_369f6b6_Dne));
        }
    }

    @Override
    protected void method_2c02b146_Dne(float f, int n, int n2) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        Cit.method_ae128dc7_bzF();
        JcN jcN = JcN.field_835f4052_Dne[field_20b857_DyG];
        for (JcN jcN2 : JcN.field_835f4052_Dne) {
            this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/allitems.png");
            if (jcN2.method_7a46288d_Dne() == field_20b857_DyG) continue;
            this.method_76b488b2_Dne(jcN2);
        }
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/creative_inv/" + jcN.method_6859cdb9_bzF());
        this.method_17d7ea99_FWm(this.field_2d29f4_aFZ, this.field_388da6_zGp, 0, 0, this.field_2092ae_Dne, this.field_267cf5_Qnq);
        this.field_3787699_Dne.method_907a9d21_Qnq();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        int n3 = this.field_2d29f4_aFZ + 175;
        int n4 = this.field_388da6_zGp + 18;
        int n5 = n4 + 112;
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/allitems.png");
        if (jcN.method_7c6f603d_FWm()) {
            this.method_17d7ea99_FWm(n3, n4 + (int)((float)(n5 - n4 - 17) * this.field_2092ab_Dne), 232 + (this.method_907a9d25_Qnq() ? 0 : 12), 0, 12, 15);
        }
        this.method_76b488b2_Dne(jcN);
        if (jcN == JcN.field_6162a71f_Zpi) {
            gTB.method_90e03f57_Dne(this.field_493682ed_Dne, this.field_2d29f4_aFZ + 43, this.field_388da6_zGp + 45, 20, this.field_2d29f4_aFZ + 43 - n, this.field_388da6_zGp + 45 - 30 - n2);
        }
    }

    @Override
    public void method_907a9d21_Qnq() {
        super.method_907a9d21_Qnq();
        int n = Mouse.getEventDWheel();
        if (n != 0 && this.method_907a9d25_Qnq()) {
            int n2 = ((FOg)this.field_36bb35e_Dne).field_f27c122c_Dne.size() / 9 - 5 + 1;
            if (n > 0) {
                n = 1;
            }
            if (n < 0) {
                n = -1;
            }
            this.field_2092ab_Dne = (float)((double)this.field_2092ab_Dne - (double)n / (double)n2);
            if (this.field_2092ab_Dne < 0.0f) {
                this.field_2092ab_Dne = 0.0f;
            }
            if (this.field_2092ab_Dne > 1.0f) {
                this.field_2092ab_Dne = 1.0f;
            }
            ((FOg)this.field_36bb35e_Dne).method_ce7f5266_Dne(this.field_2092ab_Dne);
        }
    }

    @Override
    public void method_7c6f6039_FWm() {
        super.method_7c6f6039_FWm();
        if (this.field_493682ed_Dne.field_369f6b6_Dne != null && this.field_493682ed_Dne.field_369f6b6_Dne.field_36a059b_Dne != null) {
            this.field_493682ed_Dne.field_369f6b6_Dne.field_36bb35e_Dne.method_8b2b635b_FWm(this.field_367c64a_Dne);
        }
        Keyboard.enableRepeatEvents(false);
    }

    public int method_7a46288d_Dne() {
        return field_20b857_DyG;
    }

    protected boolean method_9bc38496_Dne(JcN jcN, int n, int n2) {
        int n3 = jcN.method_ae128dba_bzF();
        int n4 = 28 * n3;
        int n5 = 0;
        if (n3 == 5) {
            n4 = this.field_2092ae_Dne - 28 + 2;
        } else if (n3 > 0) {
            n4 += n3;
        }
        int n6 = jcN.method_ae128dcb_bzF() ? n5 - 32 : n5 + this.field_267cf5_Qnq;
        return n >= n4 && n <= n4 + 28 && n2 >= n6 && n2 <= n6 + 32;
    }

    @Override
    protected void method_3c094077_Dne(onZ onZ2, int n, int n2, int n3) {
        this.field_388db7_zGp = true;
        boolean bl = n3 == 1;
        int n4 = n3 = n == -999 && n3 == 0 ? 4 : n3;
        if (onZ2 == null && field_20b857_DyG != JcN.field_6162a71f_Zpi.method_7a46288d_Dne() && n3 != 5) {
            MOS mOS = this.field_493682ed_Dne.field_369f6b6_Dne.field_36a059b_Dne;
            if (mOS.method_f87a5498_FWm() != null) {
                if (n2 == 0) {
                    this.field_493682ed_Dne.field_369f6b6_Dne.method_c9a088b8_Dne(mOS.method_f87a5498_FWm());
                    this.field_493682ed_Dne.field_36c390e_Dne.method_7c61cf15_Dne(mOS.method_f87a5498_FWm());
                    mOS.method_7c61cf15_Dne(null);
                }
                if (n2 == 1) {
                    NMq nMq = mOS.method_f87a5498_FWm().method_9e6e1a08_Dne(1);
                    this.field_493682ed_Dne.field_369f6b6_Dne.method_c9a088b8_Dne(nMq);
                    this.field_493682ed_Dne.field_36c390e_Dne.method_7c61cf15_Dne(nMq);
                    if (mOS.method_f87a5498_FWm().field_2092ae_Dne == 0) {
                        mOS.method_7c61cf15_Dne(null);
                    }
                }
            }
        } else if (onZ2 == this.field_379ef71_Dne && bl) {
            for (int i = 0; i < this.field_493682ed_Dne.field_369f6b6_Dne.field_36bb35e_Dne.method_adea226d_Dne().size(); ++i) {
                this.field_493682ed_Dne.field_36c390e_Dne.method_fd8868e_Dne(null, i);
            }
        } else if (field_20b857_DyG == JcN.field_6162a71f_Zpi.method_7a46288d_Dne()) {
            if (onZ2 == this.field_379ef71_Dne) {
                this.field_493682ed_Dne.field_369f6b6_Dne.field_36a059b_Dne.method_7c61cf15_Dne(null);
            } else if (n3 == 4 && onZ2 != null && onZ2.method_7a46289e_Dne()) {
                NMq nMq = onZ2.method_9e6e1a08_Dne(n2 == 0 ? 1 : onZ2.method_23040479_Dne().method_7c6f602c_FWm());
                this.field_493682ed_Dne.field_369f6b6_Dne.method_c9a088b8_Dne(nMq);
                this.field_493682ed_Dne.field_36c390e_Dne.method_7c61cf15_Dne(nMq);
            } else if (n3 == 4 && this.field_493682ed_Dne.field_369f6b6_Dne.field_36a059b_Dne.method_f87a5498_FWm() != null) {
                this.field_493682ed_Dne.field_369f6b6_Dne.method_c9a088b8_Dne(this.field_493682ed_Dne.field_369f6b6_Dne.field_36a059b_Dne.method_f87a5498_FWm());
                this.field_493682ed_Dne.field_36c390e_Dne.method_7c61cf15_Dne(this.field_493682ed_Dne.field_369f6b6_Dne.field_36a059b_Dne.method_f87a5498_FWm());
                this.field_493682ed_Dne.field_369f6b6_Dne.field_36a059b_Dne.method_7c61cf15_Dne(null);
            } else {
                this.field_493682ed_Dne.field_369f6b6_Dne.field_36bb35e_Dne.method_a0af09b3_Dne(onZ2 == null ? n : uod.method_6b892153_Dne((uod)((uod)onZ2)).field_267cf5_Qnq, n2, n3, this.field_493682ed_Dne.field_369f6b6_Dne);
                this.field_493682ed_Dne.field_369f6b6_Dne.field_36bb35e_Dne.method_7a46289a_Dne();
            }
        } else if (n3 != 5 && onZ2.field_36a853d_Dne == field_37a3550_Dne) {
            MOS mOS = this.field_493682ed_Dne.field_369f6b6_Dne.field_36a059b_Dne;
            NMq nMq = mOS.method_f87a5498_FWm();
            NMq nMq2 = onZ2.method_23040479_Dne();
            if (n3 == 2) {
                if (nMq2 != null && n2 >= 0 && n2 < 9) {
                    NMq nMq3 = nMq2.method_23040479_Dne();
                    nMq3.field_2092ae_Dne = nMq3.method_7c6f602c_FWm();
                    this.field_493682ed_Dne.field_369f6b6_Dne.field_36a059b_Dne.method_6e3a6b66_Dne(n2, nMq3);
                    this.field_493682ed_Dne.field_369f6b6_Dne.field_36bb35e_Dne.method_7a46289a_Dne();
                }
                return;
            }
            if (n3 == 3) {
                if (mOS.method_f87a5498_FWm() == null && onZ2.method_7a46289e_Dne()) {
                    NMq nMq4 = onZ2.method_23040479_Dne().method_23040479_Dne();
                    nMq4.field_2092ae_Dne = nMq4.method_7c6f602c_FWm();
                    mOS.method_7c61cf15_Dne(nMq4);
                }
                return;
            }
            if (n3 == 4) {
                if (nMq2 != null) {
                    NMq nMq5 = nMq2.method_23040479_Dne();
                    nMq5.field_2092ae_Dne = n2 == 0 ? 1 : nMq5.method_7c6f602c_FWm();
                    this.field_493682ed_Dne.field_369f6b6_Dne.method_c9a088b8_Dne(nMq5);
                    this.field_493682ed_Dne.field_36c390e_Dne.method_7c61cf15_Dne(nMq5);
                }
                return;
            }
            if (nMq != null && nMq2 != null && nMq.method_7c61cf19_Dne(nMq2)) {
                if (n2 == 0) {
                    if (bl) {
                        nMq.field_2092ae_Dne = nMq.method_7c6f602c_FWm();
                    } else if (nMq.field_2092ae_Dne < nMq.method_7c6f602c_FWm()) {
                        ++nMq.field_2092ae_Dne;
                    }
                } else if (nMq.field_2092ae_Dne <= 1) {
                    mOS.method_7c61cf15_Dne(null);
                } else {
                    --nMq.field_2092ae_Dne;
                }
            } else if (nMq2 != null && nMq == null) {
                mOS.method_7c61cf15_Dne(NMq.method_c9a1f574_Dne(nMq2));
                nMq = mOS.method_f87a5498_FWm();
                if (bl) {
                    nMq.field_2092ae_Dne = nMq.method_7c6f602c_FWm();
                }
            } else {
                mOS.method_7c61cf15_Dne(null);
            }
        } else {
            this.field_36bb35e_Dne.method_a0af09b3_Dne(onZ2 == null ? n : onZ2.field_267cf5_Qnq, n2, n3, this.field_493682ed_Dne.field_369f6b6_Dne);
            if (Pdb.method_117d19dd_FWm(n2) == 2) {
                for (int i = 0; i < 9; ++i) {
                    this.field_493682ed_Dne.field_36c390e_Dne.method_fd8868e_Dne(this.field_36bb35e_Dne.method_9e7d935f_Dne(45 + i).method_23040479_Dne(), 36 + i);
                }
            } else if (onZ2 != null) {
                NMq nMq = this.field_36bb35e_Dne.method_9e7d935f_Dne(onZ2.field_267cf5_Qnq).method_23040479_Dne();
                this.field_493682ed_Dne.field_36c390e_Dne.method_fd8868e_Dne(nMq, onZ2.field_267cf5_Qnq - this.field_36bb35e_Dne.field_7eb83e1f_bzF.size() + 9 + 36);
            }
        }
    }

    @Override
    protected void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        if (n3 == 0) {
            int n4 = n - this.field_2d29f4_aFZ;
            int n5 = n2 - this.field_388da6_zGp;
            for (JcN jcN : JcN.field_835f4052_Dne) {
                if (!this.method_9bc38496_Dne(jcN, n4, n5)) continue;
                return;
            }
        }
        super.method_2c2cf7c9_Dne(n, n2, n3);
    }

    private void method_d44b4592_zGp() {
        FOg fOg = (FOg)this.field_36bb35e_Dne;
        fOg.field_f27c122c_Dne.clear();
        for (dEr dEr2 : dEr.field_836aa5b6_Dne) {
            if (dEr2 == null || dEr2.method_23028156_Dne() == null) continue;
            dEr2.method_d88f4bf4_Dne(dEr2.field_267cf5_Qnq, null, fOg.field_f27c122c_Dne);
        }
        for (ycv iterator2 : ycv.field_8374a29b_Dne) {
            if (iterator2 == null || iterator2.field_36466e4_Dne == null) continue;
            dEr.field_374f605_Dne.method_718633ac_Dne(iterator2, fOg.field_f27c122c_Dne);
        }
        Iterator iterator = fOg.field_f27c122c_Dne.iterator();
        String string = this.field_3787699_Dne.method_eecad346_Dne().toLowerCase();
        while (iterator.hasNext()) {
            NMq nMq = (NMq)iterator.next();
            boolean bl = false;
            for (Object obj : nMq.method_38697b96_Dne(this.field_493682ed_Dne.field_369f6b6_Dne, this.field_493682ed_Dne.field_3758af7_Dne.field_342275_ooe)) {String string2 = (String) obj;
                if (!string2.toLowerCase().contains(string)) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            iterator.remove();
        }
        this.field_2092ab_Dne = 0.0f;
        fOg.method_ce7f5266_Dne(0.0f);
    }

    protected void method_76b488b2_Dne(JcN jcN) {
        boolean bl = jcN.method_7a46288d_Dne() == field_20b857_DyG;
        boolean bl2 = jcN.method_ae128dcb_bzF();
        int n = jcN.method_ae128dba_bzF();
        int n2 = n * 28;
        int n3 = 0;
        int n4 = this.field_2d29f4_aFZ + 28 * n;
        int n5 = this.field_388da6_zGp;
        int n6 = 32;
        if (bl) {
            n3 += 32;
        }
        if (n == 5) {
            n4 = this.field_2d29f4_aFZ + this.field_2092ae_Dne - 28;
        } else if (n > 0) {
            n4 += n;
        }
        if (bl2) {
            n5 -= 28;
        } else {
            n3 += 64;
            n5 += this.field_267cf5_Qnq - 4;
        }
        GL11.glDisable(2896);
        this.method_17d7ea99_FWm(n4, n5, n2, n3, 28, n6);
        this.field_21260a_FWm = 100.0f;
        VXB.field_374e248_Dne.field_2e5f18_bzF = 100.0f;
        int n7 = bl2 ? 1 : -1;
        GL11.glEnable(2896);
        GL11.glEnable(32826);
        NMq nMq = new NMq(jcN.method_230de6ba_Dne());
        field_374e248_Dne.method_5ae7aca8_FWm(this.field_3791671_Dne, this.field_493682ed_Dne.field_36d36bf_Dne, nMq, n4 += 6, n5 += 8 + n7);
        field_374e248_Dne.method_f14f8cda_bzF(this.field_3791671_Dne, this.field_493682ed_Dne.field_36d36bf_Dne, nMq, n4, n5);
        GL11.glDisable(2896);
        VXB.field_374e248_Dne.field_2e5f18_bzF = 0.0f;
        this.field_21260a_FWm = 0.0f;
    }

    @Override
    protected void method_16a1040_Dne(char c, int n) {
        if (field_20b857_DyG != JcN.field_f09ab1ef_zGp.method_7a46288d_Dne()) {
            if (fZI.method_c08fa79d_Dne(this.field_493682ed_Dne.field_3758af7_Dne.field_142575c8_div)) {
                this.method_50083c73_FWm(JcN.field_f09ab1ef_zGp);
            } else {
                super.method_16a1040_Dne(c, n);
            }
        } else {
            if (this.field_388db7_zGp) {
                this.field_388db7_zGp = false;
                this.field_3787699_Dne.method_8f501fe4_Dne("");
            }
            if (!this.method_ce7f5dad_Dne(n)) {
                if (this.field_3787699_Dne.method_16a1044_Dne(c, n)) {
                    this.method_d44b4592_zGp();
                } else {
                    super.method_16a1040_Dne(c, n);
                }
            }
        }
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2d29f4_aFZ == 0) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(new apb(this.field_493682ed_Dne.field_3673fc1_Dne));
        }
        if (pee_02.field_2d29f4_aFZ == 1) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(new ZyA(this, this.field_493682ed_Dne.field_3673fc1_Dne));
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        if (this.field_493682ed_Dne.field_36c390e_Dne.method_a98a0664_aFZ()) {
            super.method_7a46289a_Dne();
            this.field_f27c122c_Dne.clear();
            Keyboard.enableRepeatEvents(true);
            this.field_3787699_Dne = new mHN(this.field_3791671_Dne, this.field_2d29f4_aFZ + 82, this.field_388da6_zGp + 6, 89, this.field_3791671_Dne.field_2092ae_Dne);
            this.field_3787699_Dne.method_87b738a3_aFZ(15);
            this.field_3787699_Dne.method_ce7f9d7a_Dne(false);
            this.field_3787699_Dne.method_87b77874_aFZ(false);
            this.field_3787699_Dne.method_b51ddfb1_zGp(0xFFFFFF);
            int n = field_20b857_DyG;
            field_20b857_DyG = -1;
            this.method_50083c73_FWm(JcN.field_835f4052_Dne[n]);
            this.field_367c64a_Dne = new GpK(this.field_493682ed_Dne);
            this.field_493682ed_Dne.field_369f6b6_Dne.field_36bb35e_Dne.method_b1d7af9a_Dne(this.field_367c64a_Dne);
        } else {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(new gTB(this.field_493682ed_Dne.field_369f6b6_Dne));
        }
    }
}

