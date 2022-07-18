package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

class dvr
extends Thread {
    final muh field_37922ac_Dne;
    final TIk field_36d2096_Dne;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        block57: {
            block62: {
                block61: {
                    block60: {
                        block59: {
                            Object object;
                            boolean bl = false;
                            try {
                                bl = true;
                                if (!this.field_37922ac_Dne.field_21261e_FWm) {
                                    this.field_37922ac_Dne.field_21261e_FWm = true;
                                    this.field_37922ac_Dne.field_21260e_FWm = -2L;
                                    this.field_37922ac_Dne.field_309c90bc_DyG = "";
                                    wWl.method_7c6f602c_FWm();
                                    long l = System.nanoTime();
                                    wWl.method_5ec0aea6_Dne(this.field_36d2096_Dne.field_37d3e40_Dne, this.field_37922ac_Dne);
                                    long l2 = System.nanoTime();
                                    this.field_37922ac_Dne.field_21260e_FWm = (l2 - l) / 1000000L;
                                    bl = false;
                                } else if (this.field_37922ac_Dne.field_2e5f2c_bzF) {
                                    this.field_37922ac_Dne.field_2e5f2c_bzF = false;
                                    wWl.method_5ec0aea6_Dne(this.field_36d2096_Dne.field_37d3e40_Dne, this.field_37922ac_Dne);
                                    bl = false;
                                } else {
                                    bl = false;
                                }
                                break block57;
                            }
                            catch (UnknownHostException unknownHostException) {
                                this.field_37922ac_Dne.field_21260e_FWm = -1L;
                                bl = false;
                            }
                            catch (SocketTimeoutException socketTimeoutException) {
                                this.field_37922ac_Dne.field_21260e_FWm = -1L;
                                bl = false;
                                break block59;
                            }
                            catch (ConnectException connectException) {
                                this.field_37922ac_Dne.field_21260e_FWm = -1L;
                                bl = false;
                                break block60;
                            }
                            catch (IOException iOException) {
                                this.field_37922ac_Dne.field_21260e_FWm = -1L;
                                bl = false;
                                break block61;
                            }
                            catch (Exception exception) {
                                this.field_37922ac_Dne.field_21260e_FWm = -1L;
                                bl = false;
                                break block62;
                            }
                            finally {
                                if (bl) {
                                    object = wWl.method_fc07f5d8_Dne();
                                    synchronized (object) {
                                        wWl.method_ae128dba_bzF();
                                    }
                                }
                            }
                            object = wWl.method_fc07f5d8_Dne();
                            synchronized (object) {
                                wWl.method_ae128dba_bzF();
                                return;
                            }
                        }
                        Object object = wWl.method_fc07f5d8_Dne();
                        synchronized (object) {
                            wWl.method_ae128dba_bzF();
                            return;
                        }
                    }
                    Object object = wWl.method_fc07f5d8_Dne();
                    synchronized (object) {
                        wWl.method_ae128dba_bzF();
                        return;
                    }
                }
                Object object = wWl.method_fc07f5d8_Dne();
                synchronized (object) {
                    wWl.method_ae128dba_bzF();
                    return;
                }
            }
            Object object = wWl.method_fc07f5d8_Dne();
            synchronized (object) {
                wWl.method_ae128dba_bzF();
                return;
            }
        }
        Object object = wWl.method_fc07f5d8_Dne();
        synchronized (object) {
            wWl.method_ae128dba_bzF();
        }
    }

    dvr(TIk tIk, muh muh2) {
        this.field_36d2096_Dne = tIk;
        this.field_37922ac_Dne = muh2;
    }
}

