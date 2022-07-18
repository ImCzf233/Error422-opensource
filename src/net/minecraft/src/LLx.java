package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LLx {
    private List field_f27c122c_Dne;
    private Map field_83b1c1b0_Dne = new HashMap();
    private iDE field_3769502_Dne;
    private Map field_da2182cf_FWm;

    private void method_7c6f6039_FWm() {
        try {
            this.field_da2182cf_FWm.clear();
            if (this.field_3769502_Dne == null) {
                return;
            }
            File file = this.field_3769502_Dne.method_fac597a9_Dne("idcounts");
            if (file != null && file.exists()) {
                DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                WkD wkD = VVx.method_cd26dcc4_Dne(dataInputStream);
                dataInputStream.close();
                for (oNe oNe2 : wkD.method_be5f586d_Dne()) {
                    if (!(oNe2 instanceof phA)) continue;
                    phA phA2 = (phA)oNe2;
                    String string = phA2.method_eecad346_Dne();
                    short s = phA2.field_2092b8_Dne;
                    this.field_da2182cf_FWm.put(string, s);
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public LLx(iDE iDE2) {
        this.field_f27c122c_Dne = new ArrayList();
        this.field_da2182cf_FWm = new HashMap();
        this.field_3769502_Dne = iDE2;
        this.method_7c6f6039_FWm();
    }

    public int method_8f501fd7_Dne(String string) {
        Short s = (Short)this.field_da2182cf_FWm.get(string);
        s = s == null ? Short.valueOf((short)0) : Short.valueOf((short)(s + 1));
        this.field_da2182cf_FWm.put(string, s);
        if (this.field_3769502_Dne == null) {
            return s.shortValue();
        }
        try {
            File file = this.field_3769502_Dne.method_fac597a9_Dne("idcounts");
            if (file != null) {
                Object object2;
                WkD wkD = new WkD();
                for (Object object : this.field_da2182cf_FWm.keySet()) {
                    short s2 = (Short)this.field_da2182cf_FWm.get(object);
                    wkD.method_5ab47529_Dne((String)object, s2);
                }
                object2 = new DataOutputStream(new FileOutputStream(file));
                VVx.method_eee5c69f_Dne(wkD, (DataOutput)object2);
                ((FilterOutputStream)object2).close();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return s.shortValue();
    }

    public vWZ method_64d498e5_Dne(Class clazz, String string) {
        vWZ vWZ2;
        block7: {
            vWZ2 = (vWZ)this.field_83b1c1b0_Dne.get(string);
            if (vWZ2 != null) {
                return vWZ2;
            }
            if (this.field_3769502_Dne != null) {
                try {
                    File file = this.field_3769502_Dne.method_fac597a9_Dne(string);
                    if (file == null || !file.exists()) break block7;
                    try {
                        vWZ2 = (vWZ)clazz.getConstructor(String.class).newInstance(string);
                    }
                    catch (Exception exception) {
                        throw new RuntimeException("Failed to instantiate " + clazz.toString(), exception);
                    }
                    FileInputStream fileInputStream = new FileInputStream(file);
                    WkD wkD = VVx.method_2bf75d1a_Dne(fileInputStream);
                    fileInputStream.close();
                    vWZ2.method_8d4fb917_Dne(wkD.method_2851c945_Dne("data"));
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
        if (vWZ2 != null) {
            this.field_83b1c1b0_Dne.put(string, vWZ2);
            this.field_f27c122c_Dne.add(vWZ2);
        }
        return vWZ2;
    }

    public void method_7a46289a_Dne() {
        for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
            vWZ vWZ2 = (vWZ)this.field_f27c122c_Dne.get(i);
            if (!vWZ2.method_7a46289e_Dne()) continue;
            this.method_c1261e6e_Dne(vWZ2);
            vWZ2.method_ce7f9d7a_Dne(false);
        }
    }

    public void method_65052564_Dne(String string, vWZ vWZ2) {
        if (vWZ2 == null) {
            throw new RuntimeException("Can't set null data");
        }
        if (this.field_83b1c1b0_Dne.containsKey(string)) {
            this.field_f27c122c_Dne.remove(this.field_83b1c1b0_Dne.remove(string));
        }
        this.field_83b1c1b0_Dne.put(string, vWZ2);
        this.field_f27c122c_Dne.add(vWZ2);
    }

    private void method_c1261e6e_Dne(vWZ vWZ2) {
        if (this.field_3769502_Dne != null) {
            try {
                File file = this.field_3769502_Dne.method_fac597a9_Dne(vWZ2.field_569fcf45_Dne);
                if (file != null) {
                    WkD wkD = new WkD();
                    vWZ2.method_66a36cd8_FWm(wkD);
                    WkD wkD2 = new WkD();
                    wkD2.method_312ec00d_Dne("data", wkD);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    VVx.method_b3febbc9_Dne(wkD2, fileOutputStream);
                    fileOutputStream.close();
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}

