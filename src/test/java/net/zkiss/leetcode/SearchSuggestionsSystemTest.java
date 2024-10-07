package net.zkiss.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SearchSuggestionsSystemTest {

    private final SearchSuggestionsSystem sss = new SearchSuggestionsSystem();

    @Test
    void example1() {
        assertThat(sss.suggestedProducts(
                new String[]{"mobile", "mouse", "moneypot", "monitor", "mousepad"},
                "mouse"
        )).containsExactly(
                List.of("mobile", "moneypot", "monitor"),
                List.of("mobile", "moneypot", "monitor"),
                List.of("mouse", "mousepad"),
                List.of("mouse", "mousepad"),
                List.of("mouse", "mousepad")
        );
    }

    @Test
    void example2() {
        assertThat(sss.suggestedProducts(new String[]{"havana"}, "havana")).containsExactly(
                List.of("havana"),
                List.of("havana"),
                List.of("havana"),
                List.of("havana"),
                List.of("havana"),
                List.of("havana")
        );
    }

    @Test
    void not_found() {
        assertThat(sss.suggestedProducts(new String[]{"apple", "banana", "carrot"}, "abc")).containsExactly(
                List.of("apple"),
                List.of(),
                List.of()
        );
    }
}