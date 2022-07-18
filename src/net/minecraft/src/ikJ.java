package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ikJ {
    public int field_2092ae_Dne = 0;
    public boolean field_2092bf_Dne = true;
    private Random field_7331eae7_Dne = new Random();
    private Map field_83b1c1b0_Dne = new HashMap();
    private List field_f27c122c_Dne = new ArrayList();

    public OfD method_eb936a7f_Dne(String string, File file) {
        try {
            String string2 = string;
            string = string.substring(0, string.indexOf("."));
            if (this.field_2092bf_Dne) {
                while (Character.isDigit(string.charAt(string.length() - 1))) {
                    string = string.substring(0, string.length() - 1);
                }
            }
            if (!this.field_83b1c1b0_Dne.containsKey(string = string.replaceAll("/", "."))) {
                this.field_83b1c1b0_Dne.put(string, new ArrayList());
            }
            OfD ofD = new OfD(string2, file.toURI().toURL());
            ((List)this.field_83b1c1b0_Dne.get(string)).add(ofD);
            this.field_f27c122c_Dne.add(ofD);
            ++this.field_2092ae_Dne;
            return ofD;
        }
        catch (MalformedURLException malformedURLException) {
            malformedURLException.printStackTrace();
            throw new RuntimeException(malformedURLException);
        }
    }

    public OfD method_2304d13e_Dne() {
        return this.field_f27c122c_Dne.isEmpty() ? null : (OfD)this.field_f27c122c_Dne.get(this.field_7331eae7_Dne.nextInt(this.field_f27c122c_Dne.size()));
    }

    public OfD method_284e1388_Dne(String string) {
        List list = (List)this.field_83b1c1b0_Dne.get(string);
        return list == null ? null : (OfD)list.get(this.field_7331eae7_Dne.nextInt(list.size()));
    }
}

