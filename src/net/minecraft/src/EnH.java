package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EnH
implements ZfC {
    private List<qMV> field_f27c122c_Dne;
    private YHU field_36f6006_Dne;
    public boolean field_2092bf_Dne = true;
    private Tfm field_36d8db1_Dne;
    private qMV field_37a5bd2_Dne;
    private Set field_83b48b6a_Dne = new HashSet();
    private ZfC field_37042d5_Dne;
    private RAN field_36c164d_Dne;

    private void method_b80f26cd_Dne(qMV qMV2) {
        if (this.field_36f6006_Dne != null) {
            try {
                this.field_36f6006_Dne.method_e0b07f53_FWm(this.field_36c164d_Dne, qMV2);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    @Override
    public EyB method_2849cfe9_Dne(Qnq qnq, String string, int n, int n2, int n3) {
        return this.field_37042d5_Dne.method_2849cfe9_Dne(qnq, string, n, n2, n3);
    }

    @Override
    public qMV method_90569c11_Dne(int n, int n2) {
        qMV qMV2 = (qMV)this.field_36d8db1_Dne.method_20ed7708_Dne(Sxs.method_16cca6e_Dne(n, n2));
        return qMV2 == null ? (!this.field_36c164d_Dne.field_21261e_FWm && !this.field_2092bf_Dne ? this.field_37a5bd2_Dne : this.method_e1796070_FWm(n, n2)) : qMV2;
    }

    @Override
    public String method_eecad346_Dne() {
        return "ServerChunkCache: " + this.field_36d8db1_Dne.method_7a46288d_Dne() + " Drop: " + this.field_83b48b6a_Dne.size();
    }

    @Override
    public qMV method_e1796070_FWm(int n, int n2) {
        long l = Sxs.method_16cca6e_Dne(n, n2);
        this.field_83b48b6a_Dne.remove(l);
        qMV qMV2 = (qMV)this.field_36d8db1_Dne.method_20ed7708_Dne(l);
        if (qMV2 == null) {
            qMV2 = this.method_dcfbab7e_bzF(n, n2);
            if (qMV2 == null) {
                if (this.field_37042d5_Dne == null) {
                    qMV2 = this.field_37a5bd2_Dne;
                } else {
                    try {
                        qMV2 = this.field_37042d5_Dne.method_90569c11_Dne(n, n2);
                    }
                    catch (Throwable throwable) {
                        McM mcM = McM.method_948e60df_Dne(throwable, "Exception generating new chunk");
                        Noo noo = mcM.method_284dc627_Dne("Chunk to be generated");
                        noo.method_5e295ec0_Dne("Location", String.format("%d,%d", n, n2));
                        noo.method_5e295ec0_Dne("Position hash", l);
                        noo.method_5e295ec0_Dne("Generator", this.field_37042d5_Dne.method_eecad346_Dne());
                        throw new kaJ(mcM);
                    }
                }
            }
            this.field_36d8db1_Dne.method_b9998ac6_Dne(l, qMV2);
            this.field_f27c122c_Dne.add(qMV2);
            if (qMV2 != null) {
                qMV2.method_ae128dc7_bzF();
            }
            qMV2.method_38f7343a_Dne(this, this, n, n2);
        }
        return qMV2;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return !this.field_36c164d_Dne.field_388db7_zGp;
    }

    @Override
    public void method_7a46289a_Dne() {
        if (this.field_36f6006_Dne != null) {
            this.field_36f6006_Dne.method_7c6f6039_FWm();
        }
    }

    public void method_1e269659_FWm(int n, int n2) {
        if (this.field_36c164d_Dne.field_3690d00_Dne.method_7c6f603d_FWm()) {
            iSh iSh2 = this.field_36c164d_Dne.method_23105fed_Dne();
            int n3 = n * 16 + 8 - iSh2.field_2092ae_Dne;
            int n4 = n2 * 16 + 8 - iSh2.field_2e5f1b_bzF;
            int n5 = 128;
            if (n3 < -n5 || n3 > n5 || n4 < -n5 || n4 > n5) {
                this.field_83b48b6a_Dne.add(Sxs.method_16cca6e_Dne(n, n2));
            }
        } else {
            this.field_83b48b6a_Dne.add(Sxs.method_16cca6e_Dne(n, n2));
        }
    }

    @Override
    public boolean method_16cca7e_Dne(int n, int n2) {
        return this.field_36d8db1_Dne.method_ce7f616e_Dne(Sxs.method_16cca6e_Dne(n, n2));
    }

    @Override
    public int method_7a46288d_Dne() {
        return this.field_36d8db1_Dne.method_7a46288d_Dne();
    }

    @Override
    public void method_16cca7a_Dne(int n, int n2) {
    }

    public void method_7c6f6039_FWm() {
        for (qMV qMV2 : this.field_f27c122c_Dne) {
            this.method_1e269659_FWm(qMV2.field_2092ae_Dne, qMV2.field_21260d_FWm);
        }
    }

    private void method_9162da8e_FWm(qMV qMV2) {
        if (this.field_36f6006_Dne != null) {
            try {
                qMV2.field_2092af_Dne = this.field_36c164d_Dne.method_7c6f602d_FWm();
                this.field_36f6006_Dne.method_21550274_Dne(this.field_36c164d_Dne, qMV2);
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            catch (div div2) {
                div2.printStackTrace();
            }
        }
    }

    @Override
    public List method_c5f979a2_Dne(Icc icc, int n, int n2, int n3) {
        return this.field_37042d5_Dne.method_c5f979a2_Dne(icc, n, n2, n3);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        if (!this.field_36c164d_Dne.field_388db7_zGp) {
            for (int i = 0; i < 100; ++i) {
                if (this.field_83b48b6a_Dne.isEmpty()) continue;
                Long l = (Long)this.field_83b48b6a_Dne.iterator().next();
                qMV qMV2 = (qMV)this.field_36d8db1_Dne.method_20ed7708_Dne(l);
                qMV2.method_907a9d21_Qnq();
                this.method_9162da8e_FWm(qMV2);
                this.method_b80f26cd_Dne(qMV2);
                this.field_83b48b6a_Dne.remove(l);
                this.field_36d8db1_Dne.method_a2a9a4e7_FWm(l);
                this.field_f27c122c_Dne.remove(qMV2);
            }
            if (this.field_36f6006_Dne != null) {
                this.field_36f6006_Dne.method_7a46289a_Dne();
            }
        }
        return this.field_37042d5_Dne.method_7a46289e_Dne();
    }

    @Override
    public void method_a5c3b570_Dne(ZfC zfC, int n, int n2) {
        qMV qMV2 = this.method_90569c11_Dne(n, n2);
        if (!qMV2.field_2e5f2c_bzF) {
            qMV2.field_2e5f2c_bzF = true;
            if (this.field_37042d5_Dne != null) {
                this.field_37042d5_Dne.method_a5c3b570_Dne(zfC, n, n2);
                qMV2.method_a98a0660_aFZ();
            }
        }
    }

    @Override
    public boolean method_5f7a671f_Dne(boolean bl, TaY taY) {
        int n = 0;
        for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
            qMV qMV2 = (qMV)this.field_f27c122c_Dne.get(i);
            if (bl) {
                this.method_b80f26cd_Dne(qMV2);
            }
            if (!qMV2.method_ce7f9d7e_Dne(bl)) continue;
            this.method_9162da8e_FWm(qMV2);
            qMV2.field_267d06_Qnq = false;
            if (++n != 24 || bl) continue;
            return false;
        }
        return true;
    }

    private qMV method_dcfbab7e_bzF(int n, int n2) {
        if (this.field_36f6006_Dne == null) {
            return null;
        }
        try {
            qMV qMV2 = this.field_36f6006_Dne.method_4fcc354a_Dne(this.field_36c164d_Dne, n, n2);
            if (qMV2 != null) {
                qMV2.field_2092af_Dne = this.field_36c164d_Dne.method_7c6f602d_FWm();
                if (this.field_37042d5_Dne != null) {
                    this.field_37042d5_Dne.method_16cca7a_Dne(n, n2);
                }
            }
            return qMV2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public EnH(RAN rAN, YHU yHU, ZfC zfC) {
        this.field_36d8db1_Dne = new Tfm();
        this.field_f27c122c_Dne = new ArrayList();
        this.field_37a5bd2_Dne = new BJH(rAN, 0, 0);
        this.field_36c164d_Dne = rAN;
        this.field_36f6006_Dne = yHU;
        this.field_37042d5_Dne = zfC;
    }
}

