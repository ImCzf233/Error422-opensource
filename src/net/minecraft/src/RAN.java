package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class RAN
extends Qnq {
    private ZGT field_36fd085_Dne;
    private final trS field_37c4377_Dne;
    public boolean field_388db7_zGp;
    private final clp field_3747625_Dne;
    private boolean field_20b868_DyG;
    private int field_388da6_zGp = 0;
    private final jwh_0 field_3694131_Dne;
    private final wrs field_37da474_Dne;
    private TreeSet field_36bd63a8_Dne;
    public EnH field_366d5ad_Dne;
    private Set field_da244c89_FWm;
    private ArrayList field_dc9cb15_Dne;
    private eGv[] field_836b2213_Dne = new eGv[]{new eGv((JLE)null), new eGv((JLE)null)};
    private int field_20b857_DyG = 0;
    private static final fKu[] field_836ba557_Dne = new fKu[]{new fKu(dEr.field_d2b52a0a_oIf.field_267cf5_Qnq, 0, 1, 3, 10), new fKu(zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 1, 3, 10), new fKu(zKP.field_af0f1368_udO.field_21260d_FWm, 0, 1, 3, 10), new fKu(dEr.field_71a36e2a_Vxn.field_267cf5_Qnq, 0, 1, 1, 3), new fKu(dEr.field_ab2d1d11_ooe.field_267cf5_Qnq, 0, 1, 1, 5), new fKu(dEr.field_35d3b944_ATE.field_267cf5_Qnq, 0, 1, 1, 3), new fKu(dEr.field_af0500d6_udO.field_267cf5_Qnq, 0, 1, 1, 5), new fKu(dEr.field_7137dca1_aFZ.field_267cf5_Qnq, 0, 2, 3, 5), new fKu(dEr.field_7785c591_rPc.field_267cf5_Qnq, 0, 2, 3, 3)};

    protected void method_8c9e522b_FWm(mrb mrb2) {
        if (!this.field_3690d00_Dne.method_7c6f603d_FWm()) {
            this.field_37e0a6a_Dne.method_2c2cf7c9_Dne(0, this.field_3690d00_Dne.method_7a46288d_Dne(), 0);
        } else {
            this.field_21261e_FWm = true;
            tgc tgc2 = this.field_3690d00_Dne.field_37c1c1c_Dne;
            List list = tgc2.method_adea226d_Dne();
            Random random = new Random(this.method_7a46288e_Dne());
            EyB eyB = tgc2.method_962b7b29_Dne(0, 0, 256, list, random);
            int n = 0;
            int n2 = this.field_3690d00_Dne.method_7a46288d_Dne();
            int n3 = 0;
            if (eyB != null) {
                n = eyB.field_2092ae_Dne;
                n3 = eyB.field_2e5f1b_bzF;
            } else {
                this.method_230e0120_Dne().method_110c4dc3_FWm("Unable to find spawn biome");
            }
            int n4 = 0;
            while (!this.field_3690d00_Dne.method_16cca7e_Dne(n, n3)) {
                n += random.nextInt(64) - random.nextInt(64);
                n3 += random.nextInt(64) - random.nextInt(64);
                if (++n4 != 1000) continue;
            }
            this.field_37e0a6a_Dne.method_2c2cf7c9_Dne(n, n2, n3);
            this.field_21261e_FWm = false;
            if (mrb2.method_7a46289e_Dne()) {
                this.method_c3b4a2d0_ooe();
            }
        }
    }

    @Override
    protected void method_b0a28144_div() {
        super.method_b0a28144_div();
        int n = 0;
        int n2 = 0;
        for (Sxs sxs : this.field_83b48b6a_Dne) {
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            int n8 = sxs.field_2092ae_Dne * 16;
            int n9 = sxs.field_21260d_FWm * 16;
            this.field_365731d_Dne.method_8f501fe4_Dne("getChunk");
            qMV qMV2 = this.method_e1796070_FWm(sxs.field_2092ae_Dne, sxs.field_21260d_FWm);
            this.method_f322b0ed_Dne(n8, n9, qMV2);
            this.field_365731d_Dne.method_110c4dc3_FWm("tickChunk");
            qMV2.method_d44b4592_zGp();
            this.field_365731d_Dne.method_110c4dc3_FWm("thunder");
            if (this.field_7331eae7_Dne.nextInt(100000) == 0 && this.method_ae128dcb_bzF() && this.method_7c6f603d_FWm()) {
                this.field_21260d_FWm = this.field_21260d_FWm * 3 + 1013904223;
                n7 = this.field_21260d_FWm >> 2;
                n6 = n8 + (n7 & 0xF);
                n5 = n9 + (n7 >> 8 & 0xF);
                n4 = this.method_5c563934_Qnq(n6, n5);
                if (this.method_f2b15eb2_udO(n6, n4, n5)) {
                    this.method_bb7dd824_Dne(new xIh(this, n6, n4, n5));
                }
            }
            this.field_365731d_Dne.method_110c4dc3_FWm("iceandsnow");
            if (this.field_7331eae7_Dne.nextInt(16) == 0) {
                Object object;
                this.field_21260d_FWm = this.field_21260d_FWm * 3 + 1013904223;
                n7 = this.field_21260d_FWm >> 2;
                n6 = n7 & 0xF;
                n5 = n7 >> 8 & 0xF;
                n4 = this.method_5c563934_Qnq(n6 + n8, n5 + n9);
                if (this.method_2b9d316e_XHL(n6 + n8, n4 - 1, n5 + n9)) {
                    this.method_2ee8c47d_FWm(n6 + n8, n4 - 1, n5 + n9, zKP.field_c4c81e9d_xEx.field_21260d_FWm);
                }
                if (this.method_ae128dcb_bzF() && this.method_8d69c8a5_Zpi(n6 + n8, n4, n5 + n9)) {
                    this.method_2ee8c47d_FWm(n6 + n8, n4, n5 + n9, zKP.field_23a1e80a_EwP.field_21260d_FWm);
                }
                if (this.method_ae128dcb_bzF() && ((OdI)(object = this.method_90477c37_Dne(n6 + n8, n5 + n9))).method_7c6f603d_FWm() && (n3 = this.method_2c2cf7bc_Dne(n6 + n8, n4 - 1, n5 + n9)) != 0) {
                    zKP.field_8374b848_Dne[n3].method_52f8ce2d_a_(this, n6 + n8, n4 - 1, n5 + n9);
                }
            }
            this.field_365731d_Dne.method_110c4dc3_FWm("tickTiles");
            for (cHy cHy2 : qMV2.method_57027af4_Dne()) {
                if (cHy2 == null || !cHy2.method_7c6f603d_FWm()) continue;
                for (int i = 0; i < 3; ++i) {
                    this.field_21260d_FWm = this.field_21260d_FWm * 3 + 1013904223;
                    n3 = this.field_21260d_FWm >> 2;
                    int n10 = n3 & 0xF;
                    int n11 = n3 >> 8 & 0xF;
                    int n12 = n3 >> 16 & 0xF;
                    int n13 = cHy2.method_2c2cf7bc_Dne(n10, n12, n11);
                    ++n2;
                    zKP zKP2 = zKP.field_8374b848_Dne[n13];
                    if (zKP2 == null || !zKP2.method_8288d6f2_IjH()) continue;
                    ++n;
                    zKP2.method_ca828a1c_Dne(this, n10 + n8, n12 + cHy2.method_7a46288d_Dne(), n11 + n9, this.field_7331eae7_Dne);
                }
            }
            this.field_365731d_Dne.method_7c6f6039_FWm();
        }
    }

    public trS method_2315d1d6_Dne() {
        return this.field_37c4377_Dne;
    }

    @Override
    public boolean method_ce7f9d7e_Dne(boolean bl) {
        Vxn vxn;
        int n = this.field_36bd63a8_Dne.size();
        if (n != this.field_da244c89_FWm.size()) {
            throw new IllegalStateException("TickNextTick list out of synch");
        }
        if (n > 1000) {
            n = 1000;
        }
        this.field_365731d_Dne.method_8f501fe4_Dne("cleaning");
        for (int i = 0; i < n; ++i) {
            vxn = (Vxn)this.field_36bd63a8_Dne.first();
            if (!bl && vxn.field_2092af_Dne > this.field_37e0a6a_Dne.method_7c6f602d_FWm()) break;
            this.field_36bd63a8_Dne.remove(vxn);
            this.field_da244c89_FWm.remove(vxn);
            this.field_dc9cb15_Dne.add(vxn);
        }
        this.field_365731d_Dne.method_7c6f6039_FWm();
        this.field_365731d_Dne.method_8f501fe4_Dne("ticking");
        Iterator iterator = this.field_dc9cb15_Dne.iterator();
        while (iterator.hasNext()) {
            vxn = (Vxn)iterator.next();
            iterator.remove();
            int n2 = 0;
            if (this.method_c6b5263e_Dne(vxn.field_2092ae_Dne - n2, vxn.field_21260d_FWm - n2, vxn.field_2e5f1b_bzF - n2, vxn.field_2092ae_Dne + n2, vxn.field_21260d_FWm + n2, vxn.field_2e5f1b_bzF + n2)) {
                int n3 = this.method_2c2cf7bc_Dne(vxn.field_2092ae_Dne, vxn.field_21260d_FWm, vxn.field_2e5f1b_bzF);
                if (n3 <= 0 || !zKP.method_16cca7e_Dne(n3, vxn.field_267cf5_Qnq)) continue;
                try {
                    zKP.field_8374b848_Dne[n3].method_ca828a1c_Dne(this, vxn.field_2092ae_Dne, vxn.field_21260d_FWm, vxn.field_2e5f1b_bzF, this.field_7331eae7_Dne);
                    continue;
                }
                catch (Throwable throwable) {
                    int n4;
                    McM mcM = McM.method_948e60df_Dne(throwable, "Exception while ticking a block");
                    Noo noo = mcM.method_284dc627_Dne("Block being ticked");
                    try {
                        n4 = this.method_2dee76f_bzF(vxn.field_2092ae_Dne, vxn.field_21260d_FWm, vxn.field_2e5f1b_bzF);
                    }
                    catch (Throwable throwable2) {
                        n4 = -1;
                    }
                    Noo.method_4b34e06a_Dne(noo, vxn.field_2092ae_Dne, vxn.field_21260d_FWm, vxn.field_2e5f1b_bzF, n3, n4);
                    throw new kaJ(mcM);
                }
            }
            this.method_ae303daa_FWm(vxn.field_2092ae_Dne, vxn.field_21260d_FWm, vxn.field_2e5f1b_bzF, vxn.field_267cf5_Qnq, 0);
        }
        this.field_365731d_Dne.method_7c6f6039_FWm();
        this.field_dc9cb15_Dne.clear();
        return !this.field_36bd63a8_Dne.isEmpty();
    }

    @Override
    public void method_907a9d21_Qnq() {
        int n;
        super.method_907a9d21_Qnq();
        if (this.method_231798c9_Dne().method_907a9d25_Qnq() && this.field_2d29f4_aFZ < 3) {
            this.field_2d29f4_aFZ = 3;
        }
        this.field_3690d00_Dne.field_37c1c1c_Dne.method_7a46289a_Dne();
        if (this.method_a98a0664_aFZ()) {
            n = 0;
            if (!this.field_2e5f2c_bzF || this.field_2d29f4_aFZ >= 1) {
                // empty if block
            }
            if (n == 0) {
                long l = this.field_37e0a6a_Dne.method_ae128dbb_bzF() + 24000L;
                this.field_37e0a6a_Dne.method_117d1dab_FWm(l - l % 24000L);
                this.method_baa39402_kGO();
            }
        }
        this.field_365731d_Dne.method_8f501fe4_Dne("mobSpawner");
        if (this.method_230cbc5a_Dne().method_8f501fe8_Dne("doMobSpawning")) {
            ooe.method_b3e08cbf_Dne(this, this.field_2e5f2c_bzF, this.field_267d06_Qnq, this.field_37e0a6a_Dne.method_7c6f602d_FWm() % 400L == 0L);
        }
        this.field_365731d_Dne.method_110c4dc3_FWm("chunkSource");
        this.field_37042d5_Dne.method_7a46289e_Dne();
        n = this.method_ce7f5259_Dne(1.0f);
        if (n != this.field_2092ae_Dne) {
            this.field_2092ae_Dne = n;
        }
        this.field_37e0a6a_Dne.method_ce7f616a_Dne(this.field_37e0a6a_Dne.method_7c6f602d_FWm() + 1L);
        this.field_37e0a6a_Dne.method_117d1dab_FWm(this.field_37e0a6a_Dne.method_ae128dbb_bzF() + 1L);
        this.field_365731d_Dne.method_110c4dc3_FWm("tickPending");
        this.method_ce7f9d7e_Dne(false);
        this.field_365731d_Dne.method_110c4dc3_FWm("tickTiles");
        this.method_b0a28144_div();
        this.field_365731d_Dne.method_110c4dc3_FWm("chunkMap");
        this.field_37da474_Dne.method_7a46289a_Dne();
        this.field_365731d_Dne.method_110c4dc3_FWm("village");
        this.field_36be6b6_Dne.method_7c6f6039_FWm();
        this.field_379663e_Dne.method_7a46289a_Dne();
        this.field_365731d_Dne.method_110c4dc3_FWm("portalForcer");
        this.field_37c4377_Dne.method_ce7f616a_Dne(this.method_7c6f602d_FWm());
        this.field_365731d_Dne.method_7c6f6039_FWm();
        this.method_998e6629_Vxn();
    }

    public void method_cc5ef5c0_trS() {
        if (this.field_37042d5_Dne.method_7c6f603d_FWm()) {
            this.field_37042d5_Dne.method_7a46289a_Dne();
        }
    }

    @Override
    public void method_9a443a99_XHL() {
        this.field_20b868_DyG = !this.field_2c197105_Qnq.isEmpty();
        for (Object obj : this.field_2c197105_Qnq) {
        	FiG fiG = (FiG) obj;
            if (fiG.method_9b310ff4_Wwe()) continue;
            this.field_20b868_DyG = false;
            break;
        }
    }

    @Override
    public void method_17d7ea99_FWm(int n, int n2, int n3, int n4, int n5, int n6) {
        Vxn vxn = new Vxn(n, n2, n3, n4);
        int n7 = 0;
        if (this.field_2092bf_Dne && n4 > 0) {
            if (zKP.field_8374b848_Dne[n4].method_d44b4596_zGp()) {
                int n8;
                if (this.method_c6b5263e_Dne(vxn.field_2092ae_Dne - n7, vxn.field_21260d_FWm - n7, vxn.field_2e5f1b_bzF - n7, vxn.field_2092ae_Dne + n7, vxn.field_21260d_FWm + n7, vxn.field_2e5f1b_bzF + n7) && (n8 = this.method_2c2cf7bc_Dne(vxn.field_2092ae_Dne, vxn.field_21260d_FWm, vxn.field_2e5f1b_bzF)) == vxn.field_267cf5_Qnq && n8 > 0) {
                    zKP.field_8374b848_Dne[n8].method_ca828a1c_Dne(this, vxn.field_2092ae_Dne, vxn.field_21260d_FWm, vxn.field_2e5f1b_bzF, this.field_7331eae7_Dne);
                }
                return;
            }
            n5 = 1;
        }
        if (this.method_c6b5263e_Dne(n - n7, n2 - n7, n3 - n7, n + n7, n2 + n7, n3 + n7)) {
            if (n4 > 0) {
                vxn.method_d358994f_Dne((long)n5 + this.field_37e0a6a_Dne.method_7c6f602d_FWm());
                vxn.method_ce7f5da9_Dne(n6);
            }
            if (!this.field_da244c89_FWm.contains(vxn)) {
                this.field_da244c89_FWm.add(vxn);
                this.field_36bd63a8_Dne.add(vxn);
            }
        }
    }

    @Override
    public void method_7c6f6039_FWm() {
        if (this.field_2c197105_Qnq.isEmpty()) {
            if (this.field_388da6_zGp++ >= 1200) {
                return;
            }
        } else {
            this.method_cd4cb3d5_udO();
        }
        super.method_7c6f6039_FWm();
    }

    public oIf method_1b920c4a_Dne(Icc icc, int n, int n2, int n3) {
        List list = this.method_f8802153_FWm().method_c5f979a2_Dne(icc, n, n2, n3);
        return list != null && !list.isEmpty() ? (oIf)nGp.method_5a3a1e72_Dne(this.field_7331eae7_Dne, list) : null;
    }

    @Override
    protected ZfC method_2309d134_Dne() {
        YHU yHU = this.field_3769502_Dne.method_c0b631c6_Dne(this.field_3690d00_Dne);
        this.field_366d5ad_Dne = new EnH(this, yHU, this.field_3690d00_Dne.method_2309d134_Dne());
        return this.field_366d5ad_Dne;
    }

    public RAN(jwh_0 jwh_02, iDE iDE2, String string, int n, mrb mrb2, Bkx bkx, dLs dLs2) {
        super(iDE2, string, mrb2, Jik.method_9e6cb0ee_Dne(n), bkx, dLs2);
        this.field_dc9cb15_Dne = new ArrayList();
        this.field_3694131_Dne = jwh_02;
        this.field_3747625_Dne = new clp(this);
        this.field_37da474_Dne = new wrs(this, jwh_02.method_230ea953_Dne().method_907a9d14_Qnq());
        if (this.field_36fd085_Dne == null) {
            this.field_36fd085_Dne = new ZGT();
        }
        if (this.field_da244c89_FWm == null) {
            this.field_da244c89_FWm = new HashSet();
        }
        if (this.field_36bd63a8_Dne == null) {
            this.field_36bd63a8_Dne = new TreeSet();
        }
        this.field_37c4377_Dne = new trS(this);
        this.field_36c9bde_Dne = new kXX(jwh_02);
        hlz hlz2 = (hlz)this.field_3698a74_Dne.method_64d498e5_Dne(hlz.class, "scoreboard");
        if (hlz2 == null) {
            hlz2 = new hlz();
            this.field_3698a74_Dne.method_65052564_Dne("scoreboard", hlz2);
        }
        hlz2.method_847193d9_Dne(this.field_36c9bde_Dne);
        ((kXX)this.field_36c9bde_Dne).method_aa78bf31_Dne(hlz2);
    }

    @Override
    public void method_135a35a7_bzF(int n, int n2, int n3, int n4, int n5, int n6) {
        Vxn vxn = new Vxn(n, n2, n3, n4);
        vxn.method_ce7f5da9_Dne(n6);
        if (n4 > 0) {
            vxn.method_d358994f_Dne((long)n5 + this.field_37e0a6a_Dne.method_7c6f602d_FWm());
        }
        if (!this.field_da244c89_FWm.contains(vxn)) {
            this.field_da244c89_FWm.add(vxn);
            this.field_36bd63a8_Dne.add(vxn);
        }
    }

    @Override
    public boolean method_58fe7b0b_bzF(int n, int n2, int n3, int n4) {
        Vxn vxn = new Vxn(n, n2, n3, n4);
        return this.field_dc9cb15_Dne.contains(vxn);
    }

    public List method_5b2c30cd_Dne(int n, int n2, int n3, int n4, int n5, int n6) {
        ArrayList<ipD> arrayList = new ArrayList<ipD>();
        for (int i = 0; i < this.field_7eb83e1f_bzF.size(); ++i) {
            ipD ipD2 = (ipD)this.field_7eb83e1f_bzF.get(i);
            if (ipD2.field_267cf5_Qnq < n || ipD2.field_2d29f4_aFZ < n2 || ipD2.field_388da6_zGp < n3 || ipD2.field_267cf5_Qnq >= n4 || ipD2.field_2d29f4_aFZ >= n5 || ipD2.field_388da6_zGp >= n6) continue;
            arrayList.add(ipD2);
        }
        return arrayList;
    }

    public boolean method_a98a0664_aFZ() {
        if (this.field_20b868_DyG && !this.field_2d2a05_aFZ) {
            FiG fiG;
            Iterator iterator = this.field_2c197105_Qnq.iterator();
            do {
                if (iterator.hasNext()) continue;
                return true;
            } while ((fiG = (FiG)iterator.next()).method_c738b198_qrB());
            return false;
        }
        return false;
    }

    protected void method_c3b4a2d0_ooe() {
        int n;
        int n2;
        int n3;
        WvN wvN = new WvN(field_836ba557_Dne, 10);
        for (int i = 0; i < 10 && !wvN.method_c3e4cb88_Dne(this, this.field_7331eae7_Dne, n3 = this.field_37e0a6a_Dne.method_7a46288d_Dne() + this.field_7331eae7_Dne.nextInt(6) - this.field_7331eae7_Dne.nextInt(6), n2 = this.method_6f304eb3_aFZ(n3, n = this.field_37e0a6a_Dne.method_ae128dba_bzF() + this.field_7331eae7_Dne.nextInt(6) - this.field_7331eae7_Dne.nextInt(6)) + 1, n); ++i) {
        }
    }

    private void method_998e6629_Vxn() {
        while (!this.field_836b2213_Dne[this.field_20b857_DyG].isEmpty()) {
            int n = this.field_20b857_DyG;
            this.field_20b857_DyG ^= 1;
            for (ceE ceE2 : (List<ceE>)this.field_836b2213_Dne[n]) {
                if (!this.method_a175c7e8_Dne(ceE2)) continue;
                this.field_3694131_Dne.method_230ea953_Dne().method_a23afa5d_Dne(ceE2.method_7a46288d_Dne(), ceE2.method_7c6f602c_FWm(), ceE2.method_ae128dba_bzF(), 64.0, this.field_3690d00_Dne.field_2092ae_Dne, new vjn_0(ceE2.method_7a46288d_Dne(), ceE2.method_7c6f602c_FWm(), ceE2.method_ae128dba_bzF(), ceE2.method_d44b4585_zGp(), ceE2.method_907a9d14_Qnq(), ceE2.method_a98a0653_aFZ()));
            }
            this.field_836b2213_Dne[n].clear();
        }
    }

    public void method_560a313_FWm(sMa sMa2, boolean bl) {
        super.method_b43ddeb4_Dne(sMa2, bl);
    }

    public jwh_0 method_2302cf90_Dne() {
        return this.field_3694131_Dne;
    }

    @Override
    public void method_b43d849c_Dne(sMa sMa2, byte by) {
        JGj jGj = new JGj(sMa2.field_2d29f4_aFZ, by);
        this.method_230e0484_Dne().method_a9258ca5_FWm(sMa2, jGj);
    }

    public clp method_230e0484_Dne() {
        return this.field_3747625_Dne;
    }

    public void method_c5287a5e_qLR() {
        this.field_3769502_Dne.method_7a46289a_Dne();
    }

    @Override
    protected void method_94d18be1_FWm(sMa sMa2) {
        super.method_94d18be1_FWm(sMa2);
        this.field_36fd085_Dne.method_bb07ce88_FWm(sMa2.field_2d29f4_aFZ);
        sMa[] sMaArray = sMa2.method_5709d0c1_Dne();
        if (sMaArray != null) {
            for (int i = 0; i < sMaArray.length; ++i) {
                this.field_36fd085_Dne.method_bb07ce88_FWm(sMaArray[i].field_2d29f4_aFZ);
            }
        }
    }

    @Override
    public List method_2a089c0_Dne(qMV qMV2, boolean bl) {
        ArrayList<Vxn> arrayList = null;
        Sxs sxs = qMV2.method_2306ebfd_Dne();
        int n = (sxs.field_2092ae_Dne << 4) - 2;
        int n2 = n + 16 + 2;
        int n3 = (sxs.field_21260d_FWm << 4) - 2;
        int n4 = n3 + 16 + 2;
        for (int i = 0; i < 2; ++i) {
            Iterator iterator;
            if (i == 0) {
                iterator = this.field_36bd63a8_Dne.iterator();
            } else {
                iterator = this.field_dc9cb15_Dne.iterator();
                if (!this.field_dc9cb15_Dne.isEmpty()) {
                    System.out.println(this.field_dc9cb15_Dne.size());
                }
            }
            while (iterator.hasNext()) {
                Vxn vxn = (Vxn)iterator.next();
                if (vxn.field_2092ae_Dne < n || vxn.field_2092ae_Dne >= n2 || vxn.field_2e5f1b_bzF < n3 || vxn.field_2e5f1b_bzF >= n4) continue;
                if (bl) {
                    this.field_da244c89_FWm.remove(vxn);
                    iterator.remove();
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<Vxn>();
                }
                arrayList.add(vxn);
            }
        }
        return arrayList;
    }

    protected void method_9feec6c2_Zpi() throws div {
        this.method_c073daf8_mrb();
        this.field_3769502_Dne.method_b34bd92c_Dne(this.field_37e0a6a_Dne, this.field_3694131_Dne.method_230ea953_Dne().method_230886fb_Dne());
        this.field_3698a74_Dne.method_7a46289a_Dne();
    }

    @Override
    public boolean method_bb7dd824_Dne(sMa sMa2) {
        if (super.method_bb7dd824_Dne(sMa2)) {
            this.field_3694131_Dne.method_230ea953_Dne().method_a23afa5d_Dne(sMa2.field_2f0dd3_div, sMa2.field_22c5fd_IjH, sMa2.field_334487_mrb, 512.0, this.field_3690d00_Dne.field_2092ae_Dne, new Rle(sMa2));
            return true;
        }
        return false;
    }

    public wrs method_231732d3_Dne() {
        return this.field_37da474_Dne;
    }

    private void method_73aaafc3_ATE() {
        this.field_37e0a6a_Dne.method_b51ddfb1_zGp(0);
        this.field_37e0a6a_Dne.method_117d59bb_FWm(false);
        this.field_37e0a6a_Dne.method_87b738a3_aFZ(0);
        this.field_37e0a6a_Dne.method_ce7f9d7a_Dne(false);
    }

    @Override
    public boolean method_88973324_Dne(FiG fiG, int n, int n2, int n3) {
        return !this.field_3694131_Dne.method_41dd09d1_Dne(this, n, n2, n3, fiG);
    }

    @Override
    public void method_b43ddeb4_Dne(sMa sMa2, boolean bl) {
        if (!this.field_3694131_Dne.method_c3b4a2d4_ooe() && (sMa2 instanceof HzK || sMa2 instanceof DIk)) {
            sMa2.method_5d73f9d_g_();
        }
        if (!this.field_3694131_Dne.method_cc5ef5c4_trS() && sMa2 instanceof LUQ) {
            sMa2.method_5d73f9d_g_();
        }
        if (!(sMa2.field_37b45e5_Dne instanceof FiG)) {
            super.method_b43ddeb4_Dne(sMa2, bl);
        }
    }

    @Override
    public void method_9e2bd981_Qnq(int n, int n2, int n3, int n4, int n5, int n6) {
        ceE ceE2;
        ceE ceE3 = new ceE(n, n2, n3, n4, n5, n6);
        Iterator iterator = this.field_836b2213_Dne[this.field_20b857_DyG].iterator();
        do {
            if (iterator.hasNext()) continue;
            this.field_836b2213_Dne[this.field_20b857_DyG].add(ceE3);
            return;
        } while (!(ceE2 = (ceE)iterator.next()).equals(ceE3));
    }

    private boolean method_a175c7e8_Dne(ceE ceE2) {
        int n = this.method_2c2cf7bc_Dne(ceE2.method_7a46288d_Dne(), ceE2.method_7c6f602c_FWm(), ceE2.method_ae128dba_bzF());
        return n == ceE2.method_d44b4585_zGp() ? zKP.field_8374b848_Dne[n].method_3e226594_Dne(this, ceE2.method_7a46288d_Dne(), ceE2.method_7c6f602c_FWm(), ceE2.method_ae128dba_bzF(), ceE2.method_907a9d14_Qnq(), ceE2.method_a98a0653_aFZ()) : false;
    }

    public iSh method_f886b00c_FWm() {
        return this.field_3690d00_Dne.method_23105fed_Dne();
    }

    public void method_cd4cb3d5_udO() {
        this.field_388da6_zGp = 0;
    }

    protected void method_baa39402_kGO() {
        this.field_20b868_DyG = false;
        for (Object obj : this.field_2c197105_Qnq) {
        	FiG fiG = (FiG) obj;
            if (!fiG.method_9b310ff4_Wwe()) continue;
            fiG.method_2d24817a_Dne(false, false, true);
        }
        this.method_73aaafc3_ATE();
    }

    @Override
    public void method_ae303daa_FWm(int n, int n2, int n3, int n4, int n5) {
        this.method_17d7ea99_FWm(n, n2, n3, n4, n5, 0);
    }

    @Override
    public yTR method_4ff037c_Dne(sMa sMa2, double d, double d2, double d3, float f, boolean bl, boolean bl2) {
        yTR yTR2 = new yTR(this, sMa2, d, d2, d3, f);
        yTR2.field_2092bf_Dne = bl;
        yTR2.field_21261e_FWm = bl2;
        yTR2.method_7a46289a_Dne();
        yTR2.method_ce7f9d7a_Dne(false);
        if (!bl2) {
            yTR2.field_f27c122c_Dne.clear();
        }
        for (Object obj : this.field_2c197105_Qnq) {
        	FiG fiG = (FiG) obj;
            if (!(fiG.method_2be42992_Dne(d, d2, d3) < 4096.0)) continue;
            ((PJQ)fiG).field_36dacd0_Dne.method_7be2fb8c_Dne(new UdA(d, d2, d3, f, yTR2.field_f27c122c_Dne, (chN)yTR2.method_d410254f_Dne().get(fiG)));
        }
        return yTR2;
    }

    public void method_5f7a671b_Dne(boolean bl, TaY taY) throws div {
        if (this.field_37042d5_Dne.method_7c6f603d_FWm()) {
            if (taY != null) {
                taY.method_110c4dc3_FWm("Saving level");
            }
            this.method_9feec6c2_Zpi();
            if (taY != null) {
                taY.method_a9a920ab_Qnq("Saving chunks");
            }
            this.field_37042d5_Dne.method_5f7a671f_Dne(bl, taY);
        }
    }

    @Override
    protected void method_a98a0660_aFZ() {
        boolean bl = this.method_ae128dcb_bzF();
        super.method_a98a0660_aFZ();
        if (bl != this.method_ae128dcb_bzF()) {
            if (bl) {
                this.field_3694131_Dne.method_230ea953_Dne().method_7be2fb8c_Dne(new Tnn(2, 0));
            } else {
                this.field_3694131_Dne.method_230ea953_Dne().method_7be2fb8c_Dne(new Tnn(1, 0));
            }
        }
    }

    @Override
    protected void method_b34a9e6a_Dne(mrb mrb2) {
        if (this.field_36fd085_Dne == null) {
            this.field_36fd085_Dne = new ZGT();
        }
        if (this.field_da244c89_FWm == null) {
            this.field_da244c89_FWm = new HashSet();
        }
        if (this.field_36bd63a8_Dne == null) {
            this.field_36bd63a8_Dne = new TreeSet();
        }
        this.method_8c9e522b_FWm(mrb2);
        super.method_b34a9e6a_Dne(mrb2);
    }

    @Override
    public void method_7a46289a_Dne() {
        if (this.field_37e0a6a_Dne.method_7c6f602c_FWm() <= 0) {
            this.field_37e0a6a_Dne.method_117d19ea_FWm(64);
        }
        int n = this.field_37e0a6a_Dne.method_7a46288d_Dne();
        int n2 = this.field_37e0a6a_Dne.method_ae128dba_bzF();
        int n3 = 0;
        while (this.method_16cca6d_Dne(n, n2) == 0) {
            n += this.field_7331eae7_Dne.nextInt(8) - this.field_7331eae7_Dne.nextInt(8);
            n2 += this.field_7331eae7_Dne.nextInt(8) - this.field_7331eae7_Dne.nextInt(8);
            if (++n3 != 10000) continue;
        }
        this.field_37e0a6a_Dne.method_ce7f5da9_Dne(n);
        this.field_37e0a6a_Dne.method_143f9e1c_bzF(n2);
    }

    @Override
    public sMa method_9e7ee9d3_Dne(int n) {
        return (sMa)this.field_36fd085_Dne.method_394ba0a9_Dne(n);
    }

    @Override
    protected void method_bb7dd820_Dne(sMa sMa2) {
        super.method_bb7dd820_Dne(sMa2);
        this.field_36fd085_Dne.method_ad009545_Dne(sMa2.field_2d29f4_aFZ, sMa2);
        sMa[] sMaArray = sMa2.method_5709d0c1_Dne();
        if (sMaArray != null) {
            for (int i = 0; i < sMaArray.length; ++i) {
                this.field_36fd085_Dne.method_ad009545_Dne(sMaArray[i].field_2d29f4_aFZ, sMaArray[i]);
            }
        }
    }
}

