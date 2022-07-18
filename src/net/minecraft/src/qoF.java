package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class qoF {
    qoF() {
    }

    public static void method_dd431245_Dne(String[] stringArray) {
        JQZ jQZ = null;
        try {
            jQZ = stringArray.length > 0 ? new JQZ(stringArray[0]) : new JQZ(System.in, null, -1);
        }
        catch (Exception exception) {
            System.err.println(exception);
            return;
        }
        if (jQZ.method_7a46289e_Dne()) {
            System.out.println("Input bitstream contained " + jQZ.method_907a9d14_Qnq() + " logical bitstream section(s).");
            System.out.println("Total bitstream playing time: " + jQZ.method_ce7f5d99_Dne(-1) + " seconds\n");
        } else {
            System.out.println("Standard input was not seekable.");
            System.out.println("First logical bitstream information:\n");
        }
        for (int i = 0; i < jQZ.method_907a9d14_Qnq(); ++i) {
            Lth lth = jQZ.method_9e6dc29a_Dne(i);
            System.out.println("\tlogical bitstream section " + (i + 1) + " information:");
            System.out.println("\t\t" + lth.field_2e5f1b_bzF + "Hz " + lth.field_21260d_FWm + " channels bitrate " + jQZ.method_117d19dd_FWm(i) / 1000 + "kbps serial number=" + jQZ.method_143f9e0f_bzF(i));
            System.out.print("\t\tcompressed length: " + jQZ.method_ce7f5d9d_Dne(i) + " bytes ");
            System.out.println(" play time: " + jQZ.method_ce7f5d99_Dne(i) + "s");
            PRc pRc = jQZ.method_9e6f13d9_Dne(i);
            System.out.println(pRc);
        }
    }
}

