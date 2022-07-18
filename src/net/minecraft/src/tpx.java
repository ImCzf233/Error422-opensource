package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.FileInputStream;
import java.io.InputStream;

class tpx {
    static int field_2092ae_Dne = 8192;
    static byte[] field_3f1c582_Dne = new byte[field_2092ae_Dne];

    tpx() {
    }

    public static void method_dd431245_Dne(String[] var0) {
        Object var1 = System.in;
        if (var0.length > 0) {
            try {
                var1 = new FileInputStream(var0[0]);
            } catch (Exception var28) {
                System.err.println(var28);
            }
        }

        ytS var2 = new ytS();
        tYH var3 = new tYH();
        aHQ var4 = new aHQ();
        qlF var5 = new qlF();
        Lth var6 = new Lth();
        PRc var7 = new PRc();
        AOl var8 = new AOl();
        MOU var9 = new MOU(var8);
        int var11 = 0;
        var2.method_7a46289a_Dne();

        while(true) {
            boolean var12 = false;
            int var13 = var2.method_ce7f5d9c_Dne(4096);
            byte[] var10 = var2.field_3f1c582_Dne;

            try {
                var11 = ((InputStream)var1).read(var10, var13, 4096);
            } catch (Exception var26) {
                System.err.println(var26);
                System.exit(-1);
            }

            var2.method_117d19dd_FWm(var11);
            if (var2.method_75cc9531_FWm(var4) != 1) {
                if (var11 < 4096) {
                    var2.method_7a46288d_Dne();
                    System.err.println("Done.");
                    return;
                }

                System.err.println("Input does not appear to be an Ogg bitstream.");
                System.exit(1);
            }

            var3.method_ce7f5da9_Dne(var4.method_a98a0653_aFZ());
            var6.method_7a46289a_Dne();
            var7.method_7a46289a_Dne();
            if (var3.method_9c78e170_Dne(var4) < 0) {
                System.err.println("Error reading first page of Ogg bitstream data.");
                System.exit(1);
            }

            if (var3.method_93106d30_FWm(var5) != 1) {
                System.err.println("Error reading initial header packet.");
                System.exit(1);
            }

            if (var6.method_ba5770e3_Dne(var7, var5) < 0) {
                System.err.println("This Ogg bitstream does not contain Vorbis audio data.");
                System.exit(1);
            }

            int var14;
            for(var14 = 0; var14 < 2; var2.method_117d19dd_FWm(var11)) {
                label156:
                while(true) {
                    int var15;
                    do {
                        if (var14 >= 2) {
                            break label156;
                        }

                        var15 = var2.method_75cc9531_FWm(var4);
                        if (var15 == 0) {
                            break label156;
                        }
                    } while(var15 != 1);

                    var3.method_9c78e170_Dne(var4);

                    while(var14 < 2) {
                        var15 = var3.method_93106d30_FWm(var5);
                        if (var15 == 0) {
                            break;
                        }

                        if (var15 == -1) {
                            System.err.println("Corrupt secondary header.  Exiting.");
                            System.exit(1);
                        }

                        var6.method_ba5770e3_Dne(var7, var5);
                        ++var14;
                    }
                }

                var13 = var2.method_ce7f5d9c_Dne(4096);
                var10 = var2.field_3f1c582_Dne;

                try {
                    var11 = ((InputStream)var1).read(var10, var13, 4096);
                } catch (Exception var25) {
                    System.err.println(var25);
                    System.exit(1);
                }

                if (var11 == 0 && var14 < 2) {
                    System.err.println("End of file before finding all Vorbis headers!");
                    System.exit(1);
                }
            }

            byte[][] var29 = var7.field_7a46ee07_Dne;

            for(int var16 = 0; var16 < var29.length && var29[var16] != null; ++var16) {
                System.err.println(new String(var29[var16], 0, var29[var16].length - 1));
            }

            System.err.println("\nBitstream is " + var6.field_21260d_FWm + " channel, " + var6.field_2e5f1b_bzF + "Hz");
            System.err.println("Encoded by: " + new String(var7.field_3f1c582_Dne, 0, var7.field_3f1c582_Dne.length - 1) + "\n");
            field_2092ae_Dne = 4096 / var6.field_21260d_FWm;
            var8.method_7b199b1a_Dne(var6);
            var9.method_664cb829_Dne(var8);
            float[][][] var30 = new float[1][][];
            int[] var31 = new int[var6.field_21260d_FWm];

            while(!var12) {
                label207:
                while(true) {
                    label205:
                    while(true) {
                        if (var12) {
                            break label207;
                        }

                        int var17 = var2.method_75cc9531_FWm(var4);
                        if (var17 == 0) {
                            break label207;
                        }

                        if (var17 == -1) {
                            System.err.println("Corrupt or missing data in bitstream; continuing...");
                        } else {
                            var3.method_9c78e170_Dne(var4);

                            while(true) {
                                do {
                                    var17 = var3.method_93106d30_FWm(var5);
                                    if (var17 == 0) {
                                        if (var4.method_907a9d14_Qnq() != 0) {
                                            var12 = true;
                                        }
                                        continue label205;
                                    }
                                } while(var17 == -1);

                                if (var9.method_b9bcb96f_Dne(var5) == 0) {
                                    var8.method_7abc6b07_Dne(var9);
                                }

                                int var18;
                                while((var18 = var8.method_eb4f9bc6_Dne(var30, var31)) > 0) {
                                    float[][] var19 = var30[0];
                                    int var20 = var18 < field_2092ae_Dne ? var18 : field_2092ae_Dne;

                                    for(var14 = 0; var14 < var6.field_21260d_FWm; ++var14) {
                                        int var21 = var14 * 2;
                                        int var22 = var31[var14];

                                        for(int var23 = 0; var23 < var20; ++var23) {
                                            int var24 = (int)((double)var19[var14][var22 + var23] * 32767.0D);
                                            if (var24 > 32767) {
                                                var24 = 32767;
                                            }

                                            if (var24 < -32768) {
                                                var24 = -32768;
                                            }

                                            if (var24 < 0) {
                                                var24 |= 32768;
                                            }

                                            field_3f1c582_Dne[var21] = (byte)var24;
                                            field_3f1c582_Dne[var21 + 1] = (byte)(var24 >>> 8);
                                            var21 += 2 * var6.field_21260d_FWm;
                                        }
                                    }

                                    System.out.write(field_3f1c582_Dne, 0, 2 * var6.field_21260d_FWm * var20);
                                    var8.method_ce7f5d9c_Dne(var20);
                                }
                            }
                        }
                    }
                }

                if (!var12) {
                    var13 = var2.method_ce7f5d9c_Dne(4096);
                    var10 = var2.field_3f1c582_Dne;

                    try {
                        var11 = ((InputStream)var1).read(var10, var13, 4096);
                    } catch (Exception var27) {
                        System.err.println(var27);
                        System.exit(1);
                    }

                    var2.method_117d19dd_FWm(var11);
                    if (var11 == 0) {
                        var12 = true;
                    }
                }
            }

            var3.method_7c6f6039_FWm();
            var9.method_7a46288d_Dne();
            var8.method_7a46289a_Dne();
            var6.method_7c6f6039_FWm();
        }
    }
}

