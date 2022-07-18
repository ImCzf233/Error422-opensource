package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class kXX
extends SFA {
    private hlz field_376bd36_Dne;
    private final jwh_0 field_3694131_Dne;
    private final Set field_83b48b6a_Dne = new HashSet();

    @Override
    public void method_44c23b0b_Qnq(vfE vfE2) {
        super.method_44c23b0b_Qnq(vfE2);
        if (this.field_83b48b6a_Dne.contains(vfE2)) {
            this.method_51ee313a_zGp(vfE2);
        }
        this.method_7a46289a_Dne();
    }

    protected void method_7a46289a_Dne() {
        if (this.field_376bd36_Dne != null) {
            this.field_376bd36_Dne.method_7a46289a_Dne();
        }
    }

    @Override
    public void method_80b35f83_bzF(YGE yGE) {
        super.method_80b35f83_bzF(yGE);
        this.field_3694131_Dne.method_230ea953_Dne().method_7be2fb8c_Dne(new SPR(yGE, 2));
        this.method_7a46289a_Dne();
    }

    public List method_a3706f4_FWm(vfE vfE2) {
        ArrayList<NER> arrayList = new ArrayList<NER>();
        arrayList.add(new iQd(vfE2, 1));
        for (int i = 0; i < 3; ++i) {
            if (this.method_9e80a165_Dne(i) != vfE2) continue;
            arrayList.add(new LjQ(i, vfE2));
        }
        return arrayList;
    }

    @Override
    public void method_1190d869_Qnq(YGE yGE) {
        super.method_1190d869_Qnq(yGE);
        this.field_3694131_Dne.method_230ea953_Dne().method_7be2fb8c_Dne(new SPR(yGE, 1));
        this.method_7a46289a_Dne();
    }

    public void method_156dc12c_aFZ(vfE vfE2) {
        List<NER> list = this.method_6ced4d5_Dne(vfE2);
        for (PJQ pJQ : this.field_3694131_Dne.method_230ea953_Dne().field_f27c122c_Dne) {
            for (NER nER : list) {
                pJQ.field_36dacd0_Dne.method_7be2fb8c_Dne(nER);
            }
        }
        this.field_83b48b6a_Dne.add(vfE2);
    }

    @Override
    public void method_110c4dc3_FWm(String string) {
        super.method_110c4dc3_FWm(string);
        this.field_3694131_Dne.method_230ea953_Dne().method_7be2fb8c_Dne(new niw(string));
        this.method_7a46289a_Dne();
    }

    @Override
    public void method_68124451_FWm(YGE yGE) {
        super.method_68124451_FWm(yGE);
        this.field_3694131_Dne.method_230ea953_Dne().method_7be2fb8c_Dne(new SPR(yGE, 0));
        this.method_7a46289a_Dne();
    }

    public List method_6ced4d5_Dne(vfE vfE2) {
        ArrayList<NER> arrayList = new ArrayList<NER>();
        arrayList.add(new iQd(vfE2, 0));
        for (int i = 0; i < 3; ++i) {
            if (this.method_9e80a165_Dne(i) != vfE2) continue;
            arrayList.add(new LjQ(i, vfE2));
        }
        for (OHz oHz : this.method_6efe9cd5_Dne(vfE2)) {
            arrayList.add(new niw(oHz, 0));
        }
        return arrayList;
    }

    @Override
    public void method_9b43a6f3_FWm(vfE vfE2) {
        super.method_9b43a6f3_FWm(vfE2);
        this.method_7a46289a_Dne();
    }

    public void method_aa78bf31_Dne(hlz hlz2) {
        this.field_376bd36_Dne = hlz2;
    }

    public void method_51ee313a_zGp(vfE vfE2) {
        List<NER> list = this.method_a3706f4_FWm(vfE2);
        for (PJQ pJQ : this.field_3694131_Dne.method_230ea953_Dne().field_f27c122c_Dne) {
            for (NER nER : list) {
                pJQ.field_36dacd0_Dne.method_7be2fb8c_Dne(nER);
            }
        }
        this.field_83b48b6a_Dne.remove(vfE2);
    }

    @Override
    public void method_b3e4c225_bzF(vfE vfE2) {
        super.method_b3e4c225_bzF(vfE2);
        if (this.field_83b48b6a_Dne.contains(vfE2)) {
            this.field_3694131_Dne.method_230ea953_Dne().method_7be2fb8c_Dne(new iQd(vfE2, 2));
        }
        this.method_7a46289a_Dne();
    }

    @Override
    public void method_329d9786_Dne(String string, YGE yGE) {
        super.method_329d9786_Dne(string, yGE);
        this.field_3694131_Dne.method_230ea953_Dne().method_7be2fb8c_Dne(new SPR(yGE, Arrays.asList(string), 3));
        this.method_7a46289a_Dne();
    }

    public int method_c1eff325_Dne(vfE vfE2) {
        int n = 0;
        for (int i = 0; i < 3; ++i) {
            if (this.method_9e80a165_Dne(i) != vfE2) continue;
            ++n;
        }
        return n;
    }

    @Override
    public void method_acfe3d07_FWm(String string, YGE yGE) {
        super.method_acfe3d07_FWm(string, yGE);
        this.field_3694131_Dne.method_230ea953_Dne().method_7be2fb8c_Dne(new SPR(yGE, Arrays.asList(string), 4));
        this.method_7a46289a_Dne();
    }

    @Override
    public void method_b3c88f83_Dne(int n, vfE vfE2) {
        vfE vfE3 = this.method_9e80a165_Dne(n);
        super.method_b3c88f83_Dne(n, vfE2);
        if (vfE3 != vfE2 && vfE3 != null) {
            if (this.method_c1eff325_Dne(vfE3) > 0) {
                this.field_3694131_Dne.method_230ea953_Dne().method_7be2fb8c_Dne(new LjQ(n, vfE2));
            } else {
                this.method_51ee313a_zGp(vfE3);
            }
        }
        if (vfE2 != null) {
            if (this.field_83b48b6a_Dne.contains(vfE2)) {
                this.field_3694131_Dne.method_230ea953_Dne().method_7be2fb8c_Dne(new LjQ(n, vfE2));
            } else {
                this.method_156dc12c_aFZ(vfE2);
            }
        }
        this.method_7a46289a_Dne();
    }

    @Override
    public void method_7dd44986_Dne(OHz oHz) {
        super.method_7dd44986_Dne(oHz);
        if (this.field_83b48b6a_Dne.contains(oHz.method_23168bd6_Dne())) {
            this.field_3694131_Dne.method_230ea953_Dne().method_7be2fb8c_Dne(new niw(oHz, 0));
        }
        this.method_7a46289a_Dne();
    }

    public kXX(jwh_0 jwh_02) {
        this.field_3694131_Dne = jwh_02;
    }
}

