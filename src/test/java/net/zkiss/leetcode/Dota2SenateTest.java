package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Dota2SenateTest {

    private final Dota2Senate ds = new Dota2Senate();

    @Test
    void example1() {
        assertThat(ds.predictPartyVictory("RD")).isEqualTo("Radiant");
    }

    @Test
    void example2() {
        assertThat(ds.predictPartyVictory("RDD")).isEqualTo("Dire");
    }

    @Test
    void dr_dire() {
        assertThat(ds.predictPartyVictory("DR")).isEqualTo("Dire");
    }

    @Test
    void drrrrrrrrddddddd_radiant() {
        assertThat(ds.predictPartyVictory("DRRRRRRRRDDDDDDD")).isEqualTo("Radiant");
    }

    @Test
    void one() {
        assertThat(ds.predictPartyVictory("D")).isEqualTo("Dire");
        assertThat(ds.predictPartyVictory("R")).isEqualTo("Radiant");
    }

    @Test
    void sames() {
        assertThat(ds.predictPartyVictory("DDD")).isEqualTo("Dire");
        assertThat(ds.predictPartyVictory("RRR")).isEqualTo("Radiant");
    }

    @Test
    void fail1() {
        assertThat(ds.predictPartyVictory("DDRRR")).isEqualTo("Dire");
    }
}