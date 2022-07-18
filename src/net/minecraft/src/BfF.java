package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class BfF {
    private Random field_7331eae7_Dne = new Random();
    private String[] field_f5e54dca_Dne = "the elder scrolls klaatu berata niktu xyzzy bless curse light darkness fire air earth water hot dry cold wet ignite snuff embiggen twist shorten stretch fiddle destroy imbue galvanize enchant free limited range of towards inside sphere cube self other ball mental physical grow shrink demon elemental spirit animal creature beast humanoid undead fresh stale ".split(" ");
    public static final BfF field_3655a4a_Dne = new BfF();

    public void method_ce7f616a_Dne(long l) {
        this.field_7331eae7_Dne.setSeed(l);
    }

    public String method_eecad346_Dne() {
        int n = this.field_7331eae7_Dne.nextInt(2) + 3;
        String string = "";
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                string = string + " ";
            }
            string = string + this.field_f5e54dca_Dne[this.field_7331eae7_Dne.nextInt(this.field_f5e54dca_Dne.length)];
        }
        return string;
    }
}

