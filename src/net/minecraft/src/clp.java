package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class clp {
    private int field_2092ae_Dne;
    private final RAN field_36c164d_Dne;
    private Set<phC> field_83b48b6a_Dne = new HashSet();
    private ZGT field_36fd085_Dne = new ZGT();

    public void method_d376b080_Dne(sMa sMa2, int n, int n2) {
        this.method_9b601254_Dne(sMa2, n, n2, false);
    }

    public void method_bb7dd820_Dne(sMa sMa2) {
        if (sMa2 instanceof PJQ) {
            this.method_d376b080_Dne(sMa2, 512, 2);
            PJQ pJQ = (PJQ)sMa2;
            for (phC phC2 : this.field_83b48b6a_Dne) {
                if (phC2.field_37b45e5_Dne == pJQ) continue;
                phC2.method_58e661b1_FWm(pJQ);
            }
        } else if (sMa2 instanceof cQz) {
            this.method_9b601254_Dne(sMa2, 64, 5, true);
        } else if (sMa2 instanceof hhc) {
            this.method_9b601254_Dne(sMa2, 64, 20, false);
        } else if (sMa2 instanceof Xzh) {
            this.method_9b601254_Dne(sMa2, 64, 10, false);
        } else if (sMa2 instanceof Tdr) {
            this.method_9b601254_Dne(sMa2, 64, 10, false);
        } else if (sMa2 instanceof kxx_0) {
            this.method_9b601254_Dne(sMa2, 64, 10, true);
        } else if (sMa2 instanceof Hhj) {
            this.method_9b601254_Dne(sMa2, 64, 10, true);
        } else if (sMa2 instanceof UMP) {
            this.method_9b601254_Dne(sMa2, 64, 4, true);
        } else if (sMa2 instanceof TCA) {
            this.method_9b601254_Dne(sMa2, 64, 10, true);
        } else if (sMa2 instanceof YgL) {
            this.method_9b601254_Dne(sMa2, 64, 10, true);
        } else if (sMa2 instanceof AEw) {
            this.method_9b601254_Dne(sMa2, 64, 10, true);
        } else if (sMa2 instanceof zMx) {
            this.method_9b601254_Dne(sMa2, 64, 10, true);
        } else if (sMa2 instanceof JiM) {
            this.method_9b601254_Dne(sMa2, 64, 20, true);
        } else if (sMa2 instanceof Ebp) {
            this.method_9b601254_Dne(sMa2, 80, 3, true);
        } else if (sMa2 instanceof iMX) {
            this.method_9b601254_Dne(sMa2, 80, 3, true);
        } else if (sMa2 instanceof Xxe) {
            this.method_9b601254_Dne(sMa2, 64, 3, true);
        } else if (sMa2 instanceof DhB) {
            this.method_9b601254_Dne(sMa2, 80, 3, false);
        } else if (sMa2 instanceof oaw) {
            this.method_9b601254_Dne(sMa2, 80, 3, false);
        } else if (sMa2 instanceof NbA) {
            this.method_9b601254_Dne(sMa2, 80, 3, true);
        } else if (sMa2 instanceof WSC) {
            this.method_9b601254_Dne(sMa2, 160, 3, true);
        } else if (sMa2 instanceof gqg) {
            this.method_9b601254_Dne(sMa2, 160, 10, true);
        } else if (sMa2 instanceof CiF) {
            this.method_9b601254_Dne(sMa2, 160, 20, true);
        } else if (sMa2 instanceof JCd) {
            this.method_9b601254_Dne(sMa2, 160, Integer.MAX_VALUE, false);
        } else if (sMa2 instanceof alg) {
            this.method_9b601254_Dne(sMa2, 160, 20, true);
        } else if (sMa2 instanceof Ndk) {
            this.method_9b601254_Dne(sMa2, 256, Integer.MAX_VALUE, false);
        } else if (sMa2 instanceof BPY) {
            this.method_9b601254_Dne(sMa2, 160, Integer.MAX_VALUE, false);
        }
    }

    public void method_7a46289a_Dne() {
        ArrayList<PJQ> arrayList = new ArrayList<PJQ>();
        for (phC phC2 : this.field_83b48b6a_Dne) {
            phC2.method_ea14418b_Dne(this.field_36c164d_Dne.field_2c197105_Qnq);
            if (!phC2.field_2092bf_Dne || !(phC2.field_37b45e5_Dne instanceof PJQ)) continue;
            arrayList.add((PJQ)phC2.field_37b45e5_Dne);
        }
        for (int i = 0; i < arrayList.size(); ++i) {
            PJQ pJQ = (PJQ)arrayList.get(i);
            for (phC phC3 : this.field_83b48b6a_Dne) {
                if (phC3.field_37b45e5_Dne == pJQ) continue;
                phC3.method_58e661b1_FWm(pJQ);
            }
        }
    }

    public void method_a98e8737_Dne(PJQ pJQ, qMV qMV2) {
        for (phC phC2 : this.field_83b48b6a_Dne) {
            if (phC2.field_37b45e5_Dne == pJQ || phC2.field_37b45e5_Dne.field_22c602_IjH != qMV2.field_2092ae_Dne || phC2.field_37b45e5_Dne.field_29186d_XHL != qMV2.field_21260d_FWm) continue;
            phC2.method_58e661b1_FWm(pJQ);
        }
    }

    public void method_94d18be1_FWm(sMa sMa2) {
        Object object;
        if (sMa2 instanceof PJQ) {
            object = (PJQ)sMa2;
            for (phC phC2 : this.field_83b48b6a_Dne) {
                phC2.method_7f92adf0_Dne((PJQ)object);
            }
        }
        if ((object = (phC)this.field_36fd085_Dne.method_bb07ce88_FWm(sMa2.field_2d29f4_aFZ)) != null) {
            this.field_83b48b6a_Dne.remove(object);
            ((phC)object).method_7a46289a_Dne();
        }
    }

    public void method_a9258ca5_FWm(sMa sMa2, NER nER) {
        phC phC2 = (phC)this.field_36fd085_Dne.method_394ba0a9_Dne(sMa2.field_2d29f4_aFZ);
        if (phC2 != null) {
            phC2.method_5536af4d_FWm(nER);
        }
    }

    public clp(RAN rAN) {
        this.field_36c164d_Dne = rAN;
        this.field_2092ae_Dne = rAN.method_2302cf90_Dne().method_230ea953_Dne().method_7a46288d_Dne();
    }

    public void method_7f92adf0_Dne(PJQ pJQ) {
        for (phC phC2 : this.field_83b48b6a_Dne) {
            phC2.method_71877ce3_bzF(pJQ);
        }
    }

    public void method_e9ca0fc6_Dne(sMa sMa2, NER nER) {
        phC phC2 = (phC)this.field_36fd085_Dne.method_394ba0a9_Dne(sMa2.field_2d29f4_aFZ);
        if (phC2 != null) {
            phC2.method_7be2fb8c_Dne(nER);
        }
    }

    public void method_9b601254_Dne(sMa sMa2, int n, int n2, boolean bl) {
        if (n > this.field_2092ae_Dne) {
            n = this.field_2092ae_Dne;
        }
        try {
            if (this.field_36fd085_Dne.method_ce7f5dad_Dne(sMa2.field_2d29f4_aFZ)) {
                throw new IllegalStateException("Entity is already tracked!");
            }
            phC phC2 = new phC(sMa2, n, n2, bl);
            this.field_83b48b6a_Dne.add(phC2);
            this.field_36fd085_Dne.method_ad009545_Dne(sMa2.field_2d29f4_aFZ, phC2);
            phC2.method_12705b2a_FWm(this.field_36c164d_Dne.field_2c197105_Qnq);
        }
        catch (Throwable throwable) {
            McM mcM = McM.method_948e60df_Dne(throwable, "Adding entity to track");
            Noo noo = mcM.method_284dc627_Dne("Entity To Track");
            noo.method_5e295ec0_Dne("Tracking range", n + " blocks");
            noo.method_2aeeb7ad_Dne("Update interval", new ZXl(this, n2));
            sMa2.method_7e400579_Dne(noo);
            Noo noo2 = mcM.method_284dc627_Dne("Entity That Is Already Tracked");
            ((phC)this.field_36fd085_Dne.method_394ba0a9_Dne((int)sMa2.field_2d29f4_aFZ)).field_37b45e5_Dne.method_7e400579_Dne(noo2);
            try {
                throw new kaJ(mcM);
            }
            catch (kaJ kaJ2) {
                System.err.println("\"Silently\" catching entity tracking error.");
                kaJ2.printStackTrace();
            }
        }
    }
}

