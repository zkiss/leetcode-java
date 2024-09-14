package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DecodeStringTest {

    private final DecodeString ds = new DecodeString();

    @Test
    void example1() {
        assertThat(ds.decodeString("3[a]2[bc]")).isEqualTo("aaabcbc");
    }

    @Test
    void example2() {
        assertThat(ds.decodeString("3[a2[c]]")).isEqualTo("accaccacc");
    }

    @Test
    void example3() {
        assertThat(ds.decodeString("2[abc]3[cd]ef")).isEqualTo("abcabccdcdcdef");
    }

    @Test
    void hi_num() {
        assertThat(ds.decodeString("11[a]")).isEqualTo("aaaaaaaaaaa");
    }

    @Test
    void nested() {
        assertThat(ds.decodeString("3[2[a]]")).isEqualTo("aaaaaa");
    }

    @Test
    void no_decode() {
        assertThat(ds.decodeString("a")).isEqualTo("a");
    }

    @Test
    void one() {
        assertThat(ds.decodeString("1[a]")).isEqualTo("a");
    }
}