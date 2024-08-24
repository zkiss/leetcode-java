package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberOfRecentCallsTest {

    private final NumberOfRecentCalls.RecentCounter rc = new NumberOfRecentCalls.RecentCounter();

    @Test
    void example() {
        assertThat(rc.ping(1)).isEqualTo(1);
        assertThat(rc.ping(100)).isEqualTo(2);
        assertThat(rc.ping(3001)).isEqualTo(3);
        assertThat(rc.ping(3002)).isEqualTo(3);
    }

    @Test
    void timeout_2() {
        assertThat(rc.ping(0)).isEqualTo(1);
        assertThat(rc.ping(3000)).isEqualTo(2);
        assertThat(rc.ping(6000)).isEqualTo(2);
        assertThat(rc.ping(9000)).isEqualTo(2);
    }

    @Test
    void timeout_1() {
        assertThat(rc.ping(0)).isEqualTo(1);
        assertThat(rc.ping(3001)).isEqualTo(1);
        assertThat(rc.ping(6002)).isEqualTo(1);
        assertThat(rc.ping(9003)).isEqualTo(1);
    }
}