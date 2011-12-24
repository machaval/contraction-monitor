package org.codg.contraction;

/**
 *
 * @author machaval
 */
public class Contraction {

    private long duration;
    private long time;

    public Contraction(long duration,long time){
        this.duration = duration;
        this.time = time;
    }

    public long getDuration(){
        return duration;
    }

    public long getTime(){
        return time;
    }



}
