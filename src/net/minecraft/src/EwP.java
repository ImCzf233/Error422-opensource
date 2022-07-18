package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class EwP
implements ROX,
YHU {
    private Object field_63dcf1d7_Dne;
    private List field_f27c122c_Dne = new ArrayList();
    private final File field_d102ba32_Dne;
    private Set field_83b48b6a_Dne = new HashSet();

    @Override
    public void method_7c6f6039_FWm() {
        while (this.method_7a46289e_Dne()) {
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void method_d3c64378_Dne(Sxs sxs, WkD wkD) {
        Object object = this.field_63dcf1d7_Dne;
        Object object2 = this.field_63dcf1d7_Dne;
        synchronized (object2) {
            if (this.field_83b48b6a_Dne.contains(sxs)) {
                for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
                    if (!((xEx)this.field_f27c122c_Dne.get((int)i)).field_36d5d9e_Dne.equals(sxs)) continue;
                    this.field_f27c122c_Dne.set(i, new xEx(sxs, wkD));
                    return;
                }
            }
            this.field_f27c122c_Dne.add(new xEx(sxs, wkD));
            this.field_83b48b6a_Dne.add(sxs);
            Osh.field_36b7808_Dne.method_8346034c_Dne(this);
        }
    }

    protected qMV method_aa1eb0b5_Dne(Qnq qnq, int n, int n2, WkD wkD) {
        if (!wkD.method_8f501fe8_Dne("Level")) {
            qnq.method_230e0120_Dne().method_47a073d1_bzF("Chunk file at " + n + "," + n2 + " is missing level data, skipping");
            return null;
        }
        if (!wkD.method_2851c945_Dne("Level").method_8f501fe8_Dne("Sections")) {
            qnq.method_230e0120_Dne().method_47a073d1_bzF("Chunk file at " + n + "," + n2 + " is missing block data, skipping");
            return null;
        }
        qMV qMV2 = this.method_d3c8a455_Dne(qnq, wkD.method_2851c945_Dne("Level"));
        if (!qMV2.method_16cca7e_Dne(n, n2)) {
            qnq.method_230e0120_Dne().method_47a073d1_bzF("Chunk file at " + n + "," + n2 + " is in the wrong location; relocating. (Expected " + n + ", " + n2 + ", got " + qMV2.field_2092ae_Dne + ", " + qMV2.field_21260d_FWm + ")");
            wkD.method_5ab44f9f_Dne("xPos", n);
            wkD.method_5ab44f9f_Dne("zPos", n2);
            qMV2 = this.method_d3c8a455_Dne(qnq, wkD.method_2851c945_Dne("Level"));
        }
        return qMV2;
    }

    private void method_c39fcbbc_Dne(xEx xEx2) throws IOException {
        DataOutputStream dataOutputStream = LoG.method_1476532d_Dne(this.field_d102ba32_Dne, xEx2.field_36d5d9e_Dne.field_2092ae_Dne, xEx2.field_36d5d9e_Dne.field_21260d_FWm);
        VVx.method_eee5c69f_Dne(xEx2.field_36ef89c_Dne, dataOutputStream);
        dataOutputStream.close();
    }

    @Override
    public void method_7a46289a_Dne() {
    }

    public EwP(File file) {
        this.field_63dcf1d7_Dne = new Object();
        this.field_d102ba32_Dne = file;
    }

    private void method_2d48af31_Dne(qMV qMV2, Qnq qnq, WkD wkD) {
        Object object3;
        Object object22;
        WkD wkD2;
        wkD.method_5ab44f9f_Dne("xPos", qMV2.field_2092ae_Dne);
        wkD.method_5ab44f9f_Dne("zPos", qMV2.field_21260d_FWm);
        wkD.method_5ab45360_Dne("LastUpdate", qnq.method_7c6f602d_FWm());
        wkD.method_fbde45f2_Dne("HeightMap", qMV2.field_4039e0a_FWm);
        wkD.method_5ab48f70_Dne("TerrainPopulated", qMV2.field_2e5f2c_bzF);
        cHy[] cHyArray = qMV2.method_57027af4_Dne();
        mbZ mbZ2 = new mbZ("Sections");
        boolean bl = !qnq.field_3690d00_Dne.field_21261e_FWm;
        cHy[] cHyArray2 = cHyArray;
        int n = cHyArray.length;
        for (int i = 0; i < n; ++i) {
            cHy cHy2 = cHyArray2[i];
            if (cHy2 == null) continue;
            wkD2 = new WkD();
            wkD2.method_5ab43558_Dne("Y", (byte)(cHy2.method_7a46288d_Dne() >> 4 & 0xFF));
            wkD2.method_fbde2bab_Dne("Blocks", cHy2.method_ce7eeb83_Dne());
            if (cHy2.method_23008bc4_Dne() != null) {
                wkD2.method_fbde2bab_Dne("Add", cHy2.method_23008bc4_Dne().field_3f1c582_Dne);
            }
            wkD2.method_fbde2bab_Dne("Data", cHy2.method_f876dbe3_FWm().field_3f1c582_Dne);
            wkD2.method_fbde2bab_Dne("BlockLight", cHy2.method_228c9271_bzF().field_3f1c582_Dne);
            if (bl) {
                wkD2.method_fbde2bab_Dne("SkyLight", cHy2.method_694964cb_Qnq().field_3f1c582_Dne);
            } else {
                wkD2.method_fbde2bab_Dne("SkyLight", new byte[cHy2.method_228c9271_bzF().field_3f1c582_Dne.length]);
            }
            mbZ2.method_b4ba5ea1_Dne(wkD2);
        }
        wkD.method_58996597_Dne("Sections", mbZ2);
        wkD.method_fbde2bab_Dne("Biomes", qMV2.method_ce7eeb83_Dne());
        qMV2.field_2d2a05_aFZ = false;
        mbZ mbZ3 = new mbZ();
        for (n = 0; n < qMV2.field_27a96df1_Dne.length; ++n) {
            for (Object object : qMV2.field_27a96df1_Dne[n]) {
                if (!((sMa)object).method_66a36cdc_FWm(wkD2 = new WkD())) continue;
                qMV2.field_2d2a05_aFZ = true;
                mbZ3.method_b4ba5ea1_Dne(wkD2);
            }
        }
        wkD.method_58996597_Dne("Entities", mbZ3);
        object22 = new mbZ();
        for (Object object : qMV2.field_83b1c1b0_Dne.values()) {
            wkD2 = new WkD();
            ((ipD)object).method_66a36cd8_FWm(wkD2);
            ((mbZ)object22).method_b4ba5ea1_Dne(wkD2);
        }
        wkD.method_58996597_Dne("TileEntities", (oNe)object22);
        object3 = qnq.method_2a089c0_Dne(qMV2, false);
        if (object3 != null) {
            long l = qnq.method_7c6f602d_FWm();
            mbZ mbZ4 = new mbZ();
            Iterator iterator = ((List) object3).iterator();
            while (iterator.hasNext()) {
                Vxn vxn = (Vxn)iterator.next();
                WkD wkD3 = new WkD();
                wkD3.method_5ab44f9f_Dne("i", vxn.field_267cf5_Qnq);
                wkD3.method_5ab44f9f_Dne("x", vxn.field_2092ae_Dne);
                wkD3.method_5ab44f9f_Dne("y", vxn.field_21260d_FWm);
                wkD3.method_5ab44f9f_Dne("z", vxn.field_2e5f1b_bzF);
                wkD3.method_5ab44f9f_Dne("t", (int)(vxn.field_2092af_Dne - l));
                wkD3.method_5ab44f9f_Dne("p", vxn.field_2d29f4_aFZ);
                mbZ4.method_b4ba5ea1_Dne(wkD3);
            }
            wkD.method_58996597_Dne("TileTicks", mbZ4);
        }
    }

    private qMV method_d3c8a455_Dne(Qnq qnq, WkD wkD) {
        mbZ mbZ2;
        mbZ mbZ3;
        Object object;
        mbZ mbZ4;
        Object object2;
        int n = wkD.method_8f501fd7_Dne("xPos");
        int n2 = wkD.method_8f501fd7_Dne("zPos");
        qMV qMV2 = new qMV(qnq, n, n2);
        qMV2.field_4039e0a_FWm = wkD.method_5ab3dd80_Dne("HeightMap");
        qMV2.field_2e5f2c_bzF = wkD.method_110c4dc7_FWm("TerrainPopulated");
        mbZ mbZ5 = wkD.method_285baa50_Dne("Sections");
        int n3 = 16;
        cHy[] cHyArray = new cHy[n3];
        boolean bl = !qnq.field_3690d00_Dne.field_21261e_FWm;
        for (int i = 0; i < mbZ5.method_7a46288d_Dne(); ++i) {
            WkD wkD2 = (WkD)mbZ5.method_77d0d055_FWm(i);
            byte by = wkD2.method_8f501fd0_Dne("Y");
            cHy chy = new cHy(by << 4, bl);
            ((cHy)chy).method_174dee1_Dne(wkD2.method_5ab3dd79_Dne("Blocks"));
            if (wkD2.method_8f501fe8_Dne("Add")) {
                ((cHy)chy).method_6f59afa0_Dne(new FYZ(wkD2.method_5ab3dd79_Dne("Add"), 4));
            }
            ((cHy)chy).method_48ad6361_FWm(new FYZ(wkD2.method_5ab3dd79_Dne("Data"), 4));
            ((cHy)chy).method_614e7e93_bzF(new FYZ(wkD2.method_5ab3dd79_Dne("BlockLight"), 4));
            if (bl) {
                ((cHy)chy).method_f22bf779_Qnq(new FYZ(wkD2.method_5ab3dd79_Dne("SkyLight"), 4));
            }
            ((cHy)chy).method_7a46289a_Dne();
            cHyArray[by] = chy;
        }
        qMV2.method_dfa28592_Dne(cHyArray);
        if (wkD.method_8f501fe8_Dne("Biomes")) {
            qMV2.method_174dee1_Dne(wkD.method_5ab3dd79_Dne("Biomes"));
        }
        if ((mbZ4 = wkD.method_285baa50_Dne("Entities")) != null) {
            for (int i = 0; i < mbZ4.method_7a46288d_Dne(); ++i) {
                WkD wkD3 = (WkD)mbZ4.method_77d0d055_FWm(i);
                object2 = Klb.method_a1f613e0_Dne(wkD3, qnq);
                qMV2.field_2d2a05_aFZ = true;
                if (object2 == null) continue;
                qMV2.method_bb7dd820_Dne((sMa)object2);
                object = object2;
                WkD wkD4 = wkD3;
                while (wkD4.method_8f501fe8_Dne("Riding")) {
                    sMa sMa2 = Klb.method_a1f613e0_Dne(wkD4.method_2851c945_Dne("Riding"), qnq);
                    if (sMa2 != null) {
                        qMV2.method_bb7dd820_Dne(sMa2);
                        ((sMa)object).method_ad72a713_bzF(sMa2);
                    }
                    object = sMa2;
                    wkD4 = wkD4.method_2851c945_Dne("Riding");
                }
            }
        }
        if ((mbZ3 = wkD.method_285baa50_Dne("TileEntities")) != null) {
            for (int i = 0; i < mbZ3.method_7a46288d_Dne(); ++i) {
                object2 = (WkD)mbZ3.method_77d0d055_FWm(i);
                object = ipD.method_7db3d26b_Dne((WkD)object2);
                if (object == null) continue;
                qMV2.method_ac4d69ca_Dne((ipD)object);
            }
        }
        if (wkD.method_8f501fe8_Dne("TileTicks") && (mbZ2 = wkD.method_285baa50_Dne("TileTicks")) != null) {
            for (int i = 0; i < mbZ2.method_7a46288d_Dne(); ++i) {
                object = (WkD)mbZ2.method_77d0d055_FWm(i);
                qnq.method_135a35a7_bzF(((WkD)object).method_8f501fd7_Dne("x"), ((WkD)object).method_8f501fd7_Dne("y"), ((WkD)object).method_8f501fd7_Dne("z"), ((WkD)object).method_8f501fd7_Dne("i"), ((WkD)object).method_8f501fd7_Dne("t"), ((WkD)object).method_8f501fd7_Dne("p"));
            }
        }
        return qMV2;
    }

    @Override
    public void method_21550274_Dne(Qnq qnq, qMV qMV2) throws div {
        qnq.method_c073daf8_mrb();
        try {
            WkD wkD = new WkD();
            WkD wkD2 = new WkD();
            wkD.method_58996597_Dne("Level", wkD2);
            this.method_2d48af31_Dne(qMV2, qnq, wkD2);
            this.method_d3c64378_Dne(qMV2.method_2306ebfd_Dne(), wkD);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void method_e0b07f53_FWm(Qnq qnq, qMV qMV2) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public qMV method_4fcc354a_Dne(Qnq qnq, int n, int n2) throws IOException {
        WkD wkD = null;
        Sxs sxs = new Sxs(n, n2);
        Object object = this.field_63dcf1d7_Dne;
        Object object2 = this.field_63dcf1d7_Dne;
        synchronized (object2) {
            if (this.field_83b48b6a_Dne.contains(sxs)) {
                for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
                    if (!((xEx)this.field_f27c122c_Dne.get((int)i)).field_36d5d9e_Dne.equals(sxs)) continue;
                    wkD = ((xEx)this.field_f27c122c_Dne.get((int)i)).field_36ef89c_Dne;
                    break;
                }
            }
        }
        if (wkD == null) {
            object2 = LoG.method_993f207e_Dne(this.field_d102ba32_Dne, n, n2);
            if (object2 == null) {
                return null;
            }
            wkD = VVx.method_cd26dcc4_Dne((DataInput)object2);
        }
        return this.method_aa1eb0b5_Dne(qnq, n, n2, wkD);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean method_7a46289e_Dne() {
        xEx xEx2 = null;
        Object object = this.field_63dcf1d7_Dne;
        Object object2 = this.field_63dcf1d7_Dne;
        synchronized (object2) {
            if (this.field_f27c122c_Dne.isEmpty()) {
                return false;
            }
            xEx2 = (xEx)this.field_f27c122c_Dne.remove(0);
            this.field_83b48b6a_Dne.remove(xEx2.field_36d5d9e_Dne);
        }
        if (xEx2 != null) {
            try {
                this.method_c39fcbbc_Dne(xEx2);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return true;
    }
}

