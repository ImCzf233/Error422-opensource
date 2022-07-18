package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bkx {
    private final Map field_83b1c1b0_Dne;
    private final List field_f27c122c_Dne = new ArrayList();
    private String field_569fcf45_Dne = "";
    private final List field_6a0474ed_FWm = new ArrayList();
    public boolean field_2092bf_Dne = false;

    public String method_eecad346_Dne() {
        return this.field_f27c122c_Dne.size() == 0 ? "[UNKNOWN]" : (String)this.field_f27c122c_Dne.get(this.field_f27c122c_Dne.size() - 1);
    }

    public List method_b6fd6de3_Dne(String string) {
        if (!this.field_2092bf_Dne) {
            return null;
        }
        long l = this.field_83b1c1b0_Dne.containsKey("root") ? (Long)this.field_83b1c1b0_Dne.get("root") : 0L;
        long l2 = this.field_83b1c1b0_Dne.containsKey(string) ? (Long)this.field_83b1c1b0_Dne.get(string) : -1L;
        ArrayList<Gup> arrayList = new ArrayList<Gup>();
        if (string.length() > 0) {
            string = string + ".";
        }
        long l3 = 0L;
        for (Object obj : this.field_83b1c1b0_Dne.keySet()) {String string2 = (String) obj;
            if (string2.length() <= string.length() || !string2.startsWith(string) || string2.indexOf(".", string.length() + 1) >= 0) continue;
            l3 += ((Long)this.field_83b1c1b0_Dne.get(string2)).longValue();
        }
        float f = l3;
        if (l3 < l2) {
            l3 = l2;
        }
        if (l < l3) {
            l = l3;
        }
        for (Object obj : this.field_83b1c1b0_Dne.keySet()) {String string3 = (String) obj;
            if (string3.length() <= string.length() || !string3.startsWith(string) || string3.indexOf(".", string.length() + 1) >= 0) continue;
            long l4 = (Long)this.field_83b1c1b0_Dne.get(string3);
            double d = (double)l4 * 100.0 / (double)l3;
            double d2 = (double)l4 * 100.0 / (double)l;
            String string4 = string3.substring(string.length());
            arrayList.add(new Gup(string4, d, d2));
        }
        for (Object obj : this.field_83b1c1b0_Dne.keySet()) {String string3 = (String) obj;
            this.field_83b1c1b0_Dne.put(string3, (Long)this.field_83b1c1b0_Dne.get(string3) * 999L / 1000L);
        }
        if ((float)l3 > f) {
            arrayList.add(new Gup("unspecified", (double)((float)l3 - f) * 100.0 / (double)l3, (double)((float)l3 - f) * 100.0 / (double)l));
        }
        Collections.sort(arrayList);
        arrayList.add(0, new Gup(string, 100.0, (double)l3 * 100.0 / (double)l));
        return arrayList;
    }

    public void method_8f501fe4_Dne(String string) {
        if (this.field_2092bf_Dne) {
            if (this.field_569fcf45_Dne.length() > 0) {
                this.field_569fcf45_Dne = this.field_569fcf45_Dne + ".";
            }
            this.field_569fcf45_Dne = this.field_569fcf45_Dne + string;
            this.field_f27c122c_Dne.add(this.field_569fcf45_Dne);
            this.field_6a0474ed_FWm.add(System.nanoTime());
        }
    }

    public void method_7c6f6039_FWm() {
        if (this.field_2092bf_Dne) {
            long l = System.nanoTime();
            long l2 = (Long)this.field_6a0474ed_FWm.remove(this.field_6a0474ed_FWm.size() - 1);
            this.field_f27c122c_Dne.remove(this.field_f27c122c_Dne.size() - 1);
            long l3 = l - l2;
            if (this.field_83b1c1b0_Dne.containsKey(this.field_569fcf45_Dne)) {
                this.field_83b1c1b0_Dne.put(this.field_569fcf45_Dne, (Long)this.field_83b1c1b0_Dne.get(this.field_569fcf45_Dne) + l3);
            } else {
                this.field_83b1c1b0_Dne.put(this.field_569fcf45_Dne, l3);
            }
            if (l3 > 100000000L) {
                System.out.println("Something's taking too long! '" + this.field_569fcf45_Dne + "' took aprox " + (double)l3 / 1000000.0 + " ms");
            }
            this.field_569fcf45_Dne = !this.field_f27c122c_Dne.isEmpty() ? (String)this.field_f27c122c_Dne.get(this.field_f27c122c_Dne.size() - 1) : "";
        }
    }

    public void method_110c4dc3_FWm(String string) {
        this.method_7c6f6039_FWm();
        this.method_8f501fe4_Dne(string);
    }

    public Bkx() {
        this.field_83b1c1b0_Dne = new HashMap();
    }

    public void method_7a46289a_Dne() {
        this.field_83b1c1b0_Dne.clear();
        this.field_569fcf45_Dne = "";
        this.field_f27c122c_Dne.clear();
    }
}

