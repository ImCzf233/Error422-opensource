package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class jQO {
    boolean field_2092bf_Dne;
    private ArrayList<jhx> field_dc9cb15_Dne = new ArrayList();

    public synchronized List method_adea226d_Dne() {
        return Collections.unmodifiableList(this.field_dc9cb15_Dne);
    }

    public synchronized boolean method_7a46289e_Dne() {
        return this.field_2092bf_Dne;
    }

    public synchronized void method_7a46289a_Dne() {
        this.field_2092bf_Dne = false;
    }

    public synchronized void method_2006b72_Dne(String string, InetAddress inetAddress) {
        String string2 = TWE.method_39193c_Dne(string);
        String string3 = TWE.method_8dd0853d_FWm(string);
        if (string3 != null) {
            int n = string3.indexOf(58);
            if (n > 0) {
                string3 = inetAddress.getHostAddress() + string3.substring(n);
            }
            boolean bl = false;
            for (jhx jhx2 : this.field_dc9cb15_Dne) {
                if (!jhx2.method_d1f1ed87_FWm().equals(string3)) continue;
                jhx2.method_7a46289a_Dne();
                bl = true;
                break;
            }
            if (!bl) {
                this.field_dc9cb15_Dne.add(new jhx(string2, string3));
                this.field_2092bf_Dne = true;
            }
        }
    }
}

