package com.nonevskiy;

import org.junit.jupiter.api.*;

import java.lang.module.Configuration;

public class ExampleTest {

    @BeforeAll
    static void configure() {
        System.out.println(" this is the @BeforeAll");
    }

    @AfterAll
    static void tearDown() {
        System.out.println(" this is @AfterAll");
    }

    @BeforeEach
    void beforeTest() {
        System.out.println("  this is @BeforeEach");
    }

    @AfterEach
    void afterTest() {
        System.out.println("  this is @AfterEach");
    }

    @Test
    void firstTest0() {
        System.out.println("    this is the @Test 0");
    }

    @Test
    void firstTest1() {
        System.out.println("     this is the @Test 1");
    }
}
