package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class WkD
extends oNe {
    private Map<Object, oNe> field_83b1c1b0_Dne = new HashMap();

    public void method_5ab4445c_Dne(String string, float f) {
        this.field_83b1c1b0_Dne.put(string, new nOv(string, f));
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            WkD wkD = (WkD)object;
            return this.field_83b1c1b0_Dne.entrySet().equals(wkD.field_83b1c1b0_Dne.entrySet());
        }
        return false;
    }

    public double method_8f501fd2_Dne(String string) {
        try {
            return !this.field_83b1c1b0_Dne.containsKey(string) ? 0.0 : ((kJU)this.field_83b1c1b0_Dne.get((Object)string)).field_2092a9_Dne;
        }
        catch (ClassCastException classCastException) {
            throw new kaJ(this.method_1c327bdc_Dne(string, 6, classCastException));
        }
    }

    public boolean method_7a46289e_Dne() {
        return this.field_83b1c1b0_Dne.isEmpty();
    }

    public void method_fbde45f2_Dne(String string, int[] nArray) {
        this.field_83b1c1b0_Dne.put(string, new xuY(string, nArray));
    }

    public byte method_8f501fd0_Dne(String string) {
        try {
            return !this.field_83b1c1b0_Dne.containsKey(string) ? (byte)0 : ((bCM)this.field_83b1c1b0_Dne.get((Object)string)).field_2092a7_Dne;
        }
        catch (ClassCastException classCastException) {
            throw new kaJ(this.method_1c327bdc_Dne(string, 1, classCastException));
        }
    }

    @Override
    public oNe method_23130705_Dne() {
        WkD wkD = new WkD(this.method_eecad346_Dne());
        for (Object obj : this.field_83b1c1b0_Dne.keySet()) {String string = (String) obj;
            wkD.method_58996597_Dne(string, ((oNe)this.field_83b1c1b0_Dne.get(string)).method_23130705_Dne());
        }
        return wkD;
    }

    public boolean method_110c4dc7_FWm(String string) {
        return this.method_8f501fd0_Dne(string) != 0;
    }

    public void method_5ab45360_Dne(String string, long l) {
        this.field_83b1c1b0_Dne.put(string, new zCY(string, l));
    }

    public Collection<oNe> method_be5f586d_Dne() {
        return this.field_83b1c1b0_Dne.values();
    }

    @Override
    public byte method_7a462886_Dne() {
        return 10;
    }

    @Override
    void method_e280cae3_Dne(DataInput dataInput) throws IOException {
        oNe oNe2;
        this.field_83b1c1b0_Dne.clear();
        while ((oNe2 = oNe.method_cd315cce_Dne(dataInput)).method_7a462886_Dne() != 0) {
            this.field_83b1c1b0_Dne.put(oNe2.method_eecad346_Dne(), oNe2);
        }
    }

    public void method_5ab44f9f_Dne(String string, int n) {
        this.field_83b1c1b0_Dne.put(string, new BYr(string, n));
    }

    public int method_8f501fd7_Dne(String string) {
        try {
            return !this.field_83b1c1b0_Dne.containsKey(string) ? 0 : ((BYr)this.field_83b1c1b0_Dne.get((Object)string)).field_2092ae_Dne;
        }
        catch (ClassCastException classCastException) {
            throw new kaJ(this.method_1c327bdc_Dne(string, 3, classCastException));
        }
    }

    public WkD method_2851c945_Dne(String string) {
        try {
            return !this.field_83b1c1b0_Dne.containsKey(string) ? new WkD(string) : (WkD)this.field_83b1c1b0_Dne.get(string);
        }
        catch (ClassCastException classCastException) {
            throw new kaJ(this.method_1c327bdc_Dne(string, 10, classCastException));
        }
    }

    public WkD(String string) {
        super(string);
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.field_83b1c1b0_Dne.hashCode();
    }

    public void method_abaa98ae_Dne(String string, String string2) {
        this.field_83b1c1b0_Dne.put(string, new QNx(string, string2));
    }

    public float method_8f501fd4_Dne(String string) {
        try {
            return !this.field_83b1c1b0_Dne.containsKey(string) ? 0.0f : ((nOv)this.field_83b1c1b0_Dne.get((Object)string)).field_2092ab_Dne;
        }
        catch (ClassCastException classCastException) {
            throw new kaJ(this.method_1c327bdc_Dne(string, 5, classCastException));
        }
    }

    public oNe method_285c494f_Dne(String string) {
        return (oNe)this.field_83b1c1b0_Dne.get(string);
    }

    public WkD() {
        super("");
    }

    static Map method_af40970c_Dne(WkD wkD) {
        return wkD.field_83b1c1b0_Dne;
    }

    public void method_5ab47529_Dne(String string, short s) {
        this.field_83b1c1b0_Dne.put(string, new phA(string, s));
    }

    public void method_5ab43558_Dne(String string, byte by) {
        this.field_83b1c1b0_Dne.put(string, new bCM(string, by));
    }

    public String toString() {
        String string = this.method_eecad346_Dne() + ":[";
        for (Object obj : this.field_83b1c1b0_Dne.keySet()) {String string2 = (String) obj;
            string = string + string2 + ":" + this.field_83b1c1b0_Dne.get(string2) + ",";
        }
        return string + "]";
    }

    public boolean method_8f501fe8_Dne(String string) {
        return this.field_83b1c1b0_Dne.containsKey(string);
    }

    public void method_8f501fe4_Dne(String string) {
        this.field_83b1c1b0_Dne.remove(string);
    }

    public String method_39193c_Dne(String string) {
        try {
            return !this.field_83b1c1b0_Dne.containsKey(string) ? "" : ((QNx)this.field_83b1c1b0_Dne.get((Object)string)).field_569fcf45_Dne;
        }
        catch (ClassCastException classCastException) {
            throw new kaJ(this.method_1c327bdc_Dne(string, 8, classCastException));
        }
    }

    public mbZ method_285baa50_Dne(String string) {
        try {
            return !this.field_83b1c1b0_Dne.containsKey(string) ? new mbZ(string) : (mbZ)this.field_83b1c1b0_Dne.get(string);
        }
        catch (ClassCastException classCastException) {
            throw new kaJ(this.method_1c327bdc_Dne(string, 9, classCastException));
        }
    }

    public int[] method_5ab3dd80_Dne(String string) {
        try {
            return !this.field_83b1c1b0_Dne.containsKey(string) ? new int[]{} : ((xuY)this.field_83b1c1b0_Dne.get((Object)string)).field_3f1c589_Dne;
        }
        catch (ClassCastException classCastException) {
            throw new kaJ(this.method_1c327bdc_Dne(string, 11, classCastException));
        }
    }

    @Override
    void method_899456a2_Dne(DataOutput dataOutput) throws IOException {
        for (oNe oNe2 : this.field_83b1c1b0_Dne.values()) {
            oNe.method_9e004329_Dne(oNe2, dataOutput);
        }
        dataOutput.writeByte(0);
    }

    public long method_8f501fd8_Dne(String string) {
        try {
            return !this.field_83b1c1b0_Dne.containsKey(string) ? 0L : ((zCY)this.field_83b1c1b0_Dne.get((Object)string)).field_2092af_Dne;
        }
        catch (ClassCastException classCastException) {
            throw new kaJ(this.method_1c327bdc_Dne(string, 4, classCastException));
        }
    }

    public void method_fbde2bab_Dne(String string, byte[] byArray) {
        this.field_83b1c1b0_Dne.put(string, new kfd_0(string, byArray));
    }

    private McM method_1c327bdc_Dne(String string, int n, ClassCastException classCastException) {
        McM mcM = McM.method_948e60df_Dne(classCastException, "Reading NBT data");
        Noo noo = mcM.method_424da062_Dne("Corrupt NBT tag", 1);
        noo.method_2aeeb7ad_Dne("Tag type found", new bip(this, string));
        noo.method_2aeeb7ad_Dne("Tag type expected", new nVK(this, n));
        noo.method_5e295ec0_Dne("Tag name", string);
        if (this.method_eecad346_Dne() != null && this.method_eecad346_Dne().length() > 0) {
            noo.method_5e295ec0_Dne("Tag parent", this.method_eecad346_Dne());
        }
        return mcM;
    }

    public void method_5ab43cda_Dne(String string, double d) {
        this.field_83b1c1b0_Dne.put(string, new kJU(string, d));
    }

    public void method_312ec00d_Dne(String string, WkD wkD) {
        this.field_83b1c1b0_Dne.put(string, wkD.method_f2806fae_FWm(string));
    }

    public void method_58996597_Dne(String string, oNe oNe2) {
        this.field_83b1c1b0_Dne.put(string, oNe2.method_f2806fae_FWm(string));
    }

    public short method_8f501fe1_Dne(String string) {
        try {
            return !this.field_83b1c1b0_Dne.containsKey(string) ? (short)0 : ((phA)this.field_83b1c1b0_Dne.get((Object)string)).field_2092b8_Dne;
        }
        catch (ClassCastException classCastException) {
            throw new kaJ(this.method_1c327bdc_Dne(string, 2, classCastException));
        }
    }

    public void method_5ab48f70_Dne(String string, boolean bl) {
        this.method_5ab43558_Dne(string, (byte)(bl ? 1 : 0));
    }

    public byte[] method_5ab3dd79_Dne(String string) {
        try {
            return !this.field_83b1c1b0_Dne.containsKey(string) ? new byte[]{} : ((kfd_0)this.field_83b1c1b0_Dne.get((Object)string)).field_3f1c582_Dne;
        }
        catch (ClassCastException classCastException) {
            throw new kaJ(this.method_1c327bdc_Dne(string, 7, classCastException));
        }
    }
}

