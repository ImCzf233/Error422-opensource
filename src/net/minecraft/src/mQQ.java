package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class mQQ
extends Thread {
    final iJs field_376b11a_Dne;

    mQQ(iJs iJs2) {
        this.field_376b11a_Dne = iJs2;
    }

    @Override
    public void run() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String string;
            while (!this.field_376b11a_Dne.method_998e662d_Vxn() && this.field_376b11a_Dne.method_9a443a9d_XHL() && (string = bufferedReader.readLine()) != null) {
                this.field_376b11a_Dne.method_4ca8d65b_Dne(string, this.field_376b11a_Dne);
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }
}

