package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.client.Minecraft;

public class ark {
    private Map field_83b1c1b0_Dne;
    private final File field_d102ba32_Dne;
    private List field_f27c122c_Dne = new ArrayList();
    private final File field_fd16d933_FWm;
    private Gax field_20215f4d_FWm;
    private static final Gax field_367936e_Dne = new Fso();
    private boolean field_2092bf_Dne;
    private final Minecraft field_493682ed_Dne;

    public List method_adea226d_Dne() {
        return Collections.unmodifiableList(this.field_f27c122c_Dne);
    }

    static Gax method_f87771ec_FWm() {
        return field_367936e_Dne;
    }

    static boolean method_9ed48e51_Dne(ark ark2) {
        return ark2.field_2092bf_Dne;
    }

    private void method_7ccd8a5b_Dne(String string, File file) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        Nde nde = new Nde();
        hashMap.put("X-Minecraft-Username", this.field_493682ed_Dne.field_37d3e5f_Dne.field_569fcf45_Dne);
        hashMap.put("X-Minecraft-Version", "UNKNOWN");
        hashMap.put("X-Minecraft-Supported-Resolutions", "16");
        this.field_2092bf_Dne = true;
        this.field_493682ed_Dne.method_b88fcbd2_Dne(nde);
        fgp.method_78a7cff_Dne(file, string, new bwp(this), hashMap, 10000000, nde);
    }

    public ark(File file, Minecraft minecraft) {
        this.field_83b1c1b0_Dne = new HashMap();
        this.field_493682ed_Dne = minecraft;
        this.field_d102ba32_Dne = new File(file, "texturepacks");
        this.field_fd16d933_FWm = new File(file, "texturepacks-mp-cache");
        this.method_ae128dc7_bzF();
        this.method_7c6f6039_FWm();
    }

    private String method_6e636c2f_Dne(File file) {
        return file.isFile() && file.getName().toLowerCase().endsWith(".zip") ? file.getName() + ":" + file.length() + ":" + file.lastModified() : (file.isDirectory() && new File(file, "pack.txt").exists() ? file.getName() + ":folder:" + file.lastModified() : null);
    }

    static String method_7b05101c_Dne(ark ark2, File file) {
        return ark2.method_6e636c2f_Dne(file);
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2092bf_Dne;
    }

    static Gax method_6c4b34c9_Dne(ark ark2, Gax gax) {
        ark2.field_20215f4d_FWm = gax;
        return ark2.field_20215f4d_FWm;
    }

    public boolean method_ae128dcb_bzF() {
        if (!this.field_493682ed_Dne.field_3758af7_Dne.field_33449d_mrb) {
            return false;
        }
        etB etB2 = this.field_493682ed_Dne.method_230f05b8_Dne();
        return etB2 == null ? false : etB2.method_7a46289e_Dne();
    }

    public Gax method_230121cd_Dne() {
        return this.field_20215f4d_FWm;
    }

    private void method_ae128dc7_bzF() {
        if (!this.field_d102ba32_Dne.isDirectory()) {
            this.field_d102ba32_Dne.delete();
            this.field_d102ba32_Dne.mkdirs();
        }
        if (!this.field_fd16d933_FWm.isDirectory()) {
            this.field_fd16d933_FWm.delete();
            this.field_fd16d933_FWm.mkdirs();
        }
    }

    static Minecraft method_8e47951b_Dne(ark ark2) {
        return ark2.field_493682ed_Dne;
    }

    public void method_7c6f6039_FWm() {
        ArrayList var1 = new ArrayList();
        this.field_20215f4d_FWm = field_367936e_Dne;
        var1.add(field_367936e_Dne);
        Iterator var2 = this.method_64e4d8ee_FWm().iterator();

        while(var2.hasNext()) {
            File var3 = (File)var2.next();
            String var4 = this.method_6e636c2f_Dne(var3);
            if (var4 != null) {
                Object var5 = (Gax)this.field_83b1c1b0_Dne.get(var4);
                if (var5 == null) {
                    var5 = var3.isDirectory() ? new WUf(var4, var3, field_367936e_Dne) : new eqx(var4, var3, field_367936e_Dne);
                    this.field_83b1c1b0_Dne.put(var4, var5);
                }

                if (((Gax)var5).method_d1f1ed87_FWm().equals(this.field_493682ed_Dne.field_3758af7_Dne.field_569fcf45_Dne)) {
                    this.field_20215f4d_FWm = (Gax)var5;
                }

                var1.add(var5);
            }
        }

        this.field_f27c122c_Dne.removeAll(var1);
        var2 = this.field_f27c122c_Dne.iterator();

        while(var2.hasNext()) {
            Gax var6 = (Gax)var2.next();
            var6.method_86b6fa7a_Dne(this.field_493682ed_Dne.field_36d36bf_Dne);
            this.field_83b1c1b0_Dne.remove(var6.method_eecad346_Dne());
        }

        this.field_f27c122c_Dne = var1;
    }

    public void method_8f501fe4_Dne(String string) {
        String string2 = string.substring(string.lastIndexOf("/") + 1);
        if (string2.contains("?")) {
            string2 = string2.substring(0, string2.indexOf("?"));
        }
        if (string2.endsWith(".zip")) {
            File file = new File(this.field_fd16d933_FWm, string2);
            this.method_7ccd8a5b_Dne(string, file);
        }
    }

    public boolean method_7c6f603d_FWm() {
        if (!this.field_493682ed_Dne.field_3758af7_Dne.field_33449d_mrb) {
            return false;
        }
        etB etB2 = this.field_493682ed_Dne.method_230f05b8_Dne();
        return etB2 == null ? true : etB2.method_7c6f603d_FWm();
    }

    public void method_7a46289a_Dne() {
        this.field_2092bf_Dne = false;
        this.method_7c6f6039_FWm();
        this.field_493682ed_Dne.method_c073daf8_mrb();
    }

    public boolean method_718ce76d_Dne(Gax gax) {
        if (gax == this.field_20215f4d_FWm) {
            return false;
        }
        this.field_2092bf_Dne = false;
        this.field_20215f4d_FWm = gax;
        this.field_493682ed_Dne.field_3758af7_Dne.field_569fcf45_Dne = gax.method_d1f1ed87_FWm();
        this.field_493682ed_Dne.field_3758af7_Dne.method_7c6f6039_FWm();
        return true;
    }

    private List method_64e4d8ee_FWm() {
        return this.field_d102ba32_Dne.exists() && this.field_d102ba32_Dne.isDirectory() ? Arrays.asList(this.field_d102ba32_Dne.listFiles()) : Collections.emptyList();
    }
}

