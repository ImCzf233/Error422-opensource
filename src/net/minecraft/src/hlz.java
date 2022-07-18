package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

public class hlz
extends vWZ {
    private SFA field_36c9bde_Dne;
    private WkD field_36ef89c_Dne;

    public hlz(String string) {
        super(string);
    }

    protected void method_b2658362_Dne(mbZ mbZ2) {
        for (int i = 0; i < mbZ2.method_7a46288d_Dne(); ++i) {
            WkD wkD = (WkD)mbZ2.method_77d0d055_FWm(i);
            YGE yGE = this.field_36c9bde_Dne.method_f276515d_FWm(wkD.method_39193c_Dne("Name"));
            yGE.method_8f501fe4_Dne(wkD.method_39193c_Dne("DisplayName"));
            yGE.method_110c4dc3_FWm(wkD.method_39193c_Dne("Prefix"));
            yGE.method_47a073d1_bzF(wkD.method_39193c_Dne("Suffix"));
            if (wkD.method_8f501fe8_Dne("AllowFriendlyFire")) {
                yGE.method_ce7f9d7a_Dne(wkD.method_110c4dc7_FWm("AllowFriendlyFire"));
            }
            if (wkD.method_8f501fe8_Dne("SeeFriendlyInvisibles")) {
                yGE.method_117d59bb_FWm(wkD.method_110c4dc7_FWm("SeeFriendlyInvisibles"));
            }
            this.method_fdda52c_Dne(yGE, wkD.method_285baa50_Dne("Players"));
        }
    }

    protected void method_fdda52c_Dne(YGE yGE, mbZ mbZ2) {
        for (int i = 0; i < mbZ2.method_7a46288d_Dne(); ++i) {
            this.field_36c9bde_Dne.method_329d9786_Dne(((QNx)mbZ2.method_77d0d055_FWm((int)i)).field_569fcf45_Dne, yGE);
        }
    }

    protected void method_102200f0_Qnq(WkD wkD) {
        WkD wkD2 = new WkD();
        boolean bl = false;
        for (int i = 0; i < 3; ++i) {
            vfE vfE2 = this.field_36c9bde_Dne.method_9e80a165_Dne(i);
            if (vfE2 == null) continue;
            wkD2.method_abaa98ae_Dne("slot_" + i, vfE2.method_eecad346_Dne());
            bl = true;
        }
        if (bl) {
            wkD.method_312ec00d_Dne("DisplaySlots", wkD2);
        }
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        if (this.field_36c9bde_Dne == null) {
            jwh_0.method_2302cf90_Dne().method_230e0120_Dne().method_110c4dc3_FWm("Tried to save scoreboard without having a scoreboard...");
        } else {
            wkD.method_58996597_Dne("Objectives", this.method_f888b825_FWm());
            wkD.method_58996597_Dne("PlayerScores", this.method_229e6eb3_bzF());
            wkD.method_58996597_Dne("Teams", this.method_23126806_Dne());
            this.method_102200f0_Qnq(wkD);
        }
    }

    protected mbZ method_23126806_Dne() {
        mbZ mbZ2 = new mbZ();
        Collection<YGE> collection = this.field_36c9bde_Dne.method_4485f267_aFZ();
        for (YGE yGE : collection) {
            WkD wkD = new WkD();
            wkD.method_abaa98ae_Dne("Name", yGE.method_eecad346_Dne());
            wkD.method_abaa98ae_Dne("DisplayName", yGE.method_d1f1ed87_FWm());
            wkD.method_abaa98ae_Dne("Prefix", yGE.method_6859cdb9_bzF());
            wkD.method_abaa98ae_Dne("Suffix", yGE.method_4a7b1d9f_Qnq());
            wkD.method_5ab48f70_Dne("AllowFriendlyFire", yGE.method_7a46289e_Dne());
            wkD.method_5ab48f70_Dne("SeeFriendlyInvisibles", yGE.method_7c6f603d_FWm());
            mbZ mbZ3 = new mbZ();
            for (Object obj : yGE.method_be5f586d_Dne()) {String string = (String) obj;
                mbZ3.method_b4ba5ea1_Dne(new QNx("", string));
            }
            wkD.method_58996597_Dne("Players", mbZ3);
            mbZ2.method_b4ba5ea1_Dne(wkD);
        }
        return mbZ2;
    }

    protected mbZ method_f888b825_FWm() {
        mbZ mbZ2 = new mbZ();
        Collection<vfE> collection = this.field_36c9bde_Dne.method_be5f586d_Dne();
        for (vfE vfE2 : collection) {
            WkD wkD = new WkD();
            wkD.method_abaa98ae_Dne("Name", vfE2.method_eecad346_Dne());
            wkD.method_abaa98ae_Dne("CriteriaName", vfE2.method_2304bed6_Dne().method_eecad346_Dne());
            wkD.method_abaa98ae_Dne("DisplayName", vfE2.method_d1f1ed87_FWm());
            mbZ2.method_b4ba5ea1_Dne(wkD);
        }
        return mbZ2;
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        if (this.field_36c9bde_Dne == null) {
            this.field_36ef89c_Dne = wkD;
        } else {
            this.method_8bb93723_FWm(wkD.method_285baa50_Dne("Objectives"));
            this.method_a45a5255_bzF(wkD.method_285baa50_Dne("PlayerScores"));
            if (wkD.method_8f501fe8_Dne("DisplaySlots")) {
                this.method_7f44880a_bzF(wkD.method_2851c945_Dne("DisplaySlots"));
            }
            if (wkD.method_8f501fe8_Dne("Teams")) {
                this.method_b2658362_Dne(wkD.method_285baa50_Dne("Teams"));
            }
        }
    }

    public void method_847193d9_Dne(SFA sFA) {
        this.field_36c9bde_Dne = sFA;
        if (this.field_36ef89c_Dne != null) {
            this.method_8d4fb917_Dne(this.field_36ef89c_Dne);
        }
    }

    protected mbZ method_229e6eb3_bzF() {
        mbZ mbZ2 = new mbZ();
        Collection<OHz> collection = this.field_36c9bde_Dne.method_8a35e160_bzF();
        for (OHz oHz : collection) {
            WkD wkD = new WkD();
            wkD.method_abaa98ae_Dne("Name", oHz.method_eecad346_Dne());
            wkD.method_abaa98ae_Dne("Objective", oHz.method_23168bd6_Dne().method_eecad346_Dne());
            wkD.method_5ab44f9f_Dne("Score", oHz.method_7a46288d_Dne());
            mbZ2.method_b4ba5ea1_Dne(wkD);
        }
        return mbZ2;
    }

    protected void method_a45a5255_bzF(mbZ mbZ2) {
        for (int i = 0; i < mbZ2.method_7a46288d_Dne(); ++i) {
            WkD wkD = (WkD)mbZ2.method_77d0d055_FWm(i);
            vfE vfE2 = this.field_36c9bde_Dne.method_285fce20_Dne(wkD.method_39193c_Dne("Objective"));
            OHz oHz = this.field_36c9bde_Dne.method_938dc1b8_Dne(wkD.method_39193c_Dne("Name"), vfE2);
            oHz.method_143f9e1c_bzF(wkD.method_8f501fd7_Dne("Score"));
        }
    }

    protected void method_7f44880a_bzF(WkD wkD) {
        for (int i = 0; i < 3; ++i) {
            if (!wkD.method_8f501fe8_Dne("slot_" + i)) continue;
            String string = wkD.method_39193c_Dne("slot_" + i);
            vfE vfE2 = this.field_36c9bde_Dne.method_285fce20_Dne(string);
            this.field_36c9bde_Dne.method_b3c88f83_Dne(i, vfE2);
        }
    }

    protected void method_8bb93723_FWm(mbZ mbZ2) {
        for (int i = 0; i < mbZ2.method_7a46288d_Dne(); ++i) {
            WkD wkD = (WkD)mbZ2.method_77d0d055_FWm(i);
            PAf pAf = (PAf)PAf.field_83b1c1b0_Dne.get(wkD.method_39193c_Dne("CriteriaName"));
            vfE vfE2 = this.field_36c9bde_Dne.method_46dbd964_Dne(wkD.method_39193c_Dne("Name"), pAf);
            vfE2.method_8f501fe4_Dne(wkD.method_39193c_Dne("DisplayName"));
        }
    }

    public hlz() {
        this("scoreboard");
    }
}

