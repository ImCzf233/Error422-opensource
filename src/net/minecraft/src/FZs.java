package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

class FZs
extends Thread {
    final Nmc field_36aec88_Dne;
    final etB field_3757759_Dne;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        block53: {
            block54: {
                block58: {
                    block57: {
                        block56: {
                            boolean bl = false;
                            try {
                                bl = true;
                                this.field_3757759_Dne.field_9e60dbde_Qnq = (Object)((Object)Dne.field_5b6ce25_IjH) + "Polling..";
                                long l = System.nanoTime();
                                KDD.method_a5b17c94_Dne(this.field_3757759_Dne);
                                long l2 = System.nanoTime();
                                this.field_3757759_Dne.field_2092af_Dne = (l2 - l) / 1000000L;
                                bl = false;
                                break block53;
                            }
                            catch (UnknownHostException unknownHostException) {
                                this.field_3757759_Dne.field_2092af_Dne = -1L;
                                this.field_3757759_Dne.field_9e60dbde_Qnq = (Object)((Object)Dne.field_7129e917_aFZ) + "Can't resolve hostname";
                                bl = false;
                                break block54;
                            }
                            catch (SocketTimeoutException socketTimeoutException) {
                                this.field_3757759_Dne.field_2092af_Dne = -1L;
                                this.field_3757759_Dne.field_9e60dbde_Qnq = (Object)((Object)Dne.field_7129e917_aFZ) + "Can't reach server";
                                bl = false;
                            }
                            catch (ConnectException connectException) {
                                this.field_3757759_Dne.field_2092af_Dne = -1L;
                                this.field_3757759_Dne.field_9e60dbde_Qnq = (Object)((Object)Dne.field_7129e917_aFZ) + "Can't reach server";
                                bl = false;
                                break block56;
                            }
                            catch (IOException iOException) {
                                this.field_3757759_Dne.field_2092af_Dne = -1L;
                                this.field_3757759_Dne.field_9e60dbde_Qnq = (Object)((Object)Dne.field_7129e917_aFZ) + "Communication error";
                                bl = false;
                                break block57;
                            }
                            catch (Exception exception) {
                                this.field_3757759_Dne.field_2092af_Dne = -1L;
                                this.field_3757759_Dne.field_9e60dbde_Qnq = "ERROR: " + exception.getClass();
                                bl = false;
                                break block58;
                            }
                            finally {
                                if (bl) {
                                    Object object = KDD.method_fc07f5d8_Dne();
                                    synchronized (object) {
                                        KDD.method_ae128dba_bzF();
                                    }
                                }
                            }
                            Object object = KDD.method_fc07f5d8_Dne();
                            synchronized (object) {
                                KDD.method_ae128dba_bzF();
                                return;
                            }
                        }
                        Object object = KDD.method_fc07f5d8_Dne();
                        synchronized (object) {
                            KDD.method_ae128dba_bzF();
                            return;
                        }
                    }
                    Object object = KDD.method_fc07f5d8_Dne();
                    synchronized (object) {
                        KDD.method_ae128dba_bzF();
                        return;
                    }
                }
                Object object = KDD.method_fc07f5d8_Dne();
                synchronized (object) {
                    KDD.method_ae128dba_bzF();
                    return;
                }
            }
            Object object = KDD.method_fc07f5d8_Dne();
            synchronized (object) {
                KDD.method_ae128dba_bzF();
                return;
            }
        }
        Object object = KDD.method_fc07f5d8_Dne();
        synchronized (object) {
            KDD.method_ae128dba_bzF();
        }
    }

    FZs(Nmc nmc, etB etB2) {
        this.field_36aec88_Dne = nmc;
        this.field_3757759_Dne = etB2;
    }
}

