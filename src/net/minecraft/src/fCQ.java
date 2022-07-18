package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.Minecraft;

public class fCQ
implements Rbp {
    private final Map field_83b1c1b0_Dne;
    private final HashMap field_ecf0af5e_Dne = new HashMap();
    private final String field_d9a85c6_FWm;
    private xPm field_37d9877_Dne;
    private final String field_569fcf45_Dne;
    private final int field_2092ae_Dne;
    private final List<xPm> field_f27c122c_Dne;
    private final String field_c480ca78_bzF;
    private BufferedImage field_92a31c00_Dne = new BufferedImage(64, 64, 2);
    private dmo field_374ee26_Dne;

    public void method_7c6f6039_FWm() {
        for (xPm xPm2 : this.field_f27c122c_Dne) {
            xPm2.method_7a46289a_Dne();
        }
    }

    @Override
    public gDn method_285881e4_Dne(String string) {
        xPm xPm2;
        if (string == null) {
            new RuntimeException("Don't register null!").printStackTrace();
        }
        if ((xPm2 = (xPm)this.field_83b1c1b0_Dne.get(string)) == null) {
            xPm2 = xPm.method_28606920_Dne(string);
            this.field_83b1c1b0_Dne.put(string, xPm2);
        }
        return xPm2;
    }

    public fCQ(int n, String string, String string2, BufferedImage bufferedImage) {
        this.field_f27c122c_Dne = new ArrayList();
        this.field_83b1c1b0_Dne = new HashMap();
        this.field_2092ae_Dne = n;
        this.field_569fcf45_Dne = string;
        this.field_d9a85c6_FWm = string2;
        this.field_c480ca78_bzF = ".png";
        this.field_92a31c00_Dne = bufferedImage;
    }

    public dmo method_230e7c85_Dne() {
        return this.field_374ee26_Dne;
    }

    public gDn method_230f3f9a_Dne() {
        return this.field_37d9877_Dne;
    }

    public void method_7a46289a_Dne() {
        Object object;
        Object object2;
        Object object3;
        this.field_83b1c1b0_Dne.clear();
        if (this.field_2092ae_Dne == 0) {
            for (zKP object42 : zKP.field_8374b848_Dne) {
                if (object42 == null) continue;
                object42.method_845caac7_Dne(this);
            }
            Minecraft.method_81a5f12e_Dne().field_37b59c1_Dne.method_845caac7_Dne(this);
            ptH.field_37a7828_Dne.method_845caac7_Dne(this);
        }
        for (dEr dEr2 : dEr.field_836aa5b6_Dne) {
            if (dEr2 == null || dEr2.method_ae128dba_bzF() != this.field_2092ae_Dne) continue;
            dEr2.method_845caac7_Dne(this);
        }
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        dGv dGv2 = zpX.method_23188529_Dne().method_28573102_Dne(this.field_569fcf45_Dne);
        this.field_ecf0af5e_Dne.clear();
        this.field_f27c122c_Dne.clear();
        dmo dmo2 = zpX.method_23188529_Dne().method_955da625_Dne("missingno", 2, this.field_92a31c00_Dne.getWidth(), this.field_92a31c00_Dne.getHeight(), 10496, 6408, 9728, 9728, false, this.field_92a31c00_Dne);
        WbP wbP = new WbP(dmo2);
        dGv2.method_8cd65a02_Dne(wbP);
        hashMap.put(wbP, Arrays.asList(dmo2));
        for (Object object4 : this.field_83b1c1b0_Dne.keySet()) {
            object3 = this.field_d9a85c6_FWm + (String)object4 + this.field_c480ca78_bzF;
            object2 = zpX.method_23188529_Dne().method_b6fd6de3_Dne((String)object3);
            if (((List) object2).isEmpty()) continue;
            object = new WbP((dmo)((List) object2).get(0));
            dGv2.method_8cd65a02_Dne((WbP)object);
            hashMap.put(object, object2);
        }
        dGv2.method_7a46289a_Dne();
        this.field_374ee26_Dne = dGv2.method_230e7c85_Dne();
        for (Object object4 : dGv2.method_adea226d_Dne()) {
            object3 = ((wjH)object4).method_230866a6_Dne();
            object2 = ((WbP)object3).method_230e7c85_Dne();
            object = ((dmo)object2).method_eecad346_Dne();
            List list = (List)hashMap.get(object3);
            xPm xPm2 = (xPm)this.field_83b1c1b0_Dne.get(object);
            boolean bl = false;
            if (xPm2 == null) {
                bl = true;
                xPm2 = xPm.method_28606920_Dne((String)object);
                if (!((String)object).equals("missingno")) {
                    Minecraft.method_81a5f12e_Dne().method_230e0120_Dne().method_110c4dc3_FWm("Couldn't find premade icon for " + (String)object + " doing " + this.field_569fcf45_Dne);
                }
            }
            xPm2.method_b279e42_Dne(this.field_374ee26_Dne, list, ((wjH)object4).method_7a46288d_Dne(), ((wjH)object4).method_7c6f602c_FWm(), ((WbP)object3).method_230e7c85_Dne().method_ae128dba_bzF(), ((WbP)object3).method_230e7c85_Dne().method_907a9d14_Qnq(), ((WbP)object3).method_7a46289e_Dne());
            this.field_ecf0af5e_Dne.put(object, xPm2);
            if (!bl) {
                this.field_83b1c1b0_Dne.remove(object);
            }
            if (list.size() <= 1) continue;
            this.field_f27c122c_Dne.add(xPm2);
            String string = this.field_d9a85c6_FWm + (String)object + ".txt";
            Gax gax = Minecraft.method_81a5f12e_Dne().field_373a352_Dne.method_230121cd_Dne();
            boolean bl2 = !gax.method_5ab48f74_Dne("/" + this.field_d9a85c6_FWm + (String)object + ".png", false);
            try {
                InputStream inputStream = gax.method_435fb273_Dne("/" + string, bl2);
                Minecraft.method_81a5f12e_Dne().method_230e0120_Dne().method_8f501fe4_Dne("Found animation info for: " + string);
                xPm2.method_176c78b_Dne(new BufferedReader(new InputStreamReader(inputStream)));
            }
            catch (IOException iOException) {}
        }
        this.field_37d9877_Dne = (xPm)this.field_ecf0af5e_Dne.get("missingno");
        for (Object object4 : this.field_83b1c1b0_Dne.values()) {
            ((xPm)object4).method_c435ce32_Dne(this.field_37d9877_Dne);
        }
        this.field_374ee26_Dne.method_8f501fe4_Dne("debug.stitched_" + this.field_569fcf45_Dne + ".png");
        this.field_374ee26_Dne.method_7a46289a_Dne();
    }
}

