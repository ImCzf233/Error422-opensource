package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SFA {
    private final Map field_11f0a3b7_Qnq;
    private final vfE[] field_83734ad2_Dne;
    private final Map<Object, Map> field_416cb5d_bzF;
    private final Map field_da2182cf_FWm;
    private final Map field_7c692676_aFZ;
    private final Map field_83b1c1b0_Dne = new HashMap();

    public vfE method_46dbd964_Dne(String string, PAf pAf) {
        vfE vfE2 = this.method_285fce20_Dne(string);
        if (vfE2 != null) {
            throw new IllegalArgumentException("An objective with the name '" + string + "' already exists!");
        }
        vfE2 = new vfE(this, string, pAf);
        ArrayList<vfE> arrayList = (ArrayList<vfE>)this.field_da2182cf_FWm.get(pAf);
        if (arrayList == null) {
            arrayList = new ArrayList<vfE>();
            this.field_da2182cf_FWm.put(pAf, arrayList);
        }
        arrayList.add(vfE2);
        this.field_83b1c1b0_Dne.put(string, vfE2);
        this.method_9b43a6f3_FWm(vfE2);
        return vfE2;
    }

    public void method_b3c88f83_Dne(int n, vfE vfE2) {
        this.field_83734ad2_Dne[n] = vfE2;
    }

    public Collection<OHz> method_6efe9cd5_Dne(vfE vfE2) {
        ArrayList<OHz> arrayList = new ArrayList<OHz>();
        for (Map map : this.field_416cb5d_bzF.values()) {
            OHz oHz = (OHz)map.get(vfE2);
            if (oHz == null) continue;
            arrayList.add(oHz);
        }
        Collections.sort(arrayList, OHz.field_740a65b4_Dne);
        return arrayList;
    }

    public void method_110c4dc3_FWm(String string) {
    }

    public void method_8f501fe4_Dne(String string) {
        Map map = (Map)this.field_416cb5d_bzF.remove(string);
        if (map != null) {
            this.method_110c4dc3_FWm(string);
        }
    }

    public void method_329d9786_Dne(String string, YGE yGE) {
        if (this.method_d74cc06b_bzF(string) != null) {
            this.method_8f501fe8_Dne(string);
        }
        this.field_7c692676_aFZ.put(string, yGE);
        yGE.method_be5f586d_Dne().add(string);
    }

    public Collection method_b2c709d5_Dne(PAf pAf) {
        Collection collection = (Collection)this.field_da2182cf_FWm.get(pAf);
        return collection == null ? new ArrayList() : new ArrayList(collection);
    }

    public void method_c1eff332_Dne(vfE vfE2) {
        this.field_83b1c1b0_Dne.remove(vfE2.method_eecad346_Dne());
        for (int i = 0; i < 3; ++i) {
            if (this.method_9e80a165_Dne(i) != vfE2) continue;
            this.method_b3c88f83_Dne(i, null);
        }
        List list = (List)this.field_da2182cf_FWm.get(vfE2.method_2304bed6_Dne());
        if (list != null) {
            list.remove(vfE2);
        }
        for (Map map : this.field_416cb5d_bzF.values()) {
            map.remove(vfE2);
        }
        this.method_44c23b0b_Qnq(vfE2);
    }

    public void method_80b35f83_bzF(YGE yGE) {
    }

    public Collection method_d9c0ce46_Qnq() {
        return this.field_11f0a3b7_Qnq.keySet();
    }

    public Map method_924a9319_Dne(String string) {
        HashMap hashMap = (HashMap)this.field_416cb5d_bzF.get(string);
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        return hashMap;
    }

    public void method_44c23b0b_Qnq(vfE vfE2) {
    }

    public YGE method_28522afe_Dne(String string) {
        return (YGE)this.field_11f0a3b7_Qnq.get(string);
    }

    public YGE method_f276515d_FWm(String string) {
        YGE yGE = this.method_28522afe_Dne(string);
        if (yGE != null) {
            throw new IllegalArgumentException("An objective with the name '" + string + "' already exists!");
        }
        yGE = new YGE(this, string);
        this.field_11f0a3b7_Qnq.put(string, yGE);
        this.method_68124451_FWm(yGE);
        return yGE;
    }

    public vfE method_285fce20_Dne(String string) {
        return (vfE)this.field_83b1c1b0_Dne.get(string);
    }

    public Collection<YGE> method_4485f267_aFZ() {
        return this.field_11f0a3b7_Qnq.values();
    }

    public void method_acfe3d07_FWm(String string, YGE yGE) {
        if (this.method_d74cc06b_bzF(string) != yGE) {
            throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + yGE.method_eecad346_Dne() + "'.");
        }
        this.field_7c692676_aFZ.remove(string);
        yGE.method_be5f586d_Dne().remove(string);
    }

    public Collection method_27fd6a2e_FWm() {
        return this.field_416cb5d_bzF.keySet();
    }

    public static String method_2c0e7e17_Dne(int n) {
        switch (n) {
            case 0: {
                return "list";
            }
            case 1: {
                return "sidebar";
            }
            case 2: {
                return "belowName";
            }
        }
        return null;
    }

    public void method_1190d869_Qnq(YGE yGE) {
    }

    public void method_8ebe9090_Dne(YGE yGE) {
        this.field_11f0a3b7_Qnq.remove(yGE.method_eecad346_Dne());
        for (Object obj : yGE.method_be5f586d_Dne()) {String string = (String) obj;
            this.field_7c692676_aFZ.remove(string);
        }
        this.method_1190d869_Qnq(yGE);
    }

    public vfE method_9e80a165_Dne(int n) {
        return this.field_83734ad2_Dne[n];
    }

    public SFA() {
        this.field_da2182cf_FWm = new HashMap();
        this.field_416cb5d_bzF = new HashMap();
        this.field_83734ad2_Dne = new vfE[3];
        this.field_11f0a3b7_Qnq = new HashMap();
        this.field_7c692676_aFZ = new HashMap();
    }

    public void method_68124451_FWm(YGE yGE) {
    }

    public YGE method_d74cc06b_bzF(String string) {
        return (YGE)this.field_7c692676_aFZ.get(string);
    }

    public static int method_8f501fd7_Dne(String string) {
        return string.equalsIgnoreCase("list") ? 0 : (string.equalsIgnoreCase("sidebar") ? 1 : (string.equalsIgnoreCase("belowName") ? 2 : -1));
    }

    public Collection method_8a35e160_bzF() {
        Collection<Map> collection = this.field_416cb5d_bzF.values();
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            for (Map map : collection) {
                arrayList.addAll(map.values());
            }
        }
        return arrayList;
    }

    public void method_b3e4c225_bzF(vfE vfE2) {
    }

    public boolean method_8f501fe8_Dne(String string) {
        YGE yGE = this.method_d74cc06b_bzF(string);
        if (yGE != null) {
            this.method_acfe3d07_FWm(string, yGE);
            return true;
        }
        return false;
    }

    public OHz method_938dc1b8_Dne(String string, vfE vfE2) {
        OHz oHz;
        HashMap hashMap = (HashMap)this.field_416cb5d_bzF.get(string);
        if (hashMap == null) {
            hashMap = new HashMap();
            this.field_416cb5d_bzF.put(string, hashMap);
        }
        if ((oHz = (OHz)hashMap.get(vfE2)) == null) {
            oHz = new OHz(this, vfE2, string);
            ((Map)hashMap).put(vfE2, oHz);
        }
        return oHz;
    }

    public Collection method_be5f586d_Dne() {
        return this.field_83b1c1b0_Dne.values();
    }

    public void method_7dd44986_Dne(OHz oHz) {
    }

    public void method_9b43a6f3_FWm(vfE vfE2) {
    }
}

