package org.codg.contraction;

/**
 *
 * @author machaval
 */
public class Contraction {

    private long duration;
    private long time;
    private String timeFormat;

    public Contraction(long duration,long time,String timeFormat){
        this.duration = duration;
        this.time = time;
        this.timeFormat = timeFormat;
    }

    public long getDuration(){
        return duration;
    }

    public long getTime(){
        return time;
    }

    public String getTimeFormat(){
        return timeFormat;
    }



}
