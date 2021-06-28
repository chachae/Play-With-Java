package io.github.chachae.docs01.entity;

import java.util.Date;

/**
 * @author <a href="mailto:chenyuexin@joyy.sg">chenyuexin</a>
 * @date 2021/6/28 10:47
 */
public class UnixTime {

    private final long value;

    public UnixTime() {
        this(System.currentTimeMillis() / 1000L + 2208988800L);
    }

    public UnixTime(long value) {
        this.value = value;
    }

    public long value() {
        return value;
    }

    @Override
    public String toString() {
        return new Date((value() - 2208988800L) * 1000L).toString();
    }

}